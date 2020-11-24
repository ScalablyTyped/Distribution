package typings.contentfulManagement.spaceMemberMod

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.SpaceMemberPropstoPlainOb
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/space-member", "wrapSpaceMemberCollection")
@js.native
object wrapSpaceMemberCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[SpaceMemberProps]): Collection[SpaceMemberPropstoPlainOb, SpaceMemberProps] = js.native
}
