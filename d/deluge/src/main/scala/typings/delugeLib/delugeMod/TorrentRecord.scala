package typings
package delugeLib.delugeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentRecord extends js.Object {
  var connected: scala.Boolean
  var filters: delugeLib.Anon_State
  var stats: DelugeStats
  var torrents: org.scalablytyped.runtime.StringDictionary[Torrent]
}

object TorrentRecord {
  @scala.inline
  def apply(
    connected: scala.Boolean,
    filters: delugeLib.Anon_State,
    stats: DelugeStats,
    torrents: org.scalablytyped.runtime.StringDictionary[Torrent]
  ): TorrentRecord = {
    val __obj = js.Dynamic.literal(connected = connected, filters = filters, stats = stats, torrents = torrents)
  
    __obj.asInstanceOf[TorrentRecord]
  }
}

