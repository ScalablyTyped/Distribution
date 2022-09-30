package typings.bizcharts

import typings.bizcharts.anon.TextVisible
import typings.bizcharts.anon.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plotToolsMod {
  
  @JSImport("bizcharts/lib/utils/plotTools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def visibleHelper(cfg: Any): Visible | TextVisible = ^.asInstanceOf[js.Dynamic].applyDynamic("visibleHelper")(cfg.asInstanceOf[js.Any]).asInstanceOf[Visible | TextVisible]
  inline def visibleHelper(cfg: Any, defaultVisible: Boolean): Visible | TextVisible = (^.asInstanceOf[js.Dynamic].applyDynamic("visibleHelper")(cfg.asInstanceOf[js.Any], defaultVisible.asInstanceOf[js.Any])).asInstanceOf[Visible | TextVisible]
  
  inline def visibleHelperInvert(cfg: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("visibleHelperInvert")(cfg.asInstanceOf[js.Any]).asInstanceOf[Any]
}
