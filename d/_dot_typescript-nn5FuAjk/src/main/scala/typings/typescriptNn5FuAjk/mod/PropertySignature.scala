package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertySignature
  extends StObject
     with TypeElement
     with JSDocContainer
     with HasExpressionInitializer
     with HasJSDoc
     with HasType
     with VariableLikeDeclaration {
  
  var initializer: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_PropertySignature: typings.typescriptNn5FuAjk.mod.SyntaxKind.PropertySignature = js.native
  
  @JSName("name")
  val name_PropertySignature: PropertyName = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
}
