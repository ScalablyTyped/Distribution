package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.Actions
import typings.contentfulManagement.anon.ContentDelivery
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.contentfulManagementStrings.delete_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roleMod {
  
  @JSImport("contentful-management/dist/typings/entities/role", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapRole(http: AxiosInstance, data: RoleProps): Role = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapRole")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Role]
  
  inline def wrapRoleCollection(http: AxiosInstance, data: CollectionProp[RoleProps]): Collection[Role, RoleProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapRoleCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[Role, RoleProps]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.contentfulManagementStrings.read
    - typings.contentfulManagement.contentfulManagementStrings.create
    - typings.contentfulManagement.contentfulManagementStrings.update
    - typings.contentfulManagement.contentfulManagementStrings.delete_
    - typings.contentfulManagement.contentfulManagementStrings.publish
    - typings.contentfulManagement.contentfulManagementStrings.unpublish
    - typings.contentfulManagement.contentfulManagementStrings.archive
    - typings.contentfulManagement.contentfulManagementStrings.unarchive
  */
  trait ActionType extends StObject
  object ActionType {
    
    inline def archive: typings.contentfulManagement.contentfulManagementStrings.archive = "archive".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.archive]
    
    inline def create: typings.contentfulManagement.contentfulManagementStrings.create = "create".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.create]
    
    inline def delete: delete_ = "delete".asInstanceOf[delete_]
    
    inline def publish: typings.contentfulManagement.contentfulManagementStrings.publish = "publish".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.publish]
    
    inline def read: typings.contentfulManagement.contentfulManagementStrings.read = "read".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.read]
    
    inline def unarchive: typings.contentfulManagement.contentfulManagementStrings.unarchive = "unarchive".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.unarchive]
    
    inline def unpublish: typings.contentfulManagement.contentfulManagementStrings.unpublish = "unpublish".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.unpublish]
    
    inline def update: typings.contentfulManagement.contentfulManagementStrings.update = "update".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.update]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.contentfulManagementStrings.and
    - typings.contentfulManagement.contentfulManagementStrings.or
    - typings.contentfulManagement.contentfulManagementStrings.not
    - typings.contentfulManagement.contentfulManagementStrings.equals
  */
  trait ConditionType extends StObject
  object ConditionType {
    
    inline def and: typings.contentfulManagement.contentfulManagementStrings.and = "and".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.and]
    
    inline def equals: typings.contentfulManagement.contentfulManagementStrings.equals = "equals".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.equals]
    
    inline def not: typings.contentfulManagement.contentfulManagementStrings.not = "not".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.not]
    
    inline def or: typings.contentfulManagement.contentfulManagementStrings.or = "or".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.or]
  }
  
  /* Inlined {[ key in contentful-management.contentful-management/dist/typings/entities/role.ConditionType ]: std.Array<contentful-management.contentful-management/dist/typings/entities/role.ConstraintType> | any} */
  trait ConstraintType extends StObject {
    
    var and: js.Array[ConstraintType] | js.Any
    
    @JSName("equals")
    var equals_FConstraintType: js.Array[ConstraintType] | js.Any
    
    var not: js.Array[ConstraintType] | js.Any
    
    var or: js.Array[ConstraintType] | js.Any
  }
  object ConstraintType {
    
    inline def apply(
      and: js.Array[ConstraintType] | js.Any,
      equals_ : js.Array[ConstraintType] | js.Any,
      not: js.Array[ConstraintType] | js.Any,
      or: js.Array[ConstraintType] | js.Any
    ): ConstraintType = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstraintType]
    }
    
    extension [Self <: ConstraintType](x: Self) {
      
      inline def setAnd(value: js.Array[ConstraintType] | js.Any): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setAndVarargs(value: ConstraintType*): Self = StObject.set(x, "and", js.Array(value :_*))
      
      inline def setEquals_(value: js.Array[ConstraintType] | js.Any): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      inline def setEquals_Varargs(value: ConstraintType*): Self = StObject.set(x, "equals", js.Array(value :_*))
      
      inline def setNot(value: js.Array[ConstraintType] | js.Any): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotVarargs(value: ConstraintType*): Self = StObject.set(x, "not", js.Array(value :_*))
      
      inline def setOr(value: js.Array[ConstraintType] | js.Any): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
      
      inline def setOrVarargs(value: ConstraintType*): Self = StObject.set(x, "or", js.Array(value :_*))
    }
  }
  
  trait Role
    extends StObject
       with RoleProps
       with DefaultElements[RoleProps] {
    
    /**
      * Deletes this object on the server.
      * @memberof Role
      * @func delete
      * @return {Promise} Promise for the deletion. It contains no data, but the Promise error case should be handled.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      *
      * client.getSpace('<space_id>')
      * .then((space) => space.getRole('<role_id>'))
      * .then((role) => role.delete())
      * .then((role) => console.log(`role deleted.`))
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
      * .then((space) => space.getRole('<roles_id>'))
      * .then((roles) => {
      *   roles.name = 'New role name'
      *   return roles.update()
      * })
      * .then((roles) => console.log(`roles ${roles.sys.id} updated.`))
      * .catch(console.error)
      * ```
      */
    def update(): js.Promise[Role]
  }
  object Role {
    
    inline def apply(
      delete: () => js.Promise[Unit],
      name: String,
      permissions: ContentDelivery,
      policies: js.Array[Actions],
      sys: MetaSysProps,
      toPlainObject: () => RoleProps,
      update: () => js.Promise[Role]
    ): Role = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], policies = policies.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Role]
    }
    
    extension [Self <: Role](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => js.Promise[Role]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait RoleProps extends StObject {
    
    var name: String
    
    /**
      * Permissions for application sections
      */
    var permissions: ContentDelivery
    
    var policies: js.Array[Actions]
    
    var sys: MetaSysProps
  }
  object RoleProps {
    
    inline def apply(name: String, permissions: ContentDelivery, policies: js.Array[Actions], sys: MetaSysProps): RoleProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], policies = policies.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleProps]
    }
    
    extension [Self <: RoleProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: ContentDelivery): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPolicies(value: js.Array[Actions]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
      
      inline def setPoliciesVarargs(value: Actions*): Self = StObject.set(x, "policies", js.Array(value :_*))
      
      inline def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
