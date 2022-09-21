package typings.azureSb

import typings.azureSb.anon._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceresultMod {
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        @js.native
        trait ResourceResult extends StObject {
          
          def parse(resourceName: String, nameProperty: String, xml: js.Object): js.Object | js.Array[js.Object] = js.native
          
          def serialize(resourceName: String, resource: js.Object, properties: js.Array[String]): String = js.native
          
          def setName(
            entry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<any> */ Any,
            nameProperty: String
          ): Unit = js.native
          def setName(entry: _empty, nameProperty: String): Unit = js.native
        }
      }
    }
  }
}
