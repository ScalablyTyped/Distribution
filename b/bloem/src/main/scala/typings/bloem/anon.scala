package typings.bloem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Initialcapacity extends StObject {
    
    var initial_capacity: js.UndefOr[Double] = js.undefined
    
    var ratio: js.UndefOr[Double] = js.undefined
    
    var scaling: js.UndefOr[Double] = js.undefined
  }
  object Initialcapacity {
    
    inline def apply(): Initialcapacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Initialcapacity]
    }
    
    extension [Self <: Initialcapacity](x: Self) {
      
      inline def setInitial_capacity(value: Double): Self = StObject.set(x, "initial_capacity", value.asInstanceOf[js.Any])
      
      inline def setInitial_capacityUndefined: Self = StObject.set(x, "initial_capacity", js.undefined)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setScaling(value: Double): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
      
      inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    }
  }
}
