package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateResourceResponse extends StObject {
  
  /**
    * The Amazon resource name (ARN) that specifies the application.
    */
  var applicationArn: js.UndefOr[ApplicationArn] = js.undefined
  
  /**
    * The Amazon resource name (ARN) that specifies the resource.
    */
  var resourceArn: js.UndefOr[Arn] = js.undefined
}
object DisassociateResourceResponse {
  
  inline def apply(): DisassociateResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateResourceResponse]
  }
  
  extension [Self <: DisassociateResourceResponse](x: Self) {
    
    inline def setApplicationArn(value: ApplicationArn): Self = StObject.set(x, "applicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationArnUndefined: Self = StObject.set(x, "applicationArn", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
  }
}
