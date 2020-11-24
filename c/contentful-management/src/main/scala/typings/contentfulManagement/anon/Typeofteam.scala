package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.teamMod.Team
import typings.contentfulManagement.teamMod.TeamProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofteam extends js.Object {
  
  def wrapTeam(http: AxiosInstance, data: TeamProps): Team = js.native
  
  def wrapTeamCollection(http: AxiosInstance, data: CollectionProp[TeamProps]): Collection[Team, TeamProps] = js.native
}
object Typeofteam {
  
  @scala.inline
  def apply(
    wrapTeam: (AxiosInstance, TeamProps) => Team,
    wrapTeamCollection: (AxiosInstance, CollectionProp[TeamProps]) => Collection[Team, TeamProps]
  ): Typeofteam = {
    val __obj = js.Dynamic.literal(wrapTeam = js.Any.fromFunction2(wrapTeam), wrapTeamCollection = js.Any.fromFunction2(wrapTeamCollection))
    __obj.asInstanceOf[Typeofteam]
  }
  
  @scala.inline
  implicit class TypeofteamOps[Self <: Typeofteam] (val x: Self) extends AnyVal {
    
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
    def setWrapTeam(value: (AxiosInstance, TeamProps) => Team): Self = this.set("wrapTeam", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapTeamCollection(value: (AxiosInstance, CollectionProp[TeamProps]) => Collection[Team, TeamProps]): Self = this.set("wrapTeamCollection", js.Any.fromFunction2(value))
  }
}
