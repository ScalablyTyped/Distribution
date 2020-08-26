package typings.awsSdkClientDynamodbBrowser.typesGlobalTableDescriptionMod

import typings.awsSdkClientDynamodbBrowser.typesReplicaDescriptionMod.UnmarshalledReplicaDescription
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGlobalTableDescription extends GlobalTableDescription {
  /**
    * <p>The creation time of the global table.</p>
    */
  @JSName("CreationDateTime")
  var CreationDateTime_UnmarshalledGlobalTableDescription: js.UndefOr[Date] = js.native
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  @JSName("ReplicationGroup")
  var ReplicationGroup_UnmarshalledGlobalTableDescription: js.UndefOr[js.Array[UnmarshalledReplicaDescription]] = js.native
}

object UnmarshalledGlobalTableDescription {
  @scala.inline
  def apply(): UnmarshalledGlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGlobalTableDescription]
  }
  @scala.inline
  implicit class UnmarshalledGlobalTableDescriptionOps[Self <: UnmarshalledGlobalTableDescription] (val x: Self) extends AnyVal {
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
    def setCreationDateTime(value: Date): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDateTime: Self = this.set("CreationDateTime", js.undefined)
    @scala.inline
    def setReplicationGroupVarargs(value: UnmarshalledReplicaDescription*): Self = this.set("ReplicationGroup", js.Array(value :_*))
    @scala.inline
    def setReplicationGroup(value: js.Array[UnmarshalledReplicaDescription]): Self = this.set("ReplicationGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationGroup: Self = this.set("ReplicationGroup", js.undefined)
  }
  
}

