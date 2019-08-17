package typings.axeDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axeDashCoreMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.axeDashCore.Anon_Description
  import typings.axeDashCore.Anon_Fail
  import typings.std.Error
  import typings.std.Node

  type CheckLocale = StringDictionary[Anon_Fail]
  type ElementContext = Node | String | RunOnlyObject
  type RuleLocale = StringDictionary[Anon_Description]
  type RunCallback = js.Function2[/* error */ Error, /* results */ AxeResults, Unit]
}
