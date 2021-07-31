package typings.contentfulManagement

import typings.contentfulManagement.anon.CreateAppInstallation
import typings.contentfulManagement.anon.HttpUpload
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createEnvironmentApiMod {
  
  @JSImport("contentful-management/dist/typings/create-environment-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasHttpHttpUpload: HttpUpload): CreateAppInstallation = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasHttpHttpUpload.asInstanceOf[js.Any]).asInstanceOf[CreateAppInstallation]
  
  type ContentfulEnvironmentAPI = ReturnType[js.Function1[/* hasHttpHttpUpload */ HttpUpload, CreateAppInstallation]]
}
