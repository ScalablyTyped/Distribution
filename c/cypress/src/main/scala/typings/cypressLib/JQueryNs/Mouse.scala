package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Provided for convenience for use with jQuery.Event.which
// tslint:disable-next-line:no-const-enum
/* Rewritten from type alias, can be one of: 
  - cypressLib.cypressLibNumbers.`0`
  - cypressLib.cypressLibNumbers.`1`
  - cypressLib.cypressLibNumbers.`2`
  - cypressLib.cypressLibNumbers.`3`
*/
trait Mouse extends js.Object

object Mouse {
  @scala.inline
  def Left: cypressLib.cypressLibNumbers.`1` = this.cast(1)
  @scala.inline
  def Middle: cypressLib.cypressLibNumbers.`2` = this.cast(2)
  @scala.inline
  def None: cypressLib.cypressLibNumbers.`0` = this.cast(0)
  @scala.inline
  def Right: cypressLib.cypressLibNumbers.`3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

