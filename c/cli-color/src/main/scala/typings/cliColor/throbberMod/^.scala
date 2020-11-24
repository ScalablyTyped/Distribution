package typings.cliColor.throbberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cli-color/throbber", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Writes throbber string to *write* function at given *interval*. Optionally throbber output can be formatted with given *format* function
    */
  def apply(write: js.Function1[/* str */ String, Unit], interval: Double): Throbber = js.native
  def apply(
    write: js.Function1[/* str */ String, Unit],
    interval: Double,
    format: js.Function1[/* throbber */ String, String]
  ): Throbber = js.native
}
