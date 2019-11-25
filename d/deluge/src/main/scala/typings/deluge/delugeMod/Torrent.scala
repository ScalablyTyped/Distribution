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
    val __obj = js.Dynamic.literal(distributed_copies = distributed_copies.asInstanceOf[js.Any], download_payload_rate = download_payload_rate.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], is_auto_managed = is_auto_managed.asInstanceOf[js.Any], max_download_speed = max_download_speed.asInstanceOf[js.Any], max_upload_speed = max_upload_speed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], num_peers = num_peers.asInstanceOf[js.Any], num_seeds = num_seeds.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], save_path = save_path.asInstanceOf[js.Any], seeds_peers_ratio = seeds_peers_ratio.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], time_added = time_added.asInstanceOf[js.Any], total_done = total_done.asInstanceOf[js.Any], total_peers = total_peers.asInstanceOf[js.Any], total_seeds = total_seeds.asInstanceOf[js.Any], total_uploaded = total_uploaded.asInstanceOf[js.Any], total_wanted = total_wanted.asInstanceOf[js.Any], tracker_host = tracker_host.asInstanceOf[js.Any], upload_payload_rate = upload_payload_rate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Torrent]
  }
}

