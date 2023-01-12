package typings.cucumberTagExpressions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cucumber/tag-expressions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(infix: String): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(infix.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  trait Node extends StObject {
    
    def evaluate(variables: js.Array[String]): Boolean
  }
  object Node {
    
    inline def apply(evaluate: js.Array[String] => Boolean): Node = {
      val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate))
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      inline def setEvaluate(value: js.Array[String] => Boolean): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    }
  }
}
