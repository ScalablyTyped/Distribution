package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.Headers
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonUtilsMod {
  
  @JSImport("contentful-management/dist/typings/common-utils", "VersionHeader")
  @js.native
  def VersionHeader(): Headers = js.native
  @JSImport("contentful-management/dist/typings/common-utils", "VersionHeader")
  @js.native
  def VersionHeader(version: Double): Headers = js.native
  
  @JSImport("contentful-management/dist/typings/common-utils", "wrapCollection")
  @js.native
  def wrapCollection[R, T](fn: js.Function2[/* http */ AxiosInstance, /* entity */ T, R]): js.Function2[/* http */ AxiosInstance, /* data */ CollectionProp[T], Collection[R, T]] = js.native
}
