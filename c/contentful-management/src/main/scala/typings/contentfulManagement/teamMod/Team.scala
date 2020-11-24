package typings.contentfulManagement.teamMod

import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TeamOps[Self <: Team] (val x: Self) extends AnyVal {
    
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
    def setUpdate(value: () => js.Promise[Team]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
