package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teamMod {
  
  @JSImport("contentful-management/dist/typings/entities/team", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapTeam(http: AxiosInstance, data: TeamProps): Team = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTeam")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Team]
  
  inline def wrapTeamCollection(http: AxiosInstance, data: CollectionProp[TeamProps]): Collection[Team, TeamProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTeamCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[Team, TeamProps]]
  
  trait Team
    extends StObject
       with TeamProps
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
    def delete(): js.Promise[Unit]
    
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
    def update(): js.Promise[Team]
  }
  object Team {
    
    inline def apply(
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
    
    extension [Self <: Team](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => js.Promise[Team]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait TeamProps extends StObject {
    
    /**
      * Description of the team
      */
    var description: String
    
    /**
      * Name of the team
      */
    var name: String
    
    /**
      * System metadata
      */
    var sys: MetaSysProps
  }
  object TeamProps {
    
    inline def apply(description: String, name: String, sys: MetaSysProps): TeamProps = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamProps]
    }
    
    extension [Self <: TeamProps](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
