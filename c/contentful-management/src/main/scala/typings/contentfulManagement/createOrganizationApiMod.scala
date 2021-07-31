package typings.contentfulManagement

import typings.contentfulManagement.anon.CreateAppDefinition
import typings.contentfulManagement.anon.Http
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createOrganizationApiMod {
  
  @JSImport("contentful-management/dist/typings/create-organization-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasHttp: Http): CreateAppDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasHttp.asInstanceOf[js.Any]).asInstanceOf[CreateAppDefinition]
  
  type ContentfulOrganizationAPI = ReturnType[js.Function1[/* hasHttp */ Http, CreateAppDefinition]]
}
