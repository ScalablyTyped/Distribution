package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayName extends js.Object {
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var merchantIdentifier: js.UndefOr[java.lang.String] = js.undefined
  var validationURL: java.lang.String
}

object Anon_DisplayName {
  @scala.inline
  def apply(
    validationURL: java.lang.String,
    displayName: java.lang.String = null,
    merchantIdentifier: java.lang.String = null
  ): Anon_DisplayName = {
    val __obj = js.Dynamic.literal(validationURL = validationURL)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (merchantIdentifier != null) __obj.updateDynamic("merchantIdentifier")(merchantIdentifier)
    __obj.asInstanceOf[Anon_DisplayName]
  }
}

