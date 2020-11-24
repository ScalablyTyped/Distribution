package typings.canvasGauges.CanvasGauges

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection extends Array[BaseGauge] {
  
  def get(id: String): BaseGauge = js.native
  def get(id: Double): BaseGauge = js.native
}
