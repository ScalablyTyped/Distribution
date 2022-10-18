package typings.azureMsalCommon.distUtilsConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CacheAccountType extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "CacheAccountType")
@js.native
object CacheAccountType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CacheAccountType & String] = js.native
  
  @js.native
  sealed trait ADFS_ACCOUNT_TYPE
    extends StObject
       with CacheAccountType
  /* "ADFS" */ val ADFS_ACCOUNT_TYPE: typings.azureMsalCommon.distUtilsConstantsMod.CacheAccountType.ADFS_ACCOUNT_TYPE & String = js.native
  
  @js.native
  sealed trait GENERIC_ACCOUNT_TYPE
    extends StObject
       with CacheAccountType
  /* "Generic" */ val GENERIC_ACCOUNT_TYPE: typings.azureMsalCommon.distUtilsConstantsMod.CacheAccountType.GENERIC_ACCOUNT_TYPE & String = js.native
  
  @js.native
  sealed trait MSAV1_ACCOUNT_TYPE
    extends StObject
       with CacheAccountType
  /* "MSA" */ val MSAV1_ACCOUNT_TYPE: typings.azureMsalCommon.distUtilsConstantsMod.CacheAccountType.MSAV1_ACCOUNT_TYPE & String = js.native
  
  @js.native
  sealed trait MSSTS_ACCOUNT_TYPE
    extends StObject
       with CacheAccountType
  /* "MSSTS" */ val MSSTS_ACCOUNT_TYPE: typings.azureMsalCommon.distUtilsConstantsMod.CacheAccountType.MSSTS_ACCOUNT_TYPE & String = js.native
}
