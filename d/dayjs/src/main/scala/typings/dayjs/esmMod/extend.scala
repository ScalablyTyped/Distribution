package typings.dayjs.esmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dayjs/esm", "extend")
@js.native
object extend extends js.Object {
  
  def apply[T](plugin: PluginFunc[T]): Dayjs = js.native
  def apply[T](plugin: PluginFunc[T], option: T): Dayjs = js.native
}
