package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDBParameterGroupMessage extends js.Object {
  /**
    *  The identifier or ARN for the source DB parameter group. For information about creating an ARN, see  Constructing an ARN for Amazon RDS in the Amazon RDS User Guide.  Constraints:   Must specify a valid DB parameter group.   Must specify a valid DB parameter group identifier, for example my-db-param-group, or a valid ARN.  
    */
  var SourceDBParameterGroupIdentifier: String = js.native
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A description for the copied DB parameter group.
    */
  var TargetDBParameterGroupDescription: String = js.native
  /**
    * The identifier for the copied DB parameter group. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-db-parameter-group 
    */
  var TargetDBParameterGroupIdentifier: String = js.native
}

object CopyDBParameterGroupMessage {
  @scala.inline
  def apply(
    SourceDBParameterGroupIdentifier: String,
    TargetDBParameterGroupDescription: String,
    TargetDBParameterGroupIdentifier: String,
    Tags: TagList = null
  ): CopyDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(SourceDBParameterGroupIdentifier = SourceDBParameterGroupIdentifier.asInstanceOf[js.Any], TargetDBParameterGroupDescription = TargetDBParameterGroupDescription.asInstanceOf[js.Any], TargetDBParameterGroupIdentifier = TargetDBParameterGroupIdentifier.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBParameterGroupMessage]
  }
}

