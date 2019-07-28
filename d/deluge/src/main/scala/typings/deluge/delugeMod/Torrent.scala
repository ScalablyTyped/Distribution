package typings.deluge.delugeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Torrent extends js.Object {
  var distributed_copies: Double
  var download_payload_rate: Double
  var eta: Double
  var is_auto_managed: Boolean
  var max_download_speed: Double
  var max_upload_speed: Double
  var name: String
  var num_peers: Double
  var num_seeds: Double
  var progress: Double
  var queue: Double
  var ratio: Double
  var save_path: String
  var seeds_peers_ratio: Double
  var state: String
  var time_added: Double
  var total_done: Double
  var total_peers: Double
  var total_seeds: Double
  var total_uploaded: Double
  var total_wanted: Double
  var tracker_host: String
  var upload_payload_rate: Double
}

object Torrent {
  @scala.inline
  def apply(
    distributed_copies: Double,
    download_payload_rate: Double,
    eta: Double,
    is_auto_managed: Boolean,
    max_download_speed: Double,
    max_upload_speed: Double,
    name: String,
    num_peers: Double,
    num_seeds: Double,
    progress: Double,
    queue: Double,
    ratio: Double,
    save_path: String,
    seeds_peers_ratio: Double,
    state: String,
    time_added: Double,
    total_done: Double,
    total_peers: Double,
    total_seeds: Double,
    total_uploaded: Double,
    total_wanted: Double,
    tracker_host: String,
    upload_payload_rate: Double
  ): Torrent = {
    val __obj = js.Dynamic.literal(distributed_copies = distributed_copies, download_payload_rate = download_payload_rate, eta = eta, is_auto_managed = is_auto_managed, max_download_speed = max_download_speed, max_upload_speed = max_upload_speed, name = name, num_peers = num_peers, num_seeds = num_seeds, progress = progress, queue = queue, ratio = ratio, save_path = save_path, seeds_peers_ratio = seeds_peers_ratio, state = state, time_added = time_added, total_done = total_done, total_peers = total_peers, total_seeds = total_seeds, total_uploaded = total_uploaded, total_wanted = total_wanted, tracker_host = tracker_host, upload_payload_rate = upload_payload_rate)
  
    __obj.asInstanceOf[Torrent]
  }
}

