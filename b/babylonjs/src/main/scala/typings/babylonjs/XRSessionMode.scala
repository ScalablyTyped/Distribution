package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.babylonjsStrings.`inline`
  - typings.babylonjs.babylonjsStrings.`immersive-vr`
  - typings.babylonjs.babylonjsStrings.`immersive-ar`
*/
trait XRSessionMode extends js.Object

object XRSessionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `immersive-ar`: typings.babylonjs.babylonjsStrings.`immersive-ar` = this.cast("immersive-ar")
  @scala.inline
  def `immersive-vr`: typings.babylonjs.babylonjsStrings.`immersive-vr` = this.cast("immersive-vr")
  @scala.inline
  def `inline`: typings.babylonjs.babylonjsStrings.`inline` = this.cast("inline")
}

