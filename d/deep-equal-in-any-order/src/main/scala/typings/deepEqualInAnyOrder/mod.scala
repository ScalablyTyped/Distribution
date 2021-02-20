package typings.deepEqualInAnyOrder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object Chai {
      
      @js.native
      trait Deep extends StObject {
        
        var equalInAnyOrder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Equal */ js.Any = js.native
      }
      object Deep {
        
        @scala.inline
        def apply(
          equalInAnyOrder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Equal */ js.Any
        ): Deep = {
          val __obj = js.Dynamic.literal(equalInAnyOrder = equalInAnyOrder.asInstanceOf[js.Any])
          __obj.asInstanceOf[Deep]
        }
        
        @scala.inline
        implicit class DeepMutableBuilder[Self <: Deep] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setEqualInAnyOrder(
            value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Equal */ js.Any
          ): Self = StObject.set(x, "equalInAnyOrder", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
