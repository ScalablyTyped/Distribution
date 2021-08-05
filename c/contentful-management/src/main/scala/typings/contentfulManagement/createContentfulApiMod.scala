package typings.contentfulManagement

import typings.contentfulManagement.anon.CreatePersonalAccessToken
import typings.contentfulManagement.anon.Http
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createContentfulApiMod {
  
  @JSImport("contentful-management/dist/typings/create-contentful-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasHttp: Http): CreatePersonalAccessToken = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasHttp.asInstanceOf[js.Any]).asInstanceOf[CreatePersonalAccessToken]
  
  type ClientAPI = ReturnType[js.Function1[/* hasHttp */ Http, CreatePersonalAccessToken]]
}
