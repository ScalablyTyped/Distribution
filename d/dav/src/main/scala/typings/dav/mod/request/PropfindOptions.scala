package typings.dav.mod.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropfindOptions extends js.Object {
  /**
    *  value for Depth header.
    */
  var depth: js.UndefOr[String] = js.native
  /**
    * list of props to request.
    */
  var props: js.Array[js.Object] = js.native
}

object PropfindOptions {
  @scala.inline
  def apply(props: js.Array[js.Object]): PropfindOptions = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropfindOptions]
  }
  @scala.inline
  implicit class PropfindOptionsOps[Self <: PropfindOptions] (val x: Self) extends AnyVal {
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
    def setPropsVarargs(value: js.Object*): Self = this.set("props", js.Array(value :_*))
    @scala.inline
    def setProps(value: js.Array[js.Object]): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: String): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
  }
  
}

