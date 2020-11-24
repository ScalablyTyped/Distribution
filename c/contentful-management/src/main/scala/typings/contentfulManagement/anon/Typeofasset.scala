package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.assetMod.Asset
import typings.contentfulManagement.assetMod.AssetProps
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofasset extends js.Object {
  
  def wrapAsset(http: AxiosInstance, data: AssetProps): Asset = js.native
  
  def wrapAssetCollection(http: AxiosInstance, data: CollectionProp[AssetProps]): Collection[Asset, AssetProps] = js.native
}
object Typeofasset {
  
  @scala.inline
  def apply(
    wrapAsset: (AxiosInstance, AssetProps) => Asset,
    wrapAssetCollection: (AxiosInstance, CollectionProp[AssetProps]) => Collection[Asset, AssetProps]
  ): Typeofasset = {
    val __obj = js.Dynamic.literal(wrapAsset = js.Any.fromFunction2(wrapAsset), wrapAssetCollection = js.Any.fromFunction2(wrapAssetCollection))
    __obj.asInstanceOf[Typeofasset]
  }
  
  @scala.inline
  implicit class TypeofassetOps[Self <: Typeofasset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWrapAsset(value: (AxiosInstance, AssetProps) => Asset): Self = this.set("wrapAsset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapAssetCollection(value: (AxiosInstance, CollectionProp[AssetProps]) => Collection[Asset, AssetProps]): Self = this.set("wrapAssetCollection", js.Any.fromFunction2(value))
  }
}
