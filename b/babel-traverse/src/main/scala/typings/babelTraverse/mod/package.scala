package typings.babelTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Node = typings.babelTypes.mod.Node
  type VisitNode[T, P] = (typings.babelTraverse.mod.VisitNodeFunction[T, P]) | typings.babelTraverse.mod.VisitNodeObject[T]
  type VisitNodeFunction[T, P] = js.ThisFunction2[
    /* this */ T, 
    /* path */ typings.babelTraverse.mod.NodePath[P], 
    /* state */ js.Any, 
    scala.Unit
  ]
}
