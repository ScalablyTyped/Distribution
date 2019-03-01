package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionState extends js.Object {
  var description: java.lang.String
  var state: chromeDashAppsLib.chromeNs.ToStringLiteral[
    Anon_AUTHENTICATIONREQUIRED, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_AUTHENTICATIONREQUIRED[keyof chrome-apps.Anon_AUTHENTICATIONREQUIRED] */ js.Any
    ]
  ]
}

object Anon_DescriptionState {
  @scala.inline
  def apply(
    description: java.lang.String,
    state: chromeDashAppsLib.chromeNs.ToStringLiteral[
      Anon_AUTHENTICATIONREQUIRED, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_AUTHENTICATIONREQUIRED[keyof chrome-apps.Anon_AUTHENTICATIONREQUIRED] */ js.Any
      ]
    ]
  ): Anon_DescriptionState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionState]
  }
}

