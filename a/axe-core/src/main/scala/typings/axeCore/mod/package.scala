package typings.axeCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CheckLocale = org.scalablytyped.runtime.StringDictionary[typings.axeCore.anon.Fail]
  type ElementContext = typings.std.Node | java.lang.String | typings.axeCore.mod.ContextObject
  type RuleLocale = org.scalablytyped.runtime.StringDictionary[typings.axeCore.anon.Description]
  type RunCallback = js.Function2[
    /* error */ typings.std.Error, 
    /* results */ typings.axeCore.mod.AxeResults, 
    scala.Unit
  ]
}
