package typings.caniuseLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AgentsByID = org.scalablytyped.runtime.StringDictionary[js.UndefOr[typings.caniuseLite.mod.Agent]]
  /* Rewritten from type alias, can be one of: 
    - typings.caniuseLite.caniuseLiteStrings.ls
    - typings.caniuseLite.caniuseLiteStrings.rec
    - typings.caniuseLite.caniuseLiteStrings.pr
    - typings.caniuseLite.caniuseLiteStrings.cr
    - typings.caniuseLite.caniuseLiteStrings.wd
    - typings.caniuseLite.caniuseLiteStrings.other
    - typings.caniuseLite.caniuseLiteStrings.unoff
    - java.lang.String
  */
  type FeatureStatus = typings.caniuseLite.mod._FeatureStatus | java.lang.String
  type PackedFeature = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PackedRegion = org.scalablytyped.runtime.StringDictionary[js.Any]
  type StatsByAgentID = org.scalablytyped.runtime.StringDictionary[typings.caniuseLite.mod.SupportStatusByVersion]
  /* Rewritten from type alias, can be one of: 
    - typings.caniuseLite.caniuseLiteStrings.n
    - typings.caniuseLite.caniuseLiteStrings.p
    - typings.caniuseLite.caniuseLiteStrings.u
    - typings.caniuseLite.caniuseLiteStrings.`a x`
    - typings.caniuseLite.caniuseLiteStrings.a
    - typings.caniuseLite.caniuseLiteStrings.`y x`
    - typings.caniuseLite.caniuseLiteStrings.y
    - java.lang.String
  */
  type SupportStatus = typings.caniuseLite.mod._SupportStatus | java.lang.String
  type SupportStatusByVersion = org.scalablytyped.runtime.StringDictionary[typings.caniuseLite.mod.SupportStatus]
  type UsageByVersion = org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
}
