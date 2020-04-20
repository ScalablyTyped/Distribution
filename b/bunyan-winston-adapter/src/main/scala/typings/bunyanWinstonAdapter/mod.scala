package typings.bunyanWinstonAdapter

import typings.bunyan.mod.^
import typings.winston.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bunyan-winston-adapter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createAdapter(logger: Logger): ^ = js.native
  def createAdapter(logger: Logger, mapping: js.Any): ^ = js.native
}

