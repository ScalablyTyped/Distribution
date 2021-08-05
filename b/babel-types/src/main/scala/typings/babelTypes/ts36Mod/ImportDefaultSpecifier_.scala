package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ImportDefaultSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDefaultSpecifier_
  extends StObject
     with Node
     with ModuleSpecifier {
  
  var local: Identifier_
  
  @JSName("type")
  var type_ImportDefaultSpecifier_ : ImportDefaultSpecifier
}
object ImportDefaultSpecifier_ {
  
  inline def apply(end: Double, loc: SourceLocation, local: Identifier_, start: Double): ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[ImportDefaultSpecifier_]
  }
  
  extension [Self <: ImportDefaultSpecifier_](x: Self) {
    
    inline def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setType(value: ImportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
