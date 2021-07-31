package typings.contentfulManagement

import typings.contentfulManagement.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentTypeFieldsMod {
  
  trait ContentFields
    extends StObject
       with Item {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var items: js.UndefOr[Item] = js.undefined
    
    var localized: Boolean
    
    var name: String
    
    var omitted: js.UndefOr[Boolean] = js.undefined
    
    var required: Boolean
  }
  object ContentFields {
    
    @scala.inline
    def apply(id: String, localized: Boolean, name: String, required: Boolean, `type`: String): ContentFields = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localized = localized.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentFields]
    }
    
    @scala.inline
    implicit class ContentFieldsMutableBuilder[Self <: ContentFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: Item): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setLocalized(value: Boolean): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitted(value: Boolean): Self = StObject.set(x, "omitted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmittedUndefined: Self = StObject.set(x, "omitted", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    }
  }
  
  trait DateRange extends StObject {
    
    var max: js.UndefOr[String] = js.undefined
    
    var min: js.UndefOr[String] = js.undefined
  }
  object DateRange {
    
    @scala.inline
    def apply(): DateRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRange]
    }
    
    @scala.inline
    implicit class DateRangeMutableBuilder[Self <: DateRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  trait Item extends StObject {
    
    var linkType: js.UndefOr[String] = js.undefined
    
    var `type`: String
    
    var validations: js.UndefOr[js.Array[Validation]] = js.undefined
  }
  object Item {
    
    @scala.inline
    def apply(`type`: String): Item = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidations(value: js.Array[Validation]): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
      
      @scala.inline
      def setValidationsVarargs(value: Validation*): Self = StObject.set(x, "validations", js.Array(value :_*))
    }
  }
  
  trait NumRange extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
  }
  object NumRange {
    
    @scala.inline
    def apply(): NumRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumRange]
    }
    
    @scala.inline
    implicit class NumRangeMutableBuilder[Self <: NumRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  trait RegExp extends StObject {
    
    var flags: String
    
    var pattern: String
  }
  object RegExp {
    
    @scala.inline
    def apply(flags: String, pattern: String): RegExp = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegExp]
    }
    
    @scala.inline
    implicit class RegExpMutableBuilder[Self <: RegExp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait Validation extends StObject {
    
    var assetFileSize: js.UndefOr[NumRange] = js.undefined
    
    var assetImageDimensions: js.UndefOr[Height] = js.undefined
    
    var dateRange: js.UndefOr[DateRange] = js.undefined
    
    var enabledMarks: js.UndefOr[js.Array[String]] = js.undefined
    
    var enabledNodeTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var in: js.UndefOr[js.Array[String]] = js.undefined
    
    var linkContentType: js.UndefOr[js.Array[String]] = js.undefined
    
    var linkMimetypeGroup: js.UndefOr[js.Array[String]] = js.undefined
    
    var prohibitRegexp: js.UndefOr[RegExp] = js.undefined
    
    var range: js.UndefOr[NumRange] = js.undefined
    
    var regexp: js.UndefOr[RegExp] = js.undefined
    
    var size: js.UndefOr[NumRange] = js.undefined
    
    var unique: js.UndefOr[Boolean] = js.undefined
  }
  object Validation {
    
    @scala.inline
    def apply(): Validation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Validation]
    }
    
    @scala.inline
    implicit class ValidationMutableBuilder[Self <: Validation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssetFileSize(value: NumRange): Self = StObject.set(x, "assetFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetFileSizeUndefined: Self = StObject.set(x, "assetFileSize", js.undefined)
      
      @scala.inline
      def setAssetImageDimensions(value: Height): Self = StObject.set(x, "assetImageDimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetImageDimensionsUndefined: Self = StObject.set(x, "assetImageDimensions", js.undefined)
      
      @scala.inline
      def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
      
      @scala.inline
      def setEnabledMarks(value: js.Array[String]): Self = StObject.set(x, "enabledMarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledMarksUndefined: Self = StObject.set(x, "enabledMarks", js.undefined)
      
      @scala.inline
      def setEnabledMarksVarargs(value: String*): Self = StObject.set(x, "enabledMarks", js.Array(value :_*))
      
      @scala.inline
      def setEnabledNodeTypes(value: js.Array[String]): Self = StObject.set(x, "enabledNodeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledNodeTypesUndefined: Self = StObject.set(x, "enabledNodeTypes", js.undefined)
      
      @scala.inline
      def setEnabledNodeTypesVarargs(value: String*): Self = StObject.set(x, "enabledNodeTypes", js.Array(value :_*))
      
      @scala.inline
      def setIn(value: js.Array[String]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setInVarargs(value: String*): Self = StObject.set(x, "in", js.Array(value :_*))
      
      @scala.inline
      def setLinkContentType(value: js.Array[String]): Self = StObject.set(x, "linkContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkContentTypeUndefined: Self = StObject.set(x, "linkContentType", js.undefined)
      
      @scala.inline
      def setLinkContentTypeVarargs(value: String*): Self = StObject.set(x, "linkContentType", js.Array(value :_*))
      
      @scala.inline
      def setLinkMimetypeGroup(value: js.Array[String]): Self = StObject.set(x, "linkMimetypeGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkMimetypeGroupUndefined: Self = StObject.set(x, "linkMimetypeGroup", js.undefined)
      
      @scala.inline
      def setLinkMimetypeGroupVarargs(value: String*): Self = StObject.set(x, "linkMimetypeGroup", js.Array(value :_*))
      
      @scala.inline
      def setProhibitRegexp(value: RegExp): Self = StObject.set(x, "prohibitRegexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProhibitRegexpUndefined: Self = StObject.set(x, "prohibitRegexp", js.undefined)
      
      @scala.inline
      def setRange(value: NumRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRegexp(value: RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
      
      @scala.inline
      def setSize(value: NumRange): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
}
