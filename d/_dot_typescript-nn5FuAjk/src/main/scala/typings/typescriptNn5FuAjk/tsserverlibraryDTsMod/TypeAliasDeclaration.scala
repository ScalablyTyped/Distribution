package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAliasDeclaration
  extends StObject
     with DeclarationStatement
     with DeclarationWithTypeParameterChildren
     with HasJSDoc
     with HasType {
  
  @JSName("kind")
  val kind_TypeAliasDeclaration: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.TypeAliasDeclaration = js.native
  
  @JSName("name")
  val name_TypeAliasDeclaration: Identifier = js.native
  
  val `type`: TypeNode = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
