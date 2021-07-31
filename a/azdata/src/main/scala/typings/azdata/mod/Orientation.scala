package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends StObject
@JSImport("azdata", "Orientation")
@js.native
object Orientation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orientation & String] = js.native
  
  @js.native
  sealed trait Horizontal
    extends StObject
       with Orientation
  /* "horizontal" */ val Horizontal: typings.azdata.mod.Orientation.Horizontal & String = js.native
  
  @js.native
  sealed trait Vertical
    extends StObject
       with Orientation
  /* "vertial" */ val Vertical: typings.azdata.mod.Orientation.Vertical & String = js.native
}
