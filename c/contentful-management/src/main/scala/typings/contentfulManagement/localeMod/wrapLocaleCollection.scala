package typings.contentfulManagement.localeMod

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/locale", "wrapLocaleCollection")
@js.native
object wrapLocaleCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[LocaleProps]): Collection[Locale, LocaleProps] = js.native
}
