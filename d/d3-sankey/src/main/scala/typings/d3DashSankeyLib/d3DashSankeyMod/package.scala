package typings
package d3DashSankeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashSankeyMod {
  type SankeyExtraProperties = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SankeyLink[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] = L with (SankeyLinkMinimal[N, L])
  type SankeyNode[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] = N with (SankeyNodeMinimal[N, L])
}
