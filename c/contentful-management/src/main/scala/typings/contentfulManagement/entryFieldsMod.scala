package typings.contentfulManagement

import typings.contentfulManagement.contentfulManagementStrings.Link
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryFieldsMod {
  
  trait Array
    extends StObject
       with _EntryFields {
    
    var items: Entry | Asset | js.Symbol
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Array
  }
  object Array {
    
    inline def apply(items: Entry | Asset | js.Symbol): Array = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Array")
      __obj.asInstanceOf[Array]
    }
    
    extension [Self <: Array](x: Self) {
      
      inline def setItems(value: Entry | Asset | js.Symbol): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.contentfulManagement.contentfulManagementStrings.Array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Asset extends StObject {
    
    var linkType: typings.contentfulManagement.contentfulManagementStrings.Asset
    
    var `type`: Link
  }
  object Asset {
    
    inline def apply(): Asset = {
      val __obj = js.Dynamic.literal(linkType = "Asset")
      __obj.updateDynamic("type")("Link")
      __obj.asInstanceOf[Asset]
    }
    
    extension [Self <: Asset](x: Self) {
      
      inline def setLinkType(value: typings.contentfulManagement.contentfulManagementStrings.Asset): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      inline def setType(value: Link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Boolean extends StObject {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Boolean
  }
  object Boolean {
    
    inline def apply(): Boolean = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Boolean")
      __obj.asInstanceOf[Boolean]
    }
    
    extension [Self <: Boolean](x: Self) {
      
      inline def setType(value: typings.contentfulManagement.contentfulManagementStrings.Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Date
    extends StObject
       with _EntryFields {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Date
  }
  object Date {
    
    inline def apply(): Date = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Date")
      __obj.asInstanceOf[Date]
    }
    
    extension [Self <: Date](x: Self) {
      
      inline def setType(value: typings.contentfulManagement.contentfulManagementStrings.Date): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entry
    extends StObject
       with _EntryFields {
    
    var linkType: typings.contentfulManagement.contentfulManagementStrings.Entry
    
    var `type`: Link
  }
  object Entry {
    
    inline def apply(): Entry = {
      val __obj = js.Dynamic.literal(linkType = "Entry")
      __obj.updateDynamic("type")("Link")
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setLinkType(value: typings.contentfulManagement.contentfulManagementStrings.Entry): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      inline def setType(value: Link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - js.Symbol
    - typings.contentfulManagement.entryFieldsMod.Text
    - typings.contentfulManagement.entryFieldsMod.RichText
    - typings.contentfulManagement.entryFieldsMod.Integer
    - scala.Double
    - typings.contentfulManagement.entryFieldsMod.Date
    - scala.Boolean
    - typings.std.Record[java.lang.String, js.Any]
    - typings.contentfulManagement.entryFieldsMod.Location
    - typings.contentfulManagement.entryFieldsMod.Entry
    - typings.contentfulManagement.entryFieldsMod.Array
  */
  type EntryFields = _EntryFields | (Record[String, js.Any]) | js.Symbol | Double | scala.Boolean
  
  trait Integer
    extends StObject
       with _EntryFields {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Integer
  }
  object Integer {
    
    inline def apply(): Integer = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Integer")
      __obj.asInstanceOf[Integer]
    }
    
    extension [Self <: Integer](x: Self) {
      
      inline def setType(value: typings.contentfulManagement.contentfulManagementStrings.Integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location
    extends StObject
       with _EntryFields {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Location
  }
  object Location {
    
    inline def apply(): Location = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Location")
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setType(value: typings.contentfulManagement.contentfulManagementStrings.Location): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Number extends StObject {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Number
  }
  object Number {
    
    inline def apply(): Number = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Number")
      __obj.asInstanceOf[Number]
    }
    
    extension [Self <: Number](x: Self) {
      
      inline def setType(value: typings.contentfulManagement.contentfulManagementStrings.Number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Object extends StObject {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Object
  }
  object Object {
    
    inline def apply(): Object = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Object")
      __obj.asInstanceOf[Object]
    }
    
    extension [Self <: Object](x: Self) {
      
      inline def setType(value: typings.contentfulManagement.contentfulManagementStrings.Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RichText
    extends StObject
       with _EntryFields {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.RichText
  }
  object RichText {
    
    inline def apply(): RichText = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("RichText")
      __obj.asInstanceOf[RichText]
    }
    
    extension [Self <: RichText](x: Self) {
      
      inline def setType(value: typings.contentfulManagement.contentfulManagementStrings.RichText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Symbol extends StObject {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Symbol
  }
  object Symbol {
    
    inline def apply(): Symbol = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Symbol")
      __obj.asInstanceOf[Symbol]
    }
    
    extension [Self <: Symbol](x: Self) {
      
      inline def setType(value: typings.contentfulManagement.contentfulManagementStrings.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text
    extends StObject
       with _EntryFields {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Text
  }
  object Text {
    
    inline def apply(): Text = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Text")
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setType(value: typings.contentfulManagement.contentfulManagementStrings.Text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait _EntryFields extends StObject
  object _EntryFields {
    
    inline def Array(items: Entry | Asset | js.Symbol): typings.contentfulManagement.entryFieldsMod.Array = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Array")
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.Array]
    }
    
    inline def Date(): typings.contentfulManagement.entryFieldsMod.Date = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Date")
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.Date]
    }
    
    inline def Entry(): typings.contentfulManagement.entryFieldsMod.Entry = {
      val __obj = js.Dynamic.literal(linkType = "Entry")
      __obj.updateDynamic("type")("Link")
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.Entry]
    }
    
    inline def Integer(): typings.contentfulManagement.entryFieldsMod.Integer = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Integer")
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.Integer]
    }
    
    inline def Location(): typings.contentfulManagement.entryFieldsMod.Location = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Location")
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.Location]
    }
    
    inline def RichText(): typings.contentfulManagement.entryFieldsMod.RichText = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("RichText")
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.RichText]
    }
    
    inline def Text(): typings.contentfulManagement.entryFieldsMod.Text = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Text")
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.Text]
    }
  }
}
