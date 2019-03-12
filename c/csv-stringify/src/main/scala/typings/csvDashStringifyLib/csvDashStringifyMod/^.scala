package typings
package csvDashStringifyLib.csvDashStringifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csv-stringify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Streaming stringifier
    */
  def apply(): csvDashStringifyLib.csvDashStringifyMod.stringifyNs.Stringifier = js.native
  def apply(
    input: js.Array[js.Array[_]] | js.Array[js.Object],
    callback: js.Function2[/* error */ js.UndefOr[stdLib.Error], /* output */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Callback version: string in --> callback with string out
    */
  def apply(
    input: js.Array[js.Array[_]] | js.Array[js.Object],
    opts: csvDashStringifyLib.csvDashStringifyMod.stringifyNs.StringifyOpts,
    callback: js.Function2[/* error */ js.UndefOr[stdLib.Error], /* output */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def apply(opts: csvDashStringifyLib.csvDashStringifyMod.stringifyNs.StringifyOpts): csvDashStringifyLib.csvDashStringifyMod.stringifyNs.Stringifier = js.native
}

