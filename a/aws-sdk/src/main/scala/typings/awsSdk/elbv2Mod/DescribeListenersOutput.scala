package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeListenersOutput extends js.Object {
  /**
    * Information about the listeners.
    */
  var Listeners: js.UndefOr[typings.awsSdk.elbv2Mod.Listeners] = js.native
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object DescribeListenersOutput {
  @scala.inline
  def apply(): DescribeListenersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeListenersOutput]
  }
  @scala.inline
  implicit class DescribeListenersOutputOps[Self <: DescribeListenersOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setListenersVarargs(value: Listener*): Self = this.set("Listeners", js.Array(value :_*))
    @scala.inline
    def setListeners(value: Listeners): Self = this.set("Listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListeners: Self = this.set("Listeners", js.undefined)
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

