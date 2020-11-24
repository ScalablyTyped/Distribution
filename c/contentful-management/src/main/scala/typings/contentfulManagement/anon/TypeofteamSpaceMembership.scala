package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.teamSpaceMembershipMod.TeamSpaceMembership
import typings.contentfulManagement.teamSpaceMembershipMod.TeamSpaceMembershipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofteamSpaceMembership extends js.Object {
  
  def wrapTeamSpaceMembership(http: AxiosInstance, data: TeamSpaceMembershipProps): TeamSpaceMembership = js.native
  
  def wrapTeamSpaceMembershipCollection(http: AxiosInstance, data: CollectionProp[TeamSpaceMembershipProps]): Collection[TeamSpaceMembership, TeamSpaceMembershipProps] = js.native
}
object TypeofteamSpaceMembership {
  
  @scala.inline
  def apply(
    wrapTeamSpaceMembership: (AxiosInstance, TeamSpaceMembershipProps) => TeamSpaceMembership,
    wrapTeamSpaceMembershipCollection: (AxiosInstance, CollectionProp[TeamSpaceMembershipProps]) => Collection[TeamSpaceMembership, TeamSpaceMembershipProps]
  ): TypeofteamSpaceMembership = {
    val __obj = js.Dynamic.literal(wrapTeamSpaceMembership = js.Any.fromFunction2(wrapTeamSpaceMembership), wrapTeamSpaceMembershipCollection = js.Any.fromFunction2(wrapTeamSpaceMembershipCollection))
    __obj.asInstanceOf[TypeofteamSpaceMembership]
  }
  
  @scala.inline
  implicit class TypeofteamSpaceMembershipOps[Self <: TypeofteamSpaceMembership] (val x: Self) extends AnyVal {
    
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
    def setWrapTeamSpaceMembership(value: (AxiosInstance, TeamSpaceMembershipProps) => TeamSpaceMembership): Self = this.set("wrapTeamSpaceMembership", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapTeamSpaceMembershipCollection(
      value: (AxiosInstance, CollectionProp[TeamSpaceMembershipProps]) => Collection[TeamSpaceMembership, TeamSpaceMembershipProps]
    ): Self = this.set("wrapTeamSpaceMembershipCollection", js.Any.fromFunction2(value))
  }
}
