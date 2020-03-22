package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`pseudo-element`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoElementNode
  extends SelectorNodeType
     with BaseNode {
  @JSName("name")
  var name_PseudoElementNode: String
  var `type`: `pseudo-element`
}

object PseudoElementNode {
  @scala.inline
  def apply(name: String, `type`: `pseudo-element`, after: String = null, before: String = null): PseudoElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementNode]
  }
}

