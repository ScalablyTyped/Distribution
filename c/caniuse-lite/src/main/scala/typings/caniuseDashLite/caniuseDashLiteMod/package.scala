package typings.caniuseDashLite

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object caniuseDashLiteMod {
  type AgentsByID = StringDictionary[js.UndefOr[Agent]]
  /* Rewritten from type alias, can be one of: 
    - typings.caniuseDashLite.caniuseDashLiteStrings.ls
    - typings.caniuseDashLite.caniuseDashLiteStrings.rec
    - typings.caniuseDashLite.caniuseDashLiteStrings.pr
    - typings.caniuseDashLite.caniuseDashLiteStrings.cr
    - typings.caniuseDashLite.caniuseDashLiteStrings.wd
    - typings.caniuseDashLite.caniuseDashLiteStrings.other
    - typings.caniuseDashLite.caniuseDashLiteStrings.unoff
    - java.lang.String
  */
  type FeatureStatus = _FeatureStatus | String
  type PackedFeature = StringDictionary[js.Any]
  type PackedRegion = StringDictionary[js.Any]
  type StatsByAgentID = StringDictionary[SupportStatusByVersion]
  /* Rewritten from type alias, can be one of: 
    - typings.caniuseDashLite.caniuseDashLiteStrings.n
    - typings.caniuseDashLite.caniuseDashLiteStrings.p
    - typings.caniuseDashLite.caniuseDashLiteStrings.u
    - typings.caniuseDashLite.caniuseDashLiteStrings.`a x`
    - typings.caniuseDashLite.caniuseDashLiteStrings.a
    - typings.caniuseDashLite.caniuseDashLiteStrings.`y x`
    - typings.caniuseDashLite.caniuseDashLiteStrings.y
    - java.lang.String
  */
  type SupportStatus = _SupportStatus | String
  type SupportStatusByVersion = StringDictionary[SupportStatus]
  type UsageByVersion = StringDictionary[js.UndefOr[Double]]
}
