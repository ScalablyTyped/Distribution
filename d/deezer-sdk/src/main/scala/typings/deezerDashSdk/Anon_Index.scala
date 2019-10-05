package typings.deezerDashSdk

import typings.deezerDashSdk.DeezerSdk.Track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: Double
  var track: Track
}

object Anon_Index {
  @scala.inline
  def apply(index: Double, track: Track): Anon_Index = {
    val __obj = js.Dynamic.literal(index = index, track = track)
  
    __obj.asInstanceOf[Anon_Index]
  }
}

