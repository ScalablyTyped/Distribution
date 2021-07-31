package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.contentfulManagementStrings.Array
import typings.contentfulManagement.contentfulManagementStrings.Link
import typings.contentfulManagement.contentfulManagementStrings.`entry-field`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appDefinitionMod {
  
  @JSImport("contentful-management/dist/typings/entities/app-definition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wrapAppDefinition(http: AxiosInstance, data: AppDefinitionProps): AppDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAppDefinition")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[AppDefinition]
  
  @scala.inline
  def wrapAppDefinitionCollection(http: AxiosInstance, data: CollectionProp[AppDefinitionProps]): Collection[AppDefinition, AppDefinitionProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAppDefinitionCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[AppDefinition, AppDefinitionProps]]
  
  trait AppDefinition
    extends StObject
       with AppDefinitionProps
       with DefaultElements[AppDefinitionProps] {
    
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
      * .then((space) => space.getAppDefinition('<ui_extension_id>'))
      * .then((appDefinition) => appDefinition.delete())
      * .then(() => console.log(`App Definition deleted.`))
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
      * .then((space) => space.getAppDefinition('<ui_extension_id>'))
      * .then((appDefinition) => {
      *   appDefinition.extension.name = 'New App Definition name'
      *   return appDefinition.update()
      * })
      * .then((appDefinition) => console.log(`App Definition ${appDefinition.sys.id} updated.`))
      * .catch(console.error)
      * ```
      */
    def update(): js.Promise[AppDefinition]
  }
  object AppDefinition {
    
    @scala.inline
    def apply(
      delete: () => js.Promise[Unit],
      locations: js.Array[LocationDefinition],
      name: String,
      src: String,
      sys: MetaSysProps,
      toPlainObject: () => AppDefinitionProps,
      update: () => js.Promise[AppDefinition]
    ): AppDefinition = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[AppDefinition]
    }
    
    @scala.inline
    implicit class AppDefinitionMutableBuilder[Self <: AppDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[AppDefinition]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait AppDefinitionProps extends StObject {
    
    /**
      * Locations where the app can be installed
      */
    var locations: js.Array[LocationDefinition]
    
    /**
      * App name
      */
    var name: String
    
    /**
      * URL where the root HTML document of the app can be found
      */
    var src: String
    
    /**
      * System metadata
      */
    var sys: MetaSysProps
  }
  object AppDefinitionProps {
    
    @scala.inline
    def apply(locations: js.Array[LocationDefinition], name: String, src: String, sys: MetaSysProps): AppDefinitionProps = {
      val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppDefinitionProps]
    }
    
    @scala.inline
    implicit class AppDefinitionPropsMutableBuilder[Self <: AppDefinitionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocations(value: js.Array[LocationDefinition]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsVarargs(value: LocationDefinition*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.contentfulManagementStrings.`app-config`
    - typings.contentfulManagement.contentfulManagementStrings.`entry-sidebar`
    - typings.contentfulManagement.contentfulManagementStrings.`entry-editor`
    - typings.contentfulManagement.contentfulManagementStrings.dialog
    - typings.contentfulManagement.contentfulManagementStrings.page
  */
  trait AppLocation extends StObject
  object AppLocation {
    
    @scala.inline
    def `app-config`: typings.contentfulManagement.contentfulManagementStrings.`app-config` = "app-config".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.`app-config`]
    
    @scala.inline
    def dialog: typings.contentfulManagement.contentfulManagementStrings.dialog = "dialog".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.dialog]
    
    @scala.inline
    def `entry-editor`: typings.contentfulManagement.contentfulManagementStrings.`entry-editor` = "entry-editor".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.`entry-editor`]
    
    @scala.inline
    def `entry-sidebar`: typings.contentfulManagement.contentfulManagementStrings.`entry-sidebar` = "entry-sidebar".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.`entry-sidebar`]
    
    @scala.inline
    def page: typings.contentfulManagement.contentfulManagementStrings.page = "page".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.page]
  }
  
  trait ArrayFieldType
    extends StObject
       with FieldType {
    
    var items: SingleFieldType | LinkFieldType
    
    var `type`: Array
  }
  object ArrayFieldType {
    
    @scala.inline
    def apply(items: SingleFieldType | LinkFieldType): ArrayFieldType = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Array")
      __obj.asInstanceOf[ArrayFieldType]
    }
    
    @scala.inline
    implicit class ArrayFieldTypeMutableBuilder[Self <: ArrayFieldType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: SingleFieldType | LinkFieldType): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EntryFieldLocationDefinition
    extends StObject
       with LocationDefinition {
    
    var fieldTypes: js.Array[FieldType]
    
    var location: `entry-field`
  }
  object EntryFieldLocationDefinition {
    
    @scala.inline
    def apply(fieldTypes: js.Array[FieldType]): EntryFieldLocationDefinition = {
      val __obj = js.Dynamic.literal(fieldTypes = fieldTypes.asInstanceOf[js.Any], location = "entry-field")
      __obj.asInstanceOf[EntryFieldLocationDefinition]
    }
    
    @scala.inline
    implicit class EntryFieldLocationDefinitionMutableBuilder[Self <: EntryFieldLocationDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldTypes(value: js.Array[FieldType]): Self = StObject.set(x, "fieldTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldTypesVarargs(value: FieldType*): Self = StObject.set(x, "fieldTypes", js.Array(value :_*))
      
      @scala.inline
      def setLocation(value: `entry-field`): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.contentfulManagementStrings.Symbol
    - typings.contentfulManagement.contentfulManagementStrings.Text
    - typings.contentfulManagement.contentfulManagementStrings.RichText
    - typings.contentfulManagement.contentfulManagementStrings.Integer
    - typings.contentfulManagement.contentfulManagementStrings.Number
    - typings.contentfulManagement.contentfulManagementStrings.Date
    - typings.contentfulManagement.contentfulManagementStrings.Location
    - typings.contentfulManagement.contentfulManagementStrings.Boolean
    - typings.contentfulManagement.contentfulManagementStrings.Object
  */
  trait Field extends StObject
  object Field {
    
    @scala.inline
    def Boolean: typings.contentfulManagement.contentfulManagementStrings.Boolean = "Boolean".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Boolean]
    
    @scala.inline
    def Date: typings.contentfulManagement.contentfulManagementStrings.Date = "Date".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Date]
    
    @scala.inline
    def Integer: typings.contentfulManagement.contentfulManagementStrings.Integer = "Integer".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Integer]
    
    @scala.inline
    def Location: typings.contentfulManagement.contentfulManagementStrings.Location = "Location".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Location]
    
    @scala.inline
    def Number: typings.contentfulManagement.contentfulManagementStrings.Number = "Number".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Number]
    
    @scala.inline
    def Object: typings.contentfulManagement.contentfulManagementStrings.Object = "Object".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Object]
    
    @scala.inline
    def RichText: typings.contentfulManagement.contentfulManagementStrings.RichText = "RichText".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.RichText]
    
    @scala.inline
    def Symbol: typings.contentfulManagement.contentfulManagementStrings.Symbol = "Symbol".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Symbol]
    
    @scala.inline
    def Text: typings.contentfulManagement.contentfulManagementStrings.Text = "Text".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Text]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.appDefinitionMod.SingleFieldType
    - typings.contentfulManagement.appDefinitionMod.LinkFieldType
    - typings.contentfulManagement.appDefinitionMod.ArrayFieldType
  */
  trait FieldType extends StObject
  object FieldType {
    
    @scala.inline
    def ArrayFieldType(items: SingleFieldType | LinkFieldType): typings.contentfulManagement.appDefinitionMod.ArrayFieldType = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Array")
      __obj.asInstanceOf[typings.contentfulManagement.appDefinitionMod.ArrayFieldType]
    }
    
    @scala.inline
    def LinkFieldType(linkType: LinkType): typings.contentfulManagement.appDefinitionMod.LinkFieldType = {
      val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Link")
      __obj.asInstanceOf[typings.contentfulManagement.appDefinitionMod.LinkFieldType]
    }
    
    @scala.inline
    def SingleFieldType(`type`: Field): typings.contentfulManagement.appDefinitionMod.SingleFieldType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.appDefinitionMod.SingleFieldType]
    }
  }
  
  trait LinkFieldType
    extends StObject
       with FieldType {
    
    var linkType: LinkType
    
    var `type`: Link
  }
  object LinkFieldType {
    
    @scala.inline
    def apply(linkType: LinkType): LinkFieldType = {
      val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Link")
      __obj.asInstanceOf[LinkFieldType]
    }
    
    @scala.inline
    implicit class LinkFieldTypeMutableBuilder[Self <: LinkFieldType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkType(value: LinkType): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.contentfulManagementStrings.Asset
    - typings.contentfulManagement.contentfulManagementStrings.Entry
  */
  trait LinkType extends StObject
  object LinkType {
    
    @scala.inline
    def Asset: typings.contentfulManagement.contentfulManagementStrings.Asset = "Asset".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Asset]
    
    @scala.inline
    def Entry: typings.contentfulManagement.contentfulManagementStrings.Entry = "Entry".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Entry]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.appDefinitionMod.SingleLocationDefinition
    - typings.contentfulManagement.appDefinitionMod.EntryFieldLocationDefinition
  */
  trait LocationDefinition extends StObject
  object LocationDefinition {
    
    @scala.inline
    def EntryFieldLocationDefinition(fieldTypes: js.Array[FieldType]): typings.contentfulManagement.appDefinitionMod.EntryFieldLocationDefinition = {
      val __obj = js.Dynamic.literal(fieldTypes = fieldTypes.asInstanceOf[js.Any], location = "entry-field")
      __obj.asInstanceOf[typings.contentfulManagement.appDefinitionMod.EntryFieldLocationDefinition]
    }
    
    @scala.inline
    def SingleLocationDefinition(location: AppLocation): typings.contentfulManagement.appDefinitionMod.SingleLocationDefinition = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.appDefinitionMod.SingleLocationDefinition]
    }
  }
  
  trait SingleFieldType
    extends StObject
       with FieldType {
    
    var `type`: Field
  }
  object SingleFieldType {
    
    @scala.inline
    def apply(`type`: Field): SingleFieldType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleFieldType]
    }
    
    @scala.inline
    implicit class SingleFieldTypeMutableBuilder[Self <: SingleFieldType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Field): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SingleLocationDefinition
    extends StObject
       with LocationDefinition {
    
    var location: AppLocation
  }
  object SingleLocationDefinition {
    
    @scala.inline
    def apply(location: AppLocation): SingleLocationDefinition = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleLocationDefinition]
    }
    
    @scala.inline
    implicit class SingleLocationDefinitionMutableBuilder[Self <: SingleLocationDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: AppLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
}
