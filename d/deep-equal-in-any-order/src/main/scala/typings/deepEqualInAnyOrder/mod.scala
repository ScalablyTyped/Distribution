package typings.deepEqualInAnyOrder

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("deep-equal-in-any-order", JSImport.Namespace)
  @js.native
  val ^ : /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chai.ChaiPlugin */ Any = js.native
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chai.ChaiPlugin */ Any
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chai.ChaiPlugin */ Any = ^
  
  object global {
    
    object Chai {
      
      trait Deep extends StObject {
        
        var equalInAnyOrder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Equal */ Any
      }
      object Deep {
        
        inline def apply(
          equalInAnyOrder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Equal */ Any
        ): Deep = {
          val __obj = js.Dynamic.literal(equalInAnyOrder = equalInAnyOrder.asInstanceOf[js.Any])
          __obj.asInstanceOf[Deep]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Deep] (val x: Self) extends AnyVal {
          
          inline def setEqualInAnyOrder(
            value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Equal */ Any
          ): Self = StObject.set(x, "equalInAnyOrder", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
