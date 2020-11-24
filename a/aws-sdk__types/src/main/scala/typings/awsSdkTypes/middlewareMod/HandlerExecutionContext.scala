package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandlerExecutionContext
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * A logger that may be invoked by any handler during execution of an
    * operation.
    */
  var logger: js.UndefOr[Logger] = js.native
}
object HandlerExecutionContext {
  
  @scala.inline
  def apply(): HandlerExecutionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerExecutionContext]
  }
  
  @scala.inline
  implicit class HandlerExecutionContextOps[Self <: HandlerExecutionContext] (val x: Self) extends AnyVal {
    
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
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
  }
}
