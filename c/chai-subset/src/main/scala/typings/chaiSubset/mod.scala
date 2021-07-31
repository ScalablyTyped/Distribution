package typings.chaiSubset

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-subset", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        def containSubset(`val`: js.Any, exp: js.Any): Unit = js.native
        def containSubset(`val`: js.Any, exp: js.Any, msg: String): Unit = js.native
      }
      
      trait Assertion extends StObject {
        
        def containSubset(expected: js.Any): Assertion
      }
      object Assertion {
        
        @scala.inline
        def apply(containSubset: js.Any => Assertion): Assertion = {
          val __obj = js.Dynamic.literal(containSubset = js.Any.fromFunction1(containSubset))
          __obj.asInstanceOf[Assertion]
        }
        
        @scala.inline
        implicit class AssertionMutableBuilder[Self <: Assertion] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setContainSubset(value: js.Any => Assertion): Self = StObject.set(x, "containSubset", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
