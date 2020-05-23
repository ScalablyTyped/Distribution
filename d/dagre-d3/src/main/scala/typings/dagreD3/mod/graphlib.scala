package typings.dagreD3.mod

import typings.dagre.anon.Compound
import typings.dagre.mod.EdgeFn
import typings.dagre.mod.WeightFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", "graphlib")
@js.native
object graphlib extends js.Object {
  @js.native
  class Graph[T] ()
    extends typings.dagre.mod.graphlib.Graph[T] {
    def this(opt: Compound) = this()
  }
  
  @js.native
  object alg extends js.Object {
    def components(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = js.native
    def dijkstra(graph: typings.dagre.mod.graphlib.Graph[js.Object], source: String): js.Any = js.native
    def dijkstra(graph: typings.dagre.mod.graphlib.Graph[js.Object], source: String, weightFn: WeightFn): js.Any = js.native
    def dijkstra(
      graph: typings.dagre.mod.graphlib.Graph[js.Object],
      source: String,
      weightFn: WeightFn,
      edgeFn: EdgeFn
    ): js.Any = js.native
    def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Any = js.native
    def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn): js.Any = js.native
    def dijkstraAll(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def findCycles(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = js.native
    def floydWarchall(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Any = js.native
    def floydWarchall(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn): js.Any = js.native
    def floydWarchall(graph: typings.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def isAcyclic(graph: typings.dagre.mod.graphlib.Graph[js.Object]): Boolean = js.native
    def postorder(graph: typings.dagre.mod.graphlib.Graph[js.Object], nodeNames: String): js.Array[String] = js.native
    def postorder(graph: typings.dagre.mod.graphlib.Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = js.native
    def preorder(graph: typings.dagre.mod.graphlib.Graph[js.Object], nodeNames: String): js.Array[String] = js.native
    def preorder(graph: typings.dagre.mod.graphlib.Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = js.native
    def prim[T](graph: typings.dagre.mod.graphlib.Graph[T]): typings.dagre.mod.graphlib.Graph[T] = js.native
    def prim[T](graph: typings.dagre.mod.graphlib.Graph[T], weightFn: WeightFn): typings.dagre.mod.graphlib.Graph[T] = js.native
    def tarjam(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = js.native
    def topsort(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Array[String] = js.native
  }
  
  @js.native
  object json extends js.Object {
    def read(graph: js.Any): typings.dagre.mod.graphlib.Graph[js.Object] = js.native
    def write(graph: typings.dagre.mod.graphlib.Graph[js.Object]): js.Any = js.native
  }
  
}

