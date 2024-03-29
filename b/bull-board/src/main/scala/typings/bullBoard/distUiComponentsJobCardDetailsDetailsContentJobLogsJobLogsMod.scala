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
  
  inline def JobLogs(param0: JobLogsProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("JobLogs")(param0.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait JobLogsProps extends StObject {
    
    var actions: GetJobLogs
  }
  object JobLogsProps {
    
    inline def apply(actions: GetJobLogs): JobLogsProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobLogsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JobLogsProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: GetJobLogs): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    }
  }
}
