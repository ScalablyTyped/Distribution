package typings.deluge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadOptions extends js.Object {
  var add_paused: Boolean = js.native
  var compact_allocation: Boolean = js.native
  var download_location: String = js.native
  var file_priorities: js.Array[_] = js.native
  var max_connections: Double = js.native
  var max_download_speed: Double = js.native
  var max_upload_slots: Double = js.native
  var max_upload_speed: Double = js.native
  var prioritize_first_last_pieces: Boolean = js.native
}

object DownloadOptions {
  @scala.inline
  def apply(
    add_paused: Boolean,
    compact_allocation: Boolean,
    download_location: String,
    file_priorities: js.Array[_],
    max_connections: Double,
    max_download_speed: Double,
    max_upload_slots: Double,
    max_upload_speed: Double,
    prioritize_first_last_pieces: Boolean
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal(add_paused = add_paused.asInstanceOf[js.Any], compact_allocation = compact_allocation.asInstanceOf[js.Any], download_location = download_location.asInstanceOf[js.Any], file_priorities = file_priorities.asInstanceOf[js.Any], max_connections = max_connections.asInstanceOf[js.Any], max_download_speed = max_download_speed.asInstanceOf[js.Any], max_upload_slots = max_upload_slots.asInstanceOf[js.Any], max_upload_speed = max_upload_speed.asInstanceOf[js.Any], prioritize_first_last_pieces = prioritize_first_last_pieces.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
  @scala.inline
  implicit class DownloadOptionsOps[Self <: DownloadOptions] (val x: Self) extends AnyVal {
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
    def setAdd_paused(value: Boolean): Self = this.set("add_paused", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompact_allocation(value: Boolean): Self = this.set("compact_allocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownload_location(value: String): Self = this.set("download_location", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile_prioritiesVarargs(value: js.Any*): Self = this.set("file_priorities", js.Array(value :_*))
    @scala.inline
    def setFile_priorities(value: js.Array[_]): Self = this.set("file_priorities", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_connections(value: Double): Self = this.set("max_connections", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_download_speed(value: Double): Self = this.set("max_download_speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_upload_slots(value: Double): Self = this.set("max_upload_slots", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_upload_speed(value: Double): Self = this.set("max_upload_speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrioritize_first_last_pieces(value: Boolean): Self = this.set("prioritize_first_last_pieces", value.asInstanceOf[js.Any])
  }
  
}

