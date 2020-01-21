package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedThroughput extends js.Object {
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
    */
  var ReadCapacityUnits: PositiveLongObject = js.native
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
    */
  var WriteCapacityUnits: PositiveLongObject = js.native
}

object ProvisionedThroughput {
  @scala.inline
  def apply(ReadCapacityUnits: PositiveLongObject, WriteCapacityUnits: PositiveLongObject): ProvisionedThroughput = {
    val __obj = js.Dynamic.literal(ReadCapacityUnits = ReadCapacityUnits.asInstanceOf[js.Any], WriteCapacityUnits = WriteCapacityUnits.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProvisionedThroughput]
  }
}

