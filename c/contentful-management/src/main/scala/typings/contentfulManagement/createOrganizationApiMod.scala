package typings.contentfulManagement

import typings.contentfulManagement.anon.CreateAppDefinition
import typings.contentfulManagement.anon.Http
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/create-organization-api", JSImport.Namespace)
@js.native
object createOrganizationApiMod extends js.Object {
  
  def default(hasHttp: Http): CreateAppDefinition = js.native
  
  type ContentfulOrganizationAPI = ReturnType[js.Function1[/* hasHttp */ Http, CreateAppDefinition]]
}
