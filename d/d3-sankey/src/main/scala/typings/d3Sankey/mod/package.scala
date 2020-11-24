package typings.d3Sankey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SankeyExtraProperties = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type SankeyLink[N /* <: typings.d3Sankey.mod.SankeyExtraProperties */, L /* <: typings.d3Sankey.mod.SankeyExtraProperties */] = L with (typings.d3Sankey.mod.SankeyLinkMinimal[N, L])
  
  type SankeyNode[N /* <: typings.d3Sankey.mod.SankeyExtraProperties */, L /* <: typings.d3Sankey.mod.SankeyExtraProperties */] = N with (typings.d3Sankey.mod.SankeyNodeMinimal[N, L])
}
