package typings.burns.mod

import typings.burns.anon.Exclude
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Burns
  */
@js.native
trait Burns extends js.Object {
  
  def configure(): this.type = js.native
  def configure(config: Config): this.type = js.native
  
  def dispatch(eventName: String): this.type = js.native
  def dispatch(eventName: String, eventData: js.UndefOr[scala.Nothing], exclude: Exclude): this.type = js.native
  def dispatch(eventName: String, eventData: Record[String, _]): this.type = js.native
  def dispatch(eventName: String, eventData: Record[String, _], exclude: Exclude): this.type = js.native
  
  def registerEvents(newEvents: Record[String, EventHandler]): this.type = js.native
}
