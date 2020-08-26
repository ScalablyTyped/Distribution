package typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedThroughput extends js.Object {
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ReadCapacityUnits: Double = js.native
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var WriteCapacityUnits: Double = js.native
}

object ProvisionedThroughput {
  @scala.inline
  def apply(ReadCapacityUnits: Double, WriteCapacityUnits: Double): ProvisionedThroughput = {
    val __obj = js.Dynamic.literal(ReadCapacityUnits = ReadCapacityUnits.asInstanceOf[js.Any], WriteCapacityUnits = WriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedThroughput]
  }
  @scala.inline
  implicit class ProvisionedThroughputOps[Self <: ProvisionedThroughput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReadCapacityUnits(value: Double): Self = this.set("ReadCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteCapacityUnits(value: Double): Self = this.set("WriteCapacityUnits", value.asInstanceOf[js.Any])
  }
  
}

