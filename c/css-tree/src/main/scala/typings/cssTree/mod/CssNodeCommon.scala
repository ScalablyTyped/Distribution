package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssNodeCommon extends StObject {
  
  var loc: js.UndefOr[CssLocation] = js.undefined
  
  var `type`: String
}
object CssNodeCommon {
  
  inline def apply(`type`: String): CssNodeCommon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodeCommon]
  }
  
  extension [Self <: CssNodeCommon](x: Self) {
    
    inline def setLoc(value: CssLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
