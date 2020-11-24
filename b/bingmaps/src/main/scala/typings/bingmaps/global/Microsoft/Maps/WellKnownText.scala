package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IPrimitive
import typings.bingmaps.Microsoft.Maps.IStylesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.WellKnownText")
@js.native
object WellKnownText extends js.Object {
  
  def read(wkt: String): IPrimitive | js.Array[IPrimitive] = js.native
  def read(wkt: String, styles: IStylesOptions): IPrimitive | js.Array[IPrimitive] = js.native
  
  def write(data: js.Array[IPrimitive]): String = js.native
  def write(data: IPrimitive): String = js.native
}
