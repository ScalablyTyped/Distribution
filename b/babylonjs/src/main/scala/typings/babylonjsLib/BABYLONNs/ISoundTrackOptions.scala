package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options allowed during the creation of a sound track.
  */
trait ISoundTrackOptions extends js.Object {
  /**
    * Define if the sound track is the main sound track of the scene
    */
  var mainTrack: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The volume the sound track should take during creation
    */
  var volume: js.UndefOr[scala.Double] = js.undefined
}

