package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolNetworkPackageInfo extends StObject {
  
  /**
    * Network package ARN.
    */
  var arn: NsdInfoArn
  
  /**
    * ID of the individual network package.
    */
  var id: NsdInfoId
  
  /**
    * The metadata of the network package.
    */
  var metadata: ListSolNetworkPackageMetadata
  
  /**
    * Designer of the onboarded network service descriptor in the network package.
    */
  var nsdDesigner: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the network service descriptor on which the network package is based.
    */
  var nsdId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies a network service descriptor in a version independent manner.
    */
  var nsdInvariantId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the onboarded network service descriptor in the network package.
    */
  var nsdName: js.UndefOr[String] = js.undefined
  
  /**
    * Onboarding state of the network service descriptor in the network package.
    */
  var nsdOnboardingState: NsdOnboardingState
  
  /**
    * Operational state of the network service descriptor in the network package.
    */
  var nsdOperationalState: NsdOperationalState
  
  /**
    * Usage state of the network service descriptor in the network package.
    */
  var nsdUsageState: NsdUsageState
  
  /**
    * Version of the onboarded network service descriptor in the network package.
    */
  var nsdVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the function package for the function package descriptor referenced by the onboarded network package.
    */
  var vnfPkgIds: js.UndefOr[VnfPkgIdList] = js.undefined
}
object ListSolNetworkPackageInfo {
  
  inline def apply(
    arn: NsdInfoArn,
    id: NsdInfoId,
    metadata: ListSolNetworkPackageMetadata,
    nsdOnboardingState: NsdOnboardingState,
    nsdOperationalState: NsdOperationalState,
    nsdUsageState: NsdUsageState
  ): ListSolNetworkPackageInfo = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nsdOnboardingState = nsdOnboardingState.asInstanceOf[js.Any], nsdOperationalState = nsdOperationalState.asInstanceOf[js.Any], nsdUsageState = nsdUsageState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSolNetworkPackageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolNetworkPackageInfo] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NsdInfoArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: NsdInfoId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ListSolNetworkPackageMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNsdDesigner(value: String): Self = StObject.set(x, "nsdDesigner", value.asInstanceOf[js.Any])
    
    inline def setNsdDesignerUndefined: Self = StObject.set(x, "nsdDesigner", js.undefined)
    
    inline def setNsdId(value: String): Self = StObject.set(x, "nsdId", value.asInstanceOf[js.Any])
    
    inline def setNsdIdUndefined: Self = StObject.set(x, "nsdId", js.undefined)
    
    inline def setNsdInvariantId(value: String): Self = StObject.set(x, "nsdInvariantId", value.asInstanceOf[js.Any])
    
    inline def setNsdInvariantIdUndefined: Self = StObject.set(x, "nsdInvariantId", js.undefined)
    
    inline def setNsdName(value: String): Self = StObject.set(x, "nsdName", value.asInstanceOf[js.Any])
    
    inline def setNsdNameUndefined: Self = StObject.set(x, "nsdName", js.undefined)
    
    inline def setNsdOnboardingState(value: NsdOnboardingState): Self = StObject.set(x, "nsdOnboardingState", value.asInstanceOf[js.Any])
    
    inline def setNsdOperationalState(value: NsdOperationalState): Self = StObject.set(x, "nsdOperationalState", value.asInstanceOf[js.Any])
    
    inline def setNsdUsageState(value: NsdUsageState): Self = StObject.set(x, "nsdUsageState", value.asInstanceOf[js.Any])
    
    inline def setNsdVersion(value: String): Self = StObject.set(x, "nsdVersion", value.asInstanceOf[js.Any])
    
    inline def setNsdVersionUndefined: Self = StObject.set(x, "nsdVersion", js.undefined)
    
    inline def setVnfPkgIds(value: VnfPkgIdList): Self = StObject.set(x, "vnfPkgIds", value.asInstanceOf[js.Any])
    
    inline def setVnfPkgIdsUndefined: Self = StObject.set(x, "vnfPkgIds", js.undefined)
    
    inline def setVnfPkgIdsVarargs(value: VnfPkgId*): Self = StObject.set(x, "vnfPkgIds", js.Array(value*))
  }
}
