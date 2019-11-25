package typings.deluge.delugeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions extends js.Object {
  var add_paused: Boolean
  var compact_allocation: Boolean
  var download_location: String
  var file_priorities: js.Array[_]
  var max_connections: Double
  var max_download_speed: Double
  var max_upload_slots: Double
  var max_upload_speed: Double
  var prioritize_first_last_pieces: Boolean
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
}

