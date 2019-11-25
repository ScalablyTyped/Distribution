package typings.cassanknex.cassanknexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cassanknex.cassanknexStrings.`=`
  - typings.cassanknex.cassanknexStrings.`<`
  - typings.cassanknex.cassanknexStrings.`>`
  - typings.cassanknex.cassanknexStrings.`<=`
  - typings.cassanknex.cassanknexStrings.`>=`
*/
trait ComparisonRestriction extends js.Object

object ComparisonRestriction {
  @scala.inline
  def `<`: typings.cassanknex.cassanknexStrings.`<` = this.cast("<")
  @scala.inline
  def `<=`: typings.cassanknex.cassanknexStrings.`<=` = this.cast("<=")
  @scala.inline
  def `=`: typings.cassanknex.cassanknexStrings.`=` = this.cast("=")
  @scala.inline
  def `>`: typings.cassanknex.cassanknexStrings.`>` = this.cast(">")
  @scala.inline
  def `>=`: typings.cassanknex.cassanknexStrings.`>=` = this.cast(">=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

