package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WalkContext extends js.Object {
  var atrule: Atrule
  var atrulePrelude: AtrulePrelude
  var block: Block
  var declaration: Declaration
  var function: FunctionNode | PseudoClassSelector | PseudoElementSelector
  var root: CssNode
  var rule: Rule
  var selector: SelectorList
  var stylesheet: StyleSheet
}

