package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class of the scene acting as a container for the different elements composing a scene.
  * This class is dynamically extended by the different components of the scene increasing
  * flexibility and reducing coupling
  */
@JSImport("babylonjs", "AbstractScene")
@js.native
abstract class AbstractScene ()
  extends babylonjsLib.BABYLONNs.AbstractScene

/* static members */
@JSImport("babylonjs", "AbstractScene")
@js.native
object AbstractScene extends js.Object {
  /**
    * Stores the list of available parsers in the application.
    */
  var _BabylonFileParsers: js.Any = js.native
  /**
    * Stores the list of available individual parsers in the application.
    */
  var _IndividualBabylonFileParsers: js.Any = js.native
  /**
    * Adds n individual parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  def AddIndividualParser(name: java.lang.String, parser: babylonjsLib.BABYLONNs.IndividualBabylonFileParser): scala.Unit = js.native
  /**
    * Adds a parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  def AddParser(name: java.lang.String, parser: babylonjsLib.BABYLONNs.BabylonFileParser): scala.Unit = js.native
  /**
    * Gets an individual parser from the list of avaialble ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  def GetIndividualParser(name: java.lang.String): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.IndividualBabylonFileParser] = js.native
  /**
    * Gets a general parser from the list of avaialble ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  def GetParser(name: java.lang.String): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.BabylonFileParser] = js.native
  /**
    * Parser json data and populate both a scene and its associated container object
    * @param jsonData Defines the data to parse
    * @param scene Defines the scene to parse the data for
    * @param container Defines the container attached to the parsing sequence
    * @param rootUrl Defines the root url of the data
    */
  def Parse(
    jsonData: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    container: babylonjsLib.BABYLONNs.AssetContainer,
    rootUrl: java.lang.String
  ): scala.Unit = js.native
}

