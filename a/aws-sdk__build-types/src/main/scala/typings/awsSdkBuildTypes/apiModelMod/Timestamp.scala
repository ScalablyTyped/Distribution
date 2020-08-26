package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timestamp
  extends ShapeDef
     with Shape {
  var timestampFormat: js.UndefOr[java.lang.String] = js.native
  @JSName("type")
  val type_Timestamp: timestamp = js.native
}

object Timestamp {
  @scala.inline
  def apply(`type`: timestamp): Timestamp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp]
  }
  @scala.inline
  implicit class TimestampOps[Self <: Timestamp] (val x: Self) extends AnyVal {
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
    def setType(value: timestamp): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestampFormat(value: java.lang.String): Self = this.set("timestampFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampFormat: Self = this.set("timestampFormat", js.undefined)
  }
  
}

