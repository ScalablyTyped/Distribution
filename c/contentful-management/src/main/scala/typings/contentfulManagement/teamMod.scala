package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teamMod {
  
  @JSImport("contentful-management/dist/typings/entities/team", "wrapTeam")
  @js.native
  def wrapTeam(http: AxiosInstance, data: TeamProps): Team = js.native
  
  @JSImport("contentful-management/dist/typings/entities/team", "wrapTeamCollection")
  @js.native
  def wrapTeamCollection(http: AxiosInstance, data: CollectionProp[TeamProps]): Collection[Team, TeamProps] = js.native
  
  @js.native
  trait Team
    extends TeamProps
       with DefaultElements[TeamProps] {
    
    /**
      * Deletes this object on the server.
      * @return Promise for the deletion. It contains no data, but the Promise error case should be handled.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      *
      * client.getOrganization('organization_id')
      * .then(org => org.getOrganizationMembership('organizationMembership_id'))
      * .then((team) => {
      *  team.delete();
      * })
      * .catch(console.error)
      * ```
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * Sends an update to the server with any changes made to the object's properties
      * @return Object returned from the server with updated changes.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      *
      * client.getOrganization('organization_id')
      * .then(org => org.getTeam('team_id'))
      * .then((team) => {
      *  team.description = 'new description';
      *  team.update();
      * })
      * .catch(console.error)
      * ```
      */
    def update(): js.Promise[Team] = js.native
  }
  object Team {
    
    @scala.inline
    def apply(
      delete: () => js.Promise[Unit],
      description: String,
      name: String,
      sys: MetaSysProps,
      toPlainObject: () => TeamProps,
      update: () => js.Promise[Team]
    ): Team = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Team]
    }
    
    @scala.inline
    implicit class TeamMutableBuilder[Self <: Team] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[Team]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TeamProps extends StObject {
    
    /**
      * Description of the team
      */
    var description: String = js.native
    
    /**
      * Name of the team
      */
    var name: String = js.native
    
    /**
      * System metadata
      */
    var sys: MetaSysProps = js.native
  }
  object TeamProps {
    
    @scala.inline
    def apply(description: String, name: String, sys: MetaSysProps): TeamProps = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamProps]
    }
    
    @scala.inline
    implicit class TeamPropsMutableBuilder[Self <: TeamProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
