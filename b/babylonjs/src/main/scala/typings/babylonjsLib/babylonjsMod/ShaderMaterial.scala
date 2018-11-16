package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The ShaderMaterial object has the necessary methods to pass data from your scene to the Vertex and Fragment Shaders and returns a material that can be applied to any mesh.
     *
     * This returned material effects how the mesh will look based on the code in the shaders.
     *
     * @see http://doc.babylonjs.com/how_to/shader_material
     */
@JSImport("babylonjs", "ShaderMaterial")
@js.native
class ShaderMaterial protected ()
  extends babylonjsLib.BABYLONNs.ShaderMaterial {
  /**
           * Instantiate a new shader material.
           * The ShaderMaterial object has the necessary methods to pass data from your scene to the Vertex and Fragment Shaders and returns a material that can be applied to any mesh.
           * This returned material effects how the mesh will look based on the code in the shaders.
           * @see http://doc.babylonjs.com/how_to/shader_material
           * @param name Define the name of the material in the scene
           * @param scene Define the scene the material belongs to
           * @param shaderPath Defines  the route to the shader code in one of three ways:
           *     - object - { vertex: "custom", fragment: "custom" }, used with BABYLON.Effect.ShadersStore["customVertexShader"] and BABYLON.Effect.ShadersStore["customFragmentShader"]
           *     - object - { vertexElement: "vertexShaderCode", fragmentElement: "fragmentShaderCode" }, used with shader code in <script> tags
           *     - string - "./COMMON_NAME", used with external files COMMON_NAME.vertex.fx and COMMON_NAME.fragment.fx in index.html folder.
           * @param options Define the options used to create the shader
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, shaderPath: js.Any) = this()
  /**
           * Instantiate a new shader material.
           * The ShaderMaterial object has the necessary methods to pass data from your scene to the Vertex and Fragment Shaders and returns a material that can be applied to any mesh.
           * This returned material effects how the mesh will look based on the code in the shaders.
           * @see http://doc.babylonjs.com/how_to/shader_material
           * @param name Define the name of the material in the scene
           * @param scene Define the scene the material belongs to
           * @param shaderPath Defines  the route to the shader code in one of three ways:
           *     - object - { vertex: "custom", fragment: "custom" }, used with BABYLON.Effect.ShadersStore["customVertexShader"] and BABYLON.Effect.ShadersStore["customFragmentShader"]
           *     - object - { vertexElement: "vertexShaderCode", fragmentElement: "fragmentShaderCode" }, used with shader code in <script> tags
           *     - string - "./COMMON_NAME", used with external files COMMON_NAME.vertex.fx and COMMON_NAME.fragment.fx in index.html folder.
           * @param options Define the options used to create the shader
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, shaderPath: js.Any, options: stdLib.Partial[babylonjsLib.BABYLONNs.IShaderMaterialOptions]) = this()
}

/**
     * The ShaderMaterial object has the necessary methods to pass data from your scene to the Vertex and Fragment Shaders and returns a material that can be applied to any mesh.
     *
     * This returned material effects how the mesh will look based on the code in the shaders.
     *
     * @see http://doc.babylonjs.com/how_to/shader_material
     */
@JSImport("babylonjs", "ShaderMaterial")
@js.native
object ShaderMaterial extends js.Object {
  /**
           * Creates a shader material from parsed shader material data
           * @param source defines the JSON represnetation of the material
           * @param scene defines the hosting scene
           * @param rootUrl defines the root URL to use to load textures and relative dependencies
           * @returns a new material
           */
  def Parse(source: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.ShaderMaterial = js.native
}

