package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Primary
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Average response time as measured for the primary data holder
    */
  var primary: Dictk
  
  /**
    * Average response time as measured for the secondary data holder
    */
  var secondary: Dictk
}
object Primary {
  
  inline def apply(primary: Dictk, secondary: Dictk): Primary = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Primary]
  }
  
  extension [Self <: Primary](x: Self) {
    
    inline def setPrimary(value: Dictk): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: Dictk): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
  }
}
