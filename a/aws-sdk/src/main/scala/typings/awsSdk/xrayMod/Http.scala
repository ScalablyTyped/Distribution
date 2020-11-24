package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Http extends js.Object {
  
  /**
    * The IP address of the requestor.
    */
  var ClientIp: js.UndefOr[String] = js.native
  
  /**
    * The request method.
    */
  var HttpMethod: js.UndefOr[String] = js.native
  
  /**
    * The response status.
    */
  var HttpStatus: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The request URL.
    */
  var HttpURL: js.UndefOr[String] = js.native
  
  /**
    * The request's user agent string.
    */
  var UserAgent: js.UndefOr[String] = js.native
}
object Http {
  
  @scala.inline
  def apply(): Http = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http]
  }
  
  @scala.inline
  implicit class HttpOps[Self <: Http] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientIp(value: String): Self = this.set("ClientIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIp: Self = this.set("ClientIp", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("HttpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpMethod: Self = this.set("HttpMethod", js.undefined)
    
    @scala.inline
    def setHttpStatus(value: NullableInteger): Self = this.set("HttpStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpStatus: Self = this.set("HttpStatus", js.undefined)
    
    @scala.inline
    def setHttpURL(value: String): Self = this.set("HttpURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpURL: Self = this.set("HttpURL", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("UserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("UserAgent", js.undefined)
  }
}
