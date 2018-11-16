package typings
package axeDashCoreLib.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axeNs {
  type ElementContext = stdLib.Node | java.lang.String | RunOnlyObject
  type ImpactValue = axeDashCoreLib.axeDashCoreLibStrings.minor | axeDashCoreLib.axeDashCoreLibStrings.moderate | axeDashCoreLib.axeDashCoreLibStrings.serious | axeDashCoreLib.axeDashCoreLibStrings.critical
  type ReporterVersion = axeDashCoreLib.axeDashCoreLibStrings.v1 | axeDashCoreLib.axeDashCoreLibStrings.v2
  type RunCallback = js.Function2[/* error */ stdLib.Error, /* results */ AxeResults, scala.Unit]
  type RunOnlyType = axeDashCoreLib.axeDashCoreLibStrings.rule | axeDashCoreLib.axeDashCoreLibStrings.rules | axeDashCoreLib.axeDashCoreLibStrings.tag | axeDashCoreLib.axeDashCoreLibStrings.tags
  type TagValue = axeDashCoreLib.axeDashCoreLibStrings.wcag2a | axeDashCoreLib.axeDashCoreLibStrings.wcag2aa | axeDashCoreLib.axeDashCoreLibStrings.section508 | axeDashCoreLib.axeDashCoreLibStrings.`best-practice`
  type resultGroups = axeDashCoreLib.axeDashCoreLibStrings.inapplicable | axeDashCoreLib.axeDashCoreLibStrings.passes | axeDashCoreLib.axeDashCoreLibStrings.incomplete | axeDashCoreLib.axeDashCoreLibStrings.violations
}
