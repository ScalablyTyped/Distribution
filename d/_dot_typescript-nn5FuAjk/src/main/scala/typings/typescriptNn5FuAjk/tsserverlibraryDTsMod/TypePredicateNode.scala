package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypePredicateNode
  extends StObject
     with TypeNode
     with HasType {
  
  val assertsModifier: js.UndefOr[AssertsKeyword] = js.native
  
  @JSName("kind")
  val kind_TypePredicateNode: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.TypePredicate = js.native
  
  val parameterName: Identifier | ThisTypeNode = js.native
  
  @JSName("parent")
  val parent_TypePredicateNode: SignatureDeclaration | JSDocTypeExpression = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
}
