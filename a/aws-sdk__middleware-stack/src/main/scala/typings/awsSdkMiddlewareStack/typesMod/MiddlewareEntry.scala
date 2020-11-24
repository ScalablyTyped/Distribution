package typings.awsSdkMiddlewareStack.typesMod

import typings.awsSdkTypes.middlewareMod.BuildHandler
import typings.awsSdkTypes.middlewareMod.DeserializeHandler
import typings.awsSdkTypes.middlewareMod.FinalizeHandler
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.middlewareMod.HandlerOptions
import typings.awsSdkTypes.middlewareMod.InitializeHandler
import typings.awsSdkTypes.middlewareMod.MiddlewareType
import typings.awsSdkTypes.middlewareMod.SerializeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareEntry[Input /* <: js.Object */, Output /* <: js.Object */] extends HandlerOptions {
  
  var middleware: MiddlewareType[Input, Output] = js.native
}
object MiddlewareEntry {
  
  @scala.inline
  def apply[Input /* <: js.Object */, Output /* <: js.Object */](
    middleware: ((/* next */ BuildHandler[Input, Output]) | (/* next */ DeserializeHandler[Input, Output]) | (/* next */ FinalizeHandler[Input, Output]) | (/* next */ InitializeHandler[Input, Output]) | (/* next */ SerializeHandler[Input, Output]), /* context */ HandlerExecutionContext) => (BuildHandler[Input, Output]) | (DeserializeHandler[Input, Output]) | (FinalizeHandler[Input, Output]) | (InitializeHandler[Input, Output]) | (SerializeHandler[Input, Output])
  ): MiddlewareEntry[Input, Output] = {
    val __obj = js.Dynamic.literal(middleware = js.Any.fromFunction2(middleware))
    __obj.asInstanceOf[MiddlewareEntry[Input, Output]]
  }
  
  @scala.inline
  implicit class MiddlewareEntryOps[Self <: MiddlewareEntry[_, _], Input /* <: js.Object */, Output /* <: js.Object */] (val x: Self with (MiddlewareEntry[Input, Output])) extends AnyVal {
    
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
    def setMiddleware(
      value: ((/* next */ BuildHandler[Input, Output]) | (/* next */ DeserializeHandler[Input, Output]) | (/* next */ FinalizeHandler[Input, Output]) | (/* next */ InitializeHandler[Input, Output]) | (/* next */ SerializeHandler[Input, Output]), /* context */ HandlerExecutionContext) => (BuildHandler[Input, Output]) | (DeserializeHandler[Input, Output]) | (FinalizeHandler[Input, Output]) | (InitializeHandler[Input, Output]) | (SerializeHandler[Input, Output])
    ): Self = this.set("middleware", js.Any.fromFunction2(value))
  }
}
