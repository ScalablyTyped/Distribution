package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ExportDefaultSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDefaultSpecifier_
  extends StObject
     with Node
     with ModuleSpecifier {
  
  var exported: Identifier_
  
  @JSName("type")
  var type_ExportDefaultSpecifier_ : ExportDefaultSpecifier
}
object ExportDefaultSpecifier_ {
  
  inline def apply(end: Double, exported: Identifier_, loc: SourceLocation, start: Double): ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultSpecifier")
    __obj.asInstanceOf[ExportDefaultSpecifier_]
  }
  
  extension [Self <: ExportDefaultSpecifier_](x: Self) {
    
    inline def setExported(value: Identifier_): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    inline def setType(value: ExportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
