package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.TSCallSignatureDeclaration_
  - typings.babelTypes.mod.TSConstructSignatureDeclaration_
  - typings.babelTypes.mod.TSPropertySignature_
  - typings.babelTypes.mod.TSMethodSignature_
  - typings.babelTypes.mod.TSIndexSignature_
*/
trait TSTypeElement
  extends StObject
     with _Node
object TSTypeElement {
  
  @scala.inline
  def TSCallSignatureDeclaration_(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.mod.TSCallSignatureDeclaration_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSCallSignatureDeclaration_]
  }
  
  @scala.inline
  def TSConstructSignatureDeclaration_(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.mod.TSConstructSignatureDeclaration_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSConstructSignatureDeclaration_]
  }
  
  @scala.inline
  def TSIndexSignature_(parameters: js.Array[Identifier_]): typings.babelTypes.mod.TSIndexSignature_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typings.babelTypes.mod.TSIndexSignature_]
  }
  
  @scala.inline
  def TSMethodSignature_(key: Expression, parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.mod.TSMethodSignature_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], computed = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typings.babelTypes.mod.TSMethodSignature_]
  }
  
  @scala.inline
  def TSPropertySignature_(key: Expression): typings.babelTypes.mod.TSPropertySignature_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], computed = null, end = null, initializer = null, innerComments = null, leadingComments = null, loc = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typings.babelTypes.mod.TSPropertySignature_]
  }
}
