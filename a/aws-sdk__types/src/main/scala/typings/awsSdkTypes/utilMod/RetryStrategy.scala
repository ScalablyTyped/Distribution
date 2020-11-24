package typings.awsSdkTypes.utilMod

import typings.awsSdkTypes.middlewareMod.FinalizeHandler
import typings.awsSdkTypes.middlewareMod.FinalizeHandlerArguments
import typings.awsSdkTypes.middlewareMod.FinalizeHandlerOutput
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryStrategy extends js.Object {
  
  /**
    * the retry behavior the will invoke the next handler and handle the retry accordingly.
    * This function should also update the $metadata from the response accordingly.
    * @see {@link ResponseMetadata}
    */
  def retry[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: FinalizeHandler[Input, Output], args: FinalizeHandlerArguments[Input]): js.Promise[FinalizeHandlerOutput[Output]] = js.native
}
object RetryStrategy {
  
  @scala.inline
  def apply(
    retry: (FinalizeHandler[js.Any, js.Any], FinalizeHandlerArguments[js.Any]) => js.Promise[FinalizeHandlerOutput[js.Any]]
  ): RetryStrategy = {
    val __obj = js.Dynamic.literal(retry = js.Any.fromFunction2(retry))
    __obj.asInstanceOf[RetryStrategy]
  }
  
  @scala.inline
  implicit class RetryStrategyOps[Self <: RetryStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRetry(
      value: (FinalizeHandler[js.Any, js.Any], FinalizeHandlerArguments[js.Any]) => js.Promise[FinalizeHandlerOutput[js.Any]]
    ): Self = this.set("retry", js.Any.fromFunction2(value))
  }
}
