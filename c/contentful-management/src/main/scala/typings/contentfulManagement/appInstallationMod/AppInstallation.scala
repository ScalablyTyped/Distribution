package typings.contentfulManagement.appInstallationMod

import org.scalablytyped.runtime.StringDictionary
import typings.contentfulManagement.anon.MetaSysPropsappDefinition
import typings.contentfulManagement.commonTypesMod.DefaultElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstallation
  extends AppInstallationProps
     with DefaultElements[AppInstallationProps] {
  
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
    * .then((space) => space.getEnvironment('<environment_id>'))
    * .then((environment) => environment.getAppInstallation('<app_definition_id>'))
    * .then((appInstallation) => appInstallation.delete())
    * .then(() => console.log(`App installation deleted.`))
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
    * .then((space) => space.getEnvironment('<environment_id>'))
    * .then((environment) => environment.getAppInstallation('<app_definition_id>'))
    * .then((appInstallation) => {
    *    appInstallation.parameters.someParameter = 'New Value'
    *    return appInstallation.update()
    * })
    * .then((appInstallation) => console.log(`App installation ${appInstallation.sys.id} was updated`))
    * .catch(console.error)
    * ```
    */
  def update(): js.Promise[AppInstallation] = js.native
}
object AppInstallation {
  
  @scala.inline
  def apply(
    delete: () => js.Promise[Unit],
    parameters: StringDictionary[String],
    sys: MetaSysPropsappDefinition,
    toPlainObject: () => AppInstallationProps,
    update: () => js.Promise[AppInstallation]
  ): AppInstallation = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), parameters = parameters.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[AppInstallation]
  }
  
  @scala.inline
  implicit class AppInstallationOps[Self <: AppInstallation] (val x: Self) extends AnyVal {
    
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
    def setUpdate(value: () => js.Promise[AppInstallation]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
