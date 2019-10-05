package typings.csvDashStringify.csvDashStringifyMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csv-stringify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Streaming stringifier
    */
  def apply(): Stringifier = js.native
  def apply(
    input: js.Array[js.Array[_] | js.Object],
    callback: js.Function2[js.UndefOr[Error], /* output */ String, Unit]
  ): Unit = js.native
  /**
    * Callback version: string in --> callback with string out
    */
  def apply(
    input: js.Array[js.Array[_] | js.Object],
    opts: StringifyOpts,
    callback: js.Function2[js.UndefOr[Error], /* output */ String, Unit]
  ): Unit = js.native
  def apply(opts: StringifyOpts): Stringifier = js.native
}

