package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.commonTypesMod.QueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teamSpaceMembershipMod {
  
  @JSImport("contentful-management/dist/typings/entities/team-space-membership", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapTeamSpaceMembership(http: AxiosInstance, data: TeamSpaceMembershipProps): TeamSpaceMembership = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTeamSpaceMembership")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[TeamSpaceMembership]
  
  inline def wrapTeamSpaceMembershipCollection(http: AxiosInstance, data: CollectionProp[TeamSpaceMembershipProps]): Collection[TeamSpaceMembership, TeamSpaceMembershipProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTeamSpaceMembershipCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[TeamSpaceMembership, TeamSpaceMembershipProps]]
  
  trait Options extends StObject {
    
    var query: js.UndefOr[QueryOptions] = js.undefined
    
    var teamId: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setQuery(value: QueryOptions): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
      
      inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
    }
  }
  
  trait TeamSpaceMembership
    extends StObject
       with TeamSpaceMembershipProps
       with DefaultElements[TeamSpaceMembershipProps] {
    
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
      * client.getSpace('<space_id>')
      * .then((space) => space.getTeamSpaceMembership('<team_space_membership_id>'))
      * .then((teamSpaceMembership) => teamSpaceMembership.delete())
      * .then(() => console.log(`spaceMembership deleted.`))
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
      * client.getSpace('<space_id>')
      *  .then((space) => space.getTeamSpaceMembership('team_space_membership_id'))
      *  .then((teamSpaceMembership) => {
      *    item.roles = [
      *      {
      *        sys: {
      *          type: 'Link',
      *          linkType: 'Role',
      *          id: 'role_id'
      *        }
      *      }
      *    ]
      *  })
      *  .then((spaceMembership) => console.log(`spaceMembership ${spaceMembership.sys.id} updated.`))
      *  .catch(console.error)
      *  ```
      */
    def update(): js.Promise[TeamSpaceMembership]
  }
  object TeamSpaceMembership {
    
    inline def apply(
      admin: Boolean,
      delete: () => js.Promise[Unit],
      roles: js.Array[MetaLinkProps],
      sys: MetaSysProps,
      toPlainObject: () => TeamSpaceMembershipProps,
      update: () => js.Promise[TeamSpaceMembership]
    ): TeamSpaceMembership = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[TeamSpaceMembership]
    }
    
    extension [Self <: TeamSpaceMembership](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => js.Promise[TeamSpaceMembership]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait TeamSpaceMembershipProps extends StObject {
    
    /**
      * Is admin
      */
    var admin: Boolean
    
    /**
      * Roles
      */
    var roles: js.Array[MetaLinkProps]
    
    /**
      * System metadata
      */
    var sys: MetaSysProps
  }
  object TeamSpaceMembershipProps {
    
    inline def apply(admin: Boolean, roles: js.Array[MetaLinkProps], sys: MetaSysProps): TeamSpaceMembershipProps = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamSpaceMembershipProps]
    }
    
    extension [Self <: TeamSpaceMembershipProps](x: Self) {
      
      inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      inline def setRoles(value: js.Array[MetaLinkProps]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesVarargs(value: MetaLinkProps*): Self = StObject.set(x, "roles", js.Array(value :_*))
      
      inline def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
