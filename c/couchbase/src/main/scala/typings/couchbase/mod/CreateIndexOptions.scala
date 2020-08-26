package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIndexOptions extends js.Object {
  /**
    * True to defer building of the index until buildDeferredIndexes is called (or a direct call to the corresponding query service API).
    */
  var deferred: js.UndefOr[Boolean] = js.native
  /**
    * If a secondary index already exists, an error will be thrown unless this is set to true.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.native
}

object CreateIndexOptions {
  @scala.inline
  def apply(): CreateIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIndexOptions]
  }
  @scala.inline
  implicit class CreateIndexOptionsOps[Self <: CreateIndexOptions] (val x: Self) extends AnyVal {
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
    def setDeferred(value: Boolean): Self = this.set("deferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferred: Self = this.set("deferred", js.undefined)
    @scala.inline
    def setIgnoreIfExists(value: Boolean): Self = this.set("ignoreIfExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreIfExists: Self = this.set("ignoreIfExists", js.undefined)
  }
  
}

