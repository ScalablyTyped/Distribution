package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStatus extends StObject {
  
  /**
    * The amount of data scanned by the query in bytes that you will be charged for. This is a cumulative sum and represents the total amount of data that you will be charged for since the query was started. The charge is applied only once and is either applied when the query completes running or when the query is cancelled. 
    */
  var CumulativeBytesMetered: js.UndefOr[Long] = js.undefined
  
  /**
    * The amount of data scanned by the query in bytes. This is a cumulative sum and represents the total amount of bytes scanned since the query was started. 
    */
  var CumulativeBytesScanned: js.UndefOr[Long] = js.undefined
  
  /**
    * The progress of the query, expressed as a percentage.
    */
  var ProgressPercentage: js.UndefOr[Double] = js.undefined
}
object QueryStatus {
  
  inline def apply(): QueryStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStatus]
  }
  
  extension [Self <: QueryStatus](x: Self) {
    
    inline def setCumulativeBytesMetered(value: Long): Self = StObject.set(x, "CumulativeBytesMetered", value.asInstanceOf[js.Any])
    
    inline def setCumulativeBytesMeteredUndefined: Self = StObject.set(x, "CumulativeBytesMetered", js.undefined)
    
    inline def setCumulativeBytesScanned(value: Long): Self = StObject.set(x, "CumulativeBytesScanned", value.asInstanceOf[js.Any])
    
    inline def setCumulativeBytesScannedUndefined: Self = StObject.set(x, "CumulativeBytesScanned", js.undefined)
    
    inline def setProgressPercentage(value: Double): Self = StObject.set(x, "ProgressPercentage", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentageUndefined: Self = StObject.set(x, "ProgressPercentage", js.undefined)
  }
}
