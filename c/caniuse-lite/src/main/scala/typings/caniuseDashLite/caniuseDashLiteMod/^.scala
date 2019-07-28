package typings.caniuseDashLite.caniuseDashLiteMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("caniuse-lite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val agents: AgentsByID = js.native
  def feature(packedFeature: PackedFeature): Feature = js.native
  def region(packedRegion: PackedRegion): StringDictionary[UsageByVersion] = js.native
}

