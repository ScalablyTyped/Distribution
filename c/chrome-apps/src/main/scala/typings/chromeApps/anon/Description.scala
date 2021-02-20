package typings.chromeApps.anon

import typings.chromeApps.chrome.ToStringLiteral
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Description extends StObject {
  
  var description: String = js.native
  
  var state: ToStringLiteral[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus */ js.Any, 
    /* keyof typeof ServiceStatus */ String, 
    Exclude[
      /* keyof typeof ServiceStatus */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
    ]
  ] = js.native
}
object Description {
  
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
  ): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(
      value: ToStringLiteral[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus */ js.Any, 
          /* keyof typeof ServiceStatus */ String, 
          Exclude[
            /* keyof typeof ServiceStatus */ String, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
