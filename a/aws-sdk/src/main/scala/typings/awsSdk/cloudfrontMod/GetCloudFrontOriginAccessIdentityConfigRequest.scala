package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCloudFrontOriginAccessIdentityConfigRequest extends StObject {
  
  /**
    * The identity's ID. 
    */
  var Id: String
}
object GetCloudFrontOriginAccessIdentityConfigRequest {
  
  inline def apply(Id: String): GetCloudFrontOriginAccessIdentityConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityConfigRequest]
  }
  
  extension [Self <: GetCloudFrontOriginAccessIdentityConfigRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
