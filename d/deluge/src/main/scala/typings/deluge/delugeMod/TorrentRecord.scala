package typings.deluge.delugeMod

import org.scalablytyped.runtime.StringDictionary
import typings.deluge.Anon_State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentRecord extends js.Object {
  var connected: Boolean
  var filters: Anon_State
  var stats: DelugeStats
  var torrents: StringDictionary[Torrent]
}

object TorrentRecord {
  @scala.inline
  def apply(connected: Boolean, filters: Anon_State, stats: DelugeStats, torrents: StringDictionary[Torrent]): TorrentRecord = {
    val __obj = js.Dynamic.literal(connected = connected, filters = filters, stats = stats, torrents = torrents)
  
    __obj.asInstanceOf[TorrentRecord]
  }
}

