package typings.axeWebdriverjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnalyzeCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* results */ typings.axeWebdriverjs.mod.AxeAnalysis, 
    scala.Unit
  ]
  
  type DeprecatedAnalyzeCallback = js.Function1[/* results */ typings.axeWebdriverjs.mod.AxeAnalysis, scala.Unit]
}
