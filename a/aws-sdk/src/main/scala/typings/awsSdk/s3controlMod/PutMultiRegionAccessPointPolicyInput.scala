package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMultiRegionAccessPointPolicyInput extends StObject {
  
  /**
    * The name of the Multi-Region Access Point associated with the request.
    */
  var Name: MultiRegionAccessPointName
  
  /**
    * The policy details for the PutMultiRegionAccessPoint request.
    */
  var Policy: typings.awsSdk.s3controlMod.Policy
}
object PutMultiRegionAccessPointPolicyInput {
  
  inline def apply(Name: MultiRegionAccessPointName, Policy: Policy): PutMultiRegionAccessPointPolicyInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMultiRegionAccessPointPolicyInput]
  }
  
  extension [Self <: PutMultiRegionAccessPointPolicyInput](x: Self) {
    
    inline def setName(value: MultiRegionAccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
