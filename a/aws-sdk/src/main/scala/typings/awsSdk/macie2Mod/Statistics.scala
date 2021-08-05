package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statistics extends StObject {
  
  /**
    * The approximate number of objects that the job has yet to process during its current run.
    */
  var approximateNumberOfObjectsToProcess: js.UndefOr[double] = js.undefined
  
  /**
    * The number of times that the job has run.
    */
  var numberOfRuns: js.UndefOr[double] = js.undefined
}
object Statistics {
  
  inline def apply(): Statistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statistics]
  }
  
  extension [Self <: Statistics](x: Self) {
    
    inline def setApproximateNumberOfObjectsToProcess(value: double): Self = StObject.set(x, "approximateNumberOfObjectsToProcess", value.asInstanceOf[js.Any])
    
    inline def setApproximateNumberOfObjectsToProcessUndefined: Self = StObject.set(x, "approximateNumberOfObjectsToProcess", js.undefined)
    
    inline def setNumberOfRuns(value: double): Self = StObject.set(x, "numberOfRuns", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRunsUndefined: Self = StObject.set(x, "numberOfRuns", js.undefined)
  }
}
