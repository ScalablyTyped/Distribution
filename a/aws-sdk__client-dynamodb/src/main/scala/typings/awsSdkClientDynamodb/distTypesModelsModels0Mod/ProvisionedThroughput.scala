package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedThroughput extends StObject {
  
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB
    *             returns a <code>ThrottlingException</code>. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
    *                 Developer Guide</i>.</p>
    *          <p>If read/write capacity mode is <code>PAY_PER_REQUEST</code> the value is set to
    *             0.</p>
    */
  var ReadCapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a
    *                 <code>ThrottlingException</code>. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
    *                 Developer Guide</i>.</p>
    *          <p>If read/write capacity mode is <code>PAY_PER_REQUEST</code> the value is set to
    *             0.</p>
    */
  var WriteCapacityUnits: js.UndefOr[Double] = js.undefined
}
object ProvisionedThroughput {
  
  inline def apply(): ProvisionedThroughput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedThroughput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionedThroughput] (val x: Self) extends AnyVal {
    
    inline def setReadCapacityUnits(value: Double): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
    
    inline def setWriteCapacityUnits(value: Double): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
  }
}
