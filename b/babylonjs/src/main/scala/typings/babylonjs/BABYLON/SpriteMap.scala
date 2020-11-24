package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpriteMap extends ISpriteMap {
  
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
