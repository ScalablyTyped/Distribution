package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkDerRecords
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of meter reads
    */
  var derRecords: js.Array[AcConnections]
}
object DictkDerRecords {
  
  inline def apply(derRecords: js.Array[AcConnections]): DictkDerRecords = {
    val __obj = js.Dynamic.literal(derRecords = derRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkDerRecords]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkDerRecords] (val x: Self) extends AnyVal {
    
    inline def setDerRecords(value: js.Array[AcConnections]): Self = StObject.set(x, "derRecords", value.asInstanceOf[js.Any])
    
    inline def setDerRecordsVarargs(value: AcConnections*): Self = StObject.set(x, "derRecords", js.Array(value*))
  }
}
