package typings.babelTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArrayKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] extends std.Array<any>? P : never}[keyof T] */ js.Any
  
  type NodePaths[T /* <: typings.babelTypes.mod.Node | js.Array[typings.babelTypes.mod.Node] */] = js.Array[typings.babelTraverse.mod.NodePath[T]] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ K in keyof T ]: @babel/traverse.@babel/traverse.NodePath<std.Extract<T[K], @babel/types.@babel/types.Node>>}
    */ typings.babelTraverse.babelTraverseStrings.NodePaths with org.scalablytyped.runtime.TopLevel[T])
  
  type VisitNode[S, P /* <: typings.babelTypes.mod.Node */] = (typings.babelTraverse.mod.VisitNodeFunction[S, P]) | (typings.babelTraverse.mod.VisitNodeObject[S, P])
  
  type VisitNodeFunction[S, P /* <: typings.babelTypes.mod.Node */] = js.ThisFunction2[
    /* this */ S, 
    /* path */ typings.babelTraverse.mod.NodePath[P], 
    /* state */ S, 
    scala.Unit
  ]
}
