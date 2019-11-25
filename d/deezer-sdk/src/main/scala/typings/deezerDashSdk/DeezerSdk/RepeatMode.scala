package typings.deezerDashSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 0: No repeat\
  * 1: Repeat all\
  * 2: Repeat one
  *
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}\
  * {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
  */
/* Rewritten from type alias, can be one of: 
  - typings.deezerDashSdk.deezerDashSdkNumbers.`0`
  - typings.deezerDashSdk.deezerDashSdkNumbers.`1`
  - typings.deezerDashSdk.deezerDashSdkNumbers.`2`
*/
trait RepeatMode extends js.Object

object RepeatMode {
  @scala.inline
  def `0`: typings.deezerDashSdk.deezerDashSdkNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typings.deezerDashSdk.deezerDashSdkNumbers.`1` = this.cast(1)
  @scala.inline
  def `2`: typings.deezerDashSdk.deezerDashSdkNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

