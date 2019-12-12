package typings.camljs.camljsMod

import org.scalablytyped.runtime.TopLevel
import typings.camljs.camljsMod.ViewScope.FilesOnly
import typings.camljs.camljsMod.ViewScope.Recursive
import typings.camljs.camljsMod.ViewScope.RecursiveAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewScope extends js.Object

@JSImport("camljs", "ViewScope")
@js.native
object ViewScope extends js.Object {
  @js.native
  sealed trait FilesOnly extends ViewScope
  
  @js.native
  sealed trait Recursive extends ViewScope
  
  @js.native
  sealed trait RecursiveAll extends ViewScope
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewScope with Double] = js.native
  /* 2 */ @js.native
  object FilesOnly extends TopLevel[FilesOnly with Double]
  
  /* 0 */ @js.native
  object Recursive extends TopLevel[Recursive with Double]
  
  /* 1 */ @js.native
  object RecursiveAll extends TopLevel[RecursiveAll with Double]
  
}

