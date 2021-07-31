package typings.contentfulManagement

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorHandlerMod {
  
  @JSImport("contentful-management/dist/typings/error-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(errorResponse: AxiosError[js.Any]): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(errorResponse.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
}
