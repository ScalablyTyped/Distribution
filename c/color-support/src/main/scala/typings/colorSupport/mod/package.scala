package typings.colorSupport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ColorSupport = js.Function2[
    /* options */ js.UndefOr[typings.colorSupport.mod.ColorSupportOptions], 
    /* obj */ js.UndefOr[typings.colorSupport.mod.ColorSupportResult], 
    typings.colorSupport.colorSupportBooleans.`false` | typings.colorSupport.mod.ColorSupportResult
  ]
}
