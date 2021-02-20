package typings.bloem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Initialcapacity extends StObject {
    
    var initial_capacity: js.UndefOr[Double] = js.native
    
    var ratio: js.UndefOr[Double] = js.native
    
    var scaling: js.UndefOr[Double] = js.native
  }
  object Initialcapacity {
    
    @scala.inline
    def apply(): Initialcapacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Initialcapacity]
    }
    
    @scala.inline
    implicit class InitialcapacityMutableBuilder[Self <: Initialcapacity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitial_capacity(value: Double): Self = StObject.set(x, "initial_capacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitial_capacityUndefined: Self = StObject.set(x, "initial_capacity", js.undefined)
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      @scala.inline
      def setScaling(value: Double): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    }
  }
}
