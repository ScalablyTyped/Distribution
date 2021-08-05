package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecutionStatusDetails extends StObject {
  
  /**
    * The job execution status.
    */
  var detailsMap: js.UndefOr[DetailsMap] = js.undefined
}
object JobExecutionStatusDetails {
  
  inline def apply(): JobExecutionStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionStatusDetails]
  }
  
  extension [Self <: JobExecutionStatusDetails](x: Self) {
    
    inline def setDetailsMap(value: DetailsMap): Self = StObject.set(x, "detailsMap", value.asInstanceOf[js.Any])
    
    inline def setDetailsMapUndefined: Self = StObject.set(x, "detailsMap", js.undefined)
  }
}
