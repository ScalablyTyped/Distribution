package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobResponse extends StObject {
  
  /**
    * Returns the name of the updated job definition.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
}
object UpdateJobResponse {
  
  inline def apply(): UpdateJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobResponse]
  }
  
  extension [Self <: UpdateJobResponse](x: Self) {
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
  }
}
