package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyGlobalClusterMessage extends js.Object {
  /**
    *  Indicates if the global database cluster has deletion protection enabled. The global database cluster can't be deleted when deletion protection is enabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The DB cluster identifier for the global cluster being modified. This parameter isn't case-sensitive.  Constraints:   Must match the identifier of an existing global database cluster.  
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
  /**
    *  The new cluster identifier for the global database cluster when modifying a global database cluster. This value is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   The first character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster2 
    */
  var NewGlobalClusterIdentifier: js.UndefOr[String] = js.native
}

object ModifyGlobalClusterMessage {
  @scala.inline
  def apply(): ModifyGlobalClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyGlobalClusterMessage]
  }
  @scala.inline
  implicit class ModifyGlobalClusterMessageOps[Self <: ModifyGlobalClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = this.set("DeletionProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionProtection: Self = this.set("DeletionProtection", js.undefined)
    @scala.inline
    def setGlobalClusterIdentifier(value: String): Self = this.set("GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalClusterIdentifier: Self = this.set("GlobalClusterIdentifier", js.undefined)
    @scala.inline
    def setNewGlobalClusterIdentifier(value: String): Self = this.set("NewGlobalClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewGlobalClusterIdentifier: Self = this.set("NewGlobalClusterIdentifier", js.undefined)
  }
  
}

