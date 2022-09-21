package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identifier
  extends StObject
     with PrimaryExpression
     with Declaration
     with AssertionKey
     with BindingName
     with BindingOrAssignmentElementTarget
     with DeclarationName
     with EntityName
     with EntityNameExpression
     with JSDocNamespaceBody
     with JsxTagNameExpression
     with MemberName
     with ModuleName
     with PropertyName
     with PropertyNameLiteral
     with _ArrayBindingOrAssignmentElement {
  
  /**
    * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
    * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
    */
  val escapedText: String = js.native
  
  var isInJSDocNamespace: js.UndefOr[Boolean] = js.native
  
  @JSName("kind")
  val kind_Identifier: typings.typescriptNn5FuAjk.ts.SyntaxKind.Identifier = js.native
  
  val originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
  
  val text: java.lang.String = js.native
}
