package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.BabylonFileParser
import typings.babylonjs.BABYLON.IndividualBabylonFileParser
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AbstractScene")
@js.native
abstract class AbstractScene ()
  extends typings.babylonjs.BABYLON.AbstractScene
/* static members */
object AbstractScene {
  
  @JSGlobal("BABYLON.AbstractScene")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds n individual parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  @JSGlobal("BABYLON.AbstractScene.AddIndividualParser")
  @js.native
  def AddIndividualParser(name: String, parser: IndividualBabylonFileParser): Unit = js.native
  
  /**
    * Adds a parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  @JSGlobal("BABYLON.AbstractScene.AddParser")
  @js.native
  def AddParser(name: String, parser: BabylonFileParser): Unit = js.native
  
  /**
    * Gets an individual parser from the list of avaialble ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  @JSGlobal("BABYLON.AbstractScene.GetIndividualParser")
  @js.native
  def GetIndividualParser(name: String): Nullable[IndividualBabylonFileParser] = js.native
  
  /**
    * Gets a general parser from the list of avaialble ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  @JSGlobal("BABYLON.AbstractScene.GetParser")
  @js.native
  def GetParser(name: String): Nullable[BabylonFileParser] = js.native
  
  /**
    * Parser json data and populate both a scene and its associated container object
    * @param jsonData Defines the data to parse
    * @param scene Defines the scene to parse the data for
    * @param container Defines the container attached to the parsing sequence
    * @param rootUrl Defines the root url of the data
    */
  @JSGlobal("BABYLON.AbstractScene.Parse")
  @js.native
  def Parse(
    jsonData: js.Any,
    scene: typings.babylonjs.BABYLON.Scene,
    container: typings.babylonjs.BABYLON.AssetContainer,
    rootUrl: String
  ): Unit = js.native
  
  /**
    * Stores the list of available parsers in the application.
    */
  @JSGlobal("BABYLON.AbstractScene._BabylonFileParsers")
  @js.native
  def _BabylonFileParsers: js.Any = js.native
  @scala.inline
  def _BabylonFileParsers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BabylonFileParsers")(x.asInstanceOf[js.Any])
  
  /**
    * Stores the list of available individual parsers in the application.
    */
  @JSGlobal("BABYLON.AbstractScene._IndividualBabylonFileParsers")
  @js.native
  def _IndividualBabylonFileParsers: js.Any = js.native
  @scala.inline
  def _IndividualBabylonFileParsers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IndividualBabylonFileParsers")(x.asInstanceOf[js.Any])
}
