package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConversionTasksResult extends js.Object {
  /**
    * Information about the conversion tasks.
    */
  var ConversionTasks: js.UndefOr[DescribeConversionTaskList] = js.native
}

object DescribeConversionTasksResult {
  @scala.inline
  def apply(ConversionTasks: DescribeConversionTaskList = null): DescribeConversionTasksResult = {
    val __obj = js.Dynamic.literal()
    if (ConversionTasks != null) __obj.updateDynamic("ConversionTasks")(ConversionTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConversionTasksResult]
  }
}

