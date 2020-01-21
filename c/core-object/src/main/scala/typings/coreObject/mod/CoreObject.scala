package typings.coreObject.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreObject extends js.Object {
  // TODO restrict to `Record<string, unknown>` once we can restrict to 3.0+ on DT
  def init(): Unit = js.native
  def init(options: Record[String, _]): Unit = js.native
}

