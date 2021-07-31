package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.ExportAllDeclaration_
  - typings.babelTypes.ts36Mod.ExportDefaultDeclaration_
  - typings.babelTypes.ts36Mod.ExportNamedDeclaration_
  - typings.babelTypes.ts36Mod.ImportDeclaration_
*/
trait ModuleDeclaration extends StObject
object ModuleDeclaration {
  
  @scala.inline
  def ExportAllDeclaration_(end: Double, loc: SourceLocation, source: StringLiteral_, start: Double): typings.babelTypes.ts36Mod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ExportAllDeclaration_]
  }
  
  @scala.inline
  def ExportDefaultDeclaration_(declaration: Declaration | Expression, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ExportDefaultDeclaration_]
  }
  
  @scala.inline
  def ExportNamedDeclaration_(
    declaration: Declaration,
    end: Double,
    loc: SourceLocation,
    specifiers: js.Array[ExportSpecifier_],
    start: Double
  ): typings.babelTypes.ts36Mod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], source = null)
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ExportNamedDeclaration_]
  }
  
  @scala.inline
  def ImportDeclaration_(
    end: Double,
    loc: SourceLocation,
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
    start: Double
  ): typings.babelTypes.ts36Mod.ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ImportDeclaration_]
  }
}
