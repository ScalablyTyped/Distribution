package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrePassEffectConfiguration extends StObject {
  
  /**
    * Creates the associated post process
    */
  var createPostProcess: js.UndefOr[js.Function0[PostProcess]] = js.native
  
  /**
    * Disposes the effect configuration
    */
  var dispose: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Is the effect enabled
    */
  var enabled: Boolean = js.native
  
  /**
    * Name of the effect
    */
  var name: String = js.native
  
  /**
    * Post process to attach for this effect
    */
  var postProcess: js.UndefOr[PostProcess] = js.native
  
  /**
    * Textures required in the MRT
    */
  var texturesRequired: js.Array[Double] = js.native
}
object PrePassEffectConfiguration {
  
  @scala.inline
  def apply(enabled: Boolean, name: String, texturesRequired: js.Array[Double]): PrePassEffectConfiguration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], texturesRequired = texturesRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrePassEffectConfiguration]
  }
  
  @scala.inline
  implicit class PrePassEffectConfigurationMutableBuilder[Self <: PrePassEffectConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatePostProcess(value: () => PostProcess): Self = StObject.set(x, "createPostProcess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreatePostProcessUndefined: Self = StObject.set(x, "createPostProcess", js.undefined)
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostProcess(value: PostProcess): Self = StObject.set(x, "postProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
    
    @scala.inline
    def setTexturesRequired(value: js.Array[Double]): Self = StObject.set(x, "texturesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexturesRequiredVarargs(value: Double*): Self = StObject.set(x, "texturesRequired", js.Array(value :_*))
  }
}
