package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSolNetworkPackageOutput extends StObject {
  
  /**
    * Network package ARN.
    */
  var arn: NsdInfoArn
  
  /**
    * ID of the network package.
    */
  var id: NsdInfoId
  
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
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateSolNetworkPackageOutput {
  
  inline def apply(
    arn: NsdInfoArn,
    id: NsdInfoId,
    nsdOnboardingState: NsdOnboardingState,
    nsdOperationalState: NsdOperationalState,
    nsdUsageState: NsdUsageState
  ): CreateSolNetworkPackageOutput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nsdOnboardingState = nsdOnboardingState.asInstanceOf[js.Any], nsdOperationalState = nsdOperationalState.asInstanceOf[js.Any], nsdUsageState = nsdUsageState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSolNetworkPackageOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSolNetworkPackageOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NsdInfoArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: NsdInfoId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNsdOnboardingState(value: NsdOnboardingState): Self = StObject.set(x, "nsdOnboardingState", value.asInstanceOf[js.Any])
    
    inline def setNsdOperationalState(value: NsdOperationalState): Self = StObject.set(x, "nsdOperationalState", value.asInstanceOf[js.Any])
    
    inline def setNsdUsageState(value: NsdUsageState): Self = StObject.set(x, "nsdUsageState", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
