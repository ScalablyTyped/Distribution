package typings.cacache.enMod.verify

import typings.cacache.cacacheBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Receives a formatted entry. Return false to remove it.
    * Note: might be called more than once on the same entry.
    */
  var filter: `false` | String = js.native
}

object Options {
  @scala.inline
  def apply(filter: `false` | String): Options = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFilter(value: `false` | String): Self = this.set("filter", value.asInstanceOf[js.Any])
  }
  
}

