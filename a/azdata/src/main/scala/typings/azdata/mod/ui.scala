package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ui {
  
  @JSImport("azdata", "ui")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerModelViewProvider(widgetId: String, handler: js.Function1[/* view */ ModelView, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerModelViewProvider")(widgetId.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
