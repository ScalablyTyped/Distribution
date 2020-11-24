package typings.contentfulManagement.teamSpaceMembershipMod

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/team-space-membership", "wrapTeamSpaceMembershipCollection")
@js.native
object wrapTeamSpaceMembershipCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[TeamSpaceMembershipProps]): Collection[TeamSpaceMembership, TeamSpaceMembershipProps] = js.native
}
