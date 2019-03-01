package typings
package atCarbonTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mono extends js.Object {
  var mono: java.lang.String
  var sans: java.lang.String
  var sansCondensed: java.lang.String
  var sansHebrew: java.lang.String
  var serif: java.lang.String
}

object Anon_Mono {
  @scala.inline
  def apply(
    mono: java.lang.String,
    sans: java.lang.String,
    sansCondensed: java.lang.String,
    sansHebrew: java.lang.String,
    serif: java.lang.String
  ): Anon_Mono = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mono")(mono)
    __obj.updateDynamic("sans")(sans)
    __obj.updateDynamic("sansCondensed")(sansCondensed)
    __obj.updateDynamic("sansHebrew")(sansHebrew)
    __obj.updateDynamic("serif")(serif)
    __obj.asInstanceOf[Anon_Mono]
  }
}

