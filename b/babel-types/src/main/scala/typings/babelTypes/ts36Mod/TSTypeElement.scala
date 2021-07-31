package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.TSCallSignatureDeclaration
  - typings.babelTypes.ts36Mod.TSConstructSignatureDeclaration
  - typings.babelTypes.ts36Mod.TSIndexSignature
  - typings.babelTypes.ts36Mod.TSMethodSignature
  - typings.babelTypes.ts36Mod.TSPropertySignature
*/
trait TSTypeElement extends StObject
object TSTypeElement {
  
  @scala.inline
  def TSCallSignatureDeclaration(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSCallSignatureDeclaration]
  }
  
  @scala.inline
  def TSConstructSignatureDeclaration(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSConstructSignatureDeclaration]
  }
  
  @scala.inline
  def TSIndexSignature(end: Double, loc: SourceLocation, parameters: js.Array[Identifier_], start: Double): typings.babelTypes.ts36Mod.TSIndexSignature = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], readonly = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSIndexSignature]
  }
  
  @scala.inline
  def TSMethodSignature(end: Double, key: Expression, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSMethodSignature = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], computed = null, optional = null, parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSMethodSignature]
  }
  
  @scala.inline
  def TSPropertySignature(end: Double, key: Expression, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSPropertySignature = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], computed = null, initializer = null, optional = null, readonly = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSPropertySignature]
  }
}
