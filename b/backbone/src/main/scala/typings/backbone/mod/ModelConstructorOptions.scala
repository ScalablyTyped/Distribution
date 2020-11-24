package typings.backbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelConstructorOptions[TModel /* <: Model[_, ModelSetOptions, js.Object] */]
  extends Silenceable
     with Validable
     with Parseable {
  
  var collection: js.UndefOr[Collection[TModel]] = js.native
}
object ModelConstructorOptions {
  
  @scala.inline
  def apply[TModel /* <: Model[_, ModelSetOptions, js.Object] */](): ModelConstructorOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelConstructorOptions[TModel]]
  }
  
  @scala.inline
  implicit class ModelConstructorOptionsOps[Self <: ModelConstructorOptions[_], TModel /* <: Model[_, ModelSetOptions, js.Object] */] (val x: Self with ModelConstructorOptions[TModel]) extends AnyVal {
    
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
    def setCollection(value: Collection[TModel]): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
  }
}
