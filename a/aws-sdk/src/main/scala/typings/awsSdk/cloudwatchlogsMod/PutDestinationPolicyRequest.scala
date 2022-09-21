package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDestinationPolicyRequest extends StObject {
  
  /**
    * An IAM policy document that authorizes cross-account users to deliver their log events to the associated destination. This can be up to 5120 bytes.
    */
  var accessPolicy: AccessPolicy
  
  /**
    * A name for an existing destination.
    */
  var destinationName: DestinationName
  
  /**
    * Specify true if you are updating an existing destination policy to grant permission to an organization ID instead of granting permission to individual AWS accounts. Before you update a destination policy this way, you must first update the subscription filters in the accounts that send logs to this destination. If you do not, the subscription filters might stop working. By specifying true for forceUpdate, you are affirming that you have already updated the subscription filters. For more information, see  Updating an existing cross-account subscription  If you omit this parameter, the default of false is used.
    */
  var forceUpdate: js.UndefOr[ForceUpdate] = js.undefined
}
object PutDestinationPolicyRequest {
  
  inline def apply(accessPolicy: AccessPolicy, destinationName: DestinationName): PutDestinationPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicy = accessPolicy.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDestinationPolicyRequest]
  }
  
  extension [Self <: PutDestinationPolicyRequest](x: Self) {
    
    inline def setAccessPolicy(value: AccessPolicy): Self = StObject.set(x, "accessPolicy", value.asInstanceOf[js.Any])
    
    inline def setDestinationName(value: DestinationName): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    inline def setForceUpdate(value: ForceUpdate): Self = StObject.set(x, "forceUpdate", value.asInstanceOf[js.Any])
    
    inline def setForceUpdateUndefined: Self = StObject.set(x, "forceUpdate", js.undefined)
  }
}
