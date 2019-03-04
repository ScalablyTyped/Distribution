package typings
package delugeLib.delugeMod.delugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions extends js.Object {
  var add_paused: scala.Boolean
  var compact_allocation: scala.Boolean
  var download_location: java.lang.String
  var file_priorities: js.Array[_]
  var max_connections: scala.Double
  var max_download_speed: scala.Double
  var max_upload_slots: scala.Double
  var max_upload_speed: scala.Double
  var prioritize_first_last_pieces: scala.Boolean
}

object DownloadOptions {
  @scala.inline
  def apply(
    add_paused: scala.Boolean,
    compact_allocation: scala.Boolean,
    download_location: java.lang.String,
    file_priorities: js.Array[_],
    max_connections: scala.Double,
    max_download_speed: scala.Double,
    max_upload_slots: scala.Double,
    max_upload_speed: scala.Double,
    prioritize_first_last_pieces: scala.Boolean
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal(add_paused = add_paused, compact_allocation = compact_allocation, download_location = download_location, file_priorities = file_priorities, max_connections = max_connections, max_download_speed = max_download_speed, max_upload_slots = max_upload_slots, max_upload_speed = max_upload_speed, prioritize_first_last_pieces = prioritize_first_last_pieces)
  
    __obj.asInstanceOf[DownloadOptions]
  }
}

