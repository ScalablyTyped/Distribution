package typings.cesium.mod

import typings.cesium.anon.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ParticleBurst")
@js.native
open class ParticleBurst () extends StObject {
  def this(options: Time) = this()
  
  /**
    * <code>true</code> if the burst has been completed; <code>false</code> otherwise.
    */
  var complete: Boolean = js.native
  
  /**
    * The maximum number of particles emitted.
    */
  var maximum: Double = js.native
  
  /**
    * The minimum number of particles emitted.
    */
  var minimum: Double = js.native
  
  /**
    * The time in seconds after the beginning of the particle system's lifetime that the burst will occur.
    */
  var time: Double = js.native
}
