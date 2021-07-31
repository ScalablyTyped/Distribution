package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ExportAllDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAllDeclaration_
  extends StObject
     with Node
     with Declaration
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  
  var source: StringLiteral_
  
  @JSName("type")
  var type_ExportAllDeclaration_ : ExportAllDeclaration
}
object ExportAllDeclaration_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, source: StringLiteral_, start: Double): ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[ExportAllDeclaration_]
  }
  
  @scala.inline
  implicit class ExportAllDeclaration_MutableBuilder[Self <: ExportAllDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExportAllDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
