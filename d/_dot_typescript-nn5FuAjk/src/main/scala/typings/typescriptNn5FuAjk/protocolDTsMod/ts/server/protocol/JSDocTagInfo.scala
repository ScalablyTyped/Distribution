package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSDocTagInfo extends StObject {
  
  /** Name of the JSDoc tag */
  var name: String
  
  /**
    * Comment text after the JSDoc tag -- the text after the tag name until the next tag or end of comment
    * Display parts when UserPreferences.displayPartsForJSDoc is true, flattened to string otherwise.
    */
  var text: js.UndefOr[String | Array[SymbolDisplayPart]] = js.undefined
}
object JSDocTagInfo {
  
  inline def apply(name: String): JSDocTagInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDocTagInfo]
  }
  
  extension [Self <: JSDocTagInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setText(value: String | Array[SymbolDisplayPart]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
