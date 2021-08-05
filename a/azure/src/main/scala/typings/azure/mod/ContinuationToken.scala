package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuationToken extends StObject {
  
  var nextMarker: String
  
  var targetLocation: String
}
object ContinuationToken {
  
  inline def apply(nextMarker: String, targetLocation: String): ContinuationToken = {
    val __obj = js.Dynamic.literal(nextMarker = nextMarker.asInstanceOf[js.Any], targetLocation = targetLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuationToken]
  }
  
  extension [Self <: ContinuationToken](x: Self) {
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    inline def setTargetLocation(value: String): Self = StObject.set(x, "targetLocation", value.asInstanceOf[js.Any])
  }
}
