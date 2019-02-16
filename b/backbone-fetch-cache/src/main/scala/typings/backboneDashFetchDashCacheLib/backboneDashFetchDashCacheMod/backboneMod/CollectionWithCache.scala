package typings
package backboneDashFetchDashCacheLib.backboneDashFetchDashCacheMod.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionWithCache
  extends backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model] {
  def fetch(): jqueryLib.JQueryXHR = js.native
  def fetch(options: CollectionFetchWithCacheOptions): jqueryLib.JQueryXHR = js.native
}

