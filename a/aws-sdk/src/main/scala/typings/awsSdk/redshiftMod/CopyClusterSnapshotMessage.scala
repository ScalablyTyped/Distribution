package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyClusterSnapshotMessage extends js.Object {
  
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The identifier of the cluster the source snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name. Constraints:   Must be the identifier for a valid cluster.  
    */
  var SourceSnapshotClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The identifier for the source snapshot. Constraints:   Must be the identifier for a valid automated snapshot whose state is available.  
    */
  var SourceSnapshotIdentifier: String = js.native
  
  /**
    * The identifier given to the new manual snapshot. Constraints:   Cannot be null, empty, or blank.   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for the AWS account that is making the request.  
    */
  var TargetSnapshotIdentifier: String = js.native
}
object CopyClusterSnapshotMessage {
  
  @scala.inline
  def apply(SourceSnapshotIdentifier: String, TargetSnapshotIdentifier: String): CopyClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceSnapshotIdentifier = SourceSnapshotIdentifier.asInstanceOf[js.Any], TargetSnapshotIdentifier = TargetSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyClusterSnapshotMessage]
  }
  
  @scala.inline
  implicit class CopyClusterSnapshotMessageOps[Self <: CopyClusterSnapshotMessage] (val x: Self) extends AnyVal {
    
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
    def setSourceSnapshotIdentifier(value: String): Self = this.set("SourceSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSnapshotIdentifier(value: String): Self = this.set("TargetSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = this.set("ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualSnapshotRetentionPeriod: Self = this.set("ManualSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setSourceSnapshotClusterIdentifier(value: String): Self = this.set("SourceSnapshotClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSnapshotClusterIdentifier: Self = this.set("SourceSnapshotClusterIdentifier", js.undefined)
  }
}
