package typings
package caniuseDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object caniuseDashLiteMod {
  type AgentsByID = stdLib.Readonly[org.scalablytyped.runtime.StringDictionary[js.UndefOr[stdLib.Readonly[Agent]]]]
  type FeatureStatus = _FeatureStatus | java.lang.String
  type StatsByAgentID = stdLib.Readonly[org.scalablytyped.runtime.StringDictionary[SupportStatusByVersion]]
  type SupportStatus = _SupportStatus | java.lang.String
  type SupportStatusByVersion = stdLib.Readonly[org.scalablytyped.runtime.StringDictionary[SupportStatus]]
  type UsageByVersion = stdLib.Readonly[org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]]
}
