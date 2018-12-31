package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var preferForRegexpMatch: js.UndefOr[scala.Boolean] = js.undefined
  var regexp: stdLib.RegExp
  var typeName: js.UndefOr[java.lang.String] = js.undefined
  var useForSnippets: js.UndefOr[scala.Boolean] = js.undefined
  def transformer(`this`: World, arg: java.lang.String*): js.Any
}

