package typings.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
  */
trait PlayerState extends js.Object {
  val muted: Boolean
  val repeat: Double
  val shuffle: Boolean
  val volume: Double
}

object PlayerState {
  @scala.inline
  def apply(muted: Boolean, repeat: Double, shuffle: Boolean, volume: Double): PlayerState = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerState]
  }
}

