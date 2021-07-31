package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.FieldTypes
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uiExtensionMod {
  
  @JSImport("contentful-management/dist/typings/entities/ui-extension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wrapUiExtension(http: AxiosInstance, data: UIExtensionProps): UIExtension = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapUiExtension")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[UIExtension]
  
  @scala.inline
  def wrapUiExtensionCollection(http: AxiosInstance, data: CollectionProp[UIExtensionProps]): Collection[UIExtension, UIExtensionProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapUiExtensionCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[UIExtension, UIExtensionProps]]
  
  trait UIExtension
    extends StObject
       with UIExtensionProps
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
      * .then((space) => space.getUiExtension('<ui_extension_id>'))
      * .then((uiExtension) => {
      *   uiExtension.extension.name = 'New UI Extension name'
      *   return uiExtension.update()
      * })
      * .then((uiExtension) => console.log(`UI Extension ${uiExtension.sys.id} updated.`))
      * .catch(console.error)
      * ```
      */
    def update(): js.Promise[UIExtension]
  }
  object UIExtension {
    
    @scala.inline
    def apply(
      delete: () => js.Promise[Unit],
      `extension`: FieldTypes,
      sys: MetaSysProps,
      toPlainObject: () => UIExtensionProps,
      update: () => js.Promise[UIExtension]
    ): UIExtension = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UIExtension]
    }
    
    @scala.inline
    implicit class UIExtensionMutableBuilder[Self <: UIExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[UIExtension]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait UIExtensionProps extends StObject {
    
    var `extension`: FieldTypes
    
    var sys: MetaSysProps
  }
  object UIExtensionProps {
    
    @scala.inline
    def apply(`extension`: FieldTypes, sys: MetaSysProps): UIExtensionProps = {
      val __obj = js.Dynamic.literal(sys = sys.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UIExtensionProps]
    }
    
    @scala.inline
    implicit class UIExtensionPropsMutableBuilder[Self <: UIExtensionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtension(value: FieldTypes): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
