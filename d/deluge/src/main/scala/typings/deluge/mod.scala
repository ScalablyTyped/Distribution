package typings.deluge

import org.scalablytyped.runtime.StringDictionary
import typings.deluge.anon.State
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(deluge_url: String, password: String): Deluge = (^.asInstanceOf[js.Dynamic].apply(deluge_url.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Deluge]
  
  @JSImport("deluge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  trait DelugeStats extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: DelugeStats](x: Self) {
      
      inline def setDht_nodes(value: Double): Self = StObject.set(x, "dht_nodes", value.asInstanceOf[js.Any])
      
      inline def setDownload_protocol_rate(value: Double): Self = StObject.set(x, "download_protocol_rate", value.asInstanceOf[js.Any])
      
      inline def setDownload_rate(value: Double): Self = StObject.set(x, "download_rate", value.asInstanceOf[js.Any])
      
      inline def setFree_space(value: Double): Self = StObject.set(x, "free_space", value.asInstanceOf[js.Any])
      
      inline def setHas_incoming_connections(value: Boolean): Self = StObject.set(x, "has_incoming_connections", value.asInstanceOf[js.Any])
      
      inline def setMax_download(value: Double): Self = StObject.set(x, "max_download", value.asInstanceOf[js.Any])
      
      inline def setMax_num_connections(value: Double): Self = StObject.set(x, "max_num_connections", value.asInstanceOf[js.Any])
      
      inline def setMax_upload(value: Double): Self = StObject.set(x, "max_upload", value.asInstanceOf[js.Any])
      
      inline def setNum_connections(value: Double): Self = StObject.set(x, "num_connections", value.asInstanceOf[js.Any])
      
      inline def setUpload_protocol_rate(value: Double): Self = StObject.set(x, "upload_protocol_rate", value.asInstanceOf[js.Any])
      
      inline def setUpload_rate(value: Double): Self = StObject.set(x, "upload_rate", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadOptions extends StObject {
    
    var add_paused: Boolean
    
    var compact_allocation: Boolean
    
    var download_location: String
    
    var file_priorities: js.Array[js.Any]
    
    var max_connections: Double
    
    var max_download_speed: Double
    
    var max_upload_slots: Double
    
    var max_upload_speed: Double
    
    var prioritize_first_last_pieces: Boolean
  }
  object DownloadOptions {
    
    inline def apply(
      add_paused: Boolean,
      compact_allocation: Boolean,
      download_location: String,
      file_priorities: js.Array[js.Any],
      max_connections: Double,
      max_download_speed: Double,
      max_upload_slots: Double,
      max_upload_speed: Double,
      prioritize_first_last_pieces: Boolean
    ): DownloadOptions = {
      val __obj = js.Dynamic.literal(add_paused = add_paused.asInstanceOf[js.Any], compact_allocation = compact_allocation.asInstanceOf[js.Any], download_location = download_location.asInstanceOf[js.Any], file_priorities = file_priorities.asInstanceOf[js.Any], max_connections = max_connections.asInstanceOf[js.Any], max_download_speed = max_download_speed.asInstanceOf[js.Any], max_upload_slots = max_upload_slots.asInstanceOf[js.Any], max_upload_speed = max_upload_speed.asInstanceOf[js.Any], prioritize_first_last_pieces = prioritize_first_last_pieces.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOptions]
    }
    
    extension [Self <: DownloadOptions](x: Self) {
      
      inline def setAdd_paused(value: Boolean): Self = StObject.set(x, "add_paused", value.asInstanceOf[js.Any])
      
      inline def setCompact_allocation(value: Boolean): Self = StObject.set(x, "compact_allocation", value.asInstanceOf[js.Any])
      
      inline def setDownload_location(value: String): Self = StObject.set(x, "download_location", value.asInstanceOf[js.Any])
      
      inline def setFile_priorities(value: js.Array[js.Any]): Self = StObject.set(x, "file_priorities", value.asInstanceOf[js.Any])
      
      inline def setFile_prioritiesVarargs(value: js.Any*): Self = StObject.set(x, "file_priorities", js.Array(value :_*))
      
      inline def setMax_connections(value: Double): Self = StObject.set(x, "max_connections", value.asInstanceOf[js.Any])
      
      inline def setMax_download_speed(value: Double): Self = StObject.set(x, "max_download_speed", value.asInstanceOf[js.Any])
      
      inline def setMax_upload_slots(value: Double): Self = StObject.set(x, "max_upload_slots", value.asInstanceOf[js.Any])
      
      inline def setMax_upload_speed(value: Double): Self = StObject.set(x, "max_upload_speed", value.asInstanceOf[js.Any])
      
      inline def setPrioritize_first_last_pieces(value: Boolean): Self = StObject.set(x, "prioritize_first_last_pieces", value.asInstanceOf[js.Any])
    }
  }
  
  trait Host extends StObject {
    
    var id: String
    
    var ip: String
    
    var port: Double
    
    var status: String
  }
  object Host {
    
    inline def apply(id: String, ip: String, port: Double, status: String): Host = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Torrent extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: Torrent](x: Self) {
      
      inline def setDistributed_copies(value: Double): Self = StObject.set(x, "distributed_copies", value.asInstanceOf[js.Any])
      
      inline def setDownload_payload_rate(value: Double): Self = StObject.set(x, "download_payload_rate", value.asInstanceOf[js.Any])
      
      inline def setEta(value: Double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
      
      inline def setIs_auto_managed(value: Boolean): Self = StObject.set(x, "is_auto_managed", value.asInstanceOf[js.Any])
      
      inline def setMax_download_speed(value: Double): Self = StObject.set(x, "max_download_speed", value.asInstanceOf[js.Any])
      
      inline def setMax_upload_speed(value: Double): Self = StObject.set(x, "max_upload_speed", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNum_peers(value: Double): Self = StObject.set(x, "num_peers", value.asInstanceOf[js.Any])
      
      inline def setNum_seeds(value: Double): Self = StObject.set(x, "num_seeds", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: Double): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setSave_path(value: String): Self = StObject.set(x, "save_path", value.asInstanceOf[js.Any])
      
      inline def setSeeds_peers_ratio(value: Double): Self = StObject.set(x, "seeds_peers_ratio", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTime_added(value: Double): Self = StObject.set(x, "time_added", value.asInstanceOf[js.Any])
      
      inline def setTotal_done(value: Double): Self = StObject.set(x, "total_done", value.asInstanceOf[js.Any])
      
      inline def setTotal_peers(value: Double): Self = StObject.set(x, "total_peers", value.asInstanceOf[js.Any])
      
      inline def setTotal_seeds(value: Double): Self = StObject.set(x, "total_seeds", value.asInstanceOf[js.Any])
      
      inline def setTotal_uploaded(value: Double): Self = StObject.set(x, "total_uploaded", value.asInstanceOf[js.Any])
      
      inline def setTotal_wanted(value: Double): Self = StObject.set(x, "total_wanted", value.asInstanceOf[js.Any])
      
      inline def setTracker_host(value: String): Self = StObject.set(x, "tracker_host", value.asInstanceOf[js.Any])
      
      inline def setUpload_payload_rate(value: Double): Self = StObject.set(x, "upload_payload_rate", value.asInstanceOf[js.Any])
    }
  }
  
  trait TorrentRecord extends StObject {
    
    var connected: Boolean
    
    var filters: State
    
    var stats: DelugeStats
    
    var torrents: StringDictionary[Torrent]
  }
  object TorrentRecord {
    
    inline def apply(connected: Boolean, filters: State, stats: DelugeStats, torrents: StringDictionary[Torrent]): TorrentRecord = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], torrents = torrents.asInstanceOf[js.Any])
      __obj.asInstanceOf[TorrentRecord]
    }
    
    extension [Self <: TorrentRecord](x: Self) {
      
      inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: State): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setStats(value: DelugeStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setTorrents(value: StringDictionary[Torrent]): Self = StObject.set(x, "torrents", value.asInstanceOf[js.Any])
    }
  }
}
