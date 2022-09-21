package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AnaglyphPostProcess")
@js.native
open class AnaglyphPostProcess protected ()
  extends StObject
     with typings.babylonjs.BABYLON.AnaglyphPostProcess {
  /**
    * Creates a new AnaglyphPostProcess
    * @param name defines postprocess name
    * @param options defines creation options or target ratio scale
    * @param rigCameras defines cameras using this postprocess
    * @param samplingMode defines required sampling mode (BABYLON.Texture.NEAREST_SAMPLINGMODE by default)
    * @param engine defines hosting engine
    * @param reusable defines if the postprocess will be reused multiple times per frame
    */
  def this(name: String, options: Double, rigCameras: js.Array[typings.babylonjs.BABYLON.Camera]) = this()
  def this(name: String, options: PostProcessOptions, rigCameras: js.Array[typings.babylonjs.BABYLON.Camera]) = this()
  def this(
    name: String,
    options: Double,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    options: Double,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    options: Double,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    options: Double,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
}
