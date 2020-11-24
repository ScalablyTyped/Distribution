package typings.babelTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Node = typings.babelTypes.ts36Mod.Node
  
  type VisitNode[T, P] = (typings.babelTraverse.mod.VisitNodeFunction[T, P]) | typings.babelTraverse.mod.VisitNodeObject[T]
  
  type VisitNodeFunction[T, P] = js.ThisFunction2[
    /* this */ T, 
    /* path */ typings.babelTraverse.mod.NodePath[P], 
    /* state */ js.Any, 
    scala.Unit
  ]
}
