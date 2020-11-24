package typings.contentfulManagement.teamSpaceMembershipMod

import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamSpaceMembership
  extends TeamSpaceMembershipProps
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
  def update(): js.Promise[TeamSpaceMembership] = js.native
}
object TeamSpaceMembership {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TeamSpaceMembershipOps[Self <: TeamSpaceMembership] (val x: Self) extends AnyVal {
    
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
    def setUpdate(value: () => js.Promise[TeamSpaceMembership]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
