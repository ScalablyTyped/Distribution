package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileWatcherEventKind extends StObject
@JSGlobal("ts.FileWatcherEventKind")
@js.native
object FileWatcherEventKind extends StObject {
  
  @js.native
  sealed trait Changed
    extends StObject
       with FileWatcherEventKind
  
  @js.native
  sealed trait Created
    extends StObject
       with FileWatcherEventKind
  
  @js.native
  sealed trait Deleted
    extends StObject
       with FileWatcherEventKind
}
