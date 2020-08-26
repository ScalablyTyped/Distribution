package typings.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticOptions extends js.Object {
  var dir: String | js.Array[String] = js.native
  var route: String | js.Array[String] = js.native
}

object StaticOptions {
  @scala.inline
  def apply(dir: String | js.Array[String], route: String | js.Array[String]): StaticOptions = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticOptions]
  }
  @scala.inline
  implicit class StaticOptionsOps[Self <: StaticOptions] (val x: Self) extends AnyVal {
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
    def setDirVarargs(value: String*): Self = this.set("dir", js.Array(value :_*))
    @scala.inline
    def setDir(value: String | js.Array[String]): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteVarargs(value: String*): Self = this.set("route", js.Array(value :_*))
    @scala.inline
    def setRoute(value: String | js.Array[String]): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

