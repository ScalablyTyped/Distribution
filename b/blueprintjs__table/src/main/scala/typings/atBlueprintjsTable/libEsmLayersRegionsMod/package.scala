package typings.atBlueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmLayersRegionsMod {
  import typings.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType
  import typings.atBlueprintjsTable.libEsmRegionsMod.IRegion
  import typings.react.reactMod.CSSProperties

  type IRegionStyler = js.Function2[/* region */ IRegion, /* quadrantType */ js.UndefOr[QuadrantType], CSSProperties]
}
