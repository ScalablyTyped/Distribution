package typings.babelTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Node = typings.babelTypes.mod.Node
  type NodePaths[T /* <: typings.babelTraverse.mod.Node | js.Array[typings.babelTraverse.mod.Node] */] = js.Array[typings.babelTraverse.mod.NodePath[T]] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: @babel/traverse.@babel/traverse.NodePath<T[K]>}
    */ typings.babelTraverse.babelTraverseStrings.NodePaths with T)
  type VisitNode[S, P] = (typings.babelTraverse.mod.VisitNodeFunction[S, P]) | (typings.babelTraverse.mod.VisitNodeObject[S, P])
  type VisitNodeFunction[S, P] = js.ThisFunction2[
    /* this */ S, 
    /* path */ typings.babelTraverse.mod.NodePath[P], 
    /* state */ S, 
    scala.Unit
  ]
  type Visitor[S] = (typings.babelTraverse.mod.VisitNodeObject[S, typings.babelTraverse.mod.Node]) with typings.babelTraverse.babelTraverseStrings.Visitor with js.Any with typings.babelTypes.mod.Aliases
}
