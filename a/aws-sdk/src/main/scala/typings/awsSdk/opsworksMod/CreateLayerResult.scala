package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLayerResult extends StObject {
  
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.undefined
}
object CreateLayerResult {
  
  inline def apply(): CreateLayerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLayerResult]
  }
  
  extension [Self <: CreateLayerResult](x: Self) {
    
    inline def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "LayerId", js.undefined)
  }
}
