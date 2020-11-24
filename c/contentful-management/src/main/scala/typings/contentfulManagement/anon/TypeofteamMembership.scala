package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.teamMembershipMod.TeamMembership
import typings.contentfulManagement.teamMembershipMod.TeamMembershipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofteamMembership extends js.Object {
  
  def wrapTeamMembership(http: AxiosInstance, data: TeamMembershipProps): TeamMembership = js.native
  
  def wrapTeamMembershipCollection(http: AxiosInstance, data: CollectionProp[TeamMembershipProps]): Collection[TeamMembership, TeamMembershipProps] = js.native
}
object TypeofteamMembership {
  
  @scala.inline
  def apply(
    wrapTeamMembership: (AxiosInstance, TeamMembershipProps) => TeamMembership,
    wrapTeamMembershipCollection: (AxiosInstance, CollectionProp[TeamMembershipProps]) => Collection[TeamMembership, TeamMembershipProps]
  ): TypeofteamMembership = {
    val __obj = js.Dynamic.literal(wrapTeamMembership = js.Any.fromFunction2(wrapTeamMembership), wrapTeamMembershipCollection = js.Any.fromFunction2(wrapTeamMembershipCollection))
    __obj.asInstanceOf[TypeofteamMembership]
  }
  
  @scala.inline
  implicit class TypeofteamMembershipOps[Self <: TypeofteamMembership] (val x: Self) extends AnyVal {
    
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
    def setWrapTeamMembership(value: (AxiosInstance, TeamMembershipProps) => TeamMembership): Self = this.set("wrapTeamMembership", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapTeamMembershipCollection(
      value: (AxiosInstance, CollectionProp[TeamMembershipProps]) => Collection[TeamMembership, TeamMembershipProps]
    ): Self = this.set("wrapTeamMembershipCollection", js.Any.fromFunction2(value))
  }
}
