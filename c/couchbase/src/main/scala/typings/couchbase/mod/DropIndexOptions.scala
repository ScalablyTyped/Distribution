package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropIndexOptions extends js.Object {
  /**
    * If true, attempting to drop on a bucket without the specified index won't cause an error to be thrown.
    */
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.native
}

object DropIndexOptions {
  @scala.inline
  def apply(): DropIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropIndexOptions]
  }
  @scala.inline
  implicit class DropIndexOptionsOps[Self <: DropIndexOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreIfNotExists(value: Boolean): Self = this.set("ignoreIfNotExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreIfNotExists: Self = this.set("ignoreIfNotExists", js.undefined)
  }
  
}

