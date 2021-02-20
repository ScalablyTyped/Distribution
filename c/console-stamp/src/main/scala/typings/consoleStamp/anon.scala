package typings.consoleStamp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Colors extends StObject {
    
    /**
      * An object representing a color theme. More info https://www.npmjs.com/package/colors
      */
    var colors: js.UndefOr[Label] = js.native
    
    /**
      * An array containing the methods to exclude in the patch)
      */
    var exclude: js.UndefOr[js.Any] = js.native
    
    /**
      * An array containing the methods to include in the patch
      */
    var include: js.UndefOr[js.Any] = js.native
    
    /**
      * If true it will show the label (LOG | INFO | WARN | ERROR)
      */
    var label: js.UndefOr[Boolean] = js.native
    
    /**
      * A custom prefix for the label.
      */
    var labelPrefix: js.UndefOr[String] = js.native
    
    /**
      * A custom suffix for the label.
      */
    var labelSuffix: js.UndefOr[String] = js.native
    
    /**
      * Types can be String, Object (interpreted with util.inspect), or Function. See the test-metadata.js for examples.
      * Note that metadata can still be sent as the third parameter (as in vesion 1.6) as a backward compatibillity feature, but this is deprecated.
      */
    var metadata: js.UndefOr[js.Any] = js.native
    
    /**
      * A string with date format based on Javascript Date Format
      */
    var pattern: js.UndefOr[String] = js.native
  }
  object Colors {
    
    @scala.inline
    def apply(): Colors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: Label): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Any): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setInclude(value: js.Any): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setLabel(value: Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPrefix(value: String): Self = StObject.set(x, "labelPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPrefixUndefined: Self = StObject.set(x, "labelPrefix", js.undefined)
      
      @scala.inline
      def setLabelSuffix(value: String): Self = StObject.set(x, "labelSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSuffixUndefined: Self = StObject.set(x, "labelSuffix", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    var label: js.UndefOr[js.Any] = js.native
    
    var metadata: js.UndefOr[js.Any] = js.native
    
    var stamp: js.UndefOr[js.Any] = js.native
  }
  object Label {
    
    @scala.inline
    def apply(): Label = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setStamp(value: js.Any): Self = StObject.set(x, "stamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStampUndefined: Self = StObject.set(x, "stamp", js.undefined)
    }
  }
}
