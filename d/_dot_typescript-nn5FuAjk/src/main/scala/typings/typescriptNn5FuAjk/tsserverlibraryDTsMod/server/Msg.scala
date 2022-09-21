package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Msg extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.Msg")
@js.native
object Msg extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Msg & String] = js.native
  
  @js.native
  sealed trait Err
    extends StObject
       with Msg
  /* "Err" */ val Err: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Msg.Err & String = js.native
  
  @js.native
  sealed trait Info
    extends StObject
       with Msg
  /* "Info" */ val Info: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Msg.Info & String = js.native
  
  @js.native
  sealed trait Perf
    extends StObject
       with Msg
  /* "Perf" */ val Perf: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Msg.Perf & String = js.native
  
  /** @deprecated Only here for backwards-compatibility. Prefer just `Msg`. */
  type Types = Msg
}
