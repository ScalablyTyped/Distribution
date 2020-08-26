package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDBClusterParameterGroupMessage extends js.Object {
  /**
    * The identifier or Amazon Resource Name (ARN) for the source DB cluster parameter group. For information about creating an ARN, see  Constructing an ARN for Amazon RDS in the Amazon Aurora User Guide.  Constraints:   Must specify a valid DB cluster parameter group.   If the source DB cluster parameter group is in the same AWS Region as the copy, specify a valid DB parameter group identifier, for example my-db-cluster-param-group, or a valid ARN.   If the source DB parameter group is in a different AWS Region than the copy, specify a valid DB cluster parameter group ARN, for example arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1.  
    */
  var SourceDBClusterParameterGroupIdentifier: String = js.native
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A description for the copied DB cluster parameter group.
    */
  var TargetDBClusterParameterGroupDescription: String = js.native
  /**
    * The identifier for the copied DB cluster parameter group. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster-param-group1 
    */
  var TargetDBClusterParameterGroupIdentifier: String = js.native
}

object CopyDBClusterParameterGroupMessage {
  @scala.inline
  def apply(
    SourceDBClusterParameterGroupIdentifier: String,
    TargetDBClusterParameterGroupDescription: String,
    TargetDBClusterParameterGroupIdentifier: String
  ): CopyDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(SourceDBClusterParameterGroupIdentifier = SourceDBClusterParameterGroupIdentifier.asInstanceOf[js.Any], TargetDBClusterParameterGroupDescription = TargetDBClusterParameterGroupDescription.asInstanceOf[js.Any], TargetDBClusterParameterGroupIdentifier = TargetDBClusterParameterGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBClusterParameterGroupMessage]
  }
  @scala.inline
  implicit class CopyDBClusterParameterGroupMessageOps[Self <: CopyDBClusterParameterGroupMessage] (val x: Self) extends AnyVal {
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
    def setSourceDBClusterParameterGroupIdentifier(value: String): Self = this.set("SourceDBClusterParameterGroupIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDBClusterParameterGroupDescription(value: String): Self = this.set("TargetDBClusterParameterGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDBClusterParameterGroupIdentifier(value: String): Self = this.set("TargetDBClusterParameterGroupIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

