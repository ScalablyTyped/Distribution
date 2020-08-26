package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hits extends js.Object {
  /**
    * A cursor that can be used to retrieve the next set of matching documents when you want to page through a large result set.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * The total number of documents that match the search request.
    */
  var found: js.UndefOr[Long] = js.native
  /**
    * A document that matches the search request.
    */
  var hit: js.UndefOr[HitList] = js.native
  /**
    * The index of the first matching document.
    */
  var start: js.UndefOr[Long] = js.native
}

object Hits {
  @scala.inline
  def apply(): Hits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hits]
  }
  @scala.inline
  implicit class HitsOps[Self <: Hits] (val x: Self) extends AnyVal {
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
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setFound(value: Long): Self = this.set("found", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFound: Self = this.set("found", js.undefined)
    @scala.inline
    def setHitVarargs(value: Hit*): Self = this.set("hit", js.Array(value :_*))
    @scala.inline
    def setHit(value: HitList): Self = this.set("hit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHit: Self = this.set("hit", js.undefined)
    @scala.inline
    def setStart(value: Long): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

