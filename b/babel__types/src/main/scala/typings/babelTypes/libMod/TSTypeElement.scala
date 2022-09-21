package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method_
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.TSCallSignatureDeclaration
  - typings.babelTypes.libMod.TSConstructSignatureDeclaration
  - typings.babelTypes.libMod.TSPropertySignature
  - typings.babelTypes.libMod.TSMethodSignature
  - typings.babelTypes.libMod.TSIndexSignature
*/
trait TSTypeElement extends StObject
object TSTypeElement {
  
  inline def TSCallSignatureDeclaration(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSCallSignatureDeclaration]
  }
  
  inline def TSConstructSignatureDeclaration(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSConstructSignatureDeclaration]
  }
  
  inline def TSIndexSignature(parameters: js.Array[Identifier_]): typings.babelTypes.libMod.TSIndexSignature = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIndexSignature]
  }
  
  inline def TSMethodSignature(key: Expression, kind: method_ | get | set, parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSMethodSignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSMethodSignature]
  }
  
  inline def TSPropertySignature(key: Expression, kind: get | set): typings.babelTypes.libMod.TSPropertySignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSPropertySignature]
  }
}
