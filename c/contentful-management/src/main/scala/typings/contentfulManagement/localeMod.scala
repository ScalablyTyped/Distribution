package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.ExceptLocalePropssys
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.contentfulManagementStrings.contentDeliveryApi
import typings.contentfulManagement.contentfulManagementStrings.contentManagementApi
import typings.contentfulManagement.contentfulManagementStrings.default
import typings.contentfulManagement.contentfulManagementStrings.optional
import typings.typeFest.setOptionalMod.SetOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeMod {
  
  @JSImport("contentful-management/dist/typings/entities/locale", "wrapLocale")
  @js.native
  def wrapLocale(http: AxiosInstance, data: LocaleProps): Locale = js.native
  
  @JSImport("contentful-management/dist/typings/entities/locale", "wrapLocaleCollection")
  @js.native
  def wrapLocaleCollection(http: AxiosInstance, data: CollectionProp[LocaleProps]): Collection[Locale, LocaleProps] = js.native
  
  type CreateLocaleProps = SetOptional[
    ExceptLocalePropssys, 
    optional | contentManagementApi | default | contentDeliveryApi
  ]
  
  @js.native
  trait Locale
    extends LocaleProps
       with DefaultElements[LocaleProps] {
    
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
      * .then((space) => space.getLocale('<locale_id>'))
      * .then((locale) => locale.delete())
      * .then(() => console.log(`locale deleted.`))
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
      * .then((space) => space.getLocale('<locale_id>'))
      * .then((locale) => {
      *   locale.name = 'New locale name'
      *   return locale.update()
      * })
      * .then((locale) => console.log(`locale ${locale.sys.id} updated.`))
      * .catch(console.error)
      * ```
      */
    def update(): js.Promise[Locale] = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(
      code: String,
      contentDeliveryApi: Boolean,
      contentManagementApi: Boolean,
      default: Boolean,
      delete: () => js.Promise[Unit],
      fallbackCode: String,
      name: String,
      optional: Boolean,
      sys: MetaSysProps,
      toPlainObject: () => LocaleProps,
      update: () => js.Promise[Locale]
    ): Locale = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], contentDeliveryApi = contentDeliveryApi.asInstanceOf[js.Any], contentManagementApi = contentManagementApi.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), fallbackCode = fallbackCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[Locale]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait LocaleProps extends StObject {
    
    /**
      * If this is the default locale
      */
    var default: Boolean = js.native
    
    /**
      * Locale code (example: en-us)
      */
    var code: String = js.native
    
    /**
      *  If the content under this locale should be available on the CDA (for public reading)
      */
    var contentDeliveryApi: Boolean = js.native
    
    /**
      * If the content under this locale should be available on the CMA (for editing)
      */
    var contentManagementApi: Boolean = js.native
    
    /**
      * Locale code to fallback to when there is not content for the current locale
      */
    var fallbackCode: String = js.native
    
    /**
      * Locale name
      */
    var name: String = js.native
    
    /**
      * If the locale needs to be filled in on entries or not
      */
    var optional: Boolean = js.native
    
    var sys: MetaSysProps = js.native
  }
  object LocaleProps {
    
    @scala.inline
    def apply(
      code: String,
      contentDeliveryApi: Boolean,
      contentManagementApi: Boolean,
      default: Boolean,
      fallbackCode: String,
      name: String,
      optional: Boolean,
      sys: MetaSysProps
    ): LocaleProps = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], contentDeliveryApi = contentDeliveryApi.asInstanceOf[js.Any], contentManagementApi = contentManagementApi.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], fallbackCode = fallbackCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleProps]
    }
    
    @scala.inline
    implicit class LocalePropsMutableBuilder[Self <: LocaleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentDeliveryApi(value: Boolean): Self = StObject.set(x, "contentDeliveryApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentManagementApi(value: Boolean): Self = StObject.set(x, "contentManagementApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackCode(value: String): Self = StObject.set(x, "fallbackCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
