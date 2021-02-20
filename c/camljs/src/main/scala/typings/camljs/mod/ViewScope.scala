package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewScope extends StObject
@JSImport("camljs", "ViewScope")
@js.native
object ViewScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewScope with Double] = js.native
  
  @js.native
  sealed trait FilesOnly extends ViewScope
  /* 2 */ val FilesOnly: typings.camljs.mod.ViewScope.FilesOnly with Double = js.native
  
  @js.native
  sealed trait Recursive extends ViewScope
  /* 0 */ val Recursive: typings.camljs.mod.ViewScope.Recursive with Double = js.native
  
  @js.native
  sealed trait RecursiveAll extends ViewScope
  /* 1 */ val RecursiveAll: typings.camljs.mod.ViewScope.RecursiveAll with Double = js.native
}
