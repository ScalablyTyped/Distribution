package typings
package atBabelTraverseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object traverseMod {
  type Node = atBabelTypesLib.typesMod.Node
  type VisitNode[T, P] = (VisitNodeFunction[T, P]) | VisitNodeObject[T]
  type VisitNodeFunction[T, P] = js.ThisFunction2[/* this */ T, /* path */ NodePath[P], /* state */ js.Any, scala.Unit]
  type Visitor[S] = VisitNodeObject[Node] with atBabelTraverseLib.atBabelTraverseLibStrings.Visitor with js.Any
}
