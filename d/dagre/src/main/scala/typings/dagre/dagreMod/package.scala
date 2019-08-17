package typings.dagre

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dagreMod {
  import org.scalablytyped.runtime.StringDictionary

  type EdgeFn = js.Function1[/* outNodeName */ String, js.Array[GraphEdge]]
  type Label = StringDictionary[js.Any]
  type WeightFn = js.Function1[/* edge */ Edge, Double]
}
