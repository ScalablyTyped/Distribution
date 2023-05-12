package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateSolFunctionPackageContentOutput extends StObject {
  
  /**
    * Function package ID.
    */
  var id: VnfPkgId
  
  /**
    * Function package metadata.
    */
  var metadata: ValidateSolFunctionPackageContentMetadata
  
  /**
    * Network function product name.
    */
  var vnfProductName: String
  
  /**
    * Network function provider.
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
object ValidateSolFunctionPackageContentOutput {
  
  inline def apply(
    id: VnfPkgId,
    metadata: ValidateSolFunctionPackageContentMetadata,
    vnfProductName: String,
    vnfProvider: String,
    vnfdId: VnfdId,
    vnfdVersion: String
  ): ValidateSolFunctionPackageContentOutput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], vnfProductName = vnfProductName.asInstanceOf[js.Any], vnfProvider = vnfProvider.asInstanceOf[js.Any], vnfdId = vnfdId.asInstanceOf[js.Any], vnfdVersion = vnfdVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateSolFunctionPackageContentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateSolFunctionPackageContentOutput] (val x: Self) extends AnyVal {
    
    inline def setId(value: VnfPkgId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ValidateSolFunctionPackageContentMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setVnfProductName(value: String): Self = StObject.set(x, "vnfProductName", value.asInstanceOf[js.Any])
    
    inline def setVnfProvider(value: String): Self = StObject.set(x, "vnfProvider", value.asInstanceOf[js.Any])
    
    inline def setVnfdId(value: VnfdId): Self = StObject.set(x, "vnfdId", value.asInstanceOf[js.Any])
    
    inline def setVnfdVersion(value: String): Self = StObject.set(x, "vnfdVersion", value.asInstanceOf[js.Any])
  }
}
