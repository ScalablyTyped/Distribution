package typings.backboneFetchCache.mod.backboneAugmentingMod

import typings.backbone.mod.Model
import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelWithCache extends Model {
  def fetch(options: ModelFetchWithCacheOptions): JQueryXHR = js.native
}

