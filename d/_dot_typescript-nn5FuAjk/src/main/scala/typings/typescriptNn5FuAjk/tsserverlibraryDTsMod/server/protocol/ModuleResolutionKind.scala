package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleResolutionKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.protocol.ModuleResolutionKind")
@js.native
object ModuleResolutionKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ModuleResolutionKind & String] = js.native
  
  @js.native
  sealed trait Classic
    extends StObject
       with ModuleResolutionKind
  /* "Classic" */ val Classic: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ModuleResolutionKind.Classic & String = js.native
  
  @js.native
  sealed trait Node
    extends StObject
       with ModuleResolutionKind
  /* "Node" */ val Node: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ModuleResolutionKind.Node & String = js.native
}
