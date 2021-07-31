package typings.contentfulManagement

import typings.contentfulManagement.createCmaHttpClientMod.ClientParams
import typings.contentfulManagement.createContentfulApiMod.ClientAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("contentful-management", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createClient(params: ClientParams): ClientAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(params.asInstanceOf[js.Any]).asInstanceOf[ClientAPI]
}
