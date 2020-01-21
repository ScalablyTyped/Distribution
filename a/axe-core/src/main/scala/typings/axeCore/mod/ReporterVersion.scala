package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.axeCore.axeCoreStrings.v1
  - typings.axeCore.axeCoreStrings.v2
  - typings.axeCore.axeCoreStrings.raw
  - typings.axeCore.axeCoreStrings.`raw-env`
  - typings.axeCore.axeCoreStrings.`no-passes`
*/
trait ReporterVersion extends js.Object

object ReporterVersion {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `no-passes`: typings.axeCore.axeCoreStrings.`no-passes` = this.cast("no-passes")
  @scala.inline
  def raw: typings.axeCore.axeCoreStrings.raw = this.cast("raw")
  @scala.inline
  def `raw-env`: typings.axeCore.axeCoreStrings.`raw-env` = this.cast("raw-env")
  @scala.inline
  def v1: typings.axeCore.axeCoreStrings.v1 = this.cast("v1")
  @scala.inline
  def v2: typings.axeCore.axeCoreStrings.v2 = this.cast("v2")
}

