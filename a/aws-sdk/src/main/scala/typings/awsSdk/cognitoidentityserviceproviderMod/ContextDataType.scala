package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextDataType extends StObject {
  
  /**
    * Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data collection library.
    */
  var EncodedData: js.UndefOr[StringType] = js.undefined
  
  /**
    * HttpHeaders received on your server in same order.
    */
  var HttpHeaders: HttpHeaderList
  
  /**
    * Source IP address of your user.
    */
  var IpAddress: StringType
  
  /**
    * Your server endpoint where this API is invoked.
    */
  var ServerName: StringType
  
  /**
    * Your server path where this API is invoked. 
    */
  var ServerPath: StringType
}
object ContextDataType {
  
  @scala.inline
  def apply(HttpHeaders: HttpHeaderList, IpAddress: StringType, ServerName: StringType, ServerPath: StringType): ContextDataType = {
    val __obj = js.Dynamic.literal(HttpHeaders = HttpHeaders.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], ServerPath = ServerPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextDataType]
  }
  
  @scala.inline
  implicit class ContextDataTypeMutableBuilder[Self <: ContextDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncodedData(value: StringType): Self = StObject.set(x, "EncodedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedDataUndefined: Self = StObject.set(x, "EncodedData", js.undefined)
    
    @scala.inline
    def setHttpHeaders(value: HttpHeaderList): Self = StObject.set(x, "HttpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHeadersVarargs(value: HttpHeader*): Self = StObject.set(x, "HttpHeaders", js.Array(value :_*))
    
    @scala.inline
    def setIpAddress(value: StringType): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: StringType): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerPath(value: StringType): Self = StObject.set(x, "ServerPath", value.asInstanceOf[js.Any])
  }
}
