package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capacity extends StObject {
  
  /**
    * <p>The total number of capacity units consumed on a table or an index.</p>
    */
  var CapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The total number of read capacity units consumed on a table or an index.</p>
    */
  var ReadCapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The total number of write capacity units consumed on a table or an index.</p>
    */
  var WriteCapacityUnits: js.UndefOr[Double] = js.undefined
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
    
    inline def setReadCapacityUnits(value: Double): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
    
    inline def setWriteCapacityUnits(value: Double): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
  }
}
