package typings.camljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewScope extends js.Object
@JSImport("camljs", "ViewScope")
@js.native
object ViewScope extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewScope with Double] = js.native
  
  @js.native
  sealed trait FilesOnly extends ViewScope
  /* 2 */ @js.native
  object FilesOnly extends TopLevel[FilesOnly with Double]
  
  @js.native
  sealed trait Recursive extends ViewScope
  /* 0 */ @js.native
  object Recursive extends TopLevel[Recursive with Double]
  
  @js.native
  sealed trait RecursiveAll extends ViewScope
  /* 1 */ @js.native
  object RecursiveAll extends TopLevel[RecursiveAll with Double]
}
