package typings.backboneDashFetchDashCache.backboneDashFetchDashCacheMod.backboneMod

import typings.backbone.backboneMod.Collection
import typings.backbone.backboneMod.Model
import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionWithCache extends Collection[Model] {
  def fetch(options: CollectionFetchWithCacheOptions): JQueryXHR = js.native
}

