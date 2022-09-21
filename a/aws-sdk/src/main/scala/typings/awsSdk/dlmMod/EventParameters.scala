package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventParameters extends StObject {
  
  /**
    * The snapshot description that can trigger the policy. The description pattern is specified using a regular expression. The policy runs only if a snapshot with a description that matches the specified pattern is shared with your account. For example, specifying ^.*Created for policy: policy-1234567890abcdef0.*$ configures the policy to run only if snapshots created by policy policy-1234567890abcdef0 are shared with your account.
    */
  var DescriptionRegex: typings.awsSdk.dlmMod.DescriptionRegex
  
  /**
    * The type of event. Currently, only snapshot sharing events are supported.
    */
  var EventType: EventTypeValues
  
  /**
    * The IDs of the Amazon Web Services accounts that can trigger policy by sharing snapshots with your account. The policy only runs if one of the specified Amazon Web Services accounts shares a snapshot with your account.
    */
  var SnapshotOwner: SnapshotOwnerList
}
object EventParameters {
  
  inline def apply(DescriptionRegex: DescriptionRegex, EventType: EventTypeValues, SnapshotOwner: SnapshotOwnerList): EventParameters = {
    val __obj = js.Dynamic.literal(DescriptionRegex = DescriptionRegex.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], SnapshotOwner = SnapshotOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParameters]
  }
  
  extension [Self <: EventParameters](x: Self) {
    
    inline def setDescriptionRegex(value: DescriptionRegex): Self = StObject.set(x, "DescriptionRegex", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: EventTypeValues): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setSnapshotOwner(value: SnapshotOwnerList): Self = StObject.set(x, "SnapshotOwner", value.asInstanceOf[js.Any])
    
    inline def setSnapshotOwnerVarargs(value: AwsAccountId*): Self = StObject.set(x, "SnapshotOwner", js.Array(value*))
  }
}
