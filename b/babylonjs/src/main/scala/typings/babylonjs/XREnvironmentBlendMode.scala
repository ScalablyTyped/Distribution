package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.babylonjsStrings.opaque
  - typings.babylonjs.babylonjsStrings.additive
  - typings.babylonjs.babylonjsStrings.`alpha-blend`
*/
trait XREnvironmentBlendMode extends js.Object

object XREnvironmentBlendMode {
  @scala.inline
  def additive: typings.babylonjs.babylonjsStrings.additive = this.cast("additive")
  @scala.inline
  def `alpha-blend`: typings.babylonjs.babylonjsStrings.`alpha-blend` = this.cast("alpha-blend")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def opaque: typings.babylonjs.babylonjsStrings.opaque = this.cast("opaque")
}

