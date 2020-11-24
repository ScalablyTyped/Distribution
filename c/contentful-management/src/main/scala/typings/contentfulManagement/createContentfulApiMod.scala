package typings.contentfulManagement

import typings.contentfulManagement.anon.CreatePersonalAccessToken
import typings.contentfulManagement.anon.Http
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/create-contentful-api", JSImport.Namespace)
@js.native
object createContentfulApiMod extends js.Object {
  
  def default(hasHttp: Http): CreatePersonalAccessToken = js.native
  
  type ClientAPI = ReturnType[js.Function1[/* hasHttp */ Http, CreatePersonalAccessToken]]
}
