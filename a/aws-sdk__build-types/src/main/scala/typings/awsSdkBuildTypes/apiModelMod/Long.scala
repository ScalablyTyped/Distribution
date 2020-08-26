package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Long
  extends ShapeDef
     with Shape {
  var max: js.UndefOr[scala.Double] = js.native
  var min: js.UndefOr[scala.Double] = js.native
  @JSName("type")
  val type_Long: long = js.native
}

object Long {
  @scala.inline
  def apply(`type`: long): Long = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Long]
  }
  @scala.inline
  implicit class LongOps[Self <: Long] (val x: Self) extends AnyVal {
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
    def setType(value: long): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: scala.Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: scala.Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

