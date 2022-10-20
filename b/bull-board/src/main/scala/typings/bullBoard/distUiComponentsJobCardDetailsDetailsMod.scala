package typings.bullBoard

import typings.bullBoard.anon.GetJobLogs
import typings.bullBoard.distAppMod.AppJob
import typings.bullBoard.distUiComponentsConstantsMod.Status
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiComponentsJobCardDetailsDetailsMod {
  
  @JSImport("bull-board/dist/ui/components/JobCard/Details/Details", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Details(hasStatusJobActions: DetailsProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Details")(hasStatusJobActions.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait DetailsProps extends StObject {
    
    var actions: GetJobLogs
    
    var job: AppJob
    
    var status: Status
  }
  object DetailsProps {
    
    inline def apply(actions: GetJobLogs, job: AppJob, status: Status): DetailsProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailsProps]
    }
    
    extension [Self <: DetailsProps](x: Self) {
      
      inline def setActions(value: GetJobLogs): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setJob(value: AppJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
