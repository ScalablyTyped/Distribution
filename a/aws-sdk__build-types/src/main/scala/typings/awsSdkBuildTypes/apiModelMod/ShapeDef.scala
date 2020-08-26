package typings.awsSdkBuildTypes.apiModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeDef extends js.Object {
  var deprecated: js.UndefOr[scala.Boolean] = js.native
  var documentation: js.UndefOr[java.lang.String] = js.native
  var sensitive: js.UndefOr[scala.Boolean] = js.native
  val `type`: Type = js.native
}

object ShapeDef {
  @scala.inline
  def apply(`type`: Type): ShapeDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeDef]
  }
  @scala.inline
  implicit class ShapeDefOps[Self <: ShapeDef] (val x: Self) extends AnyVal {
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
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeprecated(value: scala.Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setDocumentation(value: java.lang.String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    @scala.inline
    def setSensitive(value: scala.Boolean): Self = this.set("sensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitive: Self = this.set("sensitive", js.undefined)
  }
  
}

