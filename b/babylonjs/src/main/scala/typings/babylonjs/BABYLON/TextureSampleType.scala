package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureSampleType extends StObject
@JSGlobal("BABYLON.TextureSampleType")
@js.native
object TextureSampleType extends StObject {
  
  @js.native
  sealed trait Depth
    extends StObject
       with TextureSampleType
  
  @js.native
  sealed trait Float
    extends StObject
       with TextureSampleType
  
  @js.native
  sealed trait Sint
    extends StObject
       with TextureSampleType
  
  @js.native
  sealed trait Uint
    extends StObject
       with TextureSampleType
  
  @js.native
  sealed trait UnfilterableFloat
    extends StObject
       with TextureSampleType
}
