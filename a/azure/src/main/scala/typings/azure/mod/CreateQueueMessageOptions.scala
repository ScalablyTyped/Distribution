package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQueueMessageOptions
  extends StObject
     with TimeoutIntervalOptions {
  
  var messagettl: js.UndefOr[Double] = js.undefined
  
  var visibilitytimeout: js.UndefOr[Double] = js.undefined
}
object CreateQueueMessageOptions {
  
  inline def apply(): CreateQueueMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueMessageOptions]
  }
  
  extension [Self <: CreateQueueMessageOptions](x: Self) {
    
    inline def setMessagettl(value: Double): Self = StObject.set(x, "messagettl", value.asInstanceOf[js.Any])
    
    inline def setMessagettlUndefined: Self = StObject.set(x, "messagettl", js.undefined)
    
    inline def setVisibilitytimeout(value: Double): Self = StObject.set(x, "visibilitytimeout", value.asInstanceOf[js.Any])
    
    inline def setVisibilitytimeoutUndefined: Self = StObject.set(x, "visibilitytimeout", js.undefined)
  }
}
