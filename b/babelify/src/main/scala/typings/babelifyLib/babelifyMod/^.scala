package typings
package babelifyLib.babelifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babelify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(filename: java.lang.String): BabelifyObject = js.native
  def apply(filename: java.lang.String, opts: BabelifyOptions): BabelifyObject = js.native
  def configure(opts: BabelifyOptions): js.Function1[/* filename */ java.lang.String, BabelifyObject] = js.native
}

