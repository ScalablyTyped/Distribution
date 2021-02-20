package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.MetaSysPropsspacesysMetaL
import typings.contentfulManagement.commonTypesMod.DefaultElements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorInterfaceMod {
  
  @JSImport("contentful-management/dist/typings/entities/editor-interface", "wrapEditorInterface")
  @js.native
  def wrapEditorInterface(http: AxiosInstance, data: EditorInterfaceProps): EditorInterface = js.native
  
  @js.native
  trait Control extends StObject {
    
    /**
      * the id of the customized field
      */
    var fieldId: String = js.native
    
    /**
      * customization associated to the field
      */
    var widgetId: String = js.native
    
    var widgetNamespace: String = js.native
  }
  object Control {
    
    @scala.inline
    def apply(fieldId: String, widgetId: String, widgetNamespace: String): Control = {
      val __obj = js.Dynamic.literal(fieldId = fieldId.asInstanceOf[js.Any], widgetId = widgetId.asInstanceOf[js.Any], widgetNamespace = widgetNamespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Control]
    }
    
    @scala.inline
    implicit class ControlMutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetId(value: String): Self = StObject.set(x, "widgetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetNamespace(value: String): Self = StObject.set(x, "widgetNamespace", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class EditorInterfaceMutableBuilder[Self <: EditorInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetControlForField(value: String => Null | Control): Self = StObject.set(x, "getControlForField", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[EditorInterface]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait EditorInterfaceProps extends StObject {
    
    /**
      * Array of fields and it's associated widgetId
      */
    var controls: js.Array[Control] = js.native
    
    var sys: MetaSysPropsspacesysMetaL = js.native
  }
  object EditorInterfaceProps {
    
    @scala.inline
    def apply(controls: js.Array[Control], sys: MetaSysPropsspacesysMetaL): EditorInterfaceProps = {
      val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorInterfaceProps]
    }
    
    @scala.inline
    implicit class EditorInterfacePropsMutableBuilder[Self <: EditorInterfaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value :_*))
      
      @scala.inline
      def setSys(value: MetaSysPropsspacesysMetaL): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
