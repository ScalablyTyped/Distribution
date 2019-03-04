package typings
package chromeDashAppsLib.chromeNs.displaySourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorInfo extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** @see ErrorType */
  var `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_CAPABILITIESNEGOTIATIONERROR, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CAPABILITIESNEGOTIATIONERROR[keyof chrome-apps.Anon_CAPABILITIESNEGOTIATIONERROR] */ js.Any
    ]
  ]
}

object ErrorInfo {
  @scala.inline
  def apply(
    `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CAPABILITIESNEGOTIATIONERROR, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CAPABILITIESNEGOTIATIONERROR[keyof chrome-apps.Anon_CAPABILITIESNEGOTIATIONERROR] */ js.Any
      ]
    ],
    description: java.lang.String = null
  ): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ErrorInfo]
  }
}

