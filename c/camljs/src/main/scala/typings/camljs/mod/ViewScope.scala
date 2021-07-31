package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewScope extends StObject
@JSImport("camljs", "ViewScope")
@js.native
object ViewScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewScope & Double] = js.native
  
  @js.native
  sealed trait FilesOnly
    extends StObject
       with ViewScope
  /* 2 */ val FilesOnly: typings.camljs.mod.ViewScope.FilesOnly & Double = js.native
  
  @js.native
  sealed trait Recursive
    extends StObject
       with ViewScope
  /* 0 */ val Recursive: typings.camljs.mod.ViewScope.Recursive & Double = js.native
  
  @js.native
  sealed trait RecursiveAll
    extends StObject
       with ViewScope
  /* 1 */ val RecursiveAll: typings.camljs.mod.ViewScope.RecursiveAll & Double = js.native
}
