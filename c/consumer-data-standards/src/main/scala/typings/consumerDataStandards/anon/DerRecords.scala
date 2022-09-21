package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DerRecords
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of meter reads
    */
  var derRecords: js.Array[AcConnections]
}
object DerRecords {
  
  inline def apply(derRecords: js.Array[AcConnections]): DerRecords = {
    val __obj = js.Dynamic.literal(derRecords = derRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DerRecords]
  }
  
  extension [Self <: DerRecords](x: Self) {
    
    inline def setDerRecords(value: js.Array[AcConnections]): Self = StObject.set(x, "derRecords", value.asInstanceOf[js.Any])
    
    inline def setDerRecordsVarargs(value: AcConnections*): Self = StObject.set(x, "derRecords", js.Array(value*))
  }
}
