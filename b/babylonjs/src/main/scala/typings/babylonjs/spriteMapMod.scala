package typings.babylonjs

import typings.babylonjs.ispritesMod.ISpriteJSONAtlas
import typings.babylonjs.ispritesMod.ISpriteJSONSprite
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.rawTextureMod.RawTexture
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spriteMapMod {
  
  @JSImport("babylonjs/Sprites/spriteMap", "SpriteMap")
  @js.native
  class SpriteMap protected () extends ISpriteMap {
    /**
      * Creates a new SpriteMap
      * @param name defines the SpriteMaps Name
      * @param atlasJSON is the JSON file that controls the Sprites Frames and Meta
      * @param spriteSheet is the Texture that the Sprites are on.
      * @param options a basic deployment configuration
      * @param scene The Scene that the map is deployed on
      */
    def this(
      name: String,
      atlasJSON: ISpriteJSONAtlas,
      spriteSheet: Texture,
      options: ISpriteMapOptions,
      scene: Scene
    ) = this()
    
    /** Texture Buffer of Float32 that holds Animation Data*/
    var _animationMap: js.Any = js.native
    
    /**
      * Creates the "frame" texture Buffer
      * -------------------------------------
      * Structure of frames
      *  "filename": "Falling-Water-2.png",
      * "frame": {"x":69,"y":103,"w":24,"h":32},
      * "rotated": true,
      * "trimmed": true,
      * "spriteSourceSize": {"x":4,"y":0,"w":24,"h":32},
      * "sourceSize": {"w":32,"h":32}
      * @returns RawTexture of the frameMap
      */
    var _createFrameBuffer: js.Any = js.native
    
    /**
      * Creates the animationMap texture Buffer
      * @param buffer normally and array of numbers, or a false to generate from scratch
      * @returns RawTexture of the animationMap
      */
    var _createTileAnimationBuffer: js.Any = js.native
    
    /**
      * Creates the tileMap texture Buffer
      * @param buffer normally and array of numbers, or a false to generate from scratch
      * @param _layer indicates what layer for a logic trigger dealing with the baseTile.  The system uses this
      * @returns RawTexture of the tileMap
      */
    var _createTileBuffer: js.Any = js.native
    
    /** Texture Buffer of Float32 that holds tile frame data*/
    var _frameMap: js.Any = js.native
    
    /** Custom ShaderMaterial Central to the System*/
    var _material: js.Any = js.native
    
    /** Custom ShaderMaterial Central to the System*/
    var _output: js.Any = js.native
    
    /** Scene that the SpriteMap was created in */
    var _scene: js.Any = js.native
    
    /** Texture Buffers of Float32 that holds tileMap data*/
    var _tileMaps: js.Any = js.native
    
    /** Systems Time Ticker*/
    var _time: js.Any = js.native
    
    /**
      * Modifies the data of the animationMap
      * @param cellID is the Index of the Sprite
      * @param _frame is the target Animation frame
      * @param toCell is the Target Index of the next frame of the animation
      * @param time is a value between 0-1 that is the trigger for when the frame should change tiles
      * @param speed is a global scalar of the time variable on the map.
      */
    def addAnimationToTile(): Unit = js.native
    def addAnimationToTile(
      cellID: js.UndefOr[scala.Nothing],
      _frame: js.UndefOr[scala.Nothing],
      toCell: js.UndefOr[scala.Nothing],
      time: js.UndefOr[scala.Nothing],
      speed: Double
    ): Unit = js.native
    def addAnimationToTile(
      cellID: js.UndefOr[scala.Nothing],
      _frame: js.UndefOr[scala.Nothing],
      toCell: js.UndefOr[scala.Nothing],
      time: Double
    ): Unit = js.native
    def addAnimationToTile(
      cellID: js.UndefOr[scala.Nothing],
      _frame: js.UndefOr[scala.Nothing],
      toCell: js.UndefOr[scala.Nothing],
      time: Double,
      speed: Double
    ): Unit = js.native
    def addAnimationToTile(cellID: js.UndefOr[scala.Nothing], _frame: js.UndefOr[scala.Nothing], toCell: Double): Unit = js.native
    def addAnimationToTile(
      cellID: js.UndefOr[scala.Nothing],
      _frame: js.UndefOr[scala.Nothing],
      toCell: Double,
      time: js.UndefOr[scala.Nothing],
      speed: Double
    ): Unit = js.native
    def addAnimationToTile(cellID: js.UndefOr[scala.Nothing], _frame: js.UndefOr[scala.Nothing], toCell: Double, time: Double): Unit = js.native
    def addAnimationToTile(
      cellID: js.UndefOr[scala.Nothing],
      _frame: js.UndefOr[scala.Nothing],
      toCell: Double,
      time: Double,
      speed: Double
    ): Unit = js.native
    def addAnimationToTile(cellID: js.UndefOr[scala.Nothing], _frame: Double): Unit = js.native
    def addAnimationToTile(
      cellID: js.UndefOr[scala.Nothing],
      _frame: Double,
      toCell: js.UndefOr[scala.Nothing],
      time: js.UndefOr[scala.Nothing],
      speed: Double
    ): Unit = js.native
    def addAnimationToTile(cellID: js.UndefOr[scala.Nothing], _frame: Double, toCell: js.UndefOr[scala.Nothing], time: Double): Unit = js.native
    def addAnimationToTile(
      cellID: js.UndefOr[scala.Nothing],
      _frame: Double,
      toCell: js.UndefOr[scala.Nothing],
      time: Double,
      speed: Double
    ): Unit = js.native
    def addAnimationToTile(cellID: js.UndefOr[scala.Nothing], _frame: Double, toCell: Double): Unit = js.native
    def addAnimationToTile(
      cellID: js.UndefOr[scala.Nothing],
      _frame: Double,
      toCell: Double,
      time: js.UndefOr[scala.Nothing],
      speed: Double
    ): Unit = js.native
    def addAnimationToTile(cellID: js.UndefOr[scala.Nothing], _frame: Double, toCell: Double, time: Double): Unit = js.native
    def addAnimationToTile(cellID: js.UndefOr[scala.Nothing], _frame: Double, toCell: Double, time: Double, speed: Double): Unit = js.native
    def addAnimationToTile(cellID: Double): Unit = js.native
    def addAnimationToTile(
      cellID: Double,
      _frame: js.UndefOr[scala.Nothing],
      toCell: js.UndefOr[scala.Nothing],
      time: js.UndefOr[scala.Nothing],
      speed: Double
    ): Unit = js.native
    def addAnimationToTile(cellID: Double, _frame: js.UndefOr[scala.Nothing], toCell: js.UndefOr[scala.Nothing], time: Double): Unit = js.native
    def addAnimationToTile(
      cellID: Double,
      _frame: js.UndefOr[scala.Nothing],
      toCell: js.UndefOr[scala.Nothing],
      time: Double,
      speed: Double
    ): Unit = js.native
    def addAnimationToTile(cellID: Double, _frame: js.UndefOr[scala.Nothing], toCell: Double): Unit = js.native
    def addAnimationToTile(
      cellID: Double,
      _frame: js.UndefOr[scala.Nothing],
      toCell: Double,
      time: js.UndefOr[scala.Nothing],
      speed: Double
    ): Unit = js.native
    def addAnimationToTile(cellID: Double, _frame: js.UndefOr[scala.Nothing], toCell: Double, time: Double): Unit = js.native
    def addAnimationToTile(cellID: Double, _frame: js.UndefOr[scala.Nothing], toCell: Double, time: Double, speed: Double): Unit = js.native
    def addAnimationToTile(cellID: Double, _frame: Double): Unit = js.native
    def addAnimationToTile(
      cellID: Double,
      _frame: Double,
      toCell: js.UndefOr[scala.Nothing],
      time: js.UndefOr[scala.Nothing],
      speed: Double
    ): Unit = js.native
    def addAnimationToTile(cellID: Double, _frame: Double, toCell: js.UndefOr[scala.Nothing], time: Double): Unit = js.native
    def addAnimationToTile(cellID: Double, _frame: Double, toCell: js.UndefOr[scala.Nothing], time: Double, speed: Double): Unit = js.native
    def addAnimationToTile(cellID: Double, _frame: Double, toCell: Double): Unit = js.native
    def addAnimationToTile(cellID: Double, _frame: Double, toCell: Double, time: js.UndefOr[scala.Nothing], speed: Double): Unit = js.native
    def addAnimationToTile(cellID: Double, _frame: Double, toCell: Double, time: Double): Unit = js.native
    def addAnimationToTile(cellID: Double, _frame: Double, toCell: Double, time: Double, speed: Double): Unit = js.native
    
    /** Sets the AnimationMap*/
    def animationMap: RawTexture = js.native
    /** Sets the AnimationMap*/
    def animationMap_=(v: RawTexture): Unit = js.native
    
    def changeTiles(_layer: js.UndefOr[scala.Nothing], pos: js.Array[Vector2]): Unit = js.native
    def changeTiles(_layer: js.UndefOr[scala.Nothing], pos: js.Array[Vector2], tile: Double): Unit = js.native
    def changeTiles(_layer: js.UndefOr[scala.Nothing], pos: Vector2): Unit = js.native
    def changeTiles(_layer: js.UndefOr[scala.Nothing], pos: Vector2, tile: Double): Unit = js.native
    def changeTiles(_layer: Double, pos: js.Array[Vector2]): Unit = js.native
    def changeTiles(_layer: Double, pos: js.Array[Vector2], tile: Double): Unit = js.native
    /**
      * Modifies the data of the tileMaps
      * @param _layer is the ID of the layer you want to edit on the SpriteMap
      * @param pos is the iVector2 Coordinates of the Tile
      * @param tile The SpriteIndex of the new Tile
      */
    def changeTiles(_layer: Double, pos: Vector2): Unit = js.native
    def changeTiles(_layer: Double, pos: Vector2, tile: Double): Unit = js.native
    
    /**
      * Gets the UV location of the mouse over the SpriteMap.
      * @returns Vector2 the UV position of the mouse interaction
      */
    def getMousePosition(): Vector2 = js.native
    
    /**
      * Returns tileID location
      * @returns Vector2 the cell position ID
      */
    def getTileID(): Vector2 = js.native
    
    /**
      * Imports the .tilemaps file
      * @param url of the .tilemaps file
      */
    def loadTileMaps(url: String): Unit = js.native
    
    /** Returns the Position of Output Plane*/
    def position: Vector3 = js.native
    /** Returns the Position of Output Plane*/
    def position_=(v: Vector3): Unit = js.native
    
    /** Returns the Rotation of Output Plane*/
    def rotation: Vector3 = js.native
    /** Returns the Rotation of Output Plane*/
    def rotation_=(v: Vector3): Unit = js.native
    
    /**
      * Exports the .tilemaps file
      */
    def saveTileMaps(): Unit = js.native
    
    /** Returns the Number of Sprites in the System */
    def spriteCount: Double = js.native
    
    /** Public Sprite Storage array, parsed from atlasJSON */
    var sprites: js.Array[ISpriteJSONSprite] = js.native
  }
  
  @js.native
  trait ISpriteMap extends IDisposable {
    
    /**
      * The JSON Array file from a https://www.codeandweb.com/texturepacker export.  Or similar structure.
      */
    var atlasJSON: ISpriteJSONAtlas = js.native
    
    /**
      * String name of the SpriteMap.
      */
    var name: String = js.native
    
    /**
      * The parameters to initialize the SpriteMap with.
      */
    var options: ISpriteMapOptions = js.native
    
    /**
      * Texture of the SpriteMap.
      */
    var spriteSheet: Texture = js.native
  }
  object ISpriteMap {
    
    @scala.inline
    def apply(
      atlasJSON: ISpriteJSONAtlas,
      dispose: () => Unit,
      name: String,
      options: ISpriteMapOptions,
      spriteSheet: Texture
    ): ISpriteMap = {
      val __obj = js.Dynamic.literal(atlasJSON = atlasJSON.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], spriteSheet = spriteSheet.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpriteMap]
    }
    
    @scala.inline
    implicit class ISpriteMapMutableBuilder[Self <: ISpriteMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtlasJSON(value: ISpriteJSONAtlas): Self = StObject.set(x, "atlasJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: ISpriteMapOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteSheet(value: Texture): Self = StObject.set(x, "spriteSheet", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISpriteMapOptions extends StObject {
    
    /**
      * number cell index of the base tile when the system compiles.
      */
    var baseTile: js.UndefOr[Double] = js.native
    
    /**
      * Vector3 scalar of the global RGB values of the SpriteMap.
      */
    var colorMultiply: js.UndefOr[Vector3] = js.native
    
    /**
      * boolean flip the sprite after its been repositioned by the framing data.
      */
    var flipU: js.UndefOr[Boolean] = js.native
    
    /**
      * number of layers that the system will reserve in resources.
      */
    var layerCount: js.UndefOr[Double] = js.native
    
    /**
      * number of max animation frames a single cell will reserve in resources.
      */
    var maxAnimationFrames: js.UndefOr[Double] = js.native
    
    /**
      * Vector3 of the position of the output plane in World Units.
      */
    var outputPosition: js.UndefOr[Vector3] = js.native
    
    /**
      * Vector3 of the rotation of the output plane.
      */
    var outputRotation: js.UndefOr[Vector3] = js.native
    
    /**
      * Vector2 of the size of the output plane in World Units.
      */
    var outputSize: js.UndefOr[Vector2] = js.native
    
    /**
      * Vector2 of the number of cells in the grid.
      */
    var stageSize: js.UndefOr[Vector2] = js.native
  }
  object ISpriteMapOptions {
    
    @scala.inline
    def apply(): ISpriteMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpriteMapOptions]
    }
    
    @scala.inline
    implicit class ISpriteMapOptionsMutableBuilder[Self <: ISpriteMapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseTile(value: Double): Self = StObject.set(x, "baseTile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseTileUndefined: Self = StObject.set(x, "baseTile", js.undefined)
      
      @scala.inline
      def setColorMultiply(value: Vector3): Self = StObject.set(x, "colorMultiply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMultiplyUndefined: Self = StObject.set(x, "colorMultiply", js.undefined)
      
      @scala.inline
      def setFlipU(value: Boolean): Self = StObject.set(x, "flipU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUUndefined: Self = StObject.set(x, "flipU", js.undefined)
      
      @scala.inline
      def setLayerCount(value: Double): Self = StObject.set(x, "layerCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerCountUndefined: Self = StObject.set(x, "layerCount", js.undefined)
      
      @scala.inline
      def setMaxAnimationFrames(value: Double): Self = StObject.set(x, "maxAnimationFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAnimationFramesUndefined: Self = StObject.set(x, "maxAnimationFrames", js.undefined)
      
      @scala.inline
      def setOutputPosition(value: Vector3): Self = StObject.set(x, "outputPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputPositionUndefined: Self = StObject.set(x, "outputPosition", js.undefined)
      
      @scala.inline
      def setOutputRotation(value: Vector3): Self = StObject.set(x, "outputRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputRotationUndefined: Self = StObject.set(x, "outputRotation", js.undefined)
      
      @scala.inline
      def setOutputSize(value: Vector2): Self = StObject.set(x, "outputSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputSizeUndefined: Self = StObject.set(x, "outputSize", js.undefined)
      
      @scala.inline
      def setStageSize(value: Vector2): Self = StObject.set(x, "stageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageSizeUndefined: Self = StObject.set(x, "stageSize", js.undefined)
    }
  }
}
