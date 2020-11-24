package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextDataType extends js.Object {
  
  /**
    * Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data collection library.
    */
  var EncodedData: js.UndefOr[StringType] = js.native
  
  /**
    * HttpHeaders received on your server in same order.
    */
  var HttpHeaders: HttpHeaderList = js.native
  
  /**
    * Source IP address of your user.
    */
  var IpAddress: StringType = js.native
  
  /**
    * Your server endpoint where this API is invoked.
    */
  var ServerName: StringType = js.native
  
  /**
    * Your server path where this API is invoked. 
    */
  var ServerPath: StringType = js.native
}
object ContextDataType {
  
  @scala.inline
  def apply(HttpHeaders: HttpHeaderList, IpAddress: StringType, ServerName: StringType, ServerPath: StringType): ContextDataType = {
    val __obj = js.Dynamic.literal(HttpHeaders = HttpHeaders.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], ServerPath = ServerPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextDataType]
  }
  
  @scala.inline
  implicit class ContextDataTypeOps[Self <: ContextDataType] (val x: Self) extends AnyVal {
    
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
    def setHttpHeadersVarargs(value: HttpHeader*): Self = this.set("HttpHeaders", js.Array(value :_*))
    
    @scala.inline
    def setHttpHeaders(value: HttpHeaderList): Self = this.set("HttpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: StringType): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: StringType): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerPath(value: StringType): Self = this.set("ServerPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedData(value: StringType): Self = this.set("EncodedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodedData: Self = this.set("EncodedData", js.undefined)
  }
}
