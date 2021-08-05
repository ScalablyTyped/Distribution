package typings.deepEqualInAnyOrder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object Chai {
      
      trait Deep extends StObject {
        
        var equalInAnyOrder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Equal */ js.Any
      }
      object Deep {
        
        inline def apply(
          equalInAnyOrder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Equal */ js.Any
        ): Deep = {
          val __obj = js.Dynamic.literal(equalInAnyOrder = equalInAnyOrder.asInstanceOf[js.Any])
          __obj.asInstanceOf[Deep]
        }
        
        extension [Self <: Deep](x: Self) {
          
          inline def setEqualInAnyOrder(
            value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Equal */ js.Any
          ): Self = StObject.set(x, "equalInAnyOrder", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
