package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EstimatedResourceSize extends StObject {
  
  /**
    * The time when the estimate of the size of the resource was made.
    */
  var estimatedOn: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The estimated size of the resource, in bytes.
    */
  var estimatedSizeInBytes: js.UndefOr[SizeInBytes] = js.undefined
}
object EstimatedResourceSize {
  
  inline def apply(): EstimatedResourceSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimatedResourceSize]
  }
  
  extension [Self <: EstimatedResourceSize](x: Self) {
    
    inline def setEstimatedOn(value: Timestamp): Self = StObject.set(x, "estimatedOn", value.asInstanceOf[js.Any])
    
    inline def setEstimatedOnUndefined: Self = StObject.set(x, "estimatedOn", js.undefined)
    
    inline def setEstimatedSizeInBytes(value: SizeInBytes): Self = StObject.set(x, "estimatedSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setEstimatedSizeInBytesUndefined: Self = StObject.set(x, "estimatedSizeInBytes", js.undefined)
  }
}
