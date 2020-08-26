package typings.awsSdkClientXrayNode.typesServiceIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledServiceId extends ServiceId {
  /**
    * <p/>
    */
  @JSName("Names")
  var Names_UnmarshalledServiceId: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledServiceId {
  @scala.inline
  def apply(): UnmarshalledServiceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledServiceId]
  }
  @scala.inline
  implicit class UnmarshalledServiceIdOps[Self <: UnmarshalledServiceId] (val x: Self) extends AnyVal {
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
    def setNamesVarargs(value: String*): Self = this.set("Names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("Names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
  }
  
}

