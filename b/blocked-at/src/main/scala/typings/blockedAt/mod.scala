package typings.blockedAt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fn: js.Function3[/* time */ Double, /* stack */ js.Array[String], /* resource */ Resource, Any]): Return = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Return]
  inline def apply(
    fn: js.Function3[/* time */ Double, /* stack */ js.Array[String], /* resource */ Resource, Any],
    options: Options
  ): Return = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Return]
  
  @JSImport("blocked-at", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var resourcesCap: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var trimFalsePositives: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setResourcesCap(value: Double): Self = StObject.set(x, "resourcesCap", value.asInstanceOf[js.Any])
      
      inline def setResourcesCapUndefined: Self = StObject.set(x, "resourcesCap", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTrimFalsePositives(value: Boolean): Self = StObject.set(x, "trimFalsePositives", value.asInstanceOf[js.Any])
      
      inline def setTrimFalsePositivesUndefined: Self = StObject.set(x, "trimFalsePositives", js.undefined)
    }
  }
  
  trait Resource extends StObject {
    
    var resource: js.UndefOr[Any] = js.undefined
    
    var `type`: String
  }
  object Resource {
    
    inline def apply(`type`: String): Resource = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    extension [Self <: Resource](x: Self) {
      
      inline def setResource(value: Any): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Return extends StObject {
    
    def stop(): Unit
  }
  object Return {
    
    inline def apply(stop: () => Unit): Return = {
      val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Return]
    }
    
    extension [Self <: Return](x: Self) {
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
