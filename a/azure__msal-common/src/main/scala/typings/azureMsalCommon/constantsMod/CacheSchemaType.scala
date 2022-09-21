package typings.azureMsalCommon.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CacheSchemaType extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "CacheSchemaType")
@js.native
object CacheSchemaType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CacheSchemaType & String] = js.native
  
  @js.native
  sealed trait ACCESS_TOKEN
    extends StObject
       with CacheSchemaType
  /* "AccessToken" */ val ACCESS_TOKEN: typings.azureMsalCommon.constantsMod.CacheSchemaType.ACCESS_TOKEN & String = js.native
  
  @js.native
  sealed trait ACCOUNT
    extends StObject
       with CacheSchemaType
  /* "Account" */ val ACCOUNT: typings.azureMsalCommon.constantsMod.CacheSchemaType.ACCOUNT & String = js.native
  
  @js.native
  sealed trait APP_METADATA
    extends StObject
       with CacheSchemaType
  /* "AppMetadata" */ val APP_METADATA: typings.azureMsalCommon.constantsMod.CacheSchemaType.APP_METADATA & String = js.native
  
  @js.native
  sealed trait CREDENTIAL
    extends StObject
       with CacheSchemaType
  /* "Credential" */ val CREDENTIAL: typings.azureMsalCommon.constantsMod.CacheSchemaType.CREDENTIAL & String = js.native
  
  @js.native
  sealed trait ID_TOKEN
    extends StObject
       with CacheSchemaType
  /* "IdToken" */ val ID_TOKEN: typings.azureMsalCommon.constantsMod.CacheSchemaType.ID_TOKEN & String = js.native
  
  @js.native
  sealed trait REFRESH_TOKEN
    extends StObject
       with CacheSchemaType
  /* "RefreshToken" */ val REFRESH_TOKEN: typings.azureMsalCommon.constantsMod.CacheSchemaType.REFRESH_TOKEN & String = js.native
  
  @js.native
  sealed trait TELEMETRY
    extends StObject
       with CacheSchemaType
  /* "Telemetry" */ val TELEMETRY: typings.azureMsalCommon.constantsMod.CacheSchemaType.TELEMETRY & String = js.native
  
  @js.native
  sealed trait TEMPORARY
    extends StObject
       with CacheSchemaType
  /* "TempCache" */ val TEMPORARY: typings.azureMsalCommon.constantsMod.CacheSchemaType.TEMPORARY & String = js.native
  
  @js.native
  sealed trait THROTTLING
    extends StObject
       with CacheSchemaType
  /* "Throttling" */ val THROTTLING: typings.azureMsalCommon.constantsMod.CacheSchemaType.THROTTLING & String = js.native
  
  @js.native
  sealed trait UNDEFINED
    extends StObject
       with CacheSchemaType
  /* "Undefined" */ val UNDEFINED: typings.azureMsalCommon.constantsMod.CacheSchemaType.UNDEFINED & String = js.native
}
