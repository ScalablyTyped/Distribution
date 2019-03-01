package typings
package atBabelTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var key: java.lang.String
  var node: atBabelTypesLib.atBabelTypesMod.Node
}

object Anon_Index {
  @scala.inline
  def apply(
    key: java.lang.String,
    node: atBabelTypesLib.atBabelTypesMod.Node,
    index: scala.Int | scala.Double = null
  ): Anon_Index = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Index]
  }
}

