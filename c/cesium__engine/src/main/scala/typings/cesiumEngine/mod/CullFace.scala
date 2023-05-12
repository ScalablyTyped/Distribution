package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CullFace extends StObject
@JSImport("@cesium/engine", "CullFace")
@js.native
object CullFace extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[CullFace & scala.Nothing] = js.native
  
  /**
    * Back-facing triangles are culled.
    */
  @js.native
  sealed trait BACK
    extends StObject
       with CullFace
  /* WebGLConstants.BACK */ val BACK: typings.cesiumEngine.mod.CullFace.BACK & scala.Nothing = js.native
  
  /**
    * Front-facing triangles are culled.
    */
  @js.native
  sealed trait FRONT
    extends StObject
       with CullFace
  /* WebGLConstants.FRONT */ val FRONT: typings.cesiumEngine.mod.CullFace.FRONT & scala.Nothing = js.native
  
  /**
    * Both front-facing and back-facing triangles are culled.
    */
  @js.native
  sealed trait FRONT_AND_BACK
    extends StObject
       with CullFace
  /* WebGLConstants.FRONT_AND_BACK */ val FRONT_AND_BACK: typings.cesiumEngine.mod.CullFace.FRONT_AND_BACK & scala.Nothing = js.native
}
