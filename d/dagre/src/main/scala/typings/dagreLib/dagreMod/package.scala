package typings
package dagreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dagreMod {
  type EdgeFn = js.Function1[/* outNodeName */ java.lang.String, js.Array[GraphEdge]]
  type Label = org.scalablytyped.runtime.StringDictionary[js.Any]
  type WeightFn = js.Function1[/* edge */ Edge, scala.Double]
}
