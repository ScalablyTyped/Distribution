package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.ts.SyntaxKind.KeyOfKeyword
import typings.typescriptNn5FuAjk.ts.SyntaxKind.TypeOperator
import typings.typescriptNn5FuAjk.ts.SyntaxKind.UniqueKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOperatorNode
  extends StObject
     with TypeNode
     with HasType {
  
  @JSName("kind")
  val kind_TypeOperatorNode: TypeOperator = js.native
  
  val operator: KeyOfKeyword | UniqueKeyword | typings.typescriptNn5FuAjk.ts.SyntaxKind.ReadonlyKeyword = js.native
  
  val `type`: TypeNode = js.native
}
