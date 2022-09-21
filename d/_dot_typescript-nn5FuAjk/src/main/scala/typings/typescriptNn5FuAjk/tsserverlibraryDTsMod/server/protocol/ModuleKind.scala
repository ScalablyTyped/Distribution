package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.protocol.ModuleKind")
@js.native
object ModuleKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ModuleKind & String] = js.native
  
  @js.native
  sealed trait AMD
    extends StObject
       with ModuleKind
  /* "AMD" */ val AMD: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ModuleKind.AMD & String = js.native
  
  @js.native
  sealed trait CommonJS
    extends StObject
       with ModuleKind
  /* "CommonJS" */ val CommonJS: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ModuleKind.CommonJS & String = js.native
  
  @js.native
  sealed trait ES2015
    extends StObject
       with ModuleKind
  /* "ES2015" */ val ES2015: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ModuleKind.ES2015 & String = js.native
  
  @js.native
  sealed trait ES6
    extends StObject
       with ModuleKind
  /* "ES6" */ val ES6: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ModuleKind.ES6 & String = js.native
  
  @js.native
  sealed trait ESNext
    extends StObject
       with ModuleKind
  /* "ESNext" */ val ESNext: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ModuleKind.ESNext & String = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ModuleKind
  /* "None" */ val None: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ModuleKind.None & String = js.native
  
  @js.native
  sealed trait System
    extends StObject
       with ModuleKind
  /* "System" */ val System: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ModuleKind.System & String = js.native
  
  @js.native
  sealed trait UMD
    extends StObject
       with ModuleKind
  /* "UMD" */ val UMD: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ModuleKind.UMD & String = js.native
}
