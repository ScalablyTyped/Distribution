package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationValue extends js.Object {
  /**
    * Value for a Boolean annotation.
    */
  var BooleanValue: js.UndefOr[NullableBoolean] = js.native
  /**
    * Value for a Number annotation.
    */
  var NumberValue: js.UndefOr[NullableDouble] = js.native
  /**
    * Value for a String annotation.
    */
  var StringValue: js.UndefOr[String] = js.native
}

object AnnotationValue {
  @scala.inline
  def apply(): AnnotationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationValue]
  }
  @scala.inline
  implicit class AnnotationValueOps[Self <: AnnotationValue] (val x: Self) extends AnyVal {
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
    def setBooleanValue(value: NullableBoolean): Self = this.set("BooleanValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanValue: Self = this.set("BooleanValue", js.undefined)
    @scala.inline
    def setNumberValue(value: NullableDouble): Self = this.set("NumberValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberValue: Self = this.set("NumberValue", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("StringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("StringValue", js.undefined)
  }
  
}

