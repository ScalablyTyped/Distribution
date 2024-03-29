package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDeclaration
  extends StObject
     with Statement
     with HasJSDoc {
  
  val assertClause: js.UndefOr[AssertClause] = js.native
  
  val importClause: js.UndefOr[ImportClause] = js.native
  
  @JSName("kind")
  val kind_ImportDeclaration: typings.typescriptNn5FuAjk.ts.SyntaxKind.ImportDeclaration = js.native
  
  /** If this is not a StringLiteral it will be a grammar error. */
  val moduleSpecifier: Expression = js.native
  
  @JSName("parent")
  val parent_ImportDeclaration: SourceFile | ModuleBlock = js.native
}
