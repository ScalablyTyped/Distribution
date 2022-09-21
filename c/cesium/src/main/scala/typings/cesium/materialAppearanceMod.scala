package typings.cesium

import typings.cesium.anon.FaceForward
import typings.cesium.mod.MaterialAppearance
import typings.cesium.mod.MaterialAppearance.MaterialSupportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialAppearanceMod {
  
  @JSImport("cesium/Source/Scene/MaterialAppearance", JSImport.Default)
  @js.native
  open class default () extends MaterialAppearance {
    def this(options: FaceForward) = this()
  }
  object default {
    
    /**
      * Determines the type of {@link Material} that is supported by a
      * {@link MaterialAppearance} instance.  This is a trade-off between
      * flexibility (a wide array of materials) and memory/performance
      * (required vertex format and GLSL shader complexity.
      */
    object MaterialSupport {
      
      /**
        * All materials, including those that work in tangent space, are supported.
        * This requires <code>position</code>, <code>normal</code>, <code>st</code>,
        * <code>tangent</code>, and <code>bitangent</code> vertex attributes.
        */
      @JSImport("cesium/Source/Scene/MaterialAppearance", "default.MaterialSupport.ALL")
      @js.native
      val ALL: MaterialSupportType = js.native
      
      /**
        * Only basic materials, which require just <code>position</code> and
        * <code>normal</code> vertex attributes, are supported.
        */
      @JSImport("cesium/Source/Scene/MaterialAppearance", "default.MaterialSupport.BASIC")
      @js.native
      val BASIC: MaterialSupportType = js.native
      
      /**
        * Materials with textures, which require <code>position</code>,
        * <code>normal</code>, and <code>st</code> vertex attributes,
        * are supported.  The vast majority of materials fall into this category.
        */
      @JSImport("cesium/Source/Scene/MaterialAppearance", "default.MaterialSupport.TEXTURED")
      @js.native
      val TEXTURED: MaterialSupportType = js.native
    }
  }
}
