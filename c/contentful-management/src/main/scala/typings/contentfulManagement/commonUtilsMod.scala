package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.Headers
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/common-utils", JSImport.Namespace)
@js.native
object commonUtilsMod extends js.Object {
  
  def VersionHeader(): Headers = js.native
  def VersionHeader(version: Double): Headers = js.native
  
  def wrapCollection[R, T](fn: js.Function2[/* http */ AxiosInstance, /* entity */ T, R]): js.Function2[/* http */ AxiosInstance, /* data */ CollectionProp[T], Collection[R, T]] = js.native
}
