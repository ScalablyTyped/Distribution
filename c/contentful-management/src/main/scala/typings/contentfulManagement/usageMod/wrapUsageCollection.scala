package typings.contentfulManagement.usageMod

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/usage", "wrapUsageCollection")
@js.native
object wrapUsageCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[UsageProps]): Collection[Usage, UsageProps] = js.native
}
