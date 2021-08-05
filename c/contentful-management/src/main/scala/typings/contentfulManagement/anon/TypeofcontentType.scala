package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.contentTypeMod.ContentTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofcontentType extends StObject {
  
  def wrapContentType(http: AxiosInstance, data: ContentTypeProps): typings.contentfulManagement.contentTypeMod.ContentType
  
  def wrapContentTypeCollection(http: AxiosInstance, data: CollectionProp[ContentTypeProps]): Collection[typings.contentfulManagement.contentTypeMod.ContentType, ContentTypeProps]
}
object TypeofcontentType {
  
  inline def apply(
    wrapContentType: (AxiosInstance, ContentTypeProps) => typings.contentfulManagement.contentTypeMod.ContentType,
    wrapContentTypeCollection: (AxiosInstance, CollectionProp[ContentTypeProps]) => Collection[typings.contentfulManagement.contentTypeMod.ContentType, ContentTypeProps]
  ): TypeofcontentType = {
    val __obj = js.Dynamic.literal(wrapContentType = js.Any.fromFunction2(wrapContentType), wrapContentTypeCollection = js.Any.fromFunction2(wrapContentTypeCollection))
    __obj.asInstanceOf[TypeofcontentType]
  }
  
  extension [Self <: TypeofcontentType](x: Self) {
    
    inline def setWrapContentType(
      value: (AxiosInstance, ContentTypeProps) => typings.contentfulManagement.contentTypeMod.ContentType
    ): Self = StObject.set(x, "wrapContentType", js.Any.fromFunction2(value))
    
    inline def setWrapContentTypeCollection(
      value: (AxiosInstance, CollectionProp[ContentTypeProps]) => Collection[typings.contentfulManagement.contentTypeMod.ContentType, ContentTypeProps]
    ): Self = StObject.set(x, "wrapContentTypeCollection", js.Any.fromFunction2(value))
  }
}
