package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorOptions extends StObject {
  
  var BaseIndentSize: js.UndefOr[Double] = js.undefined
  
  var ConvertTabsToSpaces: Boolean
  
  var IndentSize: Double
  
  var IndentStyle: typings.typescriptNn5FuAjk.mod.IndentStyle
  
  var NewLineCharacter: java.lang.String
  
  var TabSize: Double
}
object EditorOptions {
  
  inline def apply(
    ConvertTabsToSpaces: Boolean,
    IndentSize: Double,
    IndentStyle: IndentStyle,
    NewLineCharacter: java.lang.String,
    TabSize: Double
  ): EditorOptions = {
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces.asInstanceOf[js.Any], IndentSize = IndentSize.asInstanceOf[js.Any], IndentStyle = IndentStyle.asInstanceOf[js.Any], NewLineCharacter = NewLineCharacter.asInstanceOf[js.Any], TabSize = TabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
  
  extension [Self <: EditorOptions](x: Self) {
    
    inline def setBaseIndentSize(value: Double): Self = StObject.set(x, "BaseIndentSize", value.asInstanceOf[js.Any])
    
    inline def setBaseIndentSizeUndefined: Self = StObject.set(x, "BaseIndentSize", js.undefined)
    
    inline def setConvertTabsToSpaces(value: Boolean): Self = StObject.set(x, "ConvertTabsToSpaces", value.asInstanceOf[js.Any])
    
    inline def setIndentSize(value: Double): Self = StObject.set(x, "IndentSize", value.asInstanceOf[js.Any])
    
    inline def setIndentStyle(value: IndentStyle): Self = StObject.set(x, "IndentStyle", value.asInstanceOf[js.Any])
    
    inline def setNewLineCharacter(value: java.lang.String): Self = StObject.set(x, "NewLineCharacter", value.asInstanceOf[js.Any])
    
    inline def setTabSize(value: Double): Self = StObject.set(x, "TabSize", value.asInstanceOf[js.Any])
  }
}
