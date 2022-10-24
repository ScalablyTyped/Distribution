package typings.bullBoard

import typings.bullBoard.anon.PromoteJob
import typings.bullBoard.distAppMod.AppJob
import typings.bullBoard.distUiComponentsConstantsMod.Status
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiComponentsJobCardJobCardMod {
  
  @JSImport("bull-board/dist/ui/components/JobCard/JobCard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def JobCard(param0: JobCardProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("JobCard")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait JobCardProps extends StObject {
    
    var actions: PromoteJob
    
    var job: AppJob
    
    var readOnlyMode: Boolean
    
    var status: Status
  }
  object JobCardProps {
    
    inline def apply(actions: PromoteJob, job: AppJob, readOnlyMode: Boolean, status: Status): JobCardProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], readOnlyMode = readOnlyMode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobCardProps]
    }
    
    extension [Self <: JobCardProps](x: Self) {
      
      inline def setActions(value: PromoteJob): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setJob(value: AppJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyMode(value: Boolean): Self = StObject.set(x, "readOnlyMode", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
