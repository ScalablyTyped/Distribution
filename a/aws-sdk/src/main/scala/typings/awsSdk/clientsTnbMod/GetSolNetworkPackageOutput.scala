package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkPackageOutput extends StObject {
  
  /**
    * Network package ARN.
    */
  var arn: NsdInfoArn
  
  /**
    * Network package ID.
    */
  var id: NsdInfoId
  
  var metadata: GetSolNetworkPackageMetadata
  
  /**
    * Network service descriptor ID.
    */
  var nsdId: NsdId
  
  /**
    * Network service descriptor name.
    */
  var nsdName: String
  
  /**
    * Network service descriptor onboarding state.
    */
  var nsdOnboardingState: NsdOnboardingState
  
  /**
    * Network service descriptor operational state.
    */
  var nsdOperationalState: NsdOperationalState
  
  /**
    * Network service descriptor usage state.
    */
  var nsdUsageState: NsdUsageState
  
  /**
    * Network service descriptor version.
    */
  var nsdVersion: String
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Identifies the function package for the function package descriptor referenced by the onboarded network package.
    */
  var vnfPkgIds: VnfPkgIdList
}
object GetSolNetworkPackageOutput {
  
  inline def apply(
    arn: NsdInfoArn,
    id: NsdInfoId,
    metadata: GetSolNetworkPackageMetadata,
    nsdId: NsdId,
    nsdName: String,
    nsdOnboardingState: NsdOnboardingState,
    nsdOperationalState: NsdOperationalState,
    nsdUsageState: NsdUsageState,
    nsdVersion: String,
    vnfPkgIds: VnfPkgIdList
  ): GetSolNetworkPackageOutput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nsdId = nsdId.asInstanceOf[js.Any], nsdName = nsdName.asInstanceOf[js.Any], nsdOnboardingState = nsdOnboardingState.asInstanceOf[js.Any], nsdOperationalState = nsdOperationalState.asInstanceOf[js.Any], nsdUsageState = nsdUsageState.asInstanceOf[js.Any], nsdVersion = nsdVersion.asInstanceOf[js.Any], vnfPkgIds = vnfPkgIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolNetworkPackageOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkPackageOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NsdInfoArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: NsdInfoId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: GetSolNetworkPackageMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNsdId(value: NsdId): Self = StObject.set(x, "nsdId", value.asInstanceOf[js.Any])
    
    inline def setNsdName(value: String): Self = StObject.set(x, "nsdName", value.asInstanceOf[js.Any])
    
    inline def setNsdOnboardingState(value: NsdOnboardingState): Self = StObject.set(x, "nsdOnboardingState", value.asInstanceOf[js.Any])
    
    inline def setNsdOperationalState(value: NsdOperationalState): Self = StObject.set(x, "nsdOperationalState", value.asInstanceOf[js.Any])
    
    inline def setNsdUsageState(value: NsdUsageState): Self = StObject.set(x, "nsdUsageState", value.asInstanceOf[js.Any])
    
    inline def setNsdVersion(value: String): Self = StObject.set(x, "nsdVersion", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVnfPkgIds(value: VnfPkgIdList): Self = StObject.set(x, "vnfPkgIds", value.asInstanceOf[js.Any])
    
    inline def setVnfPkgIdsVarargs(value: VnfPkgId*): Self = StObject.set(x, "vnfPkgIds", js.Array(value*))
  }
}
