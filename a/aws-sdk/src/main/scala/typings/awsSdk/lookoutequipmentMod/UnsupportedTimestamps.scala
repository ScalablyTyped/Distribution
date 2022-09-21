package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsupportedTimestamps extends StObject {
  
  /**
    *  Indicates the total number of unsupported timestamps across the ingested data. 
    */
  var TotalNumberOfUnsupportedTimestamps: Integer
}
object UnsupportedTimestamps {
  
  inline def apply(TotalNumberOfUnsupportedTimestamps: Integer): UnsupportedTimestamps = {
    val __obj = js.Dynamic.literal(TotalNumberOfUnsupportedTimestamps = TotalNumberOfUnsupportedTimestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedTimestamps]
  }
  
  extension [Self <: UnsupportedTimestamps](x: Self) {
    
    inline def setTotalNumberOfUnsupportedTimestamps(value: Integer): Self = StObject.set(x, "TotalNumberOfUnsupportedTimestamps", value.asInstanceOf[js.Any])
  }
}
