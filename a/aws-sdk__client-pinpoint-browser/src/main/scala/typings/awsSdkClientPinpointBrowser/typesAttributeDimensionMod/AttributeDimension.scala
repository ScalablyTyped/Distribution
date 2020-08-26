package typings.awsSdkClientPinpointBrowser.typesAttributeDimensionMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EXCLUSIVE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INCLUSIVE
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeDimension extends js.Object {
  /**
    * The type of dimension:
    *
    * INCLUSIVE - Endpoints that match the criteria are included in the segment.
    *
    * EXCLUSIVE - Endpoints that match the criteria are excluded from the segment.
    */
  var AttributeType: js.UndefOr[INCLUSIVE | EXCLUSIVE | String] = js.native
  /**
    * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
    */
  var Values: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
}

object AttributeDimension {
  @scala.inline
  def apply(): AttributeDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeDimension]
  }
  @scala.inline
  implicit class AttributeDimensionOps[Self <: AttributeDimension] (val x: Self) extends AnyVal {
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
    def setAttributeType(value: INCLUSIVE | EXCLUSIVE | String): Self = this.set("AttributeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeType: Self = this.set("AttributeType", js.undefined)
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String] | Iterable[String]): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
  
}

