package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSolFunctionPackageContentOutput extends StObject {
  
  /**
    * Function package ID.
    */
  var id: VnfPkgId
  
  /**
    * Function package metadata.
    */
  var metadata: PutSolFunctionPackageContentMetadata
  
  /**
    * Function product name.
    */
  var vnfProductName: String
  
  /**
    * Function provider.
    */
  var vnfProvider: String
  
  /**
    * Function package descriptor ID.
    */
  var vnfdId: VnfdId
  
  /**
    * Function package descriptor version.
    */
  var vnfdVersion: String
}
object PutSolFunctionPackageContentOutput {
  
  inline def apply(
    id: VnfPkgId,
    metadata: PutSolFunctionPackageContentMetadata,
    vnfProductName: String,
    vnfProvider: String,
    vnfdId: VnfdId,
    vnfdVersion: String
  ): PutSolFunctionPackageContentOutput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], vnfProductName = vnfProductName.asInstanceOf[js.Any], vnfProvider = vnfProvider.asInstanceOf[js.Any], vnfdId = vnfdId.asInstanceOf[js.Any], vnfdVersion = vnfdVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSolFunctionPackageContentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSolFunctionPackageContentOutput] (val x: Self) extends AnyVal {
    
    inline def setId(value: VnfPkgId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: PutSolFunctionPackageContentMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setVnfProductName(value: String): Self = StObject.set(x, "vnfProductName", value.asInstanceOf[js.Any])
    
    inline def setVnfProvider(value: String): Self = StObject.set(x, "vnfProvider", value.asInstanceOf[js.Any])
    
    inline def setVnfdId(value: VnfdId): Self = StObject.set(x, "vnfdId", value.asInstanceOf[js.Any])
    
    inline def setVnfdVersion(value: String): Self = StObject.set(x, "vnfdVersion", value.asInstanceOf[js.Any])
  }
}
