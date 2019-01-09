package typings
package depcheckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Coffee extends js.Object {
  @JSName("coffee")
  var coffee_Original: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  @JSName("es6")
  var es6_Original: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  @JSName("es7")
  var es7_Original: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  @JSName("jsx")
  var jsx_Original: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  @JSName("sass")
  var sass_Original: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  @JSName("typescript")
  var typescript_Original: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  def coffee(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
  def es6(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
  def es7(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
  def jsx(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
  def sass(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
  def typescript(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
}

