package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  /**
    * The action to perform:    CREATE: Creates a resource record set that has the specified values.    DELETE: Deletes a existing resource record set.  To delete the resource record set that is associated with a traffic policy instance, use DeleteTrafficPolicyInstance. Amazon Route 53 will delete the resource record set automatically. If you delete the resource record set by using ChangeResourceRecordSets, Route 53 doesn't automatically delete the traffic policy instance, and you'll continue to be charged for it even though it's no longer in use.      UPSERT: If a resource record set doesn't already exist, Route 53 creates it. If a resource record set does exist, Route 53 updates it with the values in the request.  
    */
  var Action: ChangeAction
  
  /**
    * Information about the resource record set to create, delete, or update.
    */
  var ResourceRecordSet: typings.awsSdk.route53Mod.ResourceRecordSet
}
object Change {
  
  @scala.inline
  def apply(Action: ChangeAction, ResourceRecordSet: ResourceRecordSet): Change = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ResourceRecordSet = ResourceRecordSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRecordSet(value: ResourceRecordSet): Self = StObject.set(x, "ResourceRecordSet", value.asInstanceOf[js.Any])
  }
}
