package typings.babylonjs

import typings.babylonjs.anon.PartialIShaderMaterialOpt
import typings.babylonjs.buffersStorageBufferMod.StorageBuffer
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsPushMaterialMod.PushMaterial
import typings.babylonjs.materialsShaderLanguageMod.ShaderLanguage
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.materialsTexturesExternalTextureMod.ExternalTexture
import typings.babylonjs.materialsTexturesTextureSamplerMod.TextureSampler
import typings.babylonjs.materialsUniformBufferMod.UniformBuffer
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.mathsMathDotvectorMod.Vector4
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsShaderMaterialMod {
  
  @JSImport("babylonjs/Materials/shaderMaterial", "ShaderMaterial")
  @js.native
  open class ShaderMaterial protected () extends PushMaterial {
    /**
      * Instantiate a new shader material.
      * The ShaderMaterial object has the necessary methods to pass data from your scene to the Vertex and Fragment Shaders and returns a material that can be applied to any mesh.
      * This returned material effects how the mesh will look based on the code in the shaders.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/shaders/shaderMaterial
      * @param name Define the name of the material in the scene
      * @param scene Define the scene the material belongs to
      * @param shaderPath Defines  the route to the shader code in one of three ways:
      *  * object: { vertex: "custom", fragment: "custom" }, used with Effect.ShadersStore["customVertexShader"] and Effect.ShadersStore["customFragmentShader"]
      *  * object: { vertexElement: "vertexShaderCode", fragmentElement: "fragmentShaderCode" }, used with shader code in script tags
      *  * object: { vertexSource: "vertex shader code string", fragmentSource: "fragment shader code string" } using with strings containing the shaders code
      *  * string: "./COMMON_NAME", used with external files COMMON_NAME.vertex.fx and COMMON_NAME.fragment.fx in index.html folder.
      * @param options Define the options used to create the shader
      * @param storeEffectOnSubMeshes true to store effect on submeshes, false to store the effect directly in the material class.
      */
    def this(name: String, scene: Scene, shaderPath: Any) = this()
    def this(name: String, scene: Scene, shaderPath: Any, options: PartialIShaderMaterialOpt) = this()
    def this(name: String, scene: Scene, shaderPath: Any, options: Unit, storeEffectOnSubMeshes: Boolean) = this()
    def this(
      name: String,
      scene: Scene,
      shaderPath: Any,
      options: PartialIShaderMaterialOpt,
      storeEffectOnSubMeshes: Boolean
    ) = this()
    
    /* private */ var _cachedWorldViewMatrix: Any = js.native
    
    /* private */ var _cachedWorldViewProjectionMatrix: Any = js.native
    
    /* private */ var _checkUniform: Any = js.native
    
    /* private */ var _colors3: Any = js.native
    
    /* private */ var _colors3Arrays: Any = js.native
    
    /* private */ var _colors4: Any = js.native
    
    /* private */ var _colors4Arrays: Any = js.native
    
    /* private */ var _externalTextures: Any = js.native
    
    /* private */ var _floats: Any = js.native
    
    /* private */ var _floatsArrays: Any = js.native
    
    /* private */ var _ints: Any = js.native
    
    /* private */ var _matrices: Any = js.native
    
    /* private */ var _matrices2x2: Any = js.native
    
    /* private */ var _matrices3x3: Any = js.native
    
    /* private */ var _matrixArrays: Any = js.native
    
    /* private */ var _multiview: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _quaternions: Any = js.native
    
    /* private */ var _quaternionsArrays: Any = js.native
    
    /* private */ var _shaderPath: Any = js.native
    
    /* private */ var _storageBuffers: Any = js.native
    
    /* private */ var _textureArrays: Any = js.native
    
    /* private */ var _textureSamplers: Any = js.native
    
    /* private */ var _textures: Any = js.native
    
    /* private */ var _uints: Any = js.native
    
    /* private */ var _uniformBuffers: Any = js.native
    
    /* private */ var _vectors2: Any = js.native
    
    /* private */ var _vectors2Arrays: Any = js.native
    
    /* private */ var _vectors3: Any = js.native
    
    /* private */ var _vectors3Arrays: Any = js.native
    
    /* private */ var _vectors4: Any = js.native
    
    /* private */ var _vectors4Arrays: Any = js.native
    
    def bind(world: Matrix, mesh: Unit, effectOverride: Unit, subMesh: SubMesh): Unit = js.native
    def bind(world: Matrix, mesh: Unit, effectOverride: Nullable[Effect]): Unit = js.native
    def bind(world: Matrix, mesh: Unit, effectOverride: Nullable[Effect], subMesh: SubMesh): Unit = js.native
    def bind(world: Matrix, mesh: Mesh, effectOverride: Unit, subMesh: SubMesh): Unit = js.native
    def bind(world: Matrix, mesh: Mesh, effectOverride: Nullable[Effect]): Unit = js.native
    def bind(world: Matrix, mesh: Mesh, effectOverride: Nullable[Effect], subMesh: SubMesh): Unit = js.native
    
    def bindOnlyWorldMatrix(world: Matrix, effectOverride: Nullable[Effect]): Unit = js.native
    
    def isReady(mesh: Unit, useInstances: Boolean, subMesh: SubMesh): Boolean = js.native
    def isReady(mesh: Unit, useInstances: Unit, subMesh: SubMesh): Boolean = js.native
    def isReady(mesh: AbstractMesh, useInstances: Boolean, subMesh: SubMesh): Boolean = js.native
    def isReady(mesh: AbstractMesh, useInstances: Unit, subMesh: SubMesh): Boolean = js.native
    
    /**
      * Gets the options used to compile the shader.
      * They can be modified to trigger a new compilation
      */
    def options: IShaderMaterialOptions = js.native
    
    /**
      * Set a vec2 array in the shader from a number array.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setArray2(name: String, value: js.Array[Double]): ShaderMaterial = js.native
    
    /**
      * Set a vec3 array in the shader from a number array.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setArray3(name: String, value: js.Array[Double]): ShaderMaterial = js.native
    
    /**
      * Set a vec4 array in the shader from a number array.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setArray4(name: String, value: js.Array[Double]): ShaderMaterial = js.native
    
    /**
      * Set a vec3 in the shader from a Color3.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setColor3(name: String, value: Color3): ShaderMaterial = js.native
    
    /**
      * Set a vec3 array in the shader from a Color3 array.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setColor3Array(name: String, value: js.Array[Color3]): ShaderMaterial = js.native
    
    /**
      * Set a vec4 in the shader from a Color4.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setColor4(name: String, value: Color4): ShaderMaterial = js.native
    
    /**
      * Set a vec4 array in the shader from a Color4 array.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setColor4Array(name: String, value: js.Array[Color4]): ShaderMaterial = js.native
    
    /**
      * Set an internal texture in the shader.
      * @param name Define the name of the uniform samplers as defined in the shader
      * @param texture Define the texture to bind to this sampler
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setExternalTexture(name: String, texture: ExternalTexture): ShaderMaterial = js.native
    
    /**
      * Set a float in the shader.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setFloat(name: String, value: Double): ShaderMaterial = js.native
    
    /**
      * Set an array of floats in the shader.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setFloats(name: String, value: js.Array[Double]): ShaderMaterial = js.native
    
    /**
      * Set a int in the shader.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setInt(name: String, value: Double): ShaderMaterial = js.native
    
    /**
      * Set a float32Array in the shader from a matrix array.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setMatrices(name: String, value: js.Array[Matrix]): ShaderMaterial = js.native
    
    /**
      * Set a mat4 in the shader from a Matrix.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setMatrix(name: String, value: Matrix): ShaderMaterial = js.native
    
    def setMatrix2x2(name: String, value: js.Array[Double]): ShaderMaterial = js.native
    /**
      * Set a mat2 in the shader from a Float32Array.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setMatrix2x2(name: String, value: js.typedarray.Float32Array): ShaderMaterial = js.native
    
    def setMatrix3x3(name: String, value: js.Array[Double]): ShaderMaterial = js.native
    /**
      * Set a mat3 in the shader from a Float32Array.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setMatrix3x3(name: String, value: js.typedarray.Float32Array): ShaderMaterial = js.native
    
    /**
      * Set a vec4 in the shader from a Quaternion.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setQuaternion(name: String, value: Quaternion): ShaderMaterial = js.native
    
    /**
      * Set a vec4 array in the shader from a Quaternion array.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setQuaternionArray(name: String, value: js.Array[Quaternion]): ShaderMaterial = js.native
    
    /**
      * Set a storage buffer in the shader
      * @param name Define the name of the storage buffer as defined in the shader
      * @param buffer Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setStorageBuffer(name: String, buffer: StorageBuffer): ShaderMaterial = js.native
    
    /**
      * Set a texture in the shader.
      * @param name Define the name of the uniform samplers as defined in the shader
      * @param texture Define the texture to bind to this sampler
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setTexture(name: String, texture: BaseTexture): ShaderMaterial = js.native
    
    /**
      * Set a texture array in the shader.
      * @param name Define the name of the uniform sampler array as defined in the shader
      * @param textures Define the list of textures to bind to this sampler
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setTextureArray(name: String, textures: js.Array[BaseTexture]): ShaderMaterial = js.native
    
    /**
      * Set a texture sampler in the shader
      * @param name Define the name of the uniform as defined in the shader
      * @param sampler Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setTextureSampler(name: String, sampler: TextureSampler): ShaderMaterial = js.native
    
    /**
      * Set a unsigned int in the shader.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @return the material itself allowing "fluent" like uniform updates
      */
    def setUInt(name: String, value: Double): ShaderMaterial = js.native
    
    /**
      * Set a uniform buffer in the shader
      * @param name Define the name of the uniform as defined in the shader
      * @param buffer Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setUniformBuffer(name: String, buffer: UniformBuffer): ShaderMaterial = js.native
    
    /**
      * Set a vec2 in the shader from a Vector2.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setVector2(name: String, value: Vector2): ShaderMaterial = js.native
    
    /**
      * Set a vec3 in the shader from a Vector3.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setVector3(name: String, value: Vector3): ShaderMaterial = js.native
    
    /**
      * Set a vec4 in the shader from a Vector4.
      * @param name Define the name of the uniform as defined in the shader
      * @param value Define the value to give to the uniform
      * @returns the material itself allowing "fluent" like uniform updates
      */
    def setVector4(name: String, value: Vector4): ShaderMaterial = js.native
    
    /**
      * Gets the shader path used to define the shader code
      * It can be modified to trigger a new compilation
      */
    def shaderPath: Any = js.native
    /**
      * Sets the shader path used to define the shader code
      * It can be modified to trigger a new compilation
      */
    def shaderPath_=(shaderPath: Any): Unit = js.native
    
    /** Snippet ID if the material was created from the snippet server */
    var snippetId: String = js.native
  }
  /* static members */
  object ShaderMaterial {
    
    @JSImport("babylonjs/Materials/shaderMaterial", "ShaderMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a ShaderMaterial from a snippet saved by the Inspector
      * @deprecated Please use ParseFromSnippetAsync instead
      * @param snippetId defines the snippet to load
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a promise that will resolve to the new ShaderMaterial
      */
    @JSImport("babylonjs/Materials/shaderMaterial", "ShaderMaterial.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShaderMaterial.ParseFromSnippetAsync */ Any = js.native
    inline def CreateFromSnippetAsync_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShaderMaterial.ParseFromSnippetAsync */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateFromSnippetAsync")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a shader material from parsed shader material data
      * @param source defines the JSON representation of the material
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a new material
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): ShaderMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[ShaderMaterial]
    
    /**
      * Creates a new ShaderMaterial from a snippet saved in a remote file
      * @param name defines the name of the ShaderMaterial to create (can be null or empty to use the one from the json data)
      * @param url defines the url to load from
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a promise that will resolve to the new ShaderMaterial
      */
    inline def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene): js.Promise[ShaderMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ShaderMaterial]]
    inline def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene, rootUrl: String): js.Promise[ShaderMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ShaderMaterial]]
    
    /**
      * Creates a ShaderMaterial from a snippet saved by the Inspector
      * @param snippetId defines the snippet to load
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a promise that will resolve to the new ShaderMaterial
      */
    inline def ParseFromSnippetAsync(snippetId: String, scene: Scene): js.Promise[ShaderMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ShaderMaterial]]
    inline def ParseFromSnippetAsync(snippetId: String, scene: Scene, rootUrl: String): js.Promise[ShaderMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ShaderMaterial]]
    
    /** Define the Url to load snippets */
    @JSImport("babylonjs/Materials/shaderMaterial", "ShaderMaterial.SnippetUrl")
    @js.native
    def SnippetUrl: String = js.native
    inline def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
  }
  
  trait IShaderMaterialOptions extends StObject {
    
    /**
      * The list of attribute names used in the shader
      */
    var attributes: js.Array[String]
    
    /**
      * The list of defines used in the shader
      */
    var defines: js.Array[String]
    
    /**
      * The list of external texture names used in the shader
      */
    var externalTextures: js.Array[String]
    
    /**
      * Does the material work in alpha blend mode
      */
    var needAlphaBlending: Boolean
    
    /**
      * Does the material work in alpha test mode
      */
    var needAlphaTesting: Boolean
    
    /**
      * The list of sampler object names used in the shader
      */
    var samplerObjects: js.Array[String]
    
    /**
      * The list of sampler (texture) names used in the shader
      */
    var samplers: js.Array[String]
    
    /**
      * The language the shader is written in (default: GLSL)
      */
    var shaderLanguage: js.UndefOr[ShaderLanguage] = js.undefined
    
    /**
      * The list of storage buffer names used in the shader
      */
    var storageBuffers: js.Array[String]
    
    /**
      * The list of UBO names used in the shader
      */
    var uniformBuffers: js.Array[String]
    
    /**
      * The list of uniform names used in the shader
      */
    var uniforms: js.Array[String]
    
    /**
      * Defines if clip planes have to be turned on: true to turn them on, false to turn them off and null to turn them on/off depending on the scene configuration (scene.clipPlaneX)
      */
    var useClipPlane: Nullable[Boolean]
  }
  object IShaderMaterialOptions {
    
    inline def apply(
      attributes: js.Array[String],
      defines: js.Array[String],
      externalTextures: js.Array[String],
      needAlphaBlending: Boolean,
      needAlphaTesting: Boolean,
      samplerObjects: js.Array[String],
      samplers: js.Array[String],
      storageBuffers: js.Array[String],
      uniformBuffers: js.Array[String],
      uniforms: js.Array[String]
    ): IShaderMaterialOptions = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], externalTextures = externalTextures.asInstanceOf[js.Any], needAlphaBlending = needAlphaBlending.asInstanceOf[js.Any], needAlphaTesting = needAlphaTesting.asInstanceOf[js.Any], samplerObjects = samplerObjects.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], storageBuffers = storageBuffers.asInstanceOf[js.Any], uniformBuffers = uniformBuffers.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], useClipPlane = null)
      __obj.asInstanceOf[IShaderMaterialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IShaderMaterialOptions] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value*))
      
      inline def setExternalTextures(value: js.Array[String]): Self = StObject.set(x, "externalTextures", value.asInstanceOf[js.Any])
      
      inline def setExternalTexturesVarargs(value: String*): Self = StObject.set(x, "externalTextures", js.Array(value*))
      
      inline def setNeedAlphaBlending(value: Boolean): Self = StObject.set(x, "needAlphaBlending", value.asInstanceOf[js.Any])
      
      inline def setNeedAlphaTesting(value: Boolean): Self = StObject.set(x, "needAlphaTesting", value.asInstanceOf[js.Any])
      
      inline def setSamplerObjects(value: js.Array[String]): Self = StObject.set(x, "samplerObjects", value.asInstanceOf[js.Any])
      
      inline def setSamplerObjectsVarargs(value: String*): Self = StObject.set(x, "samplerObjects", js.Array(value*))
      
      inline def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
      
      inline def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value*))
      
      inline def setShaderLanguage(value: ShaderLanguage): Self = StObject.set(x, "shaderLanguage", value.asInstanceOf[js.Any])
      
      inline def setShaderLanguageUndefined: Self = StObject.set(x, "shaderLanguage", js.undefined)
      
      inline def setStorageBuffers(value: js.Array[String]): Self = StObject.set(x, "storageBuffers", value.asInstanceOf[js.Any])
      
      inline def setStorageBuffersVarargs(value: String*): Self = StObject.set(x, "storageBuffers", js.Array(value*))
      
      inline def setUniformBuffers(value: js.Array[String]): Self = StObject.set(x, "uniformBuffers", value.asInstanceOf[js.Any])
      
      inline def setUniformBuffersVarargs(value: String*): Self = StObject.set(x, "uniformBuffers", js.Array(value*))
      
      inline def setUniforms(value: js.Array[String]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsVarargs(value: String*): Self = StObject.set(x, "uniforms", js.Array(value*))
      
      inline def setUseClipPlane(value: Nullable[Boolean]): Self = StObject.set(x, "useClipPlane", value.asInstanceOf[js.Any])
      
      inline def setUseClipPlaneNull: Self = StObject.set(x, "useClipPlane", null)
    }
  }
}
