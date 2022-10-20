package typings.bullBoard.anon

import typings.bullBoard.distAppMod.AppJob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Job extends StObject {
  
  var job: AppJob
  
  var status: typings.bullBoard.distUiComponentsConstantsMod.Status
}
object Job {
  
  inline def apply(job: AppJob, status: typings.bullBoard.distUiComponentsConstantsMod.Status): Job = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  
  extension [Self <: Job](x: Self) {
    
    inline def setJob(value: AppJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: typings.bullBoard.distUiComponentsConstantsMod.Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
