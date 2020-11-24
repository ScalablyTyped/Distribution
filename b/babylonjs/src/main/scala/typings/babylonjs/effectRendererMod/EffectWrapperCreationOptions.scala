package typings.babylonjs.effectRendererMod

import typings.babylonjs.effectMod.Effect
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to create an EffectWrapper
  */
@js.native
trait EffectWrapperCreationOptions extends js.Object {
  
  /**
    * Attributes to use in the shader
    */
  var attributeNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Defines to use in the shader
    */
  var defines: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Engine to use to create the effect
    */
  var engine: ThinEngine = js.native
  
  /**
    * Fragment shader for the effect
    */
  var fragmentShader: String = js.native
  
  /**
    * The friendly name of the effect displayed in Spector.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Callback when effect is compiled
    */
  var onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ Effect, Unit]]] = js.native
  
  /**
    * Texture sampler names to use in the shader
    */
  var samplerNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Uniforms to use in the shader
    */
  var uniformNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Use the shader store instead of direct source code
    */
  var useShaderStore: js.UndefOr[Boolean] = js.native
  
  /**
    * Vertex shader for the effect
    */
  var vertexShader: js.UndefOr[String] = js.native
}
object EffectWrapperCreationOptions {
  
  @scala.inline
  def apply(engine: ThinEngine, fragmentShader: String): EffectWrapperCreationOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], fragmentShader = fragmentShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectWrapperCreationOptions]
  }
  
  @scala.inline
  implicit class EffectWrapperCreationOptionsOps[Self <: EffectWrapperCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setEngine(value: ThinEngine): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentShader(value: String): Self = this.set("fragmentShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNamesVarargs(value: String*): Self = this.set("attributeNames", js.Array(value :_*))
    
    @scala.inline
    def setAttributeNames(value: js.Array[String]): Self = this.set("attributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeNames: Self = this.set("attributeNames", js.undefined)
    
    @scala.inline
    def setDefinesVarargs(value: String*): Self = this.set("defines", js.Array(value :_*))
    
    @scala.inline
    def setDefines(value: js.Array[String]): Self = this.set("defines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefines: Self = this.set("defines", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnCompiled(value: /* effect */ Effect => Unit): Self = this.set("onCompiled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompiled: Self = this.set("onCompiled", js.undefined)
    
    @scala.inline
    def setOnCompiledNull: Self = this.set("onCompiled", null)
    
    @scala.inline
    def setSamplerNamesVarargs(value: String*): Self = this.set("samplerNames", js.Array(value :_*))
    
    @scala.inline
    def setSamplerNames(value: js.Array[String]): Self = this.set("samplerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplerNames: Self = this.set("samplerNames", js.undefined)
    
    @scala.inline
    def setUniformNamesVarargs(value: String*): Self = this.set("uniformNames", js.Array(value :_*))
    
    @scala.inline
    def setUniformNames(value: js.Array[String]): Self = this.set("uniformNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniformNames: Self = this.set("uniformNames", js.undefined)
    
    @scala.inline
    def setUseShaderStore(value: Boolean): Self = this.set("useShaderStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseShaderStore: Self = this.set("useShaderStore", js.undefined)
    
    @scala.inline
    def setVertexShader(value: String): Self = this.set("vertexShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexShader: Self = this.set("vertexShader", js.undefined)
  }
}
