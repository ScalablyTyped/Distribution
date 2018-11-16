package typings
package chromeLib.chromeNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChromeSettingGetResultDetails extends js.Object {
  /**
           * Optional.
           * Whether the effective value is specific to the incognito session.
           * This property will only be present if the incognito property in the details parameter of get() was true.
           */
  var incognitoSpecific: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * One of
           * • not_controllable: cannot be controlled by any extension
           * • controlled_by_other_extensions: controlled by extensions with higher precedence
           * • controllable_by_this_extension: can be controlled by this extension
           * • controlled_by_this_extension: controlled by this extension
           */
  var levelOfControl: java.lang.String
  /** The value of the setting. */
  var value: js.Any
}

