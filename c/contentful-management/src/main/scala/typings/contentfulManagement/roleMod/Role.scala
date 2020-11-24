package typings.contentfulManagement.roleMod

import typings.contentfulManagement.anon.Actions
import typings.contentfulManagement.anon.ContentDelivery
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Role
  extends RoleProps
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
  def update(): js.Promise[Role] = js.native
}
object Role {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class RoleOps[Self <: Role] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: () => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => js.Promise[Role]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
