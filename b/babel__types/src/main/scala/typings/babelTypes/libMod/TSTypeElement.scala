package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method_
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.TSCallSignatureDeclaration__
  - typings.babelTypes.libMod.TSConstructSignatureDeclaration__
  - typings.babelTypes.libMod.TSPropertySignature__
  - typings.babelTypes.libMod.TSMethodSignature__
  - typings.babelTypes.libMod.TSIndexSignature__
*/
trait TSTypeElement extends StObject
object TSTypeElement {
  
  inline def TSCallSignatureDeclaration__(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSCallSignatureDeclaration__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSCallSignatureDeclaration__]
  }
  
  inline def TSConstructSignatureDeclaration__(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSConstructSignatureDeclaration__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSConstructSignatureDeclaration__]
  }
  
  inline def TSIndexSignature__(parameters: js.Array[Identifier_]): typings.babelTypes.libMod.TSIndexSignature__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIndexSignature__]
  }
  
  inline def TSMethodSignature__(key: Expression, kind: method_ | get | set, parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSMethodSignature__ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSMethodSignature__]
  }
  
  inline def TSPropertySignature__(key: Expression, kind: get | set): typings.babelTypes.libMod.TSPropertySignature__ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSPropertySignature__]
  }
}
