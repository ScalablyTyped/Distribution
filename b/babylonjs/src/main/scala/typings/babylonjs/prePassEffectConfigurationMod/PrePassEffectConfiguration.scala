package typings.babylonjs.prePassEffectConfigurationMod

import typings.babylonjs.postProcessMod.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrePassEffectConfiguration extends js.Object {
  
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
  implicit class PrePassEffectConfigurationOps[Self <: PrePassEffectConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexturesRequiredVarargs(value: Double*): Self = this.set("texturesRequired", js.Array(value :_*))
    
    @scala.inline
    def setTexturesRequired(value: js.Array[Double]): Self = this.set("texturesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatePostProcess(value: () => PostProcess): Self = this.set("createPostProcess", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCreatePostProcess: Self = this.set("createPostProcess", js.undefined)
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
    
    @scala.inline
    def setPostProcess(value: PostProcess): Self = this.set("postProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostProcess: Self = this.set("postProcess", js.undefined)
  }
}
