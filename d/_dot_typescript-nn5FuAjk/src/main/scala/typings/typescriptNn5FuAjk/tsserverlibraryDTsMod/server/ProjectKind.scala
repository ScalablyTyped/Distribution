package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ProjectKind")
@js.native
object ProjectKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectKind & Double] = js.native
  
  @js.native
  sealed trait AutoImportProvider
    extends StObject
       with ProjectKind
  /* 3 */ val AutoImportProvider: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectKind.AutoImportProvider & Double = js.native
  
  @js.native
  sealed trait Auxiliary
    extends StObject
       with ProjectKind
  /* 4 */ val Auxiliary: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectKind.Auxiliary & Double = js.native
  
  @js.native
  sealed trait Configured
    extends StObject
       with ProjectKind
  /* 1 */ val Configured: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectKind.Configured & Double = js.native
  
  @js.native
  sealed trait External
    extends StObject
       with ProjectKind
  /* 2 */ val External: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectKind.External & Double = js.native
  
  @js.native
  sealed trait Inferred
    extends StObject
       with ProjectKind
  /* 0 */ val Inferred: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectKind.Inferred & Double = js.native
}
