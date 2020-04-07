package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.babylonjsStrings.viewer
  - typings.babylonjs.babylonjsStrings.local
  - typings.babylonjs.babylonjsStrings.`local-floor`
  - typings.babylonjs.babylonjsStrings.`bounded-floor`
  - typings.babylonjs.babylonjsStrings.unbounded
*/
trait XRReferenceSpaceType extends js.Object

object XRReferenceSpaceType {
  @scala.inline
  def `bounded-floor`: typings.babylonjs.babylonjsStrings.`bounded-floor` = this.cast("bounded-floor")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def local: typings.babylonjs.babylonjsStrings.local = this.cast("local")
  @scala.inline
  def `local-floor`: typings.babylonjs.babylonjsStrings.`local-floor` = this.cast("local-floor")
  @scala.inline
  def unbounded: typings.babylonjs.babylonjsStrings.unbounded = this.cast("unbounded")
  @scala.inline
  def viewer: typings.babylonjs.babylonjsStrings.viewer = this.cast("viewer")
}

