package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def TSCallSignatureDeclaration(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration
  ): typings.babelTypes.ts36Mod.TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSCallSignatureDeclaration]
  }
  
  @scala.inline
  def TSConstructSignatureDeclaration(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration
  ): typings.babelTypes.ts36Mod.TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSConstructSignatureDeclaration]
  }
  
  @scala.inline
  def TSIndexSignature(
    end: Double,
    loc: SourceLocation,
    parameters: js.Array[Identifier_],
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSIndexSignature
  ): typings.babelTypes.ts36Mod.TSIndexSignature = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSIndexSignature]
  }
  
  @scala.inline
  def TSMethodSignature(
    end: Double,
    key: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSMethodSignature
  ): typings.babelTypes.ts36Mod.TSMethodSignature = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSMethodSignature]
  }
  
  @scala.inline
  def TSPropertySignature(
    end: Double,
    key: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSPropertySignature
  ): typings.babelTypes.ts36Mod.TSPropertySignature = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSPropertySignature]
  }
}
