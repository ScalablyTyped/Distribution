package typings
package atBabelTraverseLib.traverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(@babel/traverse.@babel/traverse.Visitor) */ 
trait TraverseOptions[S] extends VisitNodeObject[Node] {
  var noScope: js.UndefOr[scala.Boolean] = js.undefined
  var scope: js.UndefOr[Scope] = js.undefined
}

