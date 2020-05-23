package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValuePair extends js.Object {
  /**
    *  The throughput value of the Elastic Inference Accelerator type. It can assume the following values: TFLOPS16bit: the throughput expressed in 16bit TeraFLOPS. TFLOPS32bit: the throughput expressed in 32bit TeraFLOPS. 
    */
  var key: js.UndefOr[Key] = js.native
  /**
    *  The throughput value of the Elastic Inference Accelerator type. 
    */
  var value: js.UndefOr[Value] = js.native
}

object KeyValuePair {
  @scala.inline
  def apply(key: Key = null, value: js.UndefOr[Value] = js.undefined): KeyValuePair = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair]
  }
}

