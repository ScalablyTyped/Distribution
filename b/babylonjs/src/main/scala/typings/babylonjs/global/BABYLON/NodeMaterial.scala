package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.PartialINodeMaterialOptio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NodeMaterial")
@js.native
open class NodeMaterial protected ()
  extends StObject
     with typings.babylonjs.BABYLON.NodeMaterial {
  /**
    * Create a new node based material
    * @param name defines the material name
    * @param scene defines the hosting scene
    * @param options defines creation option
    */
  def this(name: String) = this()
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(name: String, scene: Unit, options: PartialINodeMaterialOptio) = this()
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene, options: PartialINodeMaterialOptio) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
  
  /**
    * Gets or sets the active clipplane 1
    */
  /* CompleteClass */
  var clipPlane: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 2
    */
  /* CompleteClass */
  var clipPlane2: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 3
    */
  /* CompleteClass */
  var clipPlane3: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 4
    */
  /* CompleteClass */
  var clipPlane4: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 5
    */
  /* CompleteClass */
  var clipPlane5: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 6
    */
  /* CompleteClass */
  var clipPlane6: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
}
/* static members */
object NodeMaterial {
  
  @JSGlobal("BABYLON.NodeMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new node material set to default basic configuration
    * @param name defines the name of the material
    * @param scene defines the hosting scene
    * @returns a new NodeMaterial
    */
  inline def CreateDefault(name: String): typings.babylonjs.BABYLON.NodeMaterial = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDefault")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.NodeMaterial]
  inline def CreateDefault(name: String, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.NodeMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDefault")(name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.NodeMaterial]
  
  /** Define the Url to load node editor script */
  @JSGlobal("BABYLON.NodeMaterial.EditorURL")
  @js.native
  def EditorURL: String = js.native
  inline def EditorURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EditorURL")(x.asInstanceOf[js.Any])
  
  /** Gets or sets a boolean indicating that node materials should not deserialize textures from json / snippet content */
  @JSGlobal("BABYLON.NodeMaterial.IgnoreTexturesAtLoadTime")
  @js.native
  def IgnoreTexturesAtLoadTime: Boolean = js.native
  inline def IgnoreTexturesAtLoadTime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IgnoreTexturesAtLoadTime")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a node material from parsed material data
    * @param source defines the JSON representation of the material
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a new node material
    */
  inline def Parse(source: Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.NodeMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.NodeMaterial]
  inline def Parse(source: Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.NodeMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.NodeMaterial]
  
  /**
    * Creates a node material from a snippet saved in a remote file
    * @param name defines the name of the material to create
    * @param url defines the url to load from
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL for nested url in the node material
    * @param skipBuild defines whether to build the node material
    * @param targetMaterial defines a material to use instead of creating a new one
    * @returns a promise that will resolve to the new node material
    */
  inline def ParseFromFileAsync(name: String, url: String, scene: typings.babylonjs.BABYLON.Scene): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromFileAsync(name: String, url: String, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromFileAsync(
    name: String,
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    skipBuild: Boolean
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromFileAsync(
    name: String,
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    skipBuild: Boolean,
    targetMaterial: typings.babylonjs.BABYLON.NodeMaterial
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any], targetMaterial.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromFileAsync(
    name: String,
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    skipBuild: Unit,
    targetMaterial: typings.babylonjs.BABYLON.NodeMaterial
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any], targetMaterial.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromFileAsync(
    name: String,
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: Unit,
    skipBuild: Boolean
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromFileAsync(
    name: String,
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: Unit,
    skipBuild: Boolean,
    targetMaterial: typings.babylonjs.BABYLON.NodeMaterial
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any], targetMaterial.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromFileAsync(
    name: String,
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: Unit,
    skipBuild: Unit,
    targetMaterial: typings.babylonjs.BABYLON.NodeMaterial
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any], targetMaterial.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  
  /**
    * Creates a node material from a snippet saved by the node material editor
    * @param snippetId defines the snippet to load
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @param nodeMaterial defines a node material to update (instead of creating a new one)
    * @param skipBuild defines whether to build the node material
    * @returns a promise that will resolve to the new node material
    */
  inline def ParseFromSnippetAsync(snippetId: String): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(snippetId: String, scene: Unit, rootUrl: String): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(snippetId: String, scene: Unit, rootUrl: String, nodeMaterial: Unit, skipBuild: Boolean): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], nodeMaterial.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: Unit,
    rootUrl: String,
    nodeMaterial: typings.babylonjs.BABYLON.NodeMaterial
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], nodeMaterial.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: Unit,
    rootUrl: String,
    nodeMaterial: typings.babylonjs.BABYLON.NodeMaterial,
    skipBuild: Boolean
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], nodeMaterial.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(snippetId: String, scene: Unit, rootUrl: Unit, nodeMaterial: Unit, skipBuild: Boolean): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], nodeMaterial.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: Unit,
    rootUrl: Unit,
    nodeMaterial: typings.babylonjs.BABYLON.NodeMaterial
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], nodeMaterial.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: Unit,
    rootUrl: Unit,
    nodeMaterial: typings.babylonjs.BABYLON.NodeMaterial,
    skipBuild: Boolean
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], nodeMaterial.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(snippetId: String, scene: typings.babylonjs.BABYLON.Scene): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(snippetId: String, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    nodeMaterial: Unit,
    skipBuild: Boolean
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], nodeMaterial.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    nodeMaterial: typings.babylonjs.BABYLON.NodeMaterial
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], nodeMaterial.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    nodeMaterial: typings.babylonjs.BABYLON.NodeMaterial,
    skipBuild: Boolean
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], nodeMaterial.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: Unit,
    nodeMaterial: Unit,
    skipBuild: Boolean
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], nodeMaterial.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: Unit,
    nodeMaterial: typings.babylonjs.BABYLON.NodeMaterial
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], nodeMaterial.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: Unit,
    nodeMaterial: typings.babylonjs.BABYLON.NodeMaterial,
    skipBuild: Boolean
  ): js.Promise[typings.babylonjs.BABYLON.NodeMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], nodeMaterial.asInstanceOf[js.Any], skipBuild.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.NodeMaterial]]
  
  /** Define the Url to load snippets */
  @JSGlobal("BABYLON.NodeMaterial.SnippetUrl")
  @js.native
  def SnippetUrl: String = js.native
  inline def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Checks if a block is a texture block
    * @param block The block to check
    * @returns True if the block is a texture block
    */
  inline def _BlockIsTextureBlock(block: typings.babylonjs.BABYLON.NodeMaterialBlock): /* is babylonjs.BABYLON.NodeMaterialTextureBlocks */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_BlockIsTextureBlock")(block.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.BABYLON.NodeMaterialTextureBlocks */ Boolean]
  
  @JSGlobal("BABYLON.NodeMaterial._BuildIdGenerator")
  @js.native
  def _BuildIdGenerator: Any = js.native
  inline def _BuildIdGenerator_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BuildIdGenerator")(x.asInstanceOf[js.Any])
}
