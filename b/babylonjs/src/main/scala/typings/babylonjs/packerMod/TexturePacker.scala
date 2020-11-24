package typings.babylonjs.packerMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.frameMod.TexturePackerFrame
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Textures/Packer/packer", "TexturePacker")
@js.native
class TexturePacker protected () extends js.Object {
  /**
    * Initializes a texture package series from an array of meshes or a single mesh.
    * @param name The name of the package
    * @param meshes The target meshes to compose the package from
    * @param options The arguments that texture packer should follow while building.
    * @param scene The scene which the textures are scoped to.
    * @returns TexturePacker
    */
  def this(name: String, meshes: js.Array[AbstractMesh], options: ITexturePackerOptions, scene: Scene) = this()
  
  /**
    * Calculates the UV data for the frames.
    * @param baseSize the base frameSize
    * @param padding the base frame padding
    * @param dtSize size of the Dynamic Texture for that channel
    * @param dtUnits is 1/dtSize
    * @param update flag to update the input meshes
    */
  var _calculateMeshUVFrames: js.Any = js.native
  
  /**
    * Calculates the Size of the Channel Sets
    * @returns Vector2
    */
  var _calculateSize: js.Any = js.native
  
  /**
    * Starts the package process
    * @param resolve The promises resolution function
    * @returns TexturePacker
    */
  var _createFrames: js.Any = js.native
  
  /** The expected number of textures the system is parsing. */
  var _expecting: js.Any = js.native
  
  /**
    * Calculates the frames Offset.
    * @param index of the frame
    * @returns Vector2
    */
  var _getFrameOffset: js.Any = js.native
  
  /** The padding value from Math.ceil(frameSize * paddingRatio) */
  var _paddingValue: js.Any = js.native
  
  /**
    * Updates a Mesh to the frame data
    * @param mesh that is the target
    * @param frameID or the frame index
    */
  var _updateMeshUV: js.Any = js.native
  
  /**
    * Updates a Meshes materials to use the texture packer channels
    * @param m is the mesh to target
    * @param force all channels on the packer to be set.
    */
  var _updateTextureReferences: js.Any = js.native
  
  /**
    * Disposes all textures associated with this packer
    */
  def dispose(): Unit = js.native
  
  /**
    * Starts the download process for all the channels converting them to base64 data and embedding it all in a JSON file.
    * @param imageType is the image type to use.
    * @param quality of the image if downloading as jpeg, Ranges from >0 to 1.
    */
  def download(): Unit = js.native
  def download(imageType: js.UndefOr[scala.Nothing], quality: Double): Unit = js.native
  def download(imageType: String): Unit = js.native
  def download(imageType: String, quality: Double): Unit = js.native
  
  /** The Container array for the frames that are generated */
  var frames: js.Array[TexturePackerFrame] = js.native
  
  /** The Meshes to target */
  var meshes: js.Array[AbstractMesh] = js.native
  
  /** The Name of the Texture Package */
  var name: String = js.native
  
  /** Arguments passed with the Constructor */
  var options: ITexturePackerOptions = js.native
  
  /**
    * Starts the async promise to compile the texture packer.
    * @returns Promise<void>
    */
  def processAsync(): js.Promise[Unit] = js.native
  
  /** The promise that is started upon initialization */
  var promise: Nullable[js.Promise[TexturePacker | String]] = js.native
  
  /** The scene scope of the TexturePacker */
  var scene: Scene = js.native
  
  /**
    * Public method to set a Mesh to a frame
    * @param m that is the target
    * @param frameID or the frame index
    * @param updateMaterial trigger for if the Meshes attached Material be updated?
    */
  def setMeshToFrame(m: AbstractMesh, frameID: Double): Unit = js.native
  def setMeshToFrame(m: AbstractMesh, frameID: Double, updateMaterial: Boolean): Unit = js.native
  
  /** The Container object for the channel sets that are generated */
  var sets: js.Object = js.native
  
  /**
    * Public method to load a texturePacker JSON file.
    * @param data of the JSON file in string format.
    */
  def updateFromJSON(data: String): Unit = js.native
}
/* static members */
@JSImport("babylonjs/Materials/Textures/Packer/packer", "TexturePacker")
@js.native
object TexturePacker extends js.Object {
  
  /** Packer Layout Constant 2 */
  val LAYOUT_COLNUM: Double = js.native
  
  /** Packer Layout Constant 1 */
  val LAYOUT_POWER2: Double = js.native
  
  /** Packer Layout Constant 0 */
  val LAYOUT_STRIP: Double = js.native
  
  /** Packer Layout Constant 2 */
  val SUBUV_COLOR: Double = js.native
  
  /** Packer Layout Constant 1 */
  val SUBUV_EXTEND: Double = js.native
  
  /** Packer Layout Constant 0 */
  val SUBUV_WRAP: Double = js.native
}
