package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendFactor extends StObject
@JSGlobal("BABYLON.BlendFactor")
@js.native
object BlendFactor extends StObject {
  
  @js.native
  sealed trait Constant
    extends StObject
       with BlendFactor
  
  @js.native
  sealed trait Dst
    extends StObject
       with BlendFactor
  
  @js.native
  sealed trait DstAlpha
    extends StObject
       with BlendFactor
  
  @js.native
  sealed trait One
    extends StObject
       with BlendFactor
  
  @js.native
  sealed trait OneMinusConstant
    extends StObject
       with BlendFactor
  
  @js.native
  sealed trait OneMinusDst
    extends StObject
       with BlendFactor
  
  @js.native
  sealed trait OneMinusDstAlpha
    extends StObject
       with BlendFactor
  
  @js.native
  sealed trait OneMinusSrc
    extends StObject
       with BlendFactor
  
  @js.native
  sealed trait OneMinusSrcAlpha
    extends StObject
       with BlendFactor
  
  @js.native
  sealed trait Src
    extends StObject
       with BlendFactor
  
  @js.native
  sealed trait SrcAlpha
    extends StObject
       with BlendFactor
  
  @js.native
  sealed trait SrcAlphaSaturated
    extends StObject
       with BlendFactor
  
  @js.native
  sealed trait Zero
    extends StObject
       with BlendFactor
}
