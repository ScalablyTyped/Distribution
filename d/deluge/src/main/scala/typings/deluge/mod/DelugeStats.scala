package typings.deluge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelugeStats extends js.Object {
  var dht_nodes: Double
  var download_protocol_rate: Double
  var download_rate: Double
  var free_space: Double
  var has_incoming_connections: Boolean
  var max_download: Double
  var max_num_connections: Double
  var max_upload: Double
  var num_connections: Double
  var upload_protocol_rate: Double
  var upload_rate: Double
}

object DelugeStats {
  @scala.inline
  def apply(
    dht_nodes: Double,
    download_protocol_rate: Double,
    download_rate: Double,
    free_space: Double,
    has_incoming_connections: Boolean,
    max_download: Double,
    max_num_connections: Double,
    max_upload: Double,
    num_connections: Double,
    upload_protocol_rate: Double,
    upload_rate: Double
  ): DelugeStats = {
    val __obj = js.Dynamic.literal(dht_nodes = dht_nodes.asInstanceOf[js.Any], download_protocol_rate = download_protocol_rate.asInstanceOf[js.Any], download_rate = download_rate.asInstanceOf[js.Any], free_space = free_space.asInstanceOf[js.Any], has_incoming_connections = has_incoming_connections.asInstanceOf[js.Any], max_download = max_download.asInstanceOf[js.Any], max_num_connections = max_num_connections.asInstanceOf[js.Any], max_upload = max_upload.asInstanceOf[js.Any], num_connections = num_connections.asInstanceOf[js.Any], upload_protocol_rate = upload_protocol_rate.asInstanceOf[js.Any], upload_rate = upload_rate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DelugeStats]
  }
}

