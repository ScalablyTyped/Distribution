package typings.deezerSdk.anon

import typings.deezerSdk.DeezerSdk.Track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: Double
  var track: Track
}

object Index {
  @scala.inline
  def apply(index: Double, track: Track): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

