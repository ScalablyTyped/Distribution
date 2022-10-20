package typings.bullBoard

import typings.bullBoard.anon.GetJobLogs
import typings.bullBoard.distAppMod.AppJob
import typings.bullBoard.distUiHooksUseDetailsTabsMod.TabsType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiComponentsJobCardDetailsDetailsContentDetailsContentMod {
  
  @JSImport("bull-board/dist/ui/components/JobCard/Details/DetailsContent/DetailsContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DetailsContent(hasSelectedTabHasStacktraceDataReturnValueOptsFailedReasonActions: DetailsContentProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("DetailsContent")(hasSelectedTabHasStacktraceDataReturnValueOptsFailedReasonActions.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait DetailsContentProps extends StObject {
    
    var actions: GetJobLogs
    
    var job: AppJob
    
    var selectedTab: TabsType
  }
  object DetailsContentProps {
    
    inline def apply(actions: GetJobLogs, job: AppJob, selectedTab: TabsType): DetailsContentProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], selectedTab = selectedTab.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailsContentProps]
    }
    
    extension [Self <: DetailsContentProps](x: Self) {
      
      inline def setActions(value: GetJobLogs): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setJob(value: AppJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      inline def setSelectedTab(value: TabsType): Self = StObject.set(x, "selectedTab", value.asInstanceOf[js.Any])
    }
  }
}
