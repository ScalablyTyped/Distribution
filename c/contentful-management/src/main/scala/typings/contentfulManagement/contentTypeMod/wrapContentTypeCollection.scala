package typings.contentfulManagement.contentTypeMod

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/content-type", "wrapContentTypeCollection")
@js.native
object wrapContentTypeCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[ContentTypeProps]): Collection[ContentType, ContentTypeProps] = js.native
}
