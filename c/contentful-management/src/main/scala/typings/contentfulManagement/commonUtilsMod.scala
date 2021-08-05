package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.Headers
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonUtilsMod {
  
  @JSImport("contentful-management/dist/typings/common-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def VersionHeader(): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("VersionHeader")().asInstanceOf[Headers]
  inline def VersionHeader(version: Double): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("VersionHeader")(version.asInstanceOf[js.Any]).asInstanceOf[Headers]
  
  inline def wrapCollection[R, T](fn: js.Function2[/* http */ AxiosInstance, /* entity */ T, R]): js.Function2[/* http */ AxiosInstance, /* data */ CollectionProp[T], Collection[R, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapCollection")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* http */ AxiosInstance, /* data */ CollectionProp[T], Collection[R, T]]]
}
