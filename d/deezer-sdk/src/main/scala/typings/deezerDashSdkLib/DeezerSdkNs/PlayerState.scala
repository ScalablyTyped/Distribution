package typings
package deezerDashSdkLib.DeezerSdkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
  */
trait PlayerState extends js.Object {
  val muted: scala.Boolean
  val repeat: scala.Double
  val shuffle: scala.Boolean
  val volume: scala.Double
}

object PlayerState {
  @scala.inline
  def apply(muted: scala.Boolean, repeat: scala.Double, shuffle: scala.Boolean, volume: scala.Double): PlayerState = {
    val __obj = js.Dynamic.literal(muted = muted, repeat = repeat, shuffle = shuffle, volume = volume)
  
    __obj.asInstanceOf[PlayerState]
  }
}

