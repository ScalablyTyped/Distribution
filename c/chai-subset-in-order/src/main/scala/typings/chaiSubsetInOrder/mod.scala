package typings.chaiSubsetInOrder

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-subset-in-order", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        def containSubsetInOrder(`val`: Any, exp: Any): Unit = js.native
        def containSubsetInOrder(`val`: Any, exp: Any, msg: String): Unit = js.native
      }
      
      trait Assertion extends StObject {
        
        def containSubsetInOrder(expected: Any): Assertion
      }
      object Assertion {
        
        inline def apply(containSubsetInOrder: Any => Assertion): Assertion = {
          val __obj = js.Dynamic.literal(containSubsetInOrder = js.Any.fromFunction1(containSubsetInOrder))
          __obj.asInstanceOf[Assertion]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Assertion] (val x: Self) extends AnyVal {
          
          inline def setContainSubsetInOrder(value: Any => Assertion): Self = StObject.set(x, "containSubsetInOrder", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
