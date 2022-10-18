package typings.babylonjs

import typings.babylonjs.renderingPrePassEffectConfigurationMod.PrePassEffectConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingScreenSpaceReflectionsConfigurationMod {
  
  @JSImport("babylonjs/Rendering/screenSpaceReflectionsConfiguration", "ScreenSpaceReflectionsConfiguration")
  @js.native
  open class ScreenSpaceReflectionsConfiguration ()
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
