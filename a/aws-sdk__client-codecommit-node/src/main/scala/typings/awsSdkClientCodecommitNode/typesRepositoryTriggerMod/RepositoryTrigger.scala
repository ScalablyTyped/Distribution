package typings.awsSdkClientCodecommitNode.typesRepositoryTriggerMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.all
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.createReference
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.deleteReference
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.updateReference
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryTrigger extends js.Object {
  
  /**
    * <p>The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will apply to all branches.</p> <note> <p>While no content is required in the array, you must include the array itself.</p> </note>
    */
  var branches: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  
  /**
    * <p>Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.</p>
    */
  var customData: js.UndefOr[String] = js.native
  
  /**
    * <p>The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).</p>
    */
  var destinationArn: String = js.native
  
  /**
    * <p>The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). </p> <note> <p>The valid value "all" cannot be used with any other values.</p> </note>
    */
  var events: (js.Array[all | updateReference | createReference | deleteReference | String]) | (Iterable[all | updateReference | createReference | deleteReference | String]) = js.native
  
  /**
    * <p>The name of the trigger.</p>
    */
  var name: String = js.native
}
object RepositoryTrigger {
  
  @scala.inline
  def apply(
    destinationArn: String,
    events: (js.Array[all | updateReference | createReference | deleteReference | String]) | (Iterable[all | updateReference | createReference | deleteReference | String]),
    name: String
  ): RepositoryTrigger = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTrigger]
  }
  
  @scala.inline
  implicit class RepositoryTriggerOps[Self <: RepositoryTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationArn(value: String): Self = this.set("destinationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: (all | updateReference | createReference | deleteReference | String)*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(
      value: (js.Array[all | updateReference | createReference | deleteReference | String]) | (Iterable[all | updateReference | createReference | deleteReference | String])
    ): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchesVarargs(value: String*): Self = this.set("branches", js.Array(value :_*))
    
    @scala.inline
    def setBranches(value: js.Array[String] | Iterable[String]): Self = this.set("branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranches: Self = this.set("branches", js.undefined)
    
    @scala.inline
    def setCustomData(value: String): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
  }
}
