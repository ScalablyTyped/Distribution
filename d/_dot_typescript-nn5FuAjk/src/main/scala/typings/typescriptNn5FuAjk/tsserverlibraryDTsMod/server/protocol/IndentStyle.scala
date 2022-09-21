package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndentStyle extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.protocol.IndentStyle")
@js.native
object IndentStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IndentStyle & String] = js.native
  
  @js.native
  sealed trait Block
    extends StObject
       with IndentStyle
  /* "Block" */ val Block: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.IndentStyle.Block & String = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with IndentStyle
  /* "None" */ val None: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.IndentStyle.None & String = js.native
  
  @js.native
  sealed trait Smart
    extends StObject
       with IndentStyle
  /* "Smart" */ val Smart: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.IndentStyle.Smart & String = js.native
}
