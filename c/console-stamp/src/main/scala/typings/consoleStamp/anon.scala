package typings.consoleStamp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Colors extends StObject {
    
    /**
      * An object representing a color theme. More info https://www.npmjs.com/package/colors
      */
    var colors: js.UndefOr[Label] = js.undefined
    
    /**
      * An array containing the methods to exclude in the patch)
      */
    var exclude: js.UndefOr[js.Any] = js.undefined
    
    /**
      * An array containing the methods to include in the patch
      */
    var include: js.UndefOr[js.Any] = js.undefined
    
    /**
      * If true it will show the label (LOG | INFO | WARN | ERROR)
      */
    var label: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A custom prefix for the label.
      */
    var labelPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * A custom suffix for the label.
      */
    var labelSuffix: js.UndefOr[String] = js.undefined
    
    /**
      * Types can be String, Object (interpreted with util.inspect), or Function. See the test-metadata.js for examples.
      * Note that metadata can still be sent as the third parameter (as in vesion 1.6) as a backward compatibillity feature, but this is deprecated.
      */
    var metadata: js.UndefOr[js.Any] = js.undefined
    
    /**
      * A string with date format based on Javascript Date Format
      */
    var pattern: js.UndefOr[String] = js.undefined
  }
  object Colors {
    
    inline def apply(): Colors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Colors]
    }
    
    extension [Self <: Colors](x: Self) {
      
      inline def setColors(value: Label): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setExclude(value: js.Any): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setInclude(value: js.Any): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setLabel(value: Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelPrefix(value: String): Self = StObject.set(x, "labelPrefix", value.asInstanceOf[js.Any])
      
      inline def setLabelPrefixUndefined: Self = StObject.set(x, "labelPrefix", js.undefined)
      
      inline def setLabelSuffix(value: String): Self = StObject.set(x, "labelSuffix", value.asInstanceOf[js.Any])
      
      inline def setLabelSuffixUndefined: Self = StObject.set(x, "labelSuffix", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    var label: js.UndefOr[js.Any] = js.undefined
    
    var metadata: js.UndefOr[js.Any] = js.undefined
    
    var stamp: js.UndefOr[js.Any] = js.undefined
  }
  object Label {
    
    inline def apply(): Label = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setStamp(value: js.Any): Self = StObject.set(x, "stamp", value.asInstanceOf[js.Any])
      
      inline def setStampUndefined: Self = StObject.set(x, "stamp", js.undefined)
    }
  }
}
