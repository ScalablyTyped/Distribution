package typings.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object regionsMod {
  
  type IRegionStyler = js.Function2[
    /* region */ typings.blueprintjsTable.esmRegionsMod.IRegion, 
    /* quadrantType */ js.UndefOr[typings.blueprintjsTable.tableQuadrantMod.QuadrantType], 
    typings.react.mod.CSSProperties
  ]
}
