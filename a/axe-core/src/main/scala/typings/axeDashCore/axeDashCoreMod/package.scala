package typings.axeDashCore

import org.scalablytyped.runtime.StringDictionary
import typings.axeDashCore.Anon_Description
import typings.axeDashCore.Anon_Fail
import typings.std.Error
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axeDashCoreMod {
  type CheckLocale = StringDictionary[Anon_Fail]
  type ElementContext = Node | String | RunOnlyObject
  type RuleLocale = StringDictionary[Anon_Description]
  type RunCallback = js.Function2[/* error */ Error, /* results */ AxeResults, Unit]
}
