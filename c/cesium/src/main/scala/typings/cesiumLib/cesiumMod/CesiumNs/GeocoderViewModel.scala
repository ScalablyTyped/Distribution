package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderViewModel extends js.Object {
  var complete: Event[js.Array[_]]
  var flightDuration: scala.Double
  var isSearchInProgress: scala.Boolean
  var key: java.lang.String
  var scene: Scene
  var search: Command
  var searchText: java.lang.String
  var url: java.lang.String
}

object GeocoderViewModel {
  @scala.inline
  def apply(
    complete: Event[js.Array[_]],
    flightDuration: scala.Double,
    isSearchInProgress: scala.Boolean,
    key: java.lang.String,
    scene: Scene,
    search: Command,
    searchText: java.lang.String,
    url: java.lang.String
  ): GeocoderViewModel = {
    val __obj = js.Dynamic.literal(complete = complete, flightDuration = flightDuration, isSearchInProgress = isSearchInProgress, key = key, scene = scene, search = search, searchText = searchText, url = url)
  
    __obj.asInstanceOf[GeocoderViewModel]
  }
}

