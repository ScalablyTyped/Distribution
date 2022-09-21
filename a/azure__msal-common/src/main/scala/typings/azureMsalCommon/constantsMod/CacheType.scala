package typings.azureMsalCommon.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CacheType extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "CacheType")
@js.native
object CacheType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CacheType & Double] = js.native
  
  @js.native
  sealed trait ACCESS_TOKEN
    extends StObject
       with CacheType
  /* 2001 */ val ACCESS_TOKEN: typings.azureMsalCommon.constantsMod.CacheType.ACCESS_TOKEN & Double = js.native
  
  @js.native
  sealed trait ADFS
    extends StObject
       with CacheType
  /* 1001 */ val ADFS: typings.azureMsalCommon.constantsMod.CacheType.ADFS & Double = js.native
  
  @js.native
  sealed trait APP_METADATA
    extends StObject
       with CacheType
  /* 3001 */ val APP_METADATA: typings.azureMsalCommon.constantsMod.CacheType.APP_METADATA & Double = js.native
  
  @js.native
  sealed trait GENERIC
    extends StObject
       with CacheType
  /* 1004 */ val GENERIC: typings.azureMsalCommon.constantsMod.CacheType.GENERIC & Double = js.native
  
  @js.native
  sealed trait ID_TOKEN
    extends StObject
       with CacheType
  /* 2003 */ val ID_TOKEN: typings.azureMsalCommon.constantsMod.CacheType.ID_TOKEN & Double = js.native
  
  @js.native
  sealed trait MSA
    extends StObject
       with CacheType
  /* 1002 */ val MSA: typings.azureMsalCommon.constantsMod.CacheType.MSA & Double = js.native
  
  @js.native
  sealed trait MSSTS
    extends StObject
       with CacheType
  /* 1003 */ val MSSTS: typings.azureMsalCommon.constantsMod.CacheType.MSSTS & Double = js.native
  
  @js.native
  sealed trait REFRESH_TOKEN
    extends StObject
       with CacheType
  /* 2002 */ val REFRESH_TOKEN: typings.azureMsalCommon.constantsMod.CacheType.REFRESH_TOKEN & Double = js.native
  
  @js.native
  sealed trait UNDEFINED
    extends StObject
       with CacheType
  /* 9999 */ val UNDEFINED: typings.azureMsalCommon.constantsMod.CacheType.UNDEFINED & Double = js.native
}
