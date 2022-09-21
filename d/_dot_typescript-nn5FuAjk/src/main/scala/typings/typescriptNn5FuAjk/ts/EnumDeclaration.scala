package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumDeclaration
  extends StObject
     with DeclarationStatement
     with HasJSDoc {
  
  @JSName("kind")
  val kind_EnumDeclaration: typings.typescriptNn5FuAjk.ts.SyntaxKind.EnumDeclaration = js.native
  
  val members: NodeArray[EnumMember] = js.native
  
  @JSName("name")
  val name_EnumDeclaration: Identifier = js.native
}
