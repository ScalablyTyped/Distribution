package typings.axePuppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AnalyzeCB = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* result */ js.UndefOr[typings.axeCore.mod.AxeResults], 
    scala.Unit
  ]
}
