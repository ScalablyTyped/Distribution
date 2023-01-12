package typings.csstoolsSelectorSpecificity

import typings.postcssSelectorParser.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@csstools/selector-specificity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(s1: Specificity, s2: Specificity): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def selectorSpecificity(node: Node): Specificity = ^.asInstanceOf[js.Dynamic].applyDynamic("selectorSpecificity")(node.asInstanceOf[js.Any]).asInstanceOf[Specificity]
  
  trait Specificity extends StObject {
    
    var a: Double
    
    var b: Double
    
    var c: Double
  }
  object Specificity {
    
    inline def apply(a: Double, b: Double, c: Double): Specificity = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
      __obj.asInstanceOf[Specificity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Specificity] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    }
  }
}
