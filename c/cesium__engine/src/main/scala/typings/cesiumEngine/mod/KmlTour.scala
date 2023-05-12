package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "KmlTour")
@js.native
open class KmlTour protected () extends StObject {
  def this(name: String, id: String, playlist: js.Array[Any]) = this()
  
  /**
    * Add entry to this tour playlist.
    * @param entry - an entry to add to the playlist.
    */
  def addPlaylistEntry(entry: KmlTourFlyTo): Unit = js.native
  def addPlaylistEntry(entry: KmlTourWait): Unit = js.native
  
  /**
    * Event will be called when entry from playlist ends to play.
    *
    * Event callback will be called with following parameters:
    * 1. entry - entry
    * 2. terminated - true if playback was terminated by calling {@link KmlTour#stop}
    */
  var entryEnd: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Event will be called when entry from playlist starts to play.
    *
    * Event callback will be called with curent entry as first parameter.
    */
  var entryStart: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Id of kml gx:Tour entry
    */
  var id: String = js.native
  
  /**
    * Tour name
    */
  var name: String = js.native
  
  def play(widget: CesiumWidget): Unit = js.native
  def play(widget: CesiumWidget, cameraOptions: Any): Unit = js.native
  /**
    * Play this tour.
    * @param widget - The widget.
    * @param [cameraOptions] - these options will be merged with {@link Camera#flyTo}
    * options for FlyTo playlist entries.
    */
  def play(widget: Viewer): Unit = js.native
  def play(widget: Viewer, cameraOptions: Any): Unit = js.native
  
  /**
    * Array of playlist entries
    */
  var playlist: js.Array[Any] = js.native
  
  /**
    * Index of current entry from playlist
    */
  var playlistIndex: Double = js.native
  
  /**
    * Stop curently playing tour.
    */
  def stop(): Unit = js.native
  
  /**
    * Event will be called when all playlist entries are
    * played, or tour playback being canceled.
    *
    * If tour playback was terminated, event callback will
    * be called with terminated=true parameter.
    */
  var tourEnd: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Event will be called when tour starts to play,
    * before any playlist entry starts to play.
    */
  var tourStart: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
}
