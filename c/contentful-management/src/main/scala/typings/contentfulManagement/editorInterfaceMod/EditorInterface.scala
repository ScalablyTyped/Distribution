package typings.contentfulManagement.editorInterfaceMod

import typings.contentfulManagement.anon.MetaSysPropsspacesysMetaL
import typings.contentfulManagement.commonTypesMod.DefaultElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorInterface
  extends EditorInterfaceProps
     with DefaultElements[EditorInterfaceProps] {
  
  /**
    * Gets a control for a specific field
    * @return control object for specific field
    * ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getContentType('<contentType_id>'))
    * .then((contentType) => contentType.getEditorInterface())
    * .then((editorInterface) => {
    *  control = editorInterface.getControlForField('<field-id>')
    *  console.log(control)
    * })
    * .catch(console.error)
    * ```
    */
  def getControlForField(id: String): Null | Control = js.native
  
  /**
    * Sends an update to the server with any changes made to the object's properties
    * @return Object returned from the server with updated changes.
    * ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getContentType('<contentType_id>'))
    * .then((contentType) => contentType.getEditorInterface())
    * .then((editorInterface) => {
    *  editorInterface.controls[0] = { "fieldId": "title", "widgetId": "singleLine"}
    *  return editorInterface.update()
    * })
    * .catch(console.error)
    * ```
    */
  def update(): js.Promise[EditorInterface] = js.native
}
object EditorInterface {
  
  @scala.inline
  def apply(
    controls: js.Array[Control],
    getControlForField: String => Null | Control,
    sys: MetaSysPropsspacesysMetaL,
    toPlainObject: () => EditorInterfaceProps,
    update: () => js.Promise[EditorInterface]
  ): EditorInterface = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], getControlForField = js.Any.fromFunction1(getControlForField), sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[EditorInterface]
  }
  
  @scala.inline
  implicit class EditorInterfaceOps[Self <: EditorInterface] (val x: Self) extends AnyVal {
    
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
    def setGetControlForField(value: String => Null | Control): Self = this.set("getControlForField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: () => js.Promise[EditorInterface]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
