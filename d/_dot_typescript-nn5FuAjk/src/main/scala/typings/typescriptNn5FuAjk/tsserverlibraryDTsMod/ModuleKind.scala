package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "ModuleKind")
@js.native
object ModuleKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleKind & Double] = js.native
  
  @js.native
  sealed trait AMD
    extends StObject
       with ModuleKind
  /* 2 */ val AMD: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.AMD & Double = js.native
  
  @js.native
  sealed trait CommonJS
    extends StObject
       with ModuleKind
  /* 1 */ val CommonJS: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.CommonJS & Double = js.native
  
  @js.native
  sealed trait ES2015
    extends StObject
       with ModuleKind
  /* 5 */ val ES2015: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.ES2015 & Double = js.native
  
  @js.native
  sealed trait ES2020
    extends StObject
       with ModuleKind
  /* 6 */ val ES2020: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.ES2020 & Double = js.native
  
  @js.native
  sealed trait ES2022
    extends StObject
       with ModuleKind
  /* 7 */ val ES2022: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.ES2022 & Double = js.native
  
  @js.native
  sealed trait ESNext
    extends StObject
       with ModuleKind
  /* 99 */ val ESNext: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.ESNext & Double = js.native
  
  @js.native
  sealed trait Node16
    extends StObject
       with ModuleKind
  /* 100 */ val Node16: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.Node16 & Double = js.native
  
  @js.native
  sealed trait NodeNext
    extends StObject
       with ModuleKind
  /* 199 */ val NodeNext: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.NodeNext & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ModuleKind
  /* 0 */ val None: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.None & Double = js.native
  
  @js.native
  sealed trait System
    extends StObject
       with ModuleKind
  /* 4 */ val System: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.System & Double = js.native
  
  @js.native
  sealed trait UMD
    extends StObject
       with ModuleKind
  /* 3 */ val UMD: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.UMD & Double = js.native
}
