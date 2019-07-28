package typings.css.cssMod

import typings.css.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namespace
  extends Node
     with AtRule {
  /** The part following @namespace. */
  var namespace: js.UndefOr[String] = js.undefined
}

object Namespace {
  @scala.inline
  def apply(
    namespace: String = null,
    parent: Node = null,
    position: Anon_Content = null,
    `type`: String = null
  ): Namespace = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Namespace]
  }
}

