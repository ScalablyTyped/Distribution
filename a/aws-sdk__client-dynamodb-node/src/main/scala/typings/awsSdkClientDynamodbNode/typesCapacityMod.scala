package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCapacityMod {
  
  trait Capacity extends StObject {
    
    /**
      * <p>The total number of capacity units consumed on a table or an index.</p>
      */
    var CapacityUnits: js.UndefOr[Double] = js.undefined
  }
  object Capacity {
    
    inline def apply(): Capacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Capacity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Capacity] (val x: Self) extends AnyVal {
      
      inline def setCapacityUnits(value: Double): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
    }
  }
  
  type UnmarshalledCapacity = Capacity
}
