package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.TSCallSignatureDeclaration
  - typings.babelTypes.mod.TSConstructSignatureDeclaration
  - typings.babelTypes.mod.TSIndexSignature
  - typings.babelTypes.mod.TSMethodSignature
  - typings.babelTypes.mod.TSPropertySignature
*/
trait TSTypeElement extends StObject
object TSTypeElement {
  
  inline def TSCallSignatureDeclaration(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSCallSignatureDeclaration]
  }
  
  inline def TSConstructSignatureDeclaration(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSConstructSignatureDeclaration]
  }
  
  inline def TSIndexSignature(end: Double, loc: SourceLocation, parameters: js.Array[Identifier_], start: Double): typings.babelTypes.mod.TSIndexSignature = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], readonly = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typings.babelTypes.mod.TSIndexSignature]
  }
  
  inline def TSMethodSignature(end: Double, key: Expression, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSMethodSignature = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], computed = null, optional = null, parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typings.babelTypes.mod.TSMethodSignature]
  }
  
  inline def TSPropertySignature(end: Double, key: Expression, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSPropertySignature = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], computed = null, initializer = null, optional = null, readonly = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typings.babelTypes.mod.TSPropertySignature]
  }
}
