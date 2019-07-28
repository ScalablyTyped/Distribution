package typings.bunyanDashWinstonDashAdapter

import typings.bunyan.bunyanMod.^
import typings.winston.winstonMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bunyan-winston-adapter", JSImport.Namespace)
@js.native
object bunyanDashWinstonDashAdapterMod extends js.Object {
  def createAdapter(logger: Logger): ^ = js.native
  def createAdapter(logger: Logger, mapping: js.Any): ^ = js.native
}

