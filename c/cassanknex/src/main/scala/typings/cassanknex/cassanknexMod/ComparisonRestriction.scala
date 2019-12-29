package typings.cassanknex.cassanknexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cassanknex.cassanknexStrings.Equalssign
  - typings.cassanknex.cassanknexStrings.Lessthansign
  - typings.cassanknex.cassanknexStrings.Greaterthansign
  - typings.cassanknex.cassanknexStrings.LessthansignEqualssign
  - typings.cassanknex.cassanknexStrings.GreaterthansignEqualssign
*/
trait ComparisonRestriction extends js.Object

object ComparisonRestriction {
  @scala.inline
  def Equalssign: typings.cassanknex.cassanknexStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typings.cassanknex.cassanknexStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typings.cassanknex.cassanknexStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typings.cassanknex.cassanknexStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typings.cassanknex.cassanknexStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

