package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CloudType extends StObject
@JSImport("cesium", "CloudType")
@js.native
object CloudType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloudType & Double] = js.native
  
  /**
    * Cumulus cloud.
    */
  @js.native
  sealed trait CUMULUS
    extends StObject
       with CloudType
  /* 0 */ val CUMULUS: typings.cesium.mod.CloudType.CUMULUS & Double = js.native
}
