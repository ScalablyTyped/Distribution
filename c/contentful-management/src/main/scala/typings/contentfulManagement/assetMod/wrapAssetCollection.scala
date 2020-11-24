package typings.contentfulManagement.assetMod

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/asset", "wrapAssetCollection")
@js.native
object wrapAssetCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[AssetProps]): Collection[Asset, AssetProps] = js.native
}
