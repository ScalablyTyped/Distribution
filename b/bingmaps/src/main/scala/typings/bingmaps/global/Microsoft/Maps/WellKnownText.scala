package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IPrimitive
import typings.bingmaps.Microsoft.Maps.IStylesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WellKnownText {
  
  @JSGlobal("Microsoft.Maps.WellKnownText")
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(wkt: String): IPrimitive | js.Array[IPrimitive] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(wkt.asInstanceOf[js.Any]).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
  inline def read(wkt: String, styles: IStylesOptions): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(wkt.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
  
  inline def write(data: js.Array[IPrimitive]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def write(data: IPrimitive): String = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
