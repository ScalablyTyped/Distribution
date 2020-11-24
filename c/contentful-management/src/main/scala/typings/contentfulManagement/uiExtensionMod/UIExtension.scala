package typings.contentfulManagement.uiExtensionMod

import typings.contentfulManagement.anon.FieldTypes
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIExtension
  extends UIExtensionProps
     with DefaultElements[UIExtensionProps] {
  
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
    * .then((space) => space.getUiExtension('<ui_extension_id>'))
    * .then((uiExtension) => uiExtension.delete())
    * .then(() => console.log(`UI Extension deleted.`))
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
    * .then((space) => space.getUiExtension('<ui_extension_id>'))
    * .then((uiExtension) => {
    *   uiExtension.extension.name = 'New UI Extension name'
    *   return uiExtension.update()
    * })
    * .then((uiExtension) => console.log(`UI Extension ${uiExtension.sys.id} updated.`))
    * .catch(console.error)
    * ```
    */
  def update(): js.Promise[UIExtension] = js.native
}
object UIExtension {
  
  @scala.inline
  def apply(
    delete: () => js.Promise[Unit],
    extension: FieldTypes,
    sys: MetaSysProps,
    toPlainObject: () => UIExtensionProps,
    update: () => js.Promise[UIExtension]
  ): UIExtension = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), extension = extension.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[UIExtension]
  }
  
  @scala.inline
  implicit class UIExtensionOps[Self <: UIExtension] (val x: Self) extends AnyVal {
    
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
    def setUpdate(value: () => js.Promise[UIExtension]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
