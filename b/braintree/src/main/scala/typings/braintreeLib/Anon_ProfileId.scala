package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProfileId extends js.Object {
  var profileId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ProfileId {
  @scala.inline
  def apply(profileId: java.lang.String = null): Anon_ProfileId = {
    val __obj = js.Dynamic.literal()
    if (profileId != null) __obj.updateDynamic("profileId")(profileId)
    __obj.asInstanceOf[Anon_ProfileId]
  }
}

