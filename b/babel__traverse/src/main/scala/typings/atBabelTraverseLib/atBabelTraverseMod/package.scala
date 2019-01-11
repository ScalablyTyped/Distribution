package typings
package atBabelTraverseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atBabelTraverseMod {
  type Node = atBabelTypesLib.atBabelTypesMod.Node
  type VisitNode[S, P] = (VisitNodeFunction[S, P]) | (VisitNodeObject[S, P])
  type VisitNodeFunction[S, P] = js.ThisFunction2[/* this */ S, /* path */ NodePath[P], /* state */ S, scala.Unit]
  type Visitor[S] = (VisitNodeObject[S, Node]) with atBabelTraverseLib.atBabelTraverseLibStrings.Visitor with js.Any
}
