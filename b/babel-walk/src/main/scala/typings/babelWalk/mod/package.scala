package typings.babelWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AncestorFunction[TKey /* <: java.lang.String */, TState] = js.Function3[
    /* node */ typings.babelWalk.mod.NodeType[TKey], 
    /* state */ TState, 
    /* ancestors */ js.Array[typings.babelTypes.mod.Node], 
    scala.Unit
  ]
  
  type NodeType[`type` /* <: java.lang.String */] = (typings.std.Extract[typings.babelTypes.mod.Node, typings.babelWalk.anon.Type[`type`]]) | (/* import warning: importer.ImportType#apply Failed type conversion: @babel/types.@babel/types.Aliases[type] */ js.Any)
  
  type SimpleFunction[TKey /* <: java.lang.String */, TState] = js.Function2[/* node */ typings.babelWalk.mod.NodeType[TKey], /* state */ TState, scala.Unit]
}
