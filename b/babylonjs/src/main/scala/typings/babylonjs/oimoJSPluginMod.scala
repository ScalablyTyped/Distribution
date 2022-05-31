package typings.babylonjs

import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oimoJSPluginMod {
  
  @JSImport("babylonjs/Physics/Plugins/oimoJSPlugin", "OimoJSPlugin")
  @js.native
  class OimoJSPlugin ()
    extends StObject
       with IPhysicsEnginePlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, oimoInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Unit, oimoInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double, oimoInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Unit, oimoInjection: js.Any) = this()
    
    var BJSOIMO: js.Any = js.native
    
    /* private */ var _fixedTimeStep: js.Any = js.native
    
    /* private */ var _raycastResult: js.Any = js.native
    
    /* private */ var _tmpImpostorsArray: js.Any = js.native
    
    /* private */ var _tmpPositionVector: js.Any = js.native
    
    /* private */ var _useDeltaForWorldStep: js.Any = js.native
  }
}
