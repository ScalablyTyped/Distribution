package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementNode
  extends SelectorNodeType
     with BaseNode {
  @JSName("name")
  var name_ElementNode: String
  var namespace: js.UndefOr[String] = js.undefined
  var `type`: element
}

object ElementNode {
  @scala.inline
  def apply(
    name: String,
    `type`: element,
    after: String = null,
    before: String = null,
    namespace: String = null
  ): ElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementNode]
  }
}

