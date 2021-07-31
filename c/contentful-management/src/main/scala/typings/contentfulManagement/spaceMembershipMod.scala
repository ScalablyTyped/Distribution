package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceMembershipMod {
  
  @JSImport("contentful-management/dist/typings/entities/space-membership", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wrapSpaceMembership(http: AxiosInstance, data: SpaceMembershipProps): SpaceMembership = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapSpaceMembership")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[SpaceMembership]
  
  @scala.inline
  def wrapSpaceMembershipCollection(http: AxiosInstance, data: CollectionProp[SpaceMembershipProps]): Collection[SpaceMembership, SpaceMembershipProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapSpaceMembershipCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[SpaceMembership, SpaceMembershipProps]]
  
  trait SpaceMembership
    extends StObject
       with SpaceMembershipProps
       with DefaultElements[SpaceMembershipProps] {
    
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
      * .then((space) => space.getSpaceMembership('<spaceMembership_id>'))
      * .then((spaceMembership) => spaceMembership.delete())
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
      * .then((space) => space.getSpaceMembership('<spaceMembership_id>'))
      * .then((spaceMembership) => {
      *  spaceMembership.name = 'new space membership name'
      * })
      * .then((spaceMembership) => console.log(`spaceMembership ${spaceMembership.sys.id} updated.`))
      * .catch(console.error)
      * ```
      */
    def update(): js.Promise[SpaceMembership]
  }
  object SpaceMembership {
    
    @scala.inline
    def apply(
      admin: Boolean,
      delete: () => js.Promise[Unit],
      name: String,
      roles: js.Array[MetaLinkProps],
      sys: MetaSysProps,
      toPlainObject: () => SpaceMembershipProps,
      update: () => js.Promise[SpaceMembership]
    ): SpaceMembership = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), name = name.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[SpaceMembership]
    }
    
    @scala.inline
    implicit class SpaceMembershipMutableBuilder[Self <: SpaceMembership] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[SpaceMembership]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait SpaceMembershipProps extends StObject {
    
    /**
      * User is an admin
      */
    var admin: Boolean
    
    var name: String
    
    var roles: js.Array[MetaLinkProps]
    
    var sys: MetaSysProps
  }
  object SpaceMembershipProps {
    
    @scala.inline
    def apply(admin: Boolean, name: String, roles: js.Array[MetaLinkProps], sys: MetaSysProps): SpaceMembershipProps = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpaceMembershipProps]
    }
    
    @scala.inline
    implicit class SpaceMembershipPropsMutableBuilder[Self <: SpaceMembershipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoles(value: js.Array[MetaLinkProps]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesVarargs(value: MetaLinkProps*): Self = StObject.set(x, "roles", js.Array(value :_*))
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
