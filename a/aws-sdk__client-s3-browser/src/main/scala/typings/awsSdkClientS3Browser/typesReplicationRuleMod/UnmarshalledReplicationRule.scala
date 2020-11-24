package typings.awsSdkClientS3Browser.typesReplicationRuleMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typings.awsSdkClientS3Browser.typesDeleteMarkerReplicationMod.UnmarshalledDeleteMarkerReplication
import typings.awsSdkClientS3Browser.typesDestinationMod.UnmarshalledDestination
import typings.awsSdkClientS3Browser.typesReplicationRuleFilterMod.UnmarshalledReplicationRuleFilter
import typings.awsSdkClientS3Browser.typesSourceSelectionCriteriaMod.UnmarshalledSourceSelectionCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledReplicationRule extends ReplicationRule {
  
  /**
    * <p>Specifies whether Amazon S3 should replicate delete makers.</p>
    */
  @JSName("DeleteMarkerReplication")
  var DeleteMarkerReplication_UnmarshalledReplicationRule: js.UndefOr[UnmarshalledDeleteMarkerReplication] = js.native
  
  /**
    * <p>Container for replication destination information.</p>
    */
  @JSName("Destination")
  var Destination_UnmarshalledReplicationRule: UnmarshalledDestination = js.native
  
  /**
    * <p>Filter that identifies subset of objects to which the replication rule applies. A <code>Filter</code> must specify exactly one <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child element.</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledReplicationRule: js.UndefOr[UnmarshalledReplicationRuleFilter] = js.native
  
  /**
    * <p> Container that describes additional filters in identifying source objects that you want to replicate. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using an AWS KMS-managed key. You can choose to enable or disable replication of these objects. </p> <p> if you want Amazon S3 to replicate objects created with server-side encryption using AWS KMS-managed keys. </p>
    */
  @JSName("SourceSelectionCriteria")
  var SourceSelectionCriteria_UnmarshalledReplicationRule: js.UndefOr[UnmarshalledSourceSelectionCriteria] = js.native
}
object UnmarshalledReplicationRule {
  
  @scala.inline
  def apply(Destination: UnmarshalledDestination, Status: Enabled | Disabled | String): UnmarshalledReplicationRule = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicationRule]
  }
  
  @scala.inline
  implicit class UnmarshalledReplicationRuleOps[Self <: UnmarshalledReplicationRule] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: UnmarshalledDestination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteMarkerReplication(value: UnmarshalledDeleteMarkerReplication): Self = this.set("DeleteMarkerReplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteMarkerReplication: Self = this.set("DeleteMarkerReplication", js.undefined)
    
    @scala.inline
    def setFilter(value: UnmarshalledReplicationRuleFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setSourceSelectionCriteria(value: UnmarshalledSourceSelectionCriteria): Self = this.set("SourceSelectionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSelectionCriteria: Self = this.set("SourceSelectionCriteria", js.undefined)
  }
}
