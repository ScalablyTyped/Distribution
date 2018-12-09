package typings
package dagreDashD3Lib.dagreDashD3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Render extends js.Object {
  def apply(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[_, _, d3DashSelectionLib.d3DashSelectionMod.BaseType, _],
    g: dagreLib.dagreMod.graphlibNs.Graph
  ): scala.Unit = js.native
  // see http://cpettitt.github.io/project/dagre-d3/latest/demo/user-defined.html for example usage
  def arrows(): ScalablyTyped.runtime.StringDictionary[
    js.Function4[
      /* parent */ d3DashSelectionLib.d3DashSelectionMod.Selection[_, _, d3DashSelectionLib.d3DashSelectionMod.BaseType, _], 
      /* id */ java.lang.String, 
      /* edge */ dagreLib.dagreMod.Edge, 
      /* type */ java.lang.String, 
      scala.Unit
    ]
  ] = js.native
  def shapes(): ScalablyTyped.runtime.StringDictionary[
    js.Function3[
      /* parent */ d3DashSelectionLib.d3DashSelectionMod.Selection[_, _, d3DashSelectionLib.d3DashSelectionMod.BaseType, _], 
      /* bbox */ js.Any, 
      /* node */ dagreLib.dagreMod.Node, 
      scala.Unit
    ]
  ] = js.native
}

