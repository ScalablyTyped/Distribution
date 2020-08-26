package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchArrayProperties extends js.Object {
  /**
    * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
    */
  var Size: js.UndefOr[Integer] = js.native
}

object BatchArrayProperties {
  @scala.inline
  def apply(): BatchArrayProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchArrayProperties]
  }
  @scala.inline
  implicit class BatchArrayPropertiesOps[Self <: BatchArrayProperties] (val x: Self) extends AnyVal {
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
    def setSize(value: Integer): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
  }
  
}

