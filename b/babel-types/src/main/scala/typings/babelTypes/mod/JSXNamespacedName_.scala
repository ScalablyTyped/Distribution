package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXNamespacedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXNamespacedName_
  extends Node
     with JSX {
  var name: JSXIdentifier_ = js.native
  var namespace: JSXIdentifier_ = js.native
  @JSName("type")
  var type_JSXNamespacedName_ : JSXNamespacedName = js.native
}

object JSXNamespacedName_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_,
    namespace: JSXIdentifier_,
    start: Double,
    `type`: JSXNamespacedName
  ): JSXNamespacedName_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXNamespacedName_]
  }
  @scala.inline
  implicit class JSXNamespacedName_Ops[Self <: JSXNamespacedName_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: JSXIdentifier_): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: JSXIdentifier_): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: JSXNamespacedName): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

