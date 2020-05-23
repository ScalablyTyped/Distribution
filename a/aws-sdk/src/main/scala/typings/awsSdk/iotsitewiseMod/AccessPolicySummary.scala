package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPolicySummary extends js.Object {
  /**
    * The date the access policy was created, in Unix epoch time.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The ID of the access policy.
    */
  var id: ID = js.native
  /**
    * The AWS SSO identity (a user or group).
    */
  var identity: Identity = js.native
  /**
    * The date the access policy was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[Timestamp] = js.native
  /**
    * The permissions for the access policy. Note that a project ADMINISTRATOR is also known as a project owner.
    */
  var permission: Permission = js.native
  /**
    * The AWS IoT SiteWise Monitor resource (a portal or project).
    */
  var resource: Resource = js.native
}

object AccessPolicySummary {
  @scala.inline
  def apply(
    id: ID,
    identity: Identity,
    permission: Permission,
    resource: Resource,
    creationDate: Timestamp = null,
    lastUpdateDate: Timestamp = null
  ): AccessPolicySummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (lastUpdateDate != null) __obj.updateDynamic("lastUpdateDate")(lastUpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPolicySummary]
  }
}

