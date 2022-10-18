package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthorityAuthorityTypeMod {
  
  @js.native
  sealed trait AuthorityType extends StObject
  @JSImport("@azure/msal-common/dist/authority/AuthorityType", "AuthorityType")
  @js.native
  object AuthorityType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AuthorityType & Double] = js.native
    
    @js.native
    sealed trait Adfs
      extends StObject
         with AuthorityType
    /* 1 */ val Adfs: typings.azureMsalCommon.distAuthorityAuthorityTypeMod.AuthorityType.Adfs & Double = js.native
    
    @js.native
    sealed trait Default
      extends StObject
         with AuthorityType
    /* 0 */ val Default: typings.azureMsalCommon.distAuthorityAuthorityTypeMod.AuthorityType.Default & Double = js.native
  }
}
