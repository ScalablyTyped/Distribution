package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebRequest extends js.Object {
  
  /**
    * Returns client's response url
    */
  var responseURL: String = js.native
  
  /**
    * Returns client's status
    */
  var status: Double = js.native
  
  /**
    * Returns client's status as a text
    */
  var statusText: String = js.native
}
object IWebRequest {
  
  @scala.inline
  def apply(responseURL: String, status: Double, statusText: String): IWebRequest = {
    val __obj = js.Dynamic.literal(responseURL = responseURL.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebRequest]
  }
  
  @scala.inline
  implicit class IWebRequestOps[Self <: IWebRequest] (val x: Self) extends AnyVal {
    
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
    def setResponseURL(value: String): Self = this.set("responseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
  }
}
