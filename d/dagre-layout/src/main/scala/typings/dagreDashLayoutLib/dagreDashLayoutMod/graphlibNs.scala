package typings
package dagreDashLayoutLib.dagreDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-layout", "graphlib")
@js.native
object graphlibNs extends js.Object {
  @js.native
  class Graph () extends js.Object {
    def this(opt: dagreDashLayoutLib.Anon_Compound) = this()
    def edge(id: js.Any): js.Any = js.native
    def edges(): js.Array[dagreDashLayoutLib.dagreDashLayoutMod.Edge] = js.native
    def graph(): dagreDashLayoutLib.dagreDashLayoutMod.GraphLabel = js.native
    def hasNode(name: java.lang.String): scala.Boolean = js.native
    def node(id: js.Any): js.Any = js.native
    def nodes(): js.Array[java.lang.String] = js.native
    def setDefaultEdgeLabel(callback: java.lang.String): Graph = js.native
    def setDefaultEdgeLabel(callback: js.Function0[java.lang.String | js.Object]): Graph = js.native
    def setDefaultNodeLabel(callback: java.lang.String): Graph = js.native
    def setDefaultNodeLabel(callback: js.Function0[java.lang.String | js.Object]): Graph = js.native
    def setEdge(params: dagreDashLayoutLib.Anon_Name): Graph = js.native
    def setEdge(params: dagreDashLayoutLib.Anon_Name, value: java.lang.String): Graph = js.native
    def setEdge(sourceId: java.lang.String, targetId: java.lang.String): Graph = js.native
    def setEdge(
      sourceId: java.lang.String,
      targetId: java.lang.String,
      options: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): Graph = js.native
    def setEdge(
      sourceId: java.lang.String,
      targetId: java.lang.String,
      options: org.scalablytyped.runtime.StringDictionary[js.Any],
      value: java.lang.String
    ): Graph = js.native
    def setGraph(label: dagreDashLayoutLib.dagreDashLayoutMod.GraphLabel): Graph = js.native
    def setNode(id: java.lang.String, node: org.scalablytyped.runtime.StringDictionary[js.Any]): Graph = js.native
    def setParent(name: java.lang.String, parentName: java.lang.String): scala.Unit = js.native
  }
  
}

