package typings.babylonjs.buildersIndexMod

import typings.babylonjs.anon.ColorFilter
import typings.babylonjs.anon.SubdivisionsX
import typings.babylonjs.anon.Updatable
import typings.babylonjs.groundMeshMod.GroundMesh
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/Builders/index", "GroundBuilder")
@js.native
class GroundBuilder ()
  extends typings.babylonjs.groundBuilderMod.GroundBuilder
/* static members */
object GroundBuilder {
  
  @JSImport("babylonjs/Meshes/Builders/index", "GroundBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ground mesh
    * * The parameters `width` and `height` (floats, default 1) set the width and height sizes of the ground
    * * The parameter `subdivisions` (positive integer) sets the number of subdivisions per side
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the ground mesh
    * @see https://doc.babylonjs.com/how_to/set_shapes#ground
    */
  inline def CreateGround(name: String, options: SubdivisionsX, scene: js.Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  /**
    * Creates a ground mesh from a height map
    * * The parameter `url` sets the URL of the height map image resource.
    * * The parameters `width` and `height` (positive floats, default 10) set the ground width and height sizes.
    * * The parameter `subdivisions` (positive integer, default 1) sets the number of subdivision per side.
    * * The parameter `minHeight` (float, default 0) is the minimum altitude on the ground.
    * * The parameter `maxHeight` (float, default 1) is the maximum altitude on the ground.
    * * The parameter `colorFilter` (optional Color3, default (0.3, 0.59, 0.11) ) is the filter to apply to the image pixel colors to compute the height.
    * * The parameter `onReady` is a javascript callback function that will be called  once the mesh is just built (the height map download can last some time).
    * * The parameter `alphaFilter` will filter any data where the alpha channel is below this value, defaults 0 (all data visible)
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created.
    * @param name defines the name of the mesh
    * @param url defines the url to the height map
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the ground mesh
    * @see https://doc.babylonjs.com/babylon101/height_map
    * @see https://doc.babylonjs.com/how_to/set_shapes#ground-from-a-height-map
    */
  inline def CreateGroundFromHeightMap(name: String, url: String, options: ColorFilter): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: ColorFilter, scene: Nullable[Scene]): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  
  /**
    * Creates a tiled ground mesh
    * * The parameters `xmin` and `xmax` (floats, default -1 and 1) set the ground minimum and maximum X coordinates
    * * The parameters `zmin` and `zmax` (floats, default -1 and 1) set the ground minimum and maximum Z coordinates
    * * The parameter `subdivisions` is a javascript object `{w: positive integer, h: positive integer}` (default `{w: 6, h: 6}`). `w` and `h` are the numbers of subdivisions on the ground width and height. Each subdivision is called a tile
    * * The parameter `precision` is a javascript object `{w: positive integer, h: positive integer}` (default `{w: 2, h: 2}`). `w` and `h` are the numbers of subdivisions on the ground width and height of each tile
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created.
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the tiled ground mesh
    * @see https://doc.babylonjs.com/how_to/set_shapes#tiled-ground
    */
  inline def CreateTiledGround(name: String, options: Updatable): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledGround(name: String, options: Updatable, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
}
