package typings.chromeApps.anon

import typings.chromeApps.chrome.runtime.WebViewPartition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Partitions extends js.Object {
  /** Webview partition list */
  var partitions: js.Array[WebViewPartition] = js.native
}

object Partitions {
  @scala.inline
  def apply(partitions: js.Array[WebViewPartition]): Partitions = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partitions]
  }
  @scala.inline
  implicit class PartitionsOps[Self <: Partitions] (val x: Self) extends AnyVal {
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
    def setPartitionsVarargs(value: WebViewPartition*): Self = this.set("partitions", js.Array(value :_*))
    @scala.inline
    def setPartitions(value: js.Array[WebViewPartition]): Self = this.set("partitions", value.asInstanceOf[js.Any])
  }
  
}

