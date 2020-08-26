package typings.cacache.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined cacache.cacache/en.CacheObject & {  size :number} */
@js.native
trait CacheObjectsizenumber extends js.Object {
  /** Subresource Integrity hash for the content this entry refers to. */
  var integrity: String = js.native
  /** Key the entry was looked up under. Matches the key argument. */
  var key: String = js.native
  /** User-assigned metadata associated with the entry/content. */
  var metadata: js.UndefOr[js.Any] = js.native
  /** Filesystem path where content is stored, joined with cache argument. */
  var path: String = js.native
  var size: Double = js.native
  /** Timestamp the entry was first added on. */
  var time: Double = js.native
}

object CacheObjectsizenumber {
  @scala.inline
  def apply(integrity: String, key: String, path: String, size: Double, time: Double): CacheObjectsizenumber = {
    val __obj = js.Dynamic.literal(integrity = integrity.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheObjectsizenumber]
  }
  @scala.inline
  implicit class CacheObjectsizenumberOps[Self <: CacheObjectsizenumber] (val x: Self) extends AnyVal {
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
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

