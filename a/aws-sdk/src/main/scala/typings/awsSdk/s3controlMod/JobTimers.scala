package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobTimers extends StObject {
  
  /**
    * Indicates the elapsed time in seconds the job has been in the Active job state.
    */
  var ElapsedTimeInActiveSeconds: js.UndefOr[JobTimeInStateSeconds] = js.undefined
}
object JobTimers {
  
  inline def apply(): JobTimers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTimers]
  }
  
  extension [Self <: JobTimers](x: Self) {
    
    inline def setElapsedTimeInActiveSeconds(value: JobTimeInStateSeconds): Self = StObject.set(x, "ElapsedTimeInActiveSeconds", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeInActiveSecondsUndefined: Self = StObject.set(x, "ElapsedTimeInActiveSeconds", js.undefined)
  }
}
