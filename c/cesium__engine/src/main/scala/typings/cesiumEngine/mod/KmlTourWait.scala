package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.KmlTourWait.DoneCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "KmlTourWait")
@js.native
open class KmlTourWait protected () extends StObject {
  def this(duration: Double) = this()
  
  /**
    * Play this playlist entry
    * @param done - function which will be called when playback ends
    */
  def play(done: DoneCallback): Unit = js.native
  
  /**
    * Stop execution of curent entry, cancel curent timeout
    */
  def stop(): Unit = js.native
}
object KmlTourWait {
  
  /**
    * A function which will be called when playback ends.
    * @param terminated - true if {@link KmlTourWait#stop} was
    * called before entry done playback.
    */
  type DoneCallback = js.Function1[/* terminated */ Boolean, Unit]
}
