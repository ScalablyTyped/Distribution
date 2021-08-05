package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobRequest extends StObject {
  
  /**
    * The name of the job definition to delete.
    */
  var JobName: NameString
}
object DeleteJobRequest {
  
  inline def apply(JobName: NameString): DeleteJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobRequest]
  }
  
  extension [Self <: DeleteJobRequest](x: Self) {
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
  }
}
