package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleResolutionKind extends StObject
@JSImport(".typescript-nn5FuAjk", "ModuleResolutionKind")
@js.native
object ModuleResolutionKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleResolutionKind & Double] = js.native
  
  @js.native
  sealed trait Classic
    extends StObject
       with ModuleResolutionKind
  /* 1 */ val Classic: typings.typescriptNn5FuAjk.mod.ModuleResolutionKind.Classic & Double = js.native
  
  @js.native
  sealed trait Node16
    extends StObject
       with ModuleResolutionKind
  /* 3 */ val Node16: typings.typescriptNn5FuAjk.mod.ModuleResolutionKind.Node16 & Double = js.native
  
  @js.native
  sealed trait NodeJs
    extends StObject
       with ModuleResolutionKind
  /* 2 */ val NodeJs: typings.typescriptNn5FuAjk.mod.ModuleResolutionKind.NodeJs & Double = js.native
  
  @js.native
  sealed trait NodeNext
    extends StObject
       with ModuleResolutionKind
  /* 99 */ val NodeNext: typings.typescriptNn5FuAjk.mod.ModuleResolutionKind.NodeNext & Double = js.native
}
