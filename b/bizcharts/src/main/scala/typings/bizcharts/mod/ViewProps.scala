package typings.bizcharts.mod

import org.scalablytyped.runtime.StringDictionary
import typings.bizcharts.anon.X
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewProps
  extends Props[js.Any] {
  var animate: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var end: js.UndefOr[X] = js.native
  var filter: js.UndefOr[js.Array[_]] = js.native
  var id: js.UndefOr[String] = js.native
  var scale: js.UndefOr[StringDictionary[js.Any]] = js.native
  var start: js.UndefOr[X] = js.native
}

object ViewProps {
  @scala.inline
  def apply(): ViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewProps]
  }
  @scala.inline
  implicit class ViewPropsOps[Self <: ViewProps] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEnd(value: X): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: js.Array[_]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setScale(value: StringDictionary[js.Any]): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setStart(value: X): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

