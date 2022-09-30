package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSignalCatalogResponse extends StObject {
  
  /**
    *  The ARN of the updated signal catalog. 
    */
  var arn: typings.awsSdk.iotfleetwiseMod.arn
  
  /**
    *  The name of the updated signal catalog. 
    */
  var name: resourceName
}
object UpdateSignalCatalogResponse {
  
  inline def apply(arn: arn, name: resourceName): UpdateSignalCatalogResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSignalCatalogResponse]
  }
  
  extension [Self <: UpdateSignalCatalogResponse](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
