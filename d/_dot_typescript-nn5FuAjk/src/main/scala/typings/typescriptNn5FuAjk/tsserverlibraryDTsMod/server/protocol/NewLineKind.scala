package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NewLineKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.protocol.NewLineKind")
@js.native
object NewLineKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NewLineKind & String] = js.native
  
  @js.native
  sealed trait Crlf
    extends StObject
       with NewLineKind
  /* "Crlf" */ val Crlf: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.NewLineKind.Crlf & String = js.native
  
  @js.native
  sealed trait Lf
    extends StObject
       with NewLineKind
  /* "Lf" */ val Lf: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.NewLineKind.Lf & String = js.native
}
