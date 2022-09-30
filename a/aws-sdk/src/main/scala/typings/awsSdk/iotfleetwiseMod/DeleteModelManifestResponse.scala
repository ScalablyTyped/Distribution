package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelManifestResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted model manifest.
    */
  var arn: typings.awsSdk.iotfleetwiseMod.arn
  
  /**
    * The name of the deleted model manifest.
    */
  var name: resourceName
}
object DeleteModelManifestResponse {
  
  inline def apply(arn: arn, name: resourceName): DeleteModelManifestResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelManifestResponse]
  }
  
  extension [Self <: DeleteModelManifestResponse](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
