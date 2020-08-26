package typings.cacache.enMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheObject extends js.Object {
  /** Subresource Integrity hash for the content this entry refers to. */
  var integrity: String = js.native
  /** Key the entry was looked up under. Matches the key argument. */
  var key: String = js.native
  /** User-assigned metadata associated with the entry/content. */
  var metadata: js.UndefOr[js.Any] = js.native
  /** Filesystem path where content is stored, joined with cache argument. */
  var path: String = js.native
  /** Timestamp the entry was first added on. */
  var time: Double = js.native
}

object CacheObject {
  @scala.inline
  def apply(integrity: String, key: String, path: String, time: Double): CacheObject = {
    val __obj = js.Dynamic.literal(integrity = integrity.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheObject]
  }
  @scala.inline
  implicit class CacheObjectOps[Self <: CacheObject] (val x: Self) extends AnyVal {
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
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

