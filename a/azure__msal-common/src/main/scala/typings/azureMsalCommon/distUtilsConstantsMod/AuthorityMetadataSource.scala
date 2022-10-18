package typings.azureMsalCommon.distUtilsConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuthorityMetadataSource extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "AuthorityMetadataSource")
@js.native
object AuthorityMetadataSource extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AuthorityMetadataSource & String] = js.native
  
  @js.native
  sealed trait CACHE
    extends StObject
       with AuthorityMetadataSource
  /* "cache" */ val CACHE: typings.azureMsalCommon.distUtilsConstantsMod.AuthorityMetadataSource.CACHE & String = js.native
  
  @js.native
  sealed trait CONFIG
    extends StObject
       with AuthorityMetadataSource
  /* "config" */ val CONFIG: typings.azureMsalCommon.distUtilsConstantsMod.AuthorityMetadataSource.CONFIG & String = js.native
  
  @js.native
  sealed trait HARDCODED_VALUES
    extends StObject
       with AuthorityMetadataSource
  /* "hardcoded_values" */ val HARDCODED_VALUES: typings.azureMsalCommon.distUtilsConstantsMod.AuthorityMetadataSource.HARDCODED_VALUES & String = js.native
  
  @js.native
  sealed trait NETWORK
    extends StObject
       with AuthorityMetadataSource
  /* "network" */ val NETWORK: typings.azureMsalCommon.distUtilsConstantsMod.AuthorityMetadataSource.NETWORK & String = js.native
}
