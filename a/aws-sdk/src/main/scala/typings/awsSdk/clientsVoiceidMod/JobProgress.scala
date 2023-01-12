package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobProgress extends StObject {
  
  /**
    * Shows the completed percentage of enrollment or registration requests listed in the input file.
    */
  var PercentComplete: js.UndefOr[Score] = js.undefined
}
object JobProgress {
  
  inline def apply(): JobProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobProgress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobProgress] (val x: Self) extends AnyVal {
    
    inline def setPercentComplete(value: Score): Self = StObject.set(x, "PercentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "PercentComplete", js.undefined)
  }
}
