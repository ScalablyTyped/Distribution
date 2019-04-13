package typings
package camljsLib.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpression extends IGroupable {
  /** Adds And clause to the query. */
  def And(): IFieldExpression = js.native
  /** Adds Or clause to the query. */
  def Or(): IFieldExpression = js.native
}

