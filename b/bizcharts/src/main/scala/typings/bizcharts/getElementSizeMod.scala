package typings.bizcharts

import typings.bizcharts.anon.Width
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getElementSizeMod {
  
  @JSImport("bizcharts/lib/utils/getElementSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ele: Any): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ele.asInstanceOf[js.Any]).asInstanceOf[Width]
  inline def default(ele: Any, ctlSize: Record[String, Any]): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ele.asInstanceOf[js.Any], ctlSize.asInstanceOf[js.Any])).asInstanceOf[Width]
}
