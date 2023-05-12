package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "CacheRecord")
@js.native
open class CacheRecord protected ()
  extends typings.azureMsalCommon.distCacheEntitiesCacheRecordMod.CacheRecord {
  def this(
    accountEntity: js.UndefOr[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity | Null],
    idTokenEntity: js.UndefOr[typings.azureMsalCommon.distCacheEntitiesIdTokenEntityMod.IdTokenEntity | Null],
    accessTokenEntity: js.UndefOr[
        typings.azureMsalCommon.distCacheEntitiesAccessTokenEntityMod.AccessTokenEntity | Null
      ],
    refreshTokenEntity: js.UndefOr[
        typings.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity | Null
      ],
    appMetadataEntity: js.UndefOr[
        typings.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity | Null
      ]
  ) = this()
}
