package typings.atBabelTraverse

import typings.atBabelTypes.atBabelTypesMod.Aliases
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atBabelTraverseMod {
  type Node = typings.atBabelTypes.atBabelTypesMod.Node
  type VisitNode[S, P] = (VisitNodeFunction[S, P]) | (VisitNodeObject[S, P])
  type VisitNodeFunction[S, P] = js.ThisFunction2[/* this */ S, /* path */ NodePath[P], /* state */ S, Unit]
  type Visitor[S] = (VisitNodeObject[S, Node]) with typings.atBabelTraverse.atBabelTraverseStrings.Visitor with js.Any with Aliases
}
