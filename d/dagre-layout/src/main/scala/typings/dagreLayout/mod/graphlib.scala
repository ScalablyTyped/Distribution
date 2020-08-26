package typings.dagreLayout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dagreLayout.anon.Compound
import typings.dagreLayout.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-layout", "graphlib")
@js.native
object graphlib extends js.Object {
  @js.native
  class Graph () extends js.Object {
    def this(opt: Compound) = this()
    def edge(id: js.Any): js.Any = js.native
    def edges(): js.Array[Edge] = js.native
    def graph(): GraphLabel = js.native
    def hasNode(name: String): Boolean = js.native
    def node(id: js.Any): js.Any = js.native
    def nodes(): js.Array[String] = js.native
    def setDefaultEdgeLabel(callback: String): Graph = js.native
    def setDefaultEdgeLabel(callback: js.Function0[String | js.Object]): Graph = js.native
    def setDefaultNodeLabel(callback: String): Graph = js.native
    def setDefaultNodeLabel(callback: js.Function0[String | js.Object]): Graph = js.native
    def setEdge(params: Name): Graph = js.native
    def setEdge(params: Name, value: String): Graph = js.native
    def setEdge(sourceId: String, targetId: String): Graph = js.native
    def setEdge(sourceId: String, targetId: String, options: js.UndefOr[scala.Nothing], value: String): Graph = js.native
    def setEdge(sourceId: String, targetId: String, options: StringDictionary[js.Any]): Graph = js.native
    def setEdge(sourceId: String, targetId: String, options: StringDictionary[js.Any], value: String): Graph = js.native
    def setGraph(label: GraphLabel): Graph = js.native
    def setNode(id: String, node: StringDictionary[js.Any]): Graph = js.native
    def setParent(name: String, parentName: String): Unit = js.native
  }
  
}

