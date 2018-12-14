package typings
package caniuseDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object caniuseDashLiteMod {
  type AgentsByID = stdLib.Readonly[org.scalablytyped.runtime.StringDictionary[js.UndefOr[stdLib.Readonly[Agent]]]]
  type FeatureStatus = caniuseDashLiteLib.caniuseDashLiteLibStrings.ls | caniuseDashLiteLib.caniuseDashLiteLibStrings.rec | caniuseDashLiteLib.caniuseDashLiteLibStrings.pr | caniuseDashLiteLib.caniuseDashLiteLibStrings.cr | caniuseDashLiteLib.caniuseDashLiteLibStrings.wd | caniuseDashLiteLib.caniuseDashLiteLibStrings.other | caniuseDashLiteLib.caniuseDashLiteLibStrings.unoff | java.lang.String
  type StatsByAgentID = stdLib.Readonly[org.scalablytyped.runtime.StringDictionary[SupportStatusByVersion]]
  type SupportStatus = caniuseDashLiteLib.caniuseDashLiteLibStrings.n | caniuseDashLiteLib.caniuseDashLiteLibStrings.p | caniuseDashLiteLib.caniuseDashLiteLibStrings.u | (caniuseDashLiteLib.caniuseDashLiteLibStrings.`a x`) | caniuseDashLiteLib.caniuseDashLiteLibStrings.a | (caniuseDashLiteLib.caniuseDashLiteLibStrings.`y x`) | caniuseDashLiteLib.caniuseDashLiteLibStrings.y | java.lang.String
  type SupportStatusByVersion = stdLib.Readonly[org.scalablytyped.runtime.StringDictionary[SupportStatus]]
  type UsageByVersion = stdLib.Readonly[org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]]
}
