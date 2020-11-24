package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearCompositionParameters extends js.Object {
  
  /** ID of the context where the composition will be cleared */
  var contextID: Double = js.native
}
object ClearCompositionParameters {
  
  @scala.inline
  def apply(contextID: Double): ClearCompositionParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearCompositionParameters]
  }
  
  @scala.inline
  implicit class ClearCompositionParametersOps[Self <: ClearCompositionParameters] (val x: Self) extends AnyVal {
    
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
    def setContextID(value: Double): Self = this.set("contextID", value.asInstanceOf[js.Any])
  }
}
