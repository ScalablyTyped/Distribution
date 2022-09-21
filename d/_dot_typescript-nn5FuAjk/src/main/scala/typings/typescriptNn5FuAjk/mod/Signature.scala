package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signature extends StObject {
  
  var declaration: js.UndefOr[SignatureDeclaration | JSDocSignature] = js.native
  
  def getDeclaration(): SignatureDeclaration = js.native
  
  def getDocumentationComment(): Array[SymbolDisplayPart] = js.native
  def getDocumentationComment(typeChecker: TypeChecker): Array[SymbolDisplayPart] = js.native
  
  def getJsDocTags(): Array[JSDocTagInfo] = js.native
  
  def getParameters(): Array[Symbol] = js.native
  
  def getReturnType(): Type = js.native
  
  def getTypeParameterAtPosition(pos: Double): Type = js.native
  
  def getTypeParameters(): js.UndefOr[Array[TypeParameter]] = js.native
  
  var parameters: Array[Symbol] = js.native
  
  var typeParameters: js.UndefOr[Array[TypeParameter]] = js.native
}
