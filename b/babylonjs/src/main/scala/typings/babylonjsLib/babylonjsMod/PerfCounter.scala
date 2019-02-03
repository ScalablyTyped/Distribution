package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is used to track a performance counter which is number based.
  * The user has access to many properties which give statistics of different nature.
  *
  * The implementer can track two kinds of Performance Counter: time and count.
  * For time you can optionally call fetchNewFrame() to notify the start of a new frame to monitor, then call beginMonitoring() to start and endMonitoring() to record the lapsed time. endMonitoring takes a newFrame parameter for you to specify if the monitored time should be set for a new frame or accumulated to the current frame being monitored.
  * For count you first have to call fetchNewFrame() to notify the start of a new frame to monitor, then call addCount() how many time required to increment the count value you monitor.
  */
@JSImport("babylonjs", "PerfCounter")
@js.native
/**
  * Creates a new counter
  */
class PerfCounter ()
  extends babylonjsLib.BABYLONNs.PerfCounter

/* static members */
@JSImport("babylonjs", "PerfCounter")
@js.native
object PerfCounter extends js.Object {
  /**
    * Gets or sets a global boolean to turn on and off all the counters
    */
  var Enabled: scala.Boolean = js.native
}

