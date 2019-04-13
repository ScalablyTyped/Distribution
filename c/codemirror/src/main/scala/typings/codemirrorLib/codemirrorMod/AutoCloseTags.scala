package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCloseTags extends js.Object {
  /**
    * An array of tag names that should not be autoclosed. (default is empty tags for HTML, none for XML)
    */
  var dontCloseTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An array of XML tag names that should be autoclosed with '/>'. (default is none)
    */
  var emptyTags: js.Array[java.lang.String]
  /**
    * An array of tag names that should, when opened, cause a
    * blank line to be added inside the tag, and the blank line and
    * closing line to be indented. (default is block tags for HTML, none for XML)
    */
  var indentTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Whether to autoclose when the '/' of a closing tag is typed. (default true)
    */
  var whenClosing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to autoclose the tag when the final '>' of an opening tag is typed. (default true)
    */
  var whenOpening: js.UndefOr[scala.Boolean] = js.undefined
}

object AutoCloseTags {
  @scala.inline
  def apply(
    emptyTags: js.Array[java.lang.String],
    dontCloseTags: js.Array[java.lang.String] = null,
    indentTags: js.Array[java.lang.String] = null,
    whenClosing: js.UndefOr[scala.Boolean] = js.undefined,
    whenOpening: js.UndefOr[scala.Boolean] = js.undefined
  ): AutoCloseTags = {
    val __obj = js.Dynamic.literal(emptyTags = emptyTags)
    if (dontCloseTags != null) __obj.updateDynamic("dontCloseTags")(dontCloseTags)
    if (indentTags != null) __obj.updateDynamic("indentTags")(indentTags)
    if (!js.isUndefined(whenClosing)) __obj.updateDynamic("whenClosing")(whenClosing)
    if (!js.isUndefined(whenOpening)) __obj.updateDynamic("whenOpening")(whenOpening)
    __obj.asInstanceOf[AutoCloseTags]
  }
}

