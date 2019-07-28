package typings.burns.burnsMod

import typings.burns.Anon_Exclude
import typings.std.Record
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
  def dispatch(eventName: String): this.type = js.native
  def dispatch(eventName: String, eventData: Record[String, _]): this.type = js.native
  def dispatch(eventName: String, eventData: Record[String, _], exclude: Anon_Exclude): this.type = js.native
  def registerEvents(newEvents: Record[String, EventHandler]): this.type = js.native
}

