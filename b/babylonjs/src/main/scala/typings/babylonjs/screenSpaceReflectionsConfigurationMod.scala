package typings.babylonjs

import typings.babylonjs.prePassEffectConfigurationMod.PrePassEffectConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenSpaceReflectionsConfigurationMod {
  
  @JSImport("babylonjs/Rendering/screenSpaceReflectionsConfiguration", "ScreenSpaceReflectionsConfiguration")
  @js.native
  class ScreenSpaceReflectionsConfiguration ()
    extends StObject
       with PrePassEffectConfiguration {
    
    /**
      * Is the effect enabled
      */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /**
      * Name of the effect
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Textures required in the MRT
      */
    /* CompleteClass */
    var texturesRequired: js.Array[Double] = js.native
  }
}
