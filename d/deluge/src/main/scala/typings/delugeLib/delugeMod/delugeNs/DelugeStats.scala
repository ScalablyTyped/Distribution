package typings
package delugeLib.delugeMod.delugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelugeStats extends js.Object {
  var dht_nodes: scala.Double
  var download_protocol_rate: scala.Double
  var download_rate: scala.Double
  var free_space: scala.Double
  var has_incoming_connections: scala.Boolean
  var max_download: scala.Double
  var max_num_connections: scala.Double
  var max_upload: scala.Double
  var num_connections: scala.Double
  var upload_protocol_rate: scala.Double
  var upload_rate: scala.Double
}

object DelugeStats {
  @scala.inline
  def apply(
    dht_nodes: scala.Double,
    download_protocol_rate: scala.Double,
    download_rate: scala.Double,
    free_space: scala.Double,
    has_incoming_connections: scala.Boolean,
    max_download: scala.Double,
    max_num_connections: scala.Double,
    max_upload: scala.Double,
    num_connections: scala.Double,
    upload_protocol_rate: scala.Double,
    upload_rate: scala.Double
  ): DelugeStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dht_nodes")(dht_nodes)
    __obj.updateDynamic("download_protocol_rate")(download_protocol_rate)
    __obj.updateDynamic("download_rate")(download_rate)
    __obj.updateDynamic("free_space")(free_space)
    __obj.updateDynamic("has_incoming_connections")(has_incoming_connections)
    __obj.updateDynamic("max_download")(max_download)
    __obj.updateDynamic("max_num_connections")(max_num_connections)
    __obj.updateDynamic("max_upload")(max_upload)
    __obj.updateDynamic("num_connections")(num_connections)
    __obj.updateDynamic("upload_protocol_rate")(upload_protocol_rate)
    __obj.updateDynamic("upload_rate")(upload_rate)
    __obj.asInstanceOf[DelugeStats]
  }
}

