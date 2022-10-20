package typings.bullBoard

import typings.bullBoard.anon.Job
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiComponentsJobCardTimelineTimelineMod {
  
  @JSImport("bull-board/dist/ui/components/JobCard/Timeline/Timeline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Timeline(hasJobStatus: Job): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Timeline")(hasJobStatus.asInstanceOf[js.Any]).asInstanceOf[Element]
}
