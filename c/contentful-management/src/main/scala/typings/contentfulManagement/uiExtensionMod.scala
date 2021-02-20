package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.FieldTypes
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uiExtensionMod {
  
  @JSImport("contentful-management/dist/typings/entities/ui-extension", "wrapUiExtension")
  @js.native
  def wrapUiExtension(http: AxiosInstance, data: UIExtensionProps): UIExtension = js.native
  
  @JSImport("contentful-management/dist/typings/entities/ui-extension", "wrapUiExtensionCollection")
  @js.native
  def wrapUiExtensionCollection(http: AxiosInstance, data: CollectionProp[UIExtensionProps]): Collection[UIExtension, UIExtensionProps] = js.native
  
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
    implicit class UIExtensionMutableBuilder[Self <: UIExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[UIExtension]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait UIExtensionProps extends StObject {
    
    var extension: FieldTypes = js.native
    
    var sys: MetaSysProps = js.native
  }
  object UIExtensionProps {
    
    @scala.inline
    def apply(extension: FieldTypes, sys: MetaSysProps): UIExtensionProps = {
      val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
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
