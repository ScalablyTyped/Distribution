package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpHeader extends js.Object {
  
  /**
    * The header name
    */
  var headerName: js.UndefOr[StringType] = js.native
  
  /**
    * The header value.
    */
  var headerValue: js.UndefOr[StringType] = js.native
}
object HttpHeader {
  
  @scala.inline
  def apply(): HttpHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpHeader]
  }
  
  @scala.inline
  implicit class HttpHeaderOps[Self <: HttpHeader] (val x: Self) extends AnyVal {
    
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
    def setHeaderName(value: StringType): Self = this.set("headerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderName: Self = this.set("headerName", js.undefined)
    
    @scala.inline
    def setHeaderValue(value: StringType): Self = this.set("headerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderValue: Self = this.set("headerValue", js.undefined)
  }
}
