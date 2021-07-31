package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CornerType extends StObject
@JSImport("cesium", "CornerType")
@js.native
object CornerType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CornerType & Double] = js.native
  
  @js.native
  sealed trait BEVELED
    extends StObject
       with CornerType
  /* 2 */ val BEVELED: typings.cesium.mod.CornerType.BEVELED & Double = js.native
  
  @js.native
  sealed trait MITERED
    extends StObject
       with CornerType
  /* 1 */ val MITERED: typings.cesium.mod.CornerType.MITERED & Double = js.native
  
  @js.native
  sealed trait ROUNDED
    extends StObject
       with CornerType
  /* 0 */ val ROUNDED: typings.cesium.mod.CornerType.ROUNDED & Double = js.native
}
