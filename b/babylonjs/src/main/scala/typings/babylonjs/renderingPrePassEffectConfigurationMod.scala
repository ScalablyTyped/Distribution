package typings.babylonjs

import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingPrePassEffectConfigurationMod {
  
  trait PrePassEffectConfiguration extends StObject {
    
    /**
      * Creates the associated post process
      */
    var createPostProcess: js.UndefOr[js.Function0[PostProcess]] = js.undefined
    
    /**
      * Disposes the effect configuration
      */
    var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Is the effect enabled
      */
    var enabled: Boolean
    
    /**
      * Name of the effect
      */
    var name: String
    
    /**
      * Does the output of this prepass need to go through imageprocessing
      */
    var needsImageProcessing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Post process to attach for this effect
      */
    var postProcess: js.UndefOr[PostProcess] = js.undefined
    
    /**
      * Textures required in the MRT
      */
    var texturesRequired: js.Array[Double]
  }
  object PrePassEffectConfiguration {
    
    inline def apply(enabled: Boolean, name: String, texturesRequired: js.Array[Double]): PrePassEffectConfiguration = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], texturesRequired = texturesRequired.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrePassEffectConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrePassEffectConfiguration] (val x: Self) extends AnyVal {
      
      inline def setCreatePostProcess(value: () => PostProcess): Self = StObject.set(x, "createPostProcess", js.Any.fromFunction0(value))
      
      inline def setCreatePostProcessUndefined: Self = StObject.set(x, "createPostProcess", js.undefined)
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNeedsImageProcessing(value: Boolean): Self = StObject.set(x, "needsImageProcessing", value.asInstanceOf[js.Any])
      
      inline def setNeedsImageProcessingUndefined: Self = StObject.set(x, "needsImageProcessing", js.undefined)
      
      inline def setPostProcess(value: PostProcess): Self = StObject.set(x, "postProcess", value.asInstanceOf[js.Any])
      
      inline def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
      
      inline def setTexturesRequired(value: js.Array[Double]): Self = StObject.set(x, "texturesRequired", value.asInstanceOf[js.Any])
      
      inline def setTexturesRequiredVarargs(value: Double*): Self = StObject.set(x, "texturesRequired", js.Array(value*))
    }
  }
}
