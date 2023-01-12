package typings.chaiQuantifiers

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-quantifiers", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      trait Assertion extends StObject {
        
        // tslint:disable-next-line no-unnecessary-generics
        def containAll[T](cb: js.Function1[/* item */ T, Boolean]): Unit
        
        // tslint:disable-next-line no-unnecessary-generics
        def containExactlyOne[T](cb: js.Function1[/* item */ T, Boolean]): Unit
        
        // tslint:disable-next-line no-unnecessary-generics
        def containOne[T](cb: js.Function1[/* item */ T, Boolean]): Unit
      }
      object Assertion {
        
        inline def apply(
          containAll: js.Function1[Any, Boolean] => Unit,
          containExactlyOne: js.Function1[Any, Boolean] => Unit,
          containOne: js.Function1[Any, Boolean] => Unit
        ): Assertion = {
          val __obj = js.Dynamic.literal(containAll = js.Any.fromFunction1(containAll), containExactlyOne = js.Any.fromFunction1(containExactlyOne), containOne = js.Any.fromFunction1(containOne))
          __obj.asInstanceOf[Assertion]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Assertion] (val x: Self) extends AnyVal {
          
          inline def setContainAll(value: js.Function1[Any, Boolean] => Unit): Self = StObject.set(x, "containAll", js.Any.fromFunction1(value))
          
          inline def setContainExactlyOne(value: js.Function1[Any, Boolean] => Unit): Self = StObject.set(x, "containExactlyOne", js.Any.fromFunction1(value))
          
          inline def setContainOne(value: js.Function1[Any, Boolean] => Unit): Self = StObject.set(x, "containOne", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
