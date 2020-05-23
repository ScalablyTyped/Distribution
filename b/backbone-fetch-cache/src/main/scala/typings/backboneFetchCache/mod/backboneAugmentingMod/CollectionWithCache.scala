package typings.backboneFetchCache.mod.backboneAugmentingMod

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionWithCache
  extends Collection[Model[js.Any, ModelSetOptions]] {
  def fetch(options: CollectionFetchWithCacheOptions): JQueryXHR = js.native
}

