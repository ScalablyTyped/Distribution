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
  
  inline def wrapAppDefinition(http: AxiosInstance, data: AppDefinitionProps): AppDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAppDefinition")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[AppDefinition]
  
  inline def wrapAppDefinitionCollection(http: AxiosInstance, data: CollectionProp[AppDefinitionProps]): Collection[AppDefinition, AppDefinitionProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAppDefinitionCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[AppDefinition, AppDefinitionProps]]
  
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
    
    inline def apply(
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
    
    extension [Self <: AppDefinition](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => js.Promise[AppDefinition]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
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
    
    inline def apply(locations: js.Array[LocationDefinition], name: String, src: String, sys: MetaSysProps): AppDefinitionProps = {
      val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppDefinitionProps]
    }
    
    extension [Self <: AppDefinitionProps](x: Self) {
      
      inline def setLocations(value: js.Array[LocationDefinition]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: LocationDefinition*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
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
    
    inline def `app-config`: typings.contentfulManagement.contentfulManagementStrings.`app-config` = "app-config".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.`app-config`]
    
    inline def dialog: typings.contentfulManagement.contentfulManagementStrings.dialog = "dialog".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.dialog]
    
    inline def `entry-editor`: typings.contentfulManagement.contentfulManagementStrings.`entry-editor` = "entry-editor".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.`entry-editor`]
    
    inline def `entry-sidebar`: typings.contentfulManagement.contentfulManagementStrings.`entry-sidebar` = "entry-sidebar".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.`entry-sidebar`]
    
    inline def page: typings.contentfulManagement.contentfulManagementStrings.page = "page".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.page]
  }
  
  trait ArrayFieldType
    extends StObject
       with FieldType {
    
    var items: SingleFieldType | LinkFieldType
    
    var `type`: Array
  }
  object ArrayFieldType {
    
    inline def apply(items: SingleFieldType | LinkFieldType): ArrayFieldType = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Array")
      __obj.asInstanceOf[ArrayFieldType]
    }
    
    extension [Self <: ArrayFieldType](x: Self) {
      
      inline def setItems(value: SingleFieldType | LinkFieldType): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setType(value: Array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EntryFieldLocationDefinition
    extends StObject
       with LocationDefinition {
    
    var fieldTypes: js.Array[FieldType]
    
    var location: `entry-field`
  }
  object EntryFieldLocationDefinition {
    
    inline def apply(fieldTypes: js.Array[FieldType]): EntryFieldLocationDefinition = {
      val __obj = js.Dynamic.literal(fieldTypes = fieldTypes.asInstanceOf[js.Any], location = "entry-field")
      __obj.asInstanceOf[EntryFieldLocationDefinition]
    }
    
    extension [Self <: EntryFieldLocationDefinition](x: Self) {
      
      inline def setFieldTypes(value: js.Array[FieldType]): Self = StObject.set(x, "fieldTypes", value.asInstanceOf[js.Any])
      
      inline def setFieldTypesVarargs(value: FieldType*): Self = StObject.set(x, "fieldTypes", js.Array(value :_*))
      
      inline def setLocation(value: `entry-field`): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
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
    
    inline def Boolean: typings.contentfulManagement.contentfulManagementStrings.Boolean = "Boolean".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Boolean]
    
    inline def Date: typings.contentfulManagement.contentfulManagementStrings.Date = "Date".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Date]
    
    inline def Integer: typings.contentfulManagement.contentfulManagementStrings.Integer = "Integer".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Integer]
    
    inline def Location: typings.contentfulManagement.contentfulManagementStrings.Location = "Location".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Location]
    
    inline def Number: typings.contentfulManagement.contentfulManagementStrings.Number = "Number".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Number]
    
    inline def Object: typings.contentfulManagement.contentfulManagementStrings.Object = "Object".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Object]
    
    inline def RichText: typings.contentfulManagement.contentfulManagementStrings.RichText = "RichText".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.RichText]
    
    inline def Symbol: typings.contentfulManagement.contentfulManagementStrings.Symbol = "Symbol".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Symbol]
    
    inline def Text: typings.contentfulManagement.contentfulManagementStrings.Text = "Text".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Text]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.appDefinitionMod.SingleFieldType
    - typings.contentfulManagement.appDefinitionMod.LinkFieldType
    - typings.contentfulManagement.appDefinitionMod.ArrayFieldType
  */
  trait FieldType extends StObject
  object FieldType {
    
    inline def ArrayFieldType(items: SingleFieldType | LinkFieldType): typings.contentfulManagement.appDefinitionMod.ArrayFieldType = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Array")
      __obj.asInstanceOf[typings.contentfulManagement.appDefinitionMod.ArrayFieldType]
    }
    
    inline def LinkFieldType(linkType: LinkType): typings.contentfulManagement.appDefinitionMod.LinkFieldType = {
      val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Link")
      __obj.asInstanceOf[typings.contentfulManagement.appDefinitionMod.LinkFieldType]
    }
    
    inline def SingleFieldType(`type`: Field): typings.contentfulManagement.appDefinitionMod.SingleFieldType = {
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
    
    inline def apply(linkType: LinkType): LinkFieldType = {
      val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Link")
      __obj.asInstanceOf[LinkFieldType]
    }
    
    extension [Self <: LinkFieldType](x: Self) {
      
      inline def setLinkType(value: LinkType): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      inline def setType(value: Link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.contentfulManagementStrings.Asset
    - typings.contentfulManagement.contentfulManagementStrings.Entry
  */
  trait LinkType extends StObject
  object LinkType {
    
    inline def Asset: typings.contentfulManagement.contentfulManagementStrings.Asset = "Asset".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Asset]
    
    inline def Entry: typings.contentfulManagement.contentfulManagementStrings.Entry = "Entry".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.Entry]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.appDefinitionMod.SingleLocationDefinition
    - typings.contentfulManagement.appDefinitionMod.EntryFieldLocationDefinition
  */
  trait LocationDefinition extends StObject
  object LocationDefinition {
    
    inline def EntryFieldLocationDefinition(fieldTypes: js.Array[FieldType]): typings.contentfulManagement.appDefinitionMod.EntryFieldLocationDefinition = {
      val __obj = js.Dynamic.literal(fieldTypes = fieldTypes.asInstanceOf[js.Any], location = "entry-field")
      __obj.asInstanceOf[typings.contentfulManagement.appDefinitionMod.EntryFieldLocationDefinition]
    }
    
    inline def SingleLocationDefinition(location: AppLocation): typings.contentfulManagement.appDefinitionMod.SingleLocationDefinition = {
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
    
    inline def apply(`type`: Field): SingleFieldType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleFieldType]
    }
    
    extension [Self <: SingleFieldType](x: Self) {
      
      inline def setType(value: Field): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SingleLocationDefinition
    extends StObject
       with LocationDefinition {
    
    var location: AppLocation
  }
  object SingleLocationDefinition {
    
    inline def apply(location: AppLocation): SingleLocationDefinition = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleLocationDefinition]
    }
    
    extension [Self <: SingleLocationDefinition](x: Self) {
      
      inline def setLocation(value: AppLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
}
