package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.contentTypeMod.ContentTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofcontentType extends js.Object {
  
  def wrapContentType(http: AxiosInstance, data: ContentTypeProps): typings.contentfulManagement.contentTypeMod.ContentType = js.native
  
  def wrapContentTypeCollection(http: AxiosInstance, data: CollectionProp[ContentTypeProps]): Collection[typings.contentfulManagement.contentTypeMod.ContentType, ContentTypeProps] = js.native
}
object TypeofcontentType {
  
  @scala.inline
  def apply(
    wrapContentType: (AxiosInstance, ContentTypeProps) => typings.contentfulManagement.contentTypeMod.ContentType,
    wrapContentTypeCollection: (AxiosInstance, CollectionProp[ContentTypeProps]) => Collection[typings.contentfulManagement.contentTypeMod.ContentType, ContentTypeProps]
  ): TypeofcontentType = {
    val __obj = js.Dynamic.literal(wrapContentType = js.Any.fromFunction2(wrapContentType), wrapContentTypeCollection = js.Any.fromFunction2(wrapContentTypeCollection))
    __obj.asInstanceOf[TypeofcontentType]
  }
  
  @scala.inline
  implicit class TypeofcontentTypeOps[Self <: TypeofcontentType] (val x: Self) extends AnyVal {
    
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
    def setWrapContentType(
      value: (AxiosInstance, ContentTypeProps) => typings.contentfulManagement.contentTypeMod.ContentType
    ): Self = this.set("wrapContentType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapContentTypeCollection(
      value: (AxiosInstance, CollectionProp[ContentTypeProps]) => Collection[typings.contentfulManagement.contentTypeMod.ContentType, ContentTypeProps]
    ): Self = this.set("wrapContentTypeCollection", js.Any.fromFunction2(value))
  }
}
