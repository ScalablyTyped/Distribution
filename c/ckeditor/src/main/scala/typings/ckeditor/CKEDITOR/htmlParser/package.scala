package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object htmlParser {
  type rule = (js.Function1[/* value */ node | fragment | String, Boolean]) | (js.Tuple2[String, String])
}
