package typings
package burnsLib.burnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Burns
  */
@js.native
trait Burns extends js.Object {
  def configure(): this.type = js.native
  def configure(config: Config): this.type = js.native
  def dispatch(eventName: java.lang.String): this.type = js.native
  def dispatch(eventName: java.lang.String, eventData: stdLib.Record[java.lang.String, _]): this.type = js.native
  def dispatch(
    eventName: java.lang.String,
    eventData: stdLib.Record[java.lang.String, _],
    exclude: burnsLib.Anon_Exclude
  ): this.type = js.native
  def registerEvents(newEvents: stdLib.Record[java.lang.String, burnsLib.EventHandler]): this.type = js.native
}

