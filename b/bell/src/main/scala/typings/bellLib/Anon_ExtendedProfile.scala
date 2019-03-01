package typings
package bellLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendedProfile extends js.Object {
  var extendedProfile: js.UndefOr[scala.Boolean] = js.undefined
  var getMethod: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ExtendedProfile {
  @scala.inline
  def apply(extendedProfile: js.UndefOr[scala.Boolean] = js.undefined, getMethod: java.lang.String = null): Anon_ExtendedProfile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extendedProfile)) __obj.updateDynamic("extendedProfile")(extendedProfile)
    if (getMethod != null) __obj.updateDynamic("getMethod")(getMethod)
    __obj.asInstanceOf[Anon_ExtendedProfile]
  }
}

