package typings.contentfulManagement.teamMembershipMod

import typings.contentfulManagement.anon.MetaSysPropsteamsysMetaLi
import typings.contentfulManagement.commonTypesMod.DefaultElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamMembership
  extends TeamMembershipProps
     with DefaultElements[TeamMembershipProps] {
  
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
    * client.getOrganization('organizationId')
    * .then(org => org.getTeamMembership('teamId', 'teamMembershipId'))
    * .then((teamMembership) => {
    *  teamMembership.delete();
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
    * client.getOrganization('organizationId')
    * .then(org => org.getTeamMembership('teamId', 'teamMembershipId'))
    * .then((teamMembership) => {
    *  teamMembership.admin = true;
    *  teamMembership.update();
    * })
    * .catch(console.error)
    * ```
    */
  def update(): js.Promise[TeamMembership] = js.native
}
object TeamMembership {
  
  @scala.inline
  def apply(
    admin: Boolean,
    delete: () => js.Promise[Unit],
    organizationMembershipId: String,
    sys: MetaSysPropsteamsysMetaLi,
    toPlainObject: () => TeamMembershipProps,
    update: () => js.Promise[TeamMembership]
  ): TeamMembership = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), organizationMembershipId = organizationMembershipId.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TeamMembership]
  }
  
  @scala.inline
  implicit class TeamMembershipOps[Self <: TeamMembership] (val x: Self) extends AnyVal {
    
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
    def setUpdate(value: () => js.Promise[TeamMembership]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
