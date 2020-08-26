package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var Arn: js.UndefOr[LayerVersionArn] = js.native
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.native
}

object Layer {
  @scala.inline
  def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  @scala.inline
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
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
    def setArn(value: LayerVersionArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCodeSize(value: Long): Self = this.set("CodeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeSize: Self = this.set("CodeSize", js.undefined)
  }
  
}

