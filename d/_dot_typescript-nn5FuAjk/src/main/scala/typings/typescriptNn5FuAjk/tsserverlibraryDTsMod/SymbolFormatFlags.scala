package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolFormatFlags extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "SymbolFormatFlags")
@js.native
object SymbolFormatFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolFormatFlags & Double] = js.native
  
  @js.native
  sealed trait AllowAnyNodeKind
    extends StObject
       with SymbolFormatFlags
  /* 4 */ val AllowAnyNodeKind: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SymbolFormatFlags.AllowAnyNodeKind & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with SymbolFormatFlags
  /* 0 */ val None: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SymbolFormatFlags.None & Double = js.native
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope
    extends StObject
       with SymbolFormatFlags
  /* 8 */ val UseAliasDefinedOutsideCurrentScope: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SymbolFormatFlags.UseAliasDefinedOutsideCurrentScope & Double = js.native
  
  @js.native
  sealed trait UseOnlyExternalAliasing
    extends StObject
       with SymbolFormatFlags
  /* 2 */ val UseOnlyExternalAliasing: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SymbolFormatFlags.UseOnlyExternalAliasing & Double = js.native
  
  @js.native
  sealed trait WriteTypeParametersOrArguments
    extends StObject
       with SymbolFormatFlags
  /* 1 */ val WriteTypeParametersOrArguments: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SymbolFormatFlags.WriteTypeParametersOrArguments & Double = js.native
}
