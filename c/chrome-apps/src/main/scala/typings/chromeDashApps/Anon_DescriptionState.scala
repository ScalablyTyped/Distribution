package typings.chromeDashApps

import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionState extends js.Object {
  var description: String
  var state: ToStringLiteral[
    /* import warning: ImportType.apply Failed type conversion: typeof ServiceStatus */ js.Any, 
    String, 
    Exclude[
      String, 
      /* import warning: ImportType.apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
    ]
  ]
}

object Anon_DescriptionState {
  @scala.inline
  def apply(
    description: String,
    state: ToStringLiteral[
      /* import warning: ImportType.apply Failed type conversion: typeof ServiceStatus */ js.Any, 
      String, 
      Exclude[
        String, 
        /* import warning: ImportType.apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
      ]
    ]
  ): Anon_DescriptionState = {
    val __obj = js.Dynamic.literal(description = description, state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DescriptionState]
  }
}

