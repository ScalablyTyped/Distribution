package typings
package caniuseDashLiteLib.caniuseDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("caniuse-lite", JSImport.Namespace)
@js.native
object caniuseDashLiteModMembers extends js.Object {
  val agents: AgentsByID = js.native
  def feature(packedFeature: PackedFeature): Feature = js.native
  def region(packedRegion: PackedRegion): ScalablyTyped.runtime.StringDictionary[UsageByVersion] = js.native
}

