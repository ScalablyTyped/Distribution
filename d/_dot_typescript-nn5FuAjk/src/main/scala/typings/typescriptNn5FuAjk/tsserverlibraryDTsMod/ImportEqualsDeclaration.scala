package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportEqualsDeclaration
  extends StObject
     with DeclarationStatement
     with HasJSDoc
     with TypeOnlyCompatibleAliasDeclaration {
  
  val isTypeOnly: Boolean = js.native
  
  @JSName("kind")
  val kind_ImportEqualsDeclaration: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.ImportEqualsDeclaration = js.native
  
  val moduleReference: ModuleReference = js.native
  
  @JSName("name")
  val name_ImportEqualsDeclaration: Identifier = js.native
  
  @JSName("parent")
  val parent_ImportEqualsDeclaration: SourceFile | ModuleBlock = js.native
}
