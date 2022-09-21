package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TabOrientation extends StObject
@JSImport("azdata", "TabOrientation")
@js.native
object TabOrientation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TabOrientation & String] = js.native
  
  @js.native
  sealed trait Horizontal
    extends StObject
       with TabOrientation
  /* "horizontal" */ val Horizontal: typings.azdata.mod.TabOrientation.Horizontal & String = js.native
  
  @js.native
  sealed trait Vertical
    extends StObject
       with TabOrientation
  /* "vertical" */ val Vertical: typings.azdata.mod.TabOrientation.Vertical & String = js.native
}
