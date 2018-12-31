package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a sound that can be played in the application.
  * The sound can either be an ambient track or a simple sound played in reaction to a user action.
  * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
  */
@JSImport("babylonjs", "Sound")
@js.native
class Sound protected ()
  extends babylonjsLib.BABYLONNs.Sound {
  /**
    * Create a sound and attach it to a scene
    * @param name Name of your sound
    * @param urlOrArrayBuffer Url to the sound to load async or ArrayBuffer, it also works with MediaStreams
    * @param readyToPlayCallback Provide a callback function if you'd like to load your code once the sound is ready to be played
    * @param options Objects to provide with the current available options: autoplay, loop, volume, spatialSound, maxDistance, rolloffFactor, refDistance, distanceModel, panningModel, streaming
    */
  def this(name: java.lang.String, urlOrArrayBuffer: js.Any, scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(name: java.lang.String, urlOrArrayBuffer: js.Any, scene: babylonjsLib.BABYLONNs.Scene, readyToPlayCallback: babylonjsLib.BABYLONNs.Nullable[js.Function0[scala.Unit]]) = this()
  def this(name: java.lang.String, urlOrArrayBuffer: js.Any, scene: babylonjsLib.BABYLONNs.Scene, readyToPlayCallback: babylonjsLib.BABYLONNs.Nullable[js.Function0[scala.Unit]], options: js.Any) = this()
}

/**
  * Defines a sound that can be played in the application.
  * The sound can either be an ambient track or a simple sound played in reaction to a user action.
  * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
  */
@JSImport("babylonjs", "Sound")
@js.native
object Sound extends js.Object {
  /**
    * Parse a JSON representation of a sound to innstantiate in a given scene
    * @param parsedSound Define the JSON representation of the sound (usually coming from the serialize method)
    * @param scene Define the scene the new parsed sound should be created in
    * @param rootUrl Define the rooturl of the load in case we need to fetch relative dependencies
    * @param sourceSound Define a cound place holder if do not need to instantiate a new one
    * @returns the newly parsed sound
    */
  def Parse(parsedSound: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.Sound = js.native
  def Parse(
    parsedSound: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    rootUrl: java.lang.String,
    sourceSound: babylonjsLib.BABYLONNs.Sound
  ): babylonjsLib.BABYLONNs.Sound = js.native
}

