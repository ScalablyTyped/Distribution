package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolFunctionInstanceInfo extends StObject {
  
  /**
    * Network function instance ARN.
    */
  var arn: VnfInstanceArn
  
  /**
    * Network function instance ID.
    */
  var id: VnfInstanceId
  
  var instantiatedVnfInfo: js.UndefOr[GetSolInstantiatedVnfInfo] = js.undefined
  
  /**
    * Network function instance instantiation state.
    */
  var instantiationState: VnfInstantiationState
  
  /**
    * Network function instance metadata.
    */
  var metadata: ListSolFunctionInstanceMetadata
  
  /**
    * Network instance ID.
    */
  var nsInstanceId: NsInstanceId
  
  /**
    * Function package ID.
    */
  var vnfPkgId: VnfPkgId
  
  /**
    * Function package name.
    */
  var vnfPkgName: js.UndefOr[String] = js.undefined
}
object ListSolFunctionInstanceInfo {
  
  inline def apply(
    arn: VnfInstanceArn,
    id: VnfInstanceId,
    instantiationState: VnfInstantiationState,
    metadata: ListSolFunctionInstanceMetadata,
    nsInstanceId: NsInstanceId,
    vnfPkgId: VnfPkgId
  ): ListSolFunctionInstanceInfo = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instantiationState = instantiationState.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nsInstanceId = nsInstanceId.asInstanceOf[js.Any], vnfPkgId = vnfPkgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSolFunctionInstanceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolFunctionInstanceInfo] (val x: Self) extends AnyVal {
    
    inline def setArn(value: VnfInstanceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: VnfInstanceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstantiatedVnfInfo(value: GetSolInstantiatedVnfInfo): Self = StObject.set(x, "instantiatedVnfInfo", value.asInstanceOf[js.Any])
    
    inline def setInstantiatedVnfInfoUndefined: Self = StObject.set(x, "instantiatedVnfInfo", js.undefined)
    
    inline def setInstantiationState(value: VnfInstantiationState): Self = StObject.set(x, "instantiationState", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ListSolFunctionInstanceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNsInstanceId(value: NsInstanceId): Self = StObject.set(x, "nsInstanceId", value.asInstanceOf[js.Any])
    
    inline def setVnfPkgId(value: VnfPkgId): Self = StObject.set(x, "vnfPkgId", value.asInstanceOf[js.Any])
    
    inline def setVnfPkgName(value: String): Self = StObject.set(x, "vnfPkgName", value.asInstanceOf[js.Any])
    
    inline def setVnfPkgNameUndefined: Self = StObject.set(x, "vnfPkgName", js.undefined)
  }
}
