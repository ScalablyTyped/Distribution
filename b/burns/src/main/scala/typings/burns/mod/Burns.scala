package typings.burns.mod

import typings.burns.AnonExclude
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
  def dispatch(eventName: String, eventData: Record[String, _], exclude: AnonExclude): this.type = js.native
  def registerEvents(newEvents: Record[String, EventHandler]): this.type = js.native
}

