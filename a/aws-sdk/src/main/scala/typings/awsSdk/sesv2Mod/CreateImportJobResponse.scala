package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImportJobResponse extends StObject {
  
  /**
    * A string that represents the import job ID.
    */
  var JobId: js.UndefOr[typings.awsSdk.sesv2Mod.JobId] = js.undefined
}
object CreateImportJobResponse {
  
  inline def apply(): CreateImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImportJobResponse]
  }
  
  extension [Self <: CreateImportJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
