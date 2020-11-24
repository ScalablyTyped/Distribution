package typings.contentfulManagement.userMod

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/user", "wrapUserCollection")
@js.native
object wrapUserCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[UserProps]): Collection[User, UserProps] = js.native
}
