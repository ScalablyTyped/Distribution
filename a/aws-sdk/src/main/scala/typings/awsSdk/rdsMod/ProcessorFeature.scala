package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessorFeature extends js.Object {
  /**
    * The name of the processor feature. Valid names are coreCount and threadsPerCore.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The value of a processor feature name.
    */
  var Value: js.UndefOr[String] = js.native
}

object ProcessorFeature {
  @scala.inline
  def apply(): ProcessorFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessorFeature]
  }
  @scala.inline
  implicit class ProcessorFeatureOps[Self <: ProcessorFeature] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

