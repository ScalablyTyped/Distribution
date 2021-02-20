package typings.azure.mod

import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "SpeedSummary")
@js.native
class SpeedSummary protected () extends StObject {
  def this(name: String) = this()
  
  var _speedTrackPtr: Double = js.native
  
  var _speedTracks: js.Array[Double] = js.native
  
  var _startTime: Date = js.native
  
  var _timeWindow: Double = js.native
  
  var _timeWindowInSeconds: Double = js.native
  
  var _totalWindowSize: Double = js.native
  
  var completeSize: Double = js.native
  
  /**
    * Get average upload/download speed
    */
  def getAverageSpeed(): String = js.native
  def getAverageSpeed(humanReadable: Boolean): Double = js.native
  
  /**
    * Get complete percentage
    */
  def getCompletePercent(): Double = js.native
  def getCompletePercent(len: Double): Double = js.native
  
  /**
    * Get completed data size
    */
  def getCompleteSize(): String = js.native
  def getCompleteSize(humanReadable: Boolean): Double = js.native
  
  /**
    * Get running seconds
    */
  def getElapsedSeconds(): String = js.native
  def getElapsedSeconds(humanReadable: Boolean): Double = js.native
  
  /**
    * Get internal speed
    */
  def getSpeed(): String = js.native
  def getSpeed(humanReadable: Boolean): Double = js.native
  /**
    * Get auto increment function
    */
  def getSpeed(size: Double): js.Function2[/* error */ Error, /* value */ js.Any, Unit] = js.native
  
  /**
    * Get total size
    */
  def getTotalSize(): String = js.native
  def getTotalSize(humanReadable: Boolean): Double = js.native
  
  var name: String = js.native
  
  var totalSize: Double = js.native
}
