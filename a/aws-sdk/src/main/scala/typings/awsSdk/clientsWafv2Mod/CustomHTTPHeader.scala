package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomHTTPHeader extends StObject {
  
  /**
    * The name of the custom header.  For custom request header insertion, when WAF inserts the header into the request, it prefixes this name x-amzn-waf-, to avoid confusion with the headers that are already in the request. For example, for the header name sample, WAF inserts the header x-amzn-waf-sample.
    */
  var Name: CustomHTTPHeaderName
  
  /**
    * The value of the custom header.
    */
  var Value: CustomHTTPHeaderValue
}
object CustomHTTPHeader {
  
  inline def apply(Name: CustomHTTPHeaderName, Value: CustomHTTPHeaderValue): CustomHTTPHeader = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomHTTPHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomHTTPHeader] (val x: Self) extends AnyVal {
    
    inline def setName(value: CustomHTTPHeaderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CustomHTTPHeaderValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
