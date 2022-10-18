package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "ScopeSet")
@js.native
open class ScopeSet protected ()
  extends typings.azureMsalCommon.distRequestScopeSetMod.ScopeSet {
  def this(inputScopes: js.Array[String]) = this()
}
/* static members */
object ScopeSet {
  
  @JSImport("@azure/msal-common", "ScopeSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Factory method to create ScopeSet from space-delimited string
    * @param inputScopeString
    * @param appClientId
    * @param scopesRequired
    */
  inline def fromString(inputScopeString: String): typings.azureMsalCommon.distRequestScopeSetMod.ScopeSet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(inputScopeString.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distRequestScopeSetMod.ScopeSet]
}
