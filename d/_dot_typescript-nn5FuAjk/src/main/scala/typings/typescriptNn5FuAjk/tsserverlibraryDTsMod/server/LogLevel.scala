package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
  
  @js.native
  sealed trait normal
    extends StObject
       with LogLevel
  /* 1 */ val normal: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.LogLevel.normal & Double = js.native
  
  @js.native
  sealed trait requestTime
    extends StObject
       with LogLevel
  /* 2 */ val requestTime: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.LogLevel.requestTime & Double = js.native
  
  @js.native
  sealed trait terse
    extends StObject
       with LogLevel
  /* 0 */ val terse: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.LogLevel.terse & Double = js.native
  
  @js.native
  sealed trait verbose
    extends StObject
       with LogLevel
  /* 3 */ val verbose: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.LogLevel.verbose & Double = js.native
}
