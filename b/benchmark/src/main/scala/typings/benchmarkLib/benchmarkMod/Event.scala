package typings
package benchmarkLib.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("benchmark", "Event")
@js.native
class Event protected ()
  extends benchmarkLib.benchmarkMod.BenchmarkNs.Event {
  def this(`type`: java.lang.String) = this()
  def this(`type`: js.Object) = this()
  /* CompleteClass */
  override var aborted: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelled: scala.Boolean = js.native
  /* CompleteClass */
  override var currentTarget: js.Object = js.native
  /* CompleteClass */
  override var result: js.Any = js.native
  /* CompleteClass */
  override var target: js.Object = js.native
  /* CompleteClass */
  override var timeStamp: scala.Double = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
}

