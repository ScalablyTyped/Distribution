package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateSolNetworkPackageContentOutput extends StObject {
  
  /**
    * Network package ARN.
    */
  var arn: NsdInfoArn
  
  /**
    * Network package ID.
    */
  var id: NsdInfoId
  
  /**
    * Network package metadata.
    */
  var metadata: ValidateSolNetworkPackageContentMetadata
  
  /**
    * Network service descriptor ID.
    */
  var nsdId: NsdId
  
  /**
    * Network service descriptor name.
    */
  var nsdName: String
  
  /**
    * Network service descriptor version.
    */
  var nsdVersion: String
  
  /**
    * Function package IDs.
    */
  var vnfPkgIds: VnfPkgIdList
}
object ValidateSolNetworkPackageContentOutput {
  
  inline def apply(
    arn: NsdInfoArn,
    id: NsdInfoId,
    metadata: ValidateSolNetworkPackageContentMetadata,
    nsdId: NsdId,
    nsdName: String,
    nsdVersion: String,
    vnfPkgIds: VnfPkgIdList
  ): ValidateSolNetworkPackageContentOutput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nsdId = nsdId.asInstanceOf[js.Any], nsdName = nsdName.asInstanceOf[js.Any], nsdVersion = nsdVersion.asInstanceOf[js.Any], vnfPkgIds = vnfPkgIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateSolNetworkPackageContentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateSolNetworkPackageContentOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NsdInfoArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: NsdInfoId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ValidateSolNetworkPackageContentMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNsdId(value: NsdId): Self = StObject.set(x, "nsdId", value.asInstanceOf[js.Any])
    
    inline def setNsdName(value: String): Self = StObject.set(x, "nsdName", value.asInstanceOf[js.Any])
    
    inline def setNsdVersion(value: String): Self = StObject.set(x, "nsdVersion", value.asInstanceOf[js.Any])
    
    inline def setVnfPkgIds(value: VnfPkgIdList): Self = StObject.set(x, "vnfPkgIds", value.asInstanceOf[js.Any])
    
    inline def setVnfPkgIdsVarargs(value: VnfPkgId*): Self = StObject.set(x, "vnfPkgIds", js.Array(value*))
  }
}
