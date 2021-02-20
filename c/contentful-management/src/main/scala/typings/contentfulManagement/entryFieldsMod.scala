package typings.contentfulManagement

import typings.contentfulManagement.contentfulManagementStrings.Link
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryFieldsMod {
  
  @js.native
  trait Array extends _EntryFields {
    
    var items: Entry | Asset | js.Symbol = js.native
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Array = js.native
  }
  object Array {
    
    @scala.inline
    def apply(
      items: Entry | Asset | js.Symbol,
      `type`: typings.contentfulManagement.contentfulManagementStrings.Array
    ): Array = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Array]
    }
    
    @scala.inline
    implicit class ArrayMutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: Entry | Asset | js.Symbol): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: typings.contentfulManagement.contentfulManagementStrings.Array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Asset extends StObject {
    
    var linkType: typings.contentfulManagement.contentfulManagementStrings.Asset = js.native
    
    var `type`: Link = js.native
  }
  object Asset {
    
    @scala.inline
    def apply(linkType: typings.contentfulManagement.contentfulManagementStrings.Asset, `type`: Link): Asset = {
      val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Asset]
    }
    
    @scala.inline
    implicit class AssetMutableBuilder[Self <: Asset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkType(value: typings.contentfulManagement.contentfulManagementStrings.Asset): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Boolean extends StObject {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Boolean = js.native
  }
  object Boolean {
    
    @scala.inline
    def apply(`type`: typings.contentfulManagement.contentfulManagementStrings.Boolean): Boolean = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Boolean]
    }
    
    @scala.inline
    implicit class BooleanMutableBuilder[Self <: Boolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typings.contentfulManagement.contentfulManagementStrings.Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Date extends _EntryFields {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Date = js.native
  }
  object Date {
    
    @scala.inline
    def apply(`type`: typings.contentfulManagement.contentfulManagementStrings.Date): Date = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typings.contentfulManagement.contentfulManagementStrings.Date): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Entry extends _EntryFields {
    
    var linkType: typings.contentfulManagement.contentfulManagementStrings.Entry = js.native
    
    var `type`: Link = js.native
  }
  object Entry {
    
    @scala.inline
    def apply(linkType: typings.contentfulManagement.contentfulManagementStrings.Entry, `type`: Link): Entry = {
      val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkType(value: typings.contentfulManagement.contentfulManagementStrings.Entry): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait Integer extends _EntryFields {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Integer = js.native
  }
  object Integer {
    
    @scala.inline
    def apply(`type`: typings.contentfulManagement.contentfulManagementStrings.Integer): Integer = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Integer]
    }
    
    @scala.inline
    implicit class IntegerMutableBuilder[Self <: Integer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typings.contentfulManagement.contentfulManagementStrings.Integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Location extends _EntryFields {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Location = js.native
  }
  object Location {
    
    @scala.inline
    def apply(`type`: typings.contentfulManagement.contentfulManagementStrings.Location): Location = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typings.contentfulManagement.contentfulManagementStrings.Location): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Number extends StObject {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Number = js.native
  }
  object Number {
    
    @scala.inline
    def apply(`type`: typings.contentfulManagement.contentfulManagementStrings.Number): Number = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Number]
    }
    
    @scala.inline
    implicit class NumberMutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typings.contentfulManagement.contentfulManagementStrings.Number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Object extends StObject {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Object = js.native
  }
  object Object {
    
    @scala.inline
    def apply(`type`: typings.contentfulManagement.contentfulManagementStrings.Object): Object = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Object]
    }
    
    @scala.inline
    implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typings.contentfulManagement.contentfulManagementStrings.Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RichText extends _EntryFields {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.RichText = js.native
  }
  object RichText {
    
    @scala.inline
    def apply(`type`: typings.contentfulManagement.contentfulManagementStrings.RichText): RichText = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RichText]
    }
    
    @scala.inline
    implicit class RichTextMutableBuilder[Self <: RichText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typings.contentfulManagement.contentfulManagementStrings.RichText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Symbol extends StObject {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Symbol = js.native
  }
  object Symbol {
    
    @scala.inline
    def apply(`type`: typings.contentfulManagement.contentfulManagementStrings.Symbol): Symbol = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Symbol]
    }
    
    @scala.inline
    implicit class SymbolMutableBuilder[Self <: Symbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typings.contentfulManagement.contentfulManagementStrings.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Text extends _EntryFields {
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Text = js.native
  }
  object Text {
    
    @scala.inline
    def apply(`type`: typings.contentfulManagement.contentfulManagementStrings.Text): Text = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typings.contentfulManagement.contentfulManagementStrings.Text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait _EntryFields extends StObject
  object _EntryFields {
    
    @scala.inline
    def Array(
      items: Entry | Asset | js.Symbol,
      `type`: typings.contentfulManagement.contentfulManagementStrings.Array
    ): typings.contentfulManagement.entryFieldsMod.Array = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.Array]
    }
    
    @scala.inline
    def Date(`type`: typings.contentfulManagement.contentfulManagementStrings.Date): typings.contentfulManagement.entryFieldsMod.Date = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.Date]
    }
    
    @scala.inline
    def Entry(linkType: typings.contentfulManagement.contentfulManagementStrings.Entry, `type`: Link): typings.contentfulManagement.entryFieldsMod.Entry = {
      val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.Entry]
    }
    
    @scala.inline
    def Integer(`type`: typings.contentfulManagement.contentfulManagementStrings.Integer): typings.contentfulManagement.entryFieldsMod.Integer = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.Integer]
    }
    
    @scala.inline
    def Location(`type`: typings.contentfulManagement.contentfulManagementStrings.Location): typings.contentfulManagement.entryFieldsMod.Location = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.Location]
    }
    
    @scala.inline
    def RichText(`type`: typings.contentfulManagement.contentfulManagementStrings.RichText): typings.contentfulManagement.entryFieldsMod.RichText = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.RichText]
    }
    
    @scala.inline
    def Text(`type`: typings.contentfulManagement.contentfulManagementStrings.Text): typings.contentfulManagement.entryFieldsMod.Text = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.entryFieldsMod.Text]
    }
  }
}
