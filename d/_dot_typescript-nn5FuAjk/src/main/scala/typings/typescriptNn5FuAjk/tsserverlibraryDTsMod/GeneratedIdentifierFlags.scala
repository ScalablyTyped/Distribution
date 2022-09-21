package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeneratedIdentifierFlags extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "GeneratedIdentifierFlags")
@js.native
object GeneratedIdentifierFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeneratedIdentifierFlags & Double] = js.native
  
  @js.native
  sealed trait AllowNameSubstitution
    extends StObject
       with GeneratedIdentifierFlags
  /* 64 */ val AllowNameSubstitution: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.GeneratedIdentifierFlags.AllowNameSubstitution & Double = js.native
  
  @js.native
  sealed trait FileLevel
    extends StObject
       with GeneratedIdentifierFlags
  /* 32 */ val FileLevel: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.GeneratedIdentifierFlags.FileLevel & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with GeneratedIdentifierFlags
  /* 0 */ val None: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.GeneratedIdentifierFlags.None & Double = js.native
  
  @js.native
  sealed trait Optimistic
    extends StObject
       with GeneratedIdentifierFlags
  /* 16 */ val Optimistic: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.GeneratedIdentifierFlags.Optimistic & Double = js.native
  
  @js.native
  sealed trait ReservedInNestedScopes
    extends StObject
       with GeneratedIdentifierFlags
  /* 8 */ val ReservedInNestedScopes: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.GeneratedIdentifierFlags.ReservedInNestedScopes & Double = js.native
}
