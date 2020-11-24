package typings.axeCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CheckLocale = org.scalablytyped.runtime.StringDictionary[typings.axeCore.anon.Fail]
  
  type ElementContext = typings.std.Node | java.lang.String | typings.axeCore.mod.ContextObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.axeCore.axeCoreStrings.minor
    - typings.axeCore.axeCoreStrings.moderate
    - typings.axeCore.axeCoreStrings.serious
    - typings.axeCore.axeCoreStrings.critical
    - scala.Null
  */
  type ImpactValue = typings.axeCore.mod._ImpactValue | scala.Null
  
  type RuleLocale = org.scalablytyped.runtime.StringDictionary[typings.axeCore.anon.Description]
  
  type RuleObject = org.scalablytyped.runtime.StringDictionary[typings.axeCore.anon.Enabled]
  
  type RunCallback = js.Function2[
    /* error */ typings.std.Error, 
    /* results */ typings.axeCore.mod.AxeResults, 
    scala.Unit
  ]
  
  type TagValue = java.lang.String
}
