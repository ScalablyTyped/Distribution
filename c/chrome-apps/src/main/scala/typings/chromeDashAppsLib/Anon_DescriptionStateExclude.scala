package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionStateExclude extends js.Object {
  var description: java.lang.String
  var state: chromeDashAppsLib.chromeNs.ToStringLiteral[
    /* import warning: ImportType.apply Failed type conversion: typeof ServiceStatus */ js.Any, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
    ]
  ]
}

object Anon_DescriptionStateExclude {
  @scala.inline
  def apply(
    description: java.lang.String,
    state: chromeDashAppsLib.chromeNs.ToStringLiteral[
      /* import warning: ImportType.apply Failed type conversion: typeof ServiceStatus */ js.Any, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
      ]
    ]
  ): Anon_DescriptionStateExclude = {
    val __obj = js.Dynamic.literal(description = description, state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DescriptionStateExclude]
  }
}

