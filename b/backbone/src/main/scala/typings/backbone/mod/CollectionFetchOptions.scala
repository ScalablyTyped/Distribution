package typings.backbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionFetchOptions
  extends CollectionSetOptions
     with PersistenceOptions
     with Parseable {
  var reset: js.UndefOr[Boolean] = js.native
}

object CollectionFetchOptions {
  @scala.inline
  def apply(): CollectionFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionFetchOptions]
  }
  @scala.inline
  implicit class CollectionFetchOptionsOps[Self <: CollectionFetchOptions] (val x: Self) extends AnyVal {
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
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
  }
  
}

