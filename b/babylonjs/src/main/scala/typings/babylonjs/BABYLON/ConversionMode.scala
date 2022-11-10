package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConversionMode extends StObject
@JSGlobal("BABYLON.ConversionMode")
@js.native
object ConversionMode extends StObject {
  
  @js.native
  sealed trait None
    extends StObject
       with ConversionMode
  
  @js.native
  sealed trait ToGammaSpace
    extends StObject
       with ConversionMode
  
  @js.native
  sealed trait ToLinearSpace
    extends StObject
       with ConversionMode
}
