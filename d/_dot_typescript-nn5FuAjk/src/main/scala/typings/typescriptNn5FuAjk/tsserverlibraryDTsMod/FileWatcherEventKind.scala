package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileWatcherEventKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "FileWatcherEventKind")
@js.native
object FileWatcherEventKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileWatcherEventKind & Double] = js.native
  
  @js.native
  sealed trait Changed
    extends StObject
       with FileWatcherEventKind
  /* 1 */ val Changed: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FileWatcherEventKind.Changed & Double = js.native
  
  @js.native
  sealed trait Created
    extends StObject
       with FileWatcherEventKind
  /* 0 */ val Created: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FileWatcherEventKind.Created & Double = js.native
  
  @js.native
  sealed trait Deleted
    extends StObject
       with FileWatcherEventKind
  /* 2 */ val Deleted: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FileWatcherEventKind.Deleted & Double = js.native
}
