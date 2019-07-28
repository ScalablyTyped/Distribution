package typings.dagre

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dagreMod {
  type EdgeFn = js.Function1[/* outNodeName */ String, js.Array[GraphEdge]]
  type Label = StringDictionary[js.Any]
  type WeightFn = js.Function1[/* edge */ Edge, Double]
}
