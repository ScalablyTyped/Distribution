package typings.bullBoard

import typings.bullBoard.anon.GetJobLogs
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiComponentsJobCardDetailsDetailsContentJobLogsJobLogsMod {
  
  @JSImport("bull-board/dist/ui/components/JobCard/Details/DetailsContent/JobLogs/JobLogs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def JobLogs(hasActions: JobLogsProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("JobLogs")(hasActions.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait JobLogsProps extends StObject {
    
    var actions: GetJobLogs
  }
  object JobLogsProps {
    
    inline def apply(actions: GetJobLogs): JobLogsProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobLogsProps]
    }
    
    extension [Self <: JobLogsProps](x: Self) {
      
      inline def setActions(value: GetJobLogs): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    }
  }
}
