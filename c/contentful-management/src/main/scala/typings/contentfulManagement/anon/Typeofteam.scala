package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.teamMod.Team
import typings.contentfulManagement.teamMod.TeamProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofteam extends StObject {
  
  def wrapTeam(http: AxiosInstance, data: TeamProps): Team
  
  def wrapTeamCollection(http: AxiosInstance, data: CollectionProp[TeamProps]): Collection[Team, TeamProps]
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
  implicit class TypeofteamMutableBuilder[Self <: Typeofteam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapTeam(value: (AxiosInstance, TeamProps) => Team): Self = StObject.set(x, "wrapTeam", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapTeamCollection(value: (AxiosInstance, CollectionProp[TeamProps]) => Collection[Team, TeamProps]): Self = StObject.set(x, "wrapTeamCollection", js.Any.fromFunction2(value))
  }
}
