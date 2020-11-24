package typings.babylonjs.indexMod

import typings.babylonjs.anon.PartialINodeMaterialOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "NodeMaterial")
@js.native
class NodeMaterial protected ()
  extends typings.babylonjs.materialsIndexMod.NodeMaterial {
  /**
    * Create a new node based material
    * @param name defines the material name
    * @param scene defines the hosting scene
    * @param options defines creation option
    */
  def this(name: String) = this()
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: String, scene: js.UndefOr[scala.Nothing], options: PartialINodeMaterialOptio) = this()
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene, options: PartialINodeMaterialOptio) = this()
}
/* static members */
@JSImport("babylonjs/index", "NodeMaterial")
@js.native
object NodeMaterial extends js.Object {
  
  /**
    * Creates a new node material set to default basic configuration
    * @param name defines the name of the material
    * @param scene defines the hosting scene
    * @returns a new NodeMaterial
    */
  def CreateDefault(name: String): typings.babylonjs.nodeMaterialMod.NodeMaterial = js.native
  def CreateDefault(name: String, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.nodeMaterialMod.NodeMaterial = js.native
  
  /** Define the Url to load node editor script */
  var EditorURL: String = js.native
  
  /** Gets or sets a boolean indicating that node materials should not deserialize textures from json / snippet content */
  var IgnoreTexturesAtLoadTime: Boolean = js.native
  
  /**
    * Creates a node material from parsed material data
    * @param source defines the JSON representation of the material
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a new node material
    */
  def Parse(source: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.nodeMaterialMod.NodeMaterial = js.native
  def Parse(source: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.nodeMaterialMod.NodeMaterial = js.native
  
  /**
    * Creates a node material from a snippet saved in a remote file
    * @param name defines the name of the material to create
    * @param url defines the url to load from
    * @param scene defines the hosting scene
    * @returns a promise that will resolve to the new node material
    */
  def ParseFromFileAsync(name: String, url: String, scene: typings.babylonjs.sceneMod.Scene): js.Promise[typings.babylonjs.nodeMaterialMod.NodeMaterial] = js.native
  
  /**
    * Creates a node material from a snippet saved by the node material editor
    * @param snippetId defines the snippet to load
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @param nodeMaterial defines a node material to update (instead of creating a new one)
    * @returns a promise that will resolve to the new node material
    */
  def ParseFromSnippetAsync(snippetId: String, scene: typings.babylonjs.sceneMod.Scene): js.Promise[typings.babylonjs.nodeMaterialMod.NodeMaterial] = js.native
  def ParseFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.sceneMod.Scene,
    rootUrl: js.UndefOr[scala.Nothing],
    nodeMaterial: typings.babylonjs.nodeMaterialMod.NodeMaterial
  ): js.Promise[typings.babylonjs.nodeMaterialMod.NodeMaterial] = js.native
  def ParseFromSnippetAsync(snippetId: String, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): js.Promise[typings.babylonjs.nodeMaterialMod.NodeMaterial] = js.native
  def ParseFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.sceneMod.Scene,
    rootUrl: String,
    nodeMaterial: typings.babylonjs.nodeMaterialMod.NodeMaterial
  ): js.Promise[typings.babylonjs.nodeMaterialMod.NodeMaterial] = js.native
  
  /** Define the Url to load snippets */
  var SnippetUrl: String = js.native
  
  var _BuildIdGenerator: js.Any = js.native
}
