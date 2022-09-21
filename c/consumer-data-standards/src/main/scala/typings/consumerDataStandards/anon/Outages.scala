package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outages
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * List of scheduled outages. Property is mandatory but may contain and empty list if no outages are scheduled
    */
  var outages: js.Array[Duration]
}
object Outages {
  
  inline def apply(outages: js.Array[Duration]): Outages = {
    val __obj = js.Dynamic.literal(outages = outages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outages]
  }
  
  extension [Self <: Outages](x: Self) {
    
    inline def setOutages(value: js.Array[Duration]): Self = StObject.set(x, "outages", value.asInstanceOf[js.Any])
    
    inline def setOutagesVarargs(value: Duration*): Self = StObject.set(x, "outages", js.Array(value*))
  }
}
