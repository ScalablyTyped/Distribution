package typings.devextremeB5DqTZzf.mod.DevExpress

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.double
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.doubleAccounting
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.singleAccounting
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.single_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exporter {
  
  trait ExcelFont extends StObject {
    
    /**
      * Specifies whether the text should be in bold.
      */
    var bold: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The text&apos;s color in hexadecimal characters.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies whether the text should be in italic.
      */
    var italic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the typeface that should be applied to the text.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The font size specified in points (1/72 of an inch).
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * The underline formatting style.
      */
    var underline: js.UndefOr[double | doubleAccounting | none | single_ | singleAccounting] = js.undefined
  }
  object ExcelFont {
    
    inline def apply(): ExcelFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelFont]
    }
    
    extension [Self <: ExcelFont](x: Self) {
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUnderline(value: double | doubleAccounting | none | single_ | singleAccounting): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
}
