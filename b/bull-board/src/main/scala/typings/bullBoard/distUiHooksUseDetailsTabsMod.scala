package typings.bullBoard

import typings.bullBoard.anon.SelectedTab
import typings.bullBoard.distUiComponentsConstantsMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiHooksUseDetailsTabsMod {
  
  @JSImport("bull-board/dist/ui/hooks/useDetailsTabs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDetailsTabs(currentStatus: Status): SelectedTab = ^.asInstanceOf[js.Dynamic].applyDynamic("useDetailsTabs")(currentStatus.asInstanceOf[js.Any]).asInstanceOf[SelectedTab]
  
  /* Rewritten from type alias, can be one of: 
    - typings.bullBoard.bullBoardStrings.Data
    - typings.bullBoard.bullBoardStrings.Options
    - typings.bullBoard.bullBoardStrings.Logs
    - typings.bullBoard.bullBoardStrings.Error
  */
  trait TabsType extends StObject
}
