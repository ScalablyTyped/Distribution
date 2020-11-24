package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration
import typings.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration
import typings.babelTypes.babelTypesStrings.TSIndexSignature
import typings.babelTypes.babelTypesStrings.TSMethodSignature
import typings.babelTypes.babelTypesStrings.TSPropertySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.TSCallSignatureDeclaration_
  - typings.babelTypes.mod.TSConstructSignatureDeclaration_
  - typings.babelTypes.mod.TSPropertySignature_
  - typings.babelTypes.mod.TSMethodSignature_
  - typings.babelTypes.mod.TSIndexSignature_
*/
trait TSTypeElement extends _Node
object TSTypeElement {
  
  @scala.inline
  def TSPropertySignature_(key: Expression, `type`: TSPropertySignature): TSTypeElement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  
  @scala.inline
  def TSCallSignatureDeclaration_(parameters: js.Array[Identifier_ | RestElement_], `type`: TSCallSignatureDeclaration): TSTypeElement = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  
  @scala.inline
  def TSMethodSignature_(key: Expression, parameters: js.Array[Identifier_ | RestElement_], `type`: TSMethodSignature): TSTypeElement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  
  @scala.inline
  def TSConstructSignatureDeclaration_(parameters: js.Array[Identifier_ | RestElement_], `type`: TSConstructSignatureDeclaration): TSTypeElement = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  
  @scala.inline
  def TSIndexSignature_(parameters: js.Array[Identifier_], `type`: TSIndexSignature): TSTypeElement = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
}
