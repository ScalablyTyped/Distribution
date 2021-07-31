package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capacity extends StObject {
  
  /**
    * The total number of capacity units consumed on a table or an index.
    */
  var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  
  /**
    * The total number of read capacity units consumed on a table or an index.
    */
  var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  
  /**
    * The total number of write capacity units consumed on a table or an index.
    */
  var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
}
object Capacity {
  
  @scala.inline
  def apply(): Capacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capacity]
  }
  
  @scala.inline
  implicit class CapacityMutableBuilder[Self <: Capacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
    
    @scala.inline
    def setReadCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
    
    @scala.inline
    def setWriteCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
  }
}
