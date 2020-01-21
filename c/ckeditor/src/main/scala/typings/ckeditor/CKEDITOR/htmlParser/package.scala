package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object htmlParser {
  type rule = (js.Function1[
    /* value */ typings.ckeditor.CKEDITOR.htmlParser.node | typings.ckeditor.CKEDITOR.htmlParser.fragment | java.lang.String, 
    scala.Boolean
  ]) | (js.Tuple2[java.lang.String, java.lang.String])
}
