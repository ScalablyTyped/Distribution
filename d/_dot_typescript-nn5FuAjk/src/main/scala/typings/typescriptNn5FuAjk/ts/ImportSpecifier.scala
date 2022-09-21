package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSpecifier
  extends StObject
     with NamedDeclaration
     with ImportOrExportSpecifier {
  
  val isTypeOnly: Boolean = js.native
  
  @JSName("kind")
  val kind_ImportSpecifier: typings.typescriptNn5FuAjk.ts.SyntaxKind.ImportSpecifier = js.native
  
  @JSName("name")
  val name_ImportSpecifier: Identifier = js.native
  
  @JSName("parent")
  val parent_ImportSpecifier: NamedImports = js.native
  
  val propertyName: js.UndefOr[Identifier] = js.native
}
