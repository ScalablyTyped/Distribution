package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.REFRESH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The action to take for the meta data. At the moment the only option is REFRESH which requires the data holder to call the ACCC to refresh meta data as soon as practicable
    */
  var action: REFRESH
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal(action = "REFRESH")
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: REFRESH): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
