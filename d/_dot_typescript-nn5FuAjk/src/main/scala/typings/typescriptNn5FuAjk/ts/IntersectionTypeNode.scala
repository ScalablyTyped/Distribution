package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionTypeNode
  extends StObject
     with TypeNode
     with UnionOrIntersectionTypeNode {
  
  @JSName("kind")
  val kind_IntersectionTypeNode: typings.typescriptNn5FuAjk.ts.SyntaxKind.IntersectionType = js.native
  
  val types: NodeArray[TypeNode] = js.native
}
