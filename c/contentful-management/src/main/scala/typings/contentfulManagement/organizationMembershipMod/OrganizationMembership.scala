package typings.contentfulManagement.organizationMembershipMod

import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationMembership
  extends OrganizationMembershipProps
     with DefaultElements[OrganizationMembershipProps] {
  
  /**
    * Deletes this object on the server.
    * @example```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getOrganization('organization_id')
    * .then(org => org.getOrganizationMembership('organizationMembership_id'))
    * .then((organizationMembership) => {
    *  organizationMembership.delete();
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
    * .then(org => org.getOrganizationMembership('organizationMembership_id'))
    * .then((organizationMembership) => {
    *  organizationMembership.role = 'member';
    *  organizationMembership.update();
    * })
    * .catch(console.error)
    */
  def update(): js.Promise[OrganizationMembership] = js.native
}
object OrganizationMembership {
  
  @scala.inline
  def apply(
    delete: () => js.Promise[Unit],
    role: String,
    status: Boolean,
    sys: MetaSysProps,
    toPlainObject: () => OrganizationMembershipProps,
    update: () => js.Promise[OrganizationMembership]
  ): OrganizationMembership = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), role = role.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[OrganizationMembership]
  }
  
  @scala.inline
  implicit class OrganizationMembershipOps[Self <: OrganizationMembership] (val x: Self) extends AnyVal {
    
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
    def setUpdate(value: () => js.Promise[OrganizationMembership]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
