package typings.blackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emitterStateMod {
  
  object EmitterState {
    
    @JSImport("black-engine/particles/EmitterState", "EmitterState.EMITTING")
    @js.native
    val EMITTING: Double = js.native
    
    @JSImport("black-engine/particles/EmitterState", "EmitterState.FINISHED")
    @js.native
    val FINISHED: Double = js.native
    
    @JSImport("black-engine/particles/EmitterState", "EmitterState.PAUSED")
    @js.native
    val PAUSED: Double = js.native
    
    @JSImport("black-engine/particles/EmitterState", "EmitterState.PENDING")
    @js.native
    val PENDING: Double = js.native
  }
  type EmitterState = Double
}
