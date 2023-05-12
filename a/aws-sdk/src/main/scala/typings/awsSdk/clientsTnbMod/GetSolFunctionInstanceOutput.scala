package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolFunctionInstanceOutput extends StObject {
  
  /**
    * Network function instance ARN.
    */
  var arn: VnfInstanceArn
  
  /**
    * Network function instance ID.
    */
  var id: VnfInstanceId
  
  var instantiatedVnfInfo: js.UndefOr[GetSolVnfInfo] = js.undefined
  
  /**
    * Network function instantiation state.
    */
  var instantiationState: VnfInstantiationState
  
  var metadata: GetSolFunctionInstanceMetadata
  
  /**
    * Network instance ID.
    */
  var nsInstanceId: NsInstanceId
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Function package ID.
    */
  var vnfPkgId: VnfPkgId
  
  /**
    * Network function product name.
    */
  var vnfProductName: js.UndefOr[String] = js.undefined
  
  /**
    * Network function provider.
    */
  var vnfProvider: js.UndefOr[String] = js.undefined
  
  /**
    * Function package descriptor ID.
    */
  var vnfdId: VnfdId
  
  /**
    * Function package descriptor version.
    */
  var vnfdVersion: js.UndefOr[String] = js.undefined
}
object GetSolFunctionInstanceOutput {
  
  inline def apply(
    arn: VnfInstanceArn,
    id: VnfInstanceId,
    instantiationState: VnfInstantiationState,
    metadata: GetSolFunctionInstanceMetadata,
    nsInstanceId: NsInstanceId,
    vnfPkgId: VnfPkgId,
    vnfdId: VnfdId
  ): GetSolFunctionInstanceOutput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instantiationState = instantiationState.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nsInstanceId = nsInstanceId.asInstanceOf[js.Any], vnfPkgId = vnfPkgId.asInstanceOf[js.Any], vnfdId = vnfdId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolFunctionInstanceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolFunctionInstanceOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: VnfInstanceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: VnfInstanceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstantiatedVnfInfo(value: GetSolVnfInfo): Self = StObject.set(x, "instantiatedVnfInfo", value.asInstanceOf[js.Any])
    
    inline def setInstantiatedVnfInfoUndefined: Self = StObject.set(x, "instantiatedVnfInfo", js.undefined)
    
    inline def setInstantiationState(value: VnfInstantiationState): Self = StObject.set(x, "instantiationState", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: GetSolFunctionInstanceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNsInstanceId(value: NsInstanceId): Self = StObject.set(x, "nsInstanceId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVnfPkgId(value: VnfPkgId): Self = StObject.set(x, "vnfPkgId", value.asInstanceOf[js.Any])
    
    inline def setVnfProductName(value: String): Self = StObject.set(x, "vnfProductName", value.asInstanceOf[js.Any])
    
    inline def setVnfProductNameUndefined: Self = StObject.set(x, "vnfProductName", js.undefined)
    
    inline def setVnfProvider(value: String): Self = StObject.set(x, "vnfProvider", value.asInstanceOf[js.Any])
    
    inline def setVnfProviderUndefined: Self = StObject.set(x, "vnfProvider", js.undefined)
    
    inline def setVnfdId(value: VnfdId): Self = StObject.set(x, "vnfdId", value.asInstanceOf[js.Any])
    
    inline def setVnfdVersion(value: String): Self = StObject.set(x, "vnfdVersion", value.asInstanceOf[js.Any])
    
    inline def setVnfdVersionUndefined: Self = StObject.set(x, "vnfdVersion", js.undefined)
  }
}
