package typings.awsSdkTypes.protocolMod

import typings.awsSdkTypes.awsSdkTypesStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait String
  extends Shape
     with SerializationModel {
  var idempotencyToken: js.UndefOr[scala.Boolean] = js.native
  var jsonValue: js.UndefOr[scala.Boolean] = js.native
  var min: js.UndefOr[Double] = js.native
  @JSName("type")
  var type_String: string = js.native
}

object String {
  @scala.inline
  def apply(`type`: string): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
  @scala.inline
  implicit class StringOps[Self <: String] (val x: Self) extends AnyVal {
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
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdempotencyToken(value: scala.Boolean): Self = this.set("idempotencyToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdempotencyToken: Self = this.set("idempotencyToken", js.undefined)
    @scala.inline
    def setJsonValue(value: scala.Boolean): Self = this.set("jsonValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonValue: Self = this.set("jsonValue", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

