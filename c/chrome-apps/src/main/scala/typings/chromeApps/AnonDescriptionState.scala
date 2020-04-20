package typings.chromeApps

import typings.chromeApps.chrome.ToStringLiteral
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionState extends js.Object {
  var description: String
  var state: ToStringLiteral[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus */ js.Any, 
    /* keyof typeof ServiceStatus */ String, 
    Exclude[
      /* keyof typeof ServiceStatus */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
    ]
  ]
}

object AnonDescriptionState {
  @scala.inline
  def apply(
    description: String,
    state: ToStringLiteral[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus */ js.Any, 
      /* keyof typeof ServiceStatus */ String, 
      Exclude[
        /* keyof typeof ServiceStatus */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
      ]
    ]
  ): AnonDescriptionState = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionState]
  }
}

