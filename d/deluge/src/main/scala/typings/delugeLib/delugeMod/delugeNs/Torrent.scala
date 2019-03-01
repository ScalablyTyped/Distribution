package typings
package delugeLib.delugeMod.delugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Torrent extends js.Object {
  var distributed_copies: scala.Double
  var download_payload_rate: scala.Double
  var eta: scala.Double
  var is_auto_managed: scala.Boolean
  var max_download_speed: scala.Double
  var max_upload_speed: scala.Double
  var name: java.lang.String
  var num_peers: scala.Double
  var num_seeds: scala.Double
  var progress: scala.Double
  var queue: scala.Double
  var ratio: scala.Double
  var save_path: java.lang.String
  var seeds_peers_ratio: scala.Double
  var state: java.lang.String
  var time_added: scala.Double
  var total_done: scala.Double
  var total_peers: scala.Double
  var total_seeds: scala.Double
  var total_uploaded: scala.Double
  var total_wanted: scala.Double
  var tracker_host: java.lang.String
  var upload_payload_rate: scala.Double
}

object Torrent {
  @scala.inline
  def apply(
    distributed_copies: scala.Double,
    download_payload_rate: scala.Double,
    eta: scala.Double,
    is_auto_managed: scala.Boolean,
    max_download_speed: scala.Double,
    max_upload_speed: scala.Double,
    name: java.lang.String,
    num_peers: scala.Double,
    num_seeds: scala.Double,
    progress: scala.Double,
    queue: scala.Double,
    ratio: scala.Double,
    save_path: java.lang.String,
    seeds_peers_ratio: scala.Double,
    state: java.lang.String,
    time_added: scala.Double,
    total_done: scala.Double,
    total_peers: scala.Double,
    total_seeds: scala.Double,
    total_uploaded: scala.Double,
    total_wanted: scala.Double,
    tracker_host: java.lang.String,
    upload_payload_rate: scala.Double
  ): Torrent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distributed_copies")(distributed_copies)
    __obj.updateDynamic("download_payload_rate")(download_payload_rate)
    __obj.updateDynamic("eta")(eta)
    __obj.updateDynamic("is_auto_managed")(is_auto_managed)
    __obj.updateDynamic("max_download_speed")(max_download_speed)
    __obj.updateDynamic("max_upload_speed")(max_upload_speed)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("num_peers")(num_peers)
    __obj.updateDynamic("num_seeds")(num_seeds)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("queue")(queue)
    __obj.updateDynamic("ratio")(ratio)
    __obj.updateDynamic("save_path")(save_path)
    __obj.updateDynamic("seeds_peers_ratio")(seeds_peers_ratio)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("time_added")(time_added)
    __obj.updateDynamic("total_done")(total_done)
    __obj.updateDynamic("total_peers")(total_peers)
    __obj.updateDynamic("total_seeds")(total_seeds)
    __obj.updateDynamic("total_uploaded")(total_uploaded)
    __obj.updateDynamic("total_wanted")(total_wanted)
    __obj.updateDynamic("tracker_host")(tracker_host)
    __obj.updateDynamic("upload_payload_rate")(upload_payload_rate)
    __obj.asInstanceOf[Torrent]
  }
}

