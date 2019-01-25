package typings
package copyLib.copyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("copy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    patterns: java.lang.String | js.Object | js.Array[java.lang.String],
    dir: java.lang.String,
    callback: copyLib.copyMod.copyNs.Callback
  ): scala.Unit = js.native
  def apply(
    patterns: java.lang.String | js.Object | js.Array[java.lang.String],
    dir: java.lang.String,
    options: copyLib.copyMod.copyNs.Options,
    callback: copyLib.copyMod.copyNs.Callback
  ): scala.Unit = js.native
  def each(
    files: js.Array[java.lang.String],
    dir: java.lang.String,
    callback: copyLib.copyMod.copyNs.Callback
  ): scala.Unit = js.native
  def each(
    files: js.Array[java.lang.String],
    dir: java.lang.String,
    options: copyLib.copyMod.copyNs.Options,
    callback: copyLib.copyMod.copyNs.Callback
  ): scala.Unit = js.native
  def one(pattern: java.lang.String, dir: java.lang.String, callback: copyLib.copyMod.copyNs.Callback): scala.Unit = js.native
  def one(
    pattern: java.lang.String,
    dir: java.lang.String,
    options: copyLib.copyMod.copyNs.Options,
    callback: copyLib.copyMod.copyNs.Callback
  ): scala.Unit = js.native
  def one(pattern: js.Object, dir: java.lang.String, callback: copyLib.copyMod.copyNs.Callback): scala.Unit = js.native
  def one(
    pattern: js.Object,
    dir: java.lang.String,
    options: copyLib.copyMod.copyNs.Options,
    callback: copyLib.copyMod.copyNs.Callback
  ): scala.Unit = js.native
}

