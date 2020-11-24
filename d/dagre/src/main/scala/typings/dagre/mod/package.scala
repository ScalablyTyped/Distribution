package typings.dagre

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EdgeFn = js.Function1[/* outNodeName */ java.lang.String, js.Array[typings.dagre.mod.GraphEdge]]
  
  type Label = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Node[T] = T with typings.dagre.anon.Class
  
  type WeightFn = js.Function1[/* edge */ typings.dagre.mod.Edge, scala.Double]
}
