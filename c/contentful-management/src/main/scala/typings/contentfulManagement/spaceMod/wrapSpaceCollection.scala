package typings.contentfulManagement.spaceMod

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/space", "wrapSpaceCollection")
@js.native
object wrapSpaceCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[SpaceProps]): Collection[Space, SpaceProps] = js.native
}
