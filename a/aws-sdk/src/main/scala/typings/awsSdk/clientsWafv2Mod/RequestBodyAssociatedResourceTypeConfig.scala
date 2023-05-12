package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyAssociatedResourceTypeConfig extends StObject {
  
  /**
    * Specifies the maximum size of the web request body component that an associated CloudFront distribution should send to WAF for inspection. This applies to statements in the web ACL that inspect the body or JSON body.  Default: 16 KB (16,384 kilobytes) 
    */
  var DefaultSizeInspectionLimit: SizeInspectionLimit
}
object RequestBodyAssociatedResourceTypeConfig {
  
  inline def apply(DefaultSizeInspectionLimit: SizeInspectionLimit): RequestBodyAssociatedResourceTypeConfig = {
    val __obj = js.Dynamic.literal(DefaultSizeInspectionLimit = DefaultSizeInspectionLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyAssociatedResourceTypeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyAssociatedResourceTypeConfig] (val x: Self) extends AnyVal {
    
    inline def setDefaultSizeInspectionLimit(value: SizeInspectionLimit): Self = StObject.set(x, "DefaultSizeInspectionLimit", value.asInstanceOf[js.Any])
  }
}
