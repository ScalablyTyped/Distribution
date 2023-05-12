package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLimitsOutput extends StObject {
  
  /**
    * <p>The maximum total read capacity units that your account allows you to provision across
    *             all of your tables in this Region.</p>
    */
  var AccountMaxReadCapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The maximum total write capacity units that your account allows you to provision
    *             across all of your tables in this Region.</p>
    */
  var AccountMaxWriteCapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The maximum read capacity units that your account allows you to provision for a new
    *             table that you are creating in this Region, including the read capacity units
    *             provisioned for its global secondary indexes (GSIs).</p>
    */
  var TableMaxReadCapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The maximum write capacity units that your account allows you to provision for a new
    *             table that you are creating in this Region, including the write capacity units
    *             provisioned for its global secondary indexes (GSIs).</p>
    */
  var TableMaxWriteCapacityUnits: js.UndefOr[Double] = js.undefined
}
object DescribeLimitsOutput {
  
  inline def apply(): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLimitsOutput] (val x: Self) extends AnyVal {
    
    inline def setAccountMaxReadCapacityUnits(value: Double): Self = StObject.set(x, "AccountMaxReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setAccountMaxReadCapacityUnitsUndefined: Self = StObject.set(x, "AccountMaxReadCapacityUnits", js.undefined)
    
    inline def setAccountMaxWriteCapacityUnits(value: Double): Self = StObject.set(x, "AccountMaxWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setAccountMaxWriteCapacityUnitsUndefined: Self = StObject.set(x, "AccountMaxWriteCapacityUnits", js.undefined)
    
    inline def setTableMaxReadCapacityUnits(value: Double): Self = StObject.set(x, "TableMaxReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setTableMaxReadCapacityUnitsUndefined: Self = StObject.set(x, "TableMaxReadCapacityUnits", js.undefined)
    
    inline def setTableMaxWriteCapacityUnits(value: Double): Self = StObject.set(x, "TableMaxWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setTableMaxWriteCapacityUnitsUndefined: Self = StObject.set(x, "TableMaxWriteCapacityUnits", js.undefined)
  }
}
