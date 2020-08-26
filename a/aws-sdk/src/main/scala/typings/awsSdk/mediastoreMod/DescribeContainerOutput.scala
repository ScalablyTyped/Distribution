package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContainerOutput extends js.Object {
  /**
    * The name of the queried container.
    */
  var Container: js.UndefOr[typings.awsSdk.mediastoreMod.Container] = js.native
}

object DescribeContainerOutput {
  @scala.inline
  def apply(): DescribeContainerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContainerOutput]
  }
  @scala.inline
  implicit class DescribeContainerOutputOps[Self <: DescribeContainerOutput] (val x: Self) extends AnyVal {
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
    def setContainer(value: Container): Self = this.set("Container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("Container", js.undefined)
  }
  
}

