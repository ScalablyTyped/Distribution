package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptNode extends StObject {
  
  def acceptNode(node: Node): Double
}
object AcceptNode {
  
  inline def apply(acceptNode: Node => Double): AcceptNode = {
    val __obj = js.Dynamic.literal(acceptNode = js.Any.fromFunction1(acceptNode))
    __obj.asInstanceOf[AcceptNode]
  }
  
  extension [Self <: AcceptNode](x: Self) {
    
    inline def setAcceptNode(value: Node => Double): Self = StObject.set(x, "acceptNode", js.Any.fromFunction1(value))
  }
}
