package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSurroundingTextParameters extends js.Object {
  
  /** ID of the context where the surrounding text will be deleted. */
  var contextID: Double = js.native
  
  /** ID of the engine receiving the event. */
  var engineID: String = js.native
  
  /** The number of characters to be deleted */
  var length: Double = js.native
  
  /** The offset from the caret position where deletion will start. This value can be negative. */
  var offset: Double = js.native
}
object DeleteSurroundingTextParameters {
  
  @scala.inline
  def apply(contextID: Double, engineID: String, length: Double, offset: Double): DeleteSurroundingTextParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], engineID = engineID.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSurroundingTextParameters]
  }
  
  @scala.inline
  implicit class DeleteSurroundingTextParametersOps[Self <: DeleteSurroundingTextParameters] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setEngineID(value: String): Self = this.set("engineID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
}
