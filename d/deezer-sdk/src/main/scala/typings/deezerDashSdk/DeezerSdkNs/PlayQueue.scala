package typings.deezerDashSdk.DeezerSdkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
  */
trait PlayQueue extends js.Object {
  val tracks: js.Array[Track]
}

object PlayQueue {
  @scala.inline
  def apply(tracks: js.Array[Track]): PlayQueue = {
    val __obj = js.Dynamic.literal(tracks = tracks)
  
    __obj.asInstanceOf[PlayQueue]
  }
}

