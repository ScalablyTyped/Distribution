package typings.azureMsalCommon.distUtilsConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResponseMode extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "ResponseMode")
@js.native
object ResponseMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResponseMode & String] = js.native
  
  @js.native
  sealed trait FORM_POST
    extends StObject
       with ResponseMode
  /* "form_post" */ val FORM_POST: typings.azureMsalCommon.distUtilsConstantsMod.ResponseMode.FORM_POST & String = js.native
  
  @js.native
  sealed trait FRAGMENT
    extends StObject
       with ResponseMode
  /* "fragment" */ val FRAGMENT: typings.azureMsalCommon.distUtilsConstantsMod.ResponseMode.FRAGMENT & String = js.native
  
  @js.native
  sealed trait QUERY
    extends StObject
       with ResponseMode
  /* "query" */ val QUERY: typings.azureMsalCommon.distUtilsConstantsMod.ResponseMode.QUERY & String = js.native
}
