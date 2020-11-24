package typings.deluge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Torrent extends js.Object {
  
  var distributed_copies: Double = js.native
  
  var download_payload_rate: Double = js.native
  
  var eta: Double = js.native
  
  var is_auto_managed: Boolean = js.native
  
  var max_download_speed: Double = js.native
  
  var max_upload_speed: Double = js.native
  
  var name: String = js.native
  
  var num_peers: Double = js.native
  
  var num_seeds: Double = js.native
  
  var progress: Double = js.native
  
  var queue: Double = js.native
  
  var ratio: Double = js.native
  
  var save_path: String = js.native
  
  var seeds_peers_ratio: Double = js.native
  
  var state: String = js.native
  
  var time_added: Double = js.native
  
  var total_done: Double = js.native
  
  var total_peers: Double = js.native
  
  var total_seeds: Double = js.native
  
  var total_uploaded: Double = js.native
  
  var total_wanted: Double = js.native
  
  var tracker_host: String = js.native
  
  var upload_payload_rate: Double = js.native
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
  
  @scala.inline
  implicit class TorrentOps[Self <: Torrent] (val x: Self) extends AnyVal {
    
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
    def setDistributed_copies(value: Double): Self = this.set("distributed_copies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownload_payload_rate(value: Double): Self = this.set("download_payload_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEta(value: Double): Self = this.set("eta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_auto_managed(value: Boolean): Self = this.set("is_auto_managed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_download_speed(value: Double): Self = this.set("max_download_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_upload_speed(value: Double): Self = this.set("max_upload_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_peers(value: Double): Self = this.set("num_peers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_seeds(value: Double): Self = this.set("num_seeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: Double): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave_path(value: String): Self = this.set("save_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeeds_peers_ratio(value: Double): Self = this.set("seeds_peers_ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_added(value: Double): Self = this.set("time_added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_done(value: Double): Self = this.set("total_done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_peers(value: Double): Self = this.set("total_peers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_seeds(value: Double): Self = this.set("total_seeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_uploaded(value: Double): Self = this.set("total_uploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_wanted(value: Double): Self = this.set("total_wanted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracker_host(value: String): Self = this.set("tracker_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_payload_rate(value: Double): Self = this.set("upload_payload_rate", value.asInstanceOf[js.Any])
  }
}
