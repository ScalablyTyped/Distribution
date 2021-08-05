package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDistributionRequest extends StObject {
  
  /**
    * The distribution ID. 
    */
  var Id: String
  
  /**
    * The value of the ETag header that you received when you disabled the distribution. For example: E2QWRUHAPOMQZL. 
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object DeleteDistributionRequest {
  
  inline def apply(Id: String): DeleteDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDistributionRequest]
  }
  
  extension [Self <: DeleteDistributionRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
