package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ExportDefaultDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDefaultDeclaration_
  extends StObject
     with Node
     with Declaration
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  
  var declaration: Declaration | Expression
  
  @JSName("type")
  var type_ExportDefaultDeclaration_ : ExportDefaultDeclaration
}
object ExportDefaultDeclaration_ {
  
  inline def apply(declaration: Declaration | Expression, end: Double, loc: SourceLocation, start: Double): ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[ExportDefaultDeclaration_]
  }
  
  extension [Self <: ExportDefaultDeclaration_](x: Self) {
    
    inline def setDeclaration(value: Declaration | Expression): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setType(value: ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
