package typings.cypress.JQueryNs

import typings.cypress.cypressNumbers.`0`
import typings.cypress.cypressNumbers.`1`
import typings.cypress.cypressNumbers.`2`
import typings.cypress.cypressNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Provided for convenience for use with jQuery.Event.which
// tslint:disable-next-line:no-const-enum
/* Rewritten from type alias, can be one of: 
  - typings.cypress.cypressNumbers.`0`
  - typings.cypress.cypressNumbers.`1`
  - typings.cypress.cypressNumbers.`2`
  - typings.cypress.cypressNumbers.`3`
*/
trait Mouse extends js.Object

object Mouse {
  @scala.inline
  def Left: `1` = this.cast(1)
  @scala.inline
  def Middle: `2` = this.cast(2)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def Right: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

