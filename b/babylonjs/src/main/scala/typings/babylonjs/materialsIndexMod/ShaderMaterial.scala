package typings.babylonjs.materialsIndexMod

import typings.babylonjs.anon.PartialIShaderMaterialOpt
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "ShaderMaterial")
@js.native
class ShaderMaterial protected ()
  extends typings.babylonjs.shaderMaterialMod.ShaderMaterial {
  /**
    * Instantiate a new shader material.
    * The ShaderMaterial object has the necessary methods to pass data from your scene to the Vertex and Fragment Shaders and returns a material that can be applied to any mesh.
    * This returned material effects how the mesh will look based on the code in the shaders.
    * @see https://doc.babylonjs.com/how_to/shader_material
    * @param name Define the name of the material in the scene
    * @param scene Define the scene the material belongs to
    * @param shaderPath Defines  the route to the shader code in one of three ways:
    *  * object: { vertex: "custom", fragment: "custom" }, used with Effect.ShadersStore["customVertexShader"] and Effect.ShadersStore["customFragmentShader"]
    *  * object: { vertexElement: "vertexShaderCode", fragmentElement: "fragmentShaderCode" }, used with shader code in script tags
    *  * object: { vertexSource: "vertex shader code string", fragmentSource: "fragment shader code string" } using with strings containing the shaders code
    *  * string: "./COMMON_NAME", used with external files COMMON_NAME.vertex.fx and COMMON_NAME.fragment.fx in index.html folder.
    * @param options Define the options used to create the shader
    */
  def this(name: String, scene: Scene, shaderPath: js.Any) = this()
  def this(name: String, scene: Scene, shaderPath: js.Any, options: PartialIShaderMaterialOpt) = this()
}
/* static members */
object ShaderMaterial {
  
  @JSImport("babylonjs/Materials/index", "ShaderMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ShaderMaterial from a snippet saved by the Inspector
    * @param snippetId defines the snippet to load
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a promise that will resolve to the new ShaderMaterial
    */
  @JSImport("babylonjs/Materials/index", "ShaderMaterial.CreateFromSnippetAsync")
  @js.native
  def CreateFromSnippetAsync(snippetId: String, scene: Scene): js.Promise[typings.babylonjs.shaderMaterialMod.ShaderMaterial] = js.native
  @JSImport("babylonjs/Materials/index", "ShaderMaterial.CreateFromSnippetAsync")
  @js.native
  def CreateFromSnippetAsync(snippetId: String, scene: Scene, rootUrl: String): js.Promise[typings.babylonjs.shaderMaterialMod.ShaderMaterial] = js.native
  
  /**
    * Creates a shader material from parsed shader material data
    * @param source defines the JSON represnetation of the material
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a new material
    */
  @JSImport("babylonjs/Materials/index", "ShaderMaterial.Parse")
  @js.native
  def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.shaderMaterialMod.ShaderMaterial = js.native
  
  /**
    * Creates a new ShaderMaterial from a snippet saved in a remote file
    * @param name defines the name of the ShaderMaterial to create (can be null or empty to use the one from the json data)
    * @param url defines the url to load from
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a promise that will resolve to the new ShaderMaterial
    */
  @JSImport("babylonjs/Materials/index", "ShaderMaterial.ParseFromFileAsync")
  @js.native
  def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene): js.Promise[typings.babylonjs.shaderMaterialMod.ShaderMaterial] = js.native
  @JSImport("babylonjs/Materials/index", "ShaderMaterial.ParseFromFileAsync")
  @js.native
  def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene, rootUrl: String): js.Promise[typings.babylonjs.shaderMaterialMod.ShaderMaterial] = js.native
  
  /** Define the Url to load snippets */
  @JSImport("babylonjs/Materials/index", "ShaderMaterial.SnippetUrl")
  @js.native
  def SnippetUrl: String = js.native
  @scala.inline
  def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
}
