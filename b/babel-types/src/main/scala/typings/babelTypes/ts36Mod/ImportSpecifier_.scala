package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ImportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSpecifier_
  extends StObject
     with Node
     with ModuleSpecifier {
  
  var imported: Identifier_
  
  var local: Identifier_
  
  @JSName("type")
  var type_ImportSpecifier_ : ImportSpecifier
}
object ImportSpecifier_ {
  
  inline def apply(end: Double, imported: Identifier_, loc: SourceLocation, local: Identifier_, start: Double): ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[ImportSpecifier_]
  }
  
  extension [Self <: ImportSpecifier_](x: Self) {
    
    inline def setImported(value: Identifier_): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    inline def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setType(value: ImportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
