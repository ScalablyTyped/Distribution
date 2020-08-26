package typings.deluge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelugeStats extends js.Object {
  var dht_nodes: Double = js.native
  var download_protocol_rate: Double = js.native
  var download_rate: Double = js.native
  var free_space: Double = js.native
  var has_incoming_connections: Boolean = js.native
  var max_download: Double = js.native
  var max_num_connections: Double = js.native
  var max_upload: Double = js.native
  var num_connections: Double = js.native
  var upload_protocol_rate: Double = js.native
  var upload_rate: Double = js.native
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
  @scala.inline
  implicit class DelugeStatsOps[Self <: DelugeStats] (val x: Self) extends AnyVal {
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
    def setDht_nodes(value: Double): Self = this.set("dht_nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownload_protocol_rate(value: Double): Self = this.set("download_protocol_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownload_rate(value: Double): Self = this.set("download_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFree_space(value: Double): Self = this.set("free_space", value.asInstanceOf[js.Any])
    @scala.inline
    def setHas_incoming_connections(value: Boolean): Self = this.set("has_incoming_connections", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_download(value: Double): Self = this.set("max_download", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_num_connections(value: Double): Self = this.set("max_num_connections", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_upload(value: Double): Self = this.set("max_upload", value.asInstanceOf[js.Any])
    @scala.inline
    def setNum_connections(value: Double): Self = this.set("num_connections", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpload_protocol_rate(value: Double): Self = this.set("upload_protocol_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpload_rate(value: Double): Self = this.set("upload_rate", value.asInstanceOf[js.Any])
  }
  
}

