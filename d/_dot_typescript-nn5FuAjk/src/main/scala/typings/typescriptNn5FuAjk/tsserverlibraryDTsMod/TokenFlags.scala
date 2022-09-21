package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenFlags extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "TokenFlags")
@js.native
object TokenFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenFlags & Double] = js.native
  
  @js.native
  sealed trait BinarySpecifier
    extends StObject
       with TokenFlags
  /* 128 */ val BinarySpecifier: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenFlags.BinarySpecifier & Double = js.native
  
  @js.native
  sealed trait HexSpecifier
    extends StObject
       with TokenFlags
  /* 64 */ val HexSpecifier: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenFlags.HexSpecifier & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TokenFlags
  /* 0 */ val None: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenFlags.None & Double = js.native
  
  @js.native
  sealed trait Octal
    extends StObject
       with TokenFlags
  /* 32 */ val Octal: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenFlags.Octal & Double = js.native
  
  @js.native
  sealed trait OctalSpecifier
    extends StObject
       with TokenFlags
  /* 256 */ val OctalSpecifier: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenFlags.OctalSpecifier & Double = js.native
  
  @js.native
  sealed trait Scientific
    extends StObject
       with TokenFlags
  /* 16 */ val Scientific: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenFlags.Scientific & Double = js.native
}
