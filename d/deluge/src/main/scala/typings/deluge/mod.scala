package typings.deluge

import org.scalablytyped.runtime.StringDictionary
import typings.deluge.anon.State
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deluge", JSImport.Namespace)
  @js.native
  def apply(deluge_url: String, password: String): Deluge = js.native
  
  @js.native
  trait Deluge extends StObject {
    
    /**
      * Add the torrent to Deluge
      * @param magnet
      * @param dlPath
      * @param callback
      */
    def add(
      magnet: String,
      dlPath: String,
      callback: js.Function3[/* error */ String, /* result */ Boolean, /* response */ ServerResponse, Unit]
    ): Unit = js.native
    def add(
      magnet: String,
      dlPath: DownloadOptions,
      callback: js.Function3[/* error */ String, /* result */ Boolean, /* response */ ServerResponse, Unit]
    ): Unit = js.native
    
    /**
      * Connect the WebUI to the wanted daemon
      * @param hostID
      * @param callback
      */
    def connect(
      hostID: String,
      callback: js.Function3[/* error */ String, /* result */ Boolean, /* response */ ServerResponse, Unit]
    ): Unit = js.native
    
    /**
      * Get the list of all the hosts that the WebUI can connect to
      * @param callback
      */
    def getHosts(
      callback: js.Function3[/* error */ String, /* result */ js.Array[Host], /* response */ ServerResponse, Unit]
    ): Unit = js.native
    
    /**
      * Get the list of all torrents and changing data that represents their status in the WebUI
      * @param callback
      */
    def getTorrentRecord(
      callback: js.Function3[/* error */ String, /* result */ TorrentRecord, /* response */ ServerResponse, Unit]
    ): Unit = js.native
    
    /**
      * Check if the WebUI is connected to a deamon. Return true or false as result of the callback.
      * @param callback
      */
    def isConnected(
      callback: js.Function3[/* error */ String, /* result */ Boolean, /* response */ ServerResponse, Unit]
    ): Unit = js.native
    
    /**
      * Set cookies in COOKIE_JAR, cookies is an object with urls as keys, example:
      * {'http://example.org/': 'uid=1234;pass=xxxx;'}
      * @object cookies
      */
    def setCookies(
      cookies: StringDictionary[String],
      callback: js.Function3[/* error */ String, /* result */ Boolean, /* response */ ServerResponse, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait DelugeStats extends StObject {
    
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
    implicit class DelugeStatsMutableBuilder[Self <: DelugeStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDht_nodes(value: Double): Self = StObject.set(x, "dht_nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownload_protocol_rate(value: Double): Self = StObject.set(x, "download_protocol_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownload_rate(value: Double): Self = StObject.set(x, "download_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFree_space(value: Double): Self = StObject.set(x, "free_space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_incoming_connections(value: Boolean): Self = StObject.set(x, "has_incoming_connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_download(value: Double): Self = StObject.set(x, "max_download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_num_connections(value: Double): Self = StObject.set(x, "max_num_connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_upload(value: Double): Self = StObject.set(x, "max_upload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_connections(value: Double): Self = StObject.set(x, "num_connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocol_rate(value: Double): Self = StObject.set(x, "upload_protocol_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_rate(value: Double): Self = StObject.set(x, "upload_rate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DownloadOptions extends StObject {
    
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
    implicit class DownloadOptionsMutableBuilder[Self <: DownloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd_paused(value: Boolean): Self = StObject.set(x, "add_paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompact_allocation(value: Boolean): Self = StObject.set(x, "compact_allocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownload_location(value: String): Self = StObject.set(x, "download_location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile_priorities(value: js.Array[_]): Self = StObject.set(x, "file_priorities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile_prioritiesVarargs(value: js.Any*): Self = StObject.set(x, "file_priorities", js.Array(value :_*))
      
      @scala.inline
      def setMax_connections(value: Double): Self = StObject.set(x, "max_connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_download_speed(value: Double): Self = StObject.set(x, "max_download_speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_upload_slots(value: Double): Self = StObject.set(x, "max_upload_slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_upload_speed(value: Double): Self = StObject.set(x, "max_upload_speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrioritize_first_last_pieces(value: Boolean): Self = StObject.set(x, "prioritize_first_last_pieces", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Host extends StObject {
    
    var id: String = js.native
    
    var ip: String = js.native
    
    var port: Double = js.native
    
    var status: String = js.native
  }
  object Host {
    
    @scala.inline
    def apply(id: String, ip: String, port: Double, status: String): Host = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Torrent extends StObject {
    
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
    implicit class TorrentMutableBuilder[Self <: Torrent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistributed_copies(value: Double): Self = StObject.set(x, "distributed_copies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownload_payload_rate(value: Double): Self = StObject.set(x, "download_payload_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEta(value: Double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_auto_managed(value: Boolean): Self = StObject.set(x, "is_auto_managed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_download_speed(value: Double): Self = StObject.set(x, "max_download_speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_upload_speed(value: Double): Self = StObject.set(x, "max_upload_speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_peers(value: Double): Self = StObject.set(x, "num_peers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_seeds(value: Double): Self = StObject.set(x, "num_seeds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: Double): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSave_path(value: String): Self = StObject.set(x, "save_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeeds_peers_ratio(value: Double): Self = StObject.set(x, "seeds_peers_ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime_added(value: Double): Self = StObject.set(x, "time_added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_done(value: Double): Self = StObject.set(x, "total_done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_peers(value: Double): Self = StObject.set(x, "total_peers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_seeds(value: Double): Self = StObject.set(x, "total_seeds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_uploaded(value: Double): Self = StObject.set(x, "total_uploaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_wanted(value: Double): Self = StObject.set(x, "total_wanted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracker_host(value: String): Self = StObject.set(x, "tracker_host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_payload_rate(value: Double): Self = StObject.set(x, "upload_payload_rate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TorrentRecord extends StObject {
    
    var connected: Boolean = js.native
    
    var filters: State = js.native
    
    var stats: DelugeStats = js.native
    
    var torrents: StringDictionary[Torrent] = js.native
  }
  object TorrentRecord {
    
    @scala.inline
    def apply(connected: Boolean, filters: State, stats: DelugeStats, torrents: StringDictionary[Torrent]): TorrentRecord = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], torrents = torrents.asInstanceOf[js.Any])
      __obj.asInstanceOf[TorrentRecord]
    }
    
    @scala.inline
    implicit class TorrentRecordMutableBuilder[Self <: TorrentRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: State): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: DelugeStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTorrents(value: StringDictionary[Torrent]): Self = StObject.set(x, "torrents", value.asInstanceOf[js.Any])
    }
  }
}
