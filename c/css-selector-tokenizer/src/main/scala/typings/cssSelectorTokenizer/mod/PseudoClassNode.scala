package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`pseudo-class`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoClassNode
  extends SelectorNodeType
     with BaseNode {
  var content: js.UndefOr[String] = js.undefined
  @JSName("name")
  var name_PseudoClassNode: String
  var `type`: `pseudo-class`
}

object PseudoClassNode {
  @scala.inline
  def apply(
    name: String,
    `type`: `pseudo-class`,
    after: String = null,
    before: String = null,
    content: String = null
  ): PseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoClassNode]
  }
}

