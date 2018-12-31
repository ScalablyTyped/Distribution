package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "SpeedSummary")
@js.native
class SpeedSummary protected () extends js.Object {
  def this(name: java.lang.String) = this()
  var _speedTrackPtr: scala.Double = js.native
  var _speedTracks: js.Array[scala.Double] = js.native
  var _startTime: stdLib.Date = js.native
  var _timeWindow: scala.Double = js.native
  var _timeWindowInSeconds: scala.Double = js.native
  var _totalWindowSize: scala.Double = js.native
  var completeSize: scala.Double = js.native
  var name: java.lang.String = js.native
  var totalSize: scala.Double = js.native
  /**
    * Get average upload/download speed
    */
  def getAverageSpeed(): java.lang.String = js.native
  def getAverageSpeed(humanReadable: scala.Boolean): scala.Double = js.native
  /**
    * Get complete percentage
    */
  def getCompletePercent(): scala.Double = js.native
  def getCompletePercent(len: scala.Double): scala.Double = js.native
  /**
    * Get completed data size
    */
  def getCompleteSize(): java.lang.String = js.native
  def getCompleteSize(humanReadable: scala.Boolean): scala.Double = js.native
  /**
    * Get running seconds
    */
  def getElapsedSeconds(): java.lang.String = js.native
  def getElapsedSeconds(humanReadable: scala.Boolean): scala.Double = js.native
  /**
    * Get internal speed
    */
  def getSpeed(): java.lang.String = js.native
  def getSpeed(humanReadable: scala.Boolean): scala.Double = js.native
  /**
    * Get auto increment function
    */
  def getSpeed(size: scala.Double): js.Function2[/* error */ nodeLib.Error, /* value */ js.Any, scala.Unit] = js.native
  /**
    * Get total size
    */
  def getTotalSize(): java.lang.String = js.native
  def getTotalSize(humanReadable: scala.Boolean): scala.Double = js.native
}

