package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.frameMod.TexturePackerFrame
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packerMod {
  
  @JSImport("babylonjs/Materials/Textures/Packer/packer", "TexturePacker")
  @js.native
  open class TexturePacker protected () extends StObject {
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
    /* private */ var _calculateMeshUVFrames: Any = js.native
    
    /**
      * Calculates the Size of the Channel Sets
      * @returns Vector2
      */
    /* private */ var _calculateSize: Any = js.native
    
    /**
      * Starts the package process
      * @param resolve The promises resolution function
      * @returns TexturePacker
      */
    /* private */ var _createFrames: Any = js.native
    
    /** The expected number of textures the system is parsing. */
    /* private */ var _expecting: Any = js.native
    
    /**
      * Calculates the frames Offset.
      * @param index of the frame
      * @returns Vector2
      */
    /* private */ var _getFrameOffset: Any = js.native
    
    /** The padding value from Math.ceil(frameSize * paddingRatio) */
    /* private */ var _paddingValue: Any = js.native
    
    /**
      * Updates a Mesh to the frame data
      * @param mesh that is the target
      * @param frameID or the frame index
      */
    /* private */ var _updateMeshUV: Any = js.native
    
    /**
      * Updates a Meshes materials to use the texture packer channels
      * @param m is the mesh to target
      * @param force all channels on the packer to be set.
      */
    /* private */ var _updateTextureReferences: Any = js.native
    
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
    def download(imageType: String): Unit = js.native
    def download(imageType: String, quality: Double): Unit = js.native
    def download(imageType: Unit, quality: Double): Unit = js.native
    
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
  object TexturePacker {
    
    /** Packer Layout Constant 2 */
    @JSImport("babylonjs/Materials/Textures/Packer/packer", "TexturePacker.LAYOUT_COLNUM")
    @js.native
    val LAYOUT_COLNUM: Double = js.native
    
    /** Packer Layout Constant 1 */
    @JSImport("babylonjs/Materials/Textures/Packer/packer", "TexturePacker.LAYOUT_POWER2")
    @js.native
    val LAYOUT_POWER2: Double = js.native
    
    /** Packer Layout Constant 0 */
    @JSImport("babylonjs/Materials/Textures/Packer/packer", "TexturePacker.LAYOUT_STRIP")
    @js.native
    val LAYOUT_STRIP: Double = js.native
    
    /** Packer Layout Constant 2 */
    @JSImport("babylonjs/Materials/Textures/Packer/packer", "TexturePacker.SUBUV_COLOR")
    @js.native
    val SUBUV_COLOR: Double = js.native
    
    /** Packer Layout Constant 1 */
    @JSImport("babylonjs/Materials/Textures/Packer/packer", "TexturePacker.SUBUV_EXTEND")
    @js.native
    val SUBUV_EXTEND: Double = js.native
    
    /** Packer Layout Constant 0 */
    @JSImport("babylonjs/Materials/Textures/Packer/packer", "TexturePacker.SUBUV_WRAP")
    @js.native
    val SUBUV_WRAP: Double = js.native
  }
  
  trait ITexturePackerJSON extends StObject {
    
    /**
      * The frame data of the Packer
      */
    var frames: js.Array[Double]
    
    /**
      * The frame ID
      */
    var name: String
    
    /**
      * The options of the Packer
      */
    var options: ITexturePackerOptions
    
    /**
      * The base64 channel data
      */
    var sets: Any
  }
  object ITexturePackerJSON {
    
    inline def apply(frames: js.Array[Double], name: String, options: ITexturePackerOptions, sets: Any): ITexturePackerJSON = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITexturePackerJSON]
    }
    
    extension [Self <: ITexturePackerJSON](x: Self) {
      
      inline def setFrames(value: js.Array[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: Double*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ITexturePackerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSets(value: Any): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITexturePackerOptions extends StObject {
    
    /**
      * number of columns if using custom column count layout(2).  This defaults to 4.
      */
    var colnum: js.UndefOr[Double] = js.undefined
    
    /**
      * string value representing the context fill style color.  Defaults to 'black'.
      */
    var customFillColor: js.UndefOr[String] = js.undefined
    
    /**
      * boolean flag to dispose all the source textures.  Defaults to true.
      */
    var disposeSources: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Fills the blank cells in a set to the customFillColor.  Defaults to true.
      */
    var fillBlanks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Width and Height Value of each Frame in the TexturePacker Sets
      */
    var frameSize: js.UndefOr[Double] = js.undefined
    
    /**
      * number representing the layout style. Defaults to LAYOUT_STRIP
      */
    var layout: js.UndefOr[Double] = js.undefined
    
    /**
      * Custom targets for the channels of a texture packer.  Default is all the channels of the Standard Material
      */
    var map: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If in SUBUV_COLOR padding mode what color to use.
      */
    var paddingColor: js.UndefOr[Color3 | Color4] = js.undefined
    
    /**
      * Number that declares the fill method for the padding gutter.
      */
    var paddingMode: js.UndefOr[Double] = js.undefined
    
    /**
      * Ratio of the value to add padding wise to each cell.  Defaults to 0.0115
      */
    var paddingRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * flag to update the input meshes to the new packed texture after compilation. Defaults to true.
      */
    var updateInputMeshes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the UV input targets, as a single value for all meshes. Defaults to VertexBuffer.UVKind
      */
    var uvsIn: js.UndefOr[String] = js.undefined
    
    /**
      * the UV output targets, as a single value for all meshes.  Defaults to VertexBuffer.UVKind
      */
    var uvsOut: js.UndefOr[String] = js.undefined
  }
  object ITexturePackerOptions {
    
    inline def apply(): ITexturePackerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITexturePackerOptions]
    }
    
    extension [Self <: ITexturePackerOptions](x: Self) {
      
      inline def setColnum(value: Double): Self = StObject.set(x, "colnum", value.asInstanceOf[js.Any])
      
      inline def setColnumUndefined: Self = StObject.set(x, "colnum", js.undefined)
      
      inline def setCustomFillColor(value: String): Self = StObject.set(x, "customFillColor", value.asInstanceOf[js.Any])
      
      inline def setCustomFillColorUndefined: Self = StObject.set(x, "customFillColor", js.undefined)
      
      inline def setDisposeSources(value: Boolean): Self = StObject.set(x, "disposeSources", value.asInstanceOf[js.Any])
      
      inline def setDisposeSourcesUndefined: Self = StObject.set(x, "disposeSources", js.undefined)
      
      inline def setFillBlanks(value: Boolean): Self = StObject.set(x, "fillBlanks", value.asInstanceOf[js.Any])
      
      inline def setFillBlanksUndefined: Self = StObject.set(x, "fillBlanks", js.undefined)
      
      inline def setFrameSize(value: Double): Self = StObject.set(x, "frameSize", value.asInstanceOf[js.Any])
      
      inline def setFrameSizeUndefined: Self = StObject.set(x, "frameSize", js.undefined)
      
      inline def setLayout(value: Double): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMap(value: js.Array[String]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMapVarargs(value: String*): Self = StObject.set(x, "map", js.Array(value*))
      
      inline def setPaddingColor(value: Color3 | Color4): Self = StObject.set(x, "paddingColor", value.asInstanceOf[js.Any])
      
      inline def setPaddingColorUndefined: Self = StObject.set(x, "paddingColor", js.undefined)
      
      inline def setPaddingMode(value: Double): Self = StObject.set(x, "paddingMode", value.asInstanceOf[js.Any])
      
      inline def setPaddingModeUndefined: Self = StObject.set(x, "paddingMode", js.undefined)
      
      inline def setPaddingRatio(value: Double): Self = StObject.set(x, "paddingRatio", value.asInstanceOf[js.Any])
      
      inline def setPaddingRatioUndefined: Self = StObject.set(x, "paddingRatio", js.undefined)
      
      inline def setUpdateInputMeshes(value: Boolean): Self = StObject.set(x, "updateInputMeshes", value.asInstanceOf[js.Any])
      
      inline def setUpdateInputMeshesUndefined: Self = StObject.set(x, "updateInputMeshes", js.undefined)
      
      inline def setUvsIn(value: String): Self = StObject.set(x, "uvsIn", value.asInstanceOf[js.Any])
      
      inline def setUvsInUndefined: Self = StObject.set(x, "uvsIn", js.undefined)
      
      inline def setUvsOut(value: String): Self = StObject.set(x, "uvsOut", value.asInstanceOf[js.Any])
      
      inline def setUvsOutUndefined: Self = StObject.set(x, "uvsOut", js.undefined)
    }
  }
}
