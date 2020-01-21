package typings.deezerSdk

import typings.deezerSdk.DeezerSdk.Track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: Double
  var track: Track
}

object AnonIndex {
  @scala.inline
  def apply(index: Double, track: Track): AnonIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIndex]
  }
}

