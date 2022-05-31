package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathConstantsMod {
  
  @JSImport("babylonjs/Maths/math.constants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constant used to define the minimal number value in Babylon.js
    * @ignorenaming
    */
  @JSImport("babylonjs/Maths/math.constants", "Epsilon")
  @js.native
  def Epsilon: Double = js.native
  inline def Epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Epsilon")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Maths/math.constants", "ToGammaSpace")
  @js.native
  val ToGammaSpace: Double = js.native
  
  @JSImport("babylonjs/Maths/math.constants", "ToLinearSpace")
  @js.native
  val ToLinearSpace: /* 2.2 */ Double = js.native
}
