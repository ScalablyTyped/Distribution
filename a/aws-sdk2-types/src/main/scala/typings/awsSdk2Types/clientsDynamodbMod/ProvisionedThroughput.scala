package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedThroughput extends StObject {
  
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
    */
  var ReadCapacityUnits: PositiveLongObject
  
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
    */
  var WriteCapacityUnits: PositiveLongObject
}
object ProvisionedThroughput {
  
  inline def apply(ReadCapacityUnits: PositiveLongObject, WriteCapacityUnits: PositiveLongObject): ProvisionedThroughput = {
    val __obj = js.Dynamic.literal(ReadCapacityUnits = ReadCapacityUnits.asInstanceOf[js.Any], WriteCapacityUnits = WriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedThroughput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionedThroughput] (val x: Self) extends AnyVal {
    
    inline def setReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
  }
}
