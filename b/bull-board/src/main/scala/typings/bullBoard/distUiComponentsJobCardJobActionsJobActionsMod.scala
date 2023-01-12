package typings.bullBoard

import typings.bullBoard.anon.CleanJob
import typings.bullBoard.distUiComponentsConstantsMod.Status
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiComponentsJobCardJobActionsJobActionsMod {
  
  @JSImport("bull-board/dist/ui/components/JobCard/JobActions/JobActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def JobActions(param0: JobActionsProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("JobActions")(param0.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait JobActionsProps extends StObject {
    
    var actions: CleanJob
    
    var status: Status
  }
  object JobActionsProps {
    
    inline def apply(actions: CleanJob, status: Status): JobActionsProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobActionsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JobActionsProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: CleanJob): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
