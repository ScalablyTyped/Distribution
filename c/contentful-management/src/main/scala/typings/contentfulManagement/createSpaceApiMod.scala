package typings.contentfulManagement

import typings.contentfulManagement.anon.CreateApiKey
import typings.contentfulManagement.anon.HttpUpload
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSpaceApiMod {
  
  @JSImport("contentful-management/dist/typings/create-space-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasHttpHttpUpload: HttpUpload): CreateApiKey = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasHttpHttpUpload.asInstanceOf[js.Any]).asInstanceOf[CreateApiKey]
  
  type ContentfulSpaceAPI = ReturnType[js.Function1[/* hasHttpHttpUpload */ HttpUpload, CreateApiKey]]
}
