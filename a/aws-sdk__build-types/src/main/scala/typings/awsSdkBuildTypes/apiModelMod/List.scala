package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List
  extends ShapeDef
     with ComplexShape
     with Shape {
  var flattened: js.UndefOr[scala.Boolean] = js.native
  var max: js.UndefOr[scala.Double] = js.native
  var member: Member = js.native
  var min: js.UndefOr[scala.Double] = js.native
  @JSName("type")
  val type_List: list = js.native
}

object List {
  @scala.inline
  def apply(member: Member, `type`: list): List = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
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
    def setMember(value: Member): Self = this.set("member", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: list): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlattened(value: scala.Boolean): Self = this.set("flattened", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlattened: Self = this.set("flattened", js.undefined)
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

