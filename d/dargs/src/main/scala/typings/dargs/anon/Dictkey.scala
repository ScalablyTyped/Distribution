package typings.dargs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends /* key */ StringDictionary[String | Boolean | Double | js.Array[String]] {
  var `--`: js.UndefOr[js.Array[String]] = js.native
  @JSName("_")
  var _underscore: js.UndefOr[js.Array[String]] = js.native
}

object Dictkey {
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
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
    def `set--Varargs`(value: String*): Self = this.set("--", js.Array(value :_*))
    @scala.inline
    def `set--`(value: js.Array[String]): Self = this.set("--", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete--`: Self = this.set("--", js.undefined)
    @scala.inline
    def set_underscoreVarargs(value: String*): Self = this.set("_", js.Array(value :_*))
    @scala.inline
    def set_underscore(value: js.Array[String]): Self = this.set("_", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_underscore: Self = this.set("_", js.undefined)
  }
  
}

