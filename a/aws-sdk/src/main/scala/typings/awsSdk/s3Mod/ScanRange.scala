package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanRange extends js.Object {
  /**
    * Specifies the end of the byte range. This parameter is optional. Valid values: non-negative integers. The default value is one less than the size of the object being queried. If only the End parameter is supplied, it is interpreted to mean scan the last N bytes of the file. For example, &lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt; means scan the last 50 bytes.
    */
  var End: js.UndefOr[typings.awsSdk.s3Mod.End] = js.native
  /**
    * Specifies the start of the byte range. This parameter is optional. Valid values: non-negative integers. The default value is 0. If only start is supplied, it means scan from that point to the end of the file.For example; &lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt; means scan from byte 50 until the end of the file.
    */
  var Start: js.UndefOr[typings.awsSdk.s3Mod.Start] = js.native
}

object ScanRange {
  @scala.inline
  def apply(End: js.UndefOr[End] = js.undefined, Start: js.UndefOr[Start] = js.undefined): ScanRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(End)) __obj.updateDynamic("End")(End.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Start)) __obj.updateDynamic("Start")(Start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanRange]
  }
}

