package typings.backboneFetchCache.mod

import typings.backbone.mod.CollectionFetchOptions
import typings.backbone.mod.ModelFetchOptions
import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuperMethods extends js.Object {
  
  def collectionFetch(): JQueryXHR = js.native
  def collectionFetch(options: CollectionFetchOptions): JQueryXHR = js.native
  
  def modelFetch(): JQueryXHR = js.native
  def modelFetch(options: ModelFetchOptions): JQueryXHR = js.native
  
  def modelSync(arg: js.Any*): JQueryXHR = js.native
}
