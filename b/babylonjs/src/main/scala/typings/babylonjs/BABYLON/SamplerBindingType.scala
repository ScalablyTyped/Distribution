package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SamplerBindingType extends StObject
@JSGlobal("BABYLON.SamplerBindingType")
@js.native
object SamplerBindingType extends StObject {
  
  @js.native
  sealed trait Comparison
    extends StObject
       with SamplerBindingType
  
  @js.native
  sealed trait Filtering
    extends StObject
       with SamplerBindingType
  
  @js.native
  sealed trait NonFiltering
    extends StObject
       with SamplerBindingType
}
