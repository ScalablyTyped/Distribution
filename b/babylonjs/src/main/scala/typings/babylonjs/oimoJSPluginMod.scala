package typings.babylonjs

import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oimoJSPluginMod {
  
  @JSImport("babylonjs/Physics/Plugins/oimoJSPlugin", "OimoJSPlugin")
  @js.native
  open class OimoJSPlugin ()
    extends StObject
       with IPhysicsEnginePlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, oimoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Unit, oimoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double, oimoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Unit, oimoInjection: Any) = this()
    
    var BJSOIMO: Any = js.native
    
    /* private */ var _fixedTimeStep: Any = js.native
    
    /* private */ var _raycastResult: Any = js.native
    
    /* private */ var _tmpImpostorsArray: Any = js.native
    
    /* private */ var _tmpPositionVector: Any = js.native
    
    /* private */ var _useDeltaForWorldStep: Any = js.native
  }
}
