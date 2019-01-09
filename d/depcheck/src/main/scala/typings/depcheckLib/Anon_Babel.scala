package typings
package depcheckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Babel extends js.Object {
  @JSName("babel")
  var babel_Original: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  @JSName("bin")
  var bin_Original: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  @JSName("commitizen")
  var commitizen_Original: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  @JSName("eslint")
  var eslint_Original: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  @JSName("feross-standard")
  var `feross-standard_Original`: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  @JSName("gulp-load-plugins")
  var `gulp-load-plugins_Original`: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  @JSName("mocha")
  var mocha_Original: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  @JSName("webpack")
  var webpack_Original: depcheckLib.depcheckMod.depcheckNs.Parser = js.native
  def babel(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
  def bin(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
  def commitizen(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
  def eslint(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
  def `feross-standard`(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
  def `gulp-load-plugins`(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
  def mocha(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
  def webpack(
    content: java.lang.String,
    filePath: java.lang.String,
    deps: js.Array[java.lang.String],
    rootDir: java.lang.String
  ): depcheckLib.depcheckMod.depcheckNs.Node = js.native
}

