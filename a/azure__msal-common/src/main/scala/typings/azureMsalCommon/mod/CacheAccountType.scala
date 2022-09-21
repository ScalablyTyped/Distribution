package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "CacheAccountType")
@js.native
object CacheAccountType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.azureMsalCommon.constantsMod.CacheAccountType & String] = js.native
  
  /* "ADFS" */ val ADFS_ACCOUNT_TYPE: typings.azureMsalCommon.constantsMod.CacheAccountType.ADFS_ACCOUNT_TYPE & String = js.native
  
  /* "Generic" */ val GENERIC_ACCOUNT_TYPE: typings.azureMsalCommon.constantsMod.CacheAccountType.GENERIC_ACCOUNT_TYPE & String = js.native
  
  /* "MSA" */ val MSAV1_ACCOUNT_TYPE: typings.azureMsalCommon.constantsMod.CacheAccountType.MSAV1_ACCOUNT_TYPE & String = js.native
  
  /* "MSSTS" */ val MSSTS_ACCOUNT_TYPE: typings.azureMsalCommon.constantsMod.CacheAccountType.MSSTS_ACCOUNT_TYPE & String = js.native
}
