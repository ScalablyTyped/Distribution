package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "HeadingPitchRange")
@js.native
class HeadingPitchRange () extends StObject {
  def this(heading: Double) = this()
  def this(heading: Double, pitch: Double) = this()
  def this(heading: Unit, pitch: Double) = this()
  def this(heading: Double, pitch: Double, range: Double) = this()
  def this(heading: Double, pitch: Unit, range: Double) = this()
  def this(heading: Unit, pitch: Double, range: Double) = this()
  def this(heading: Unit, pitch: Unit, range: Double) = this()
  
  var heading: Double = js.native
  
  var pitch: Double = js.native
  
  var range: Double = js.native
}
object HeadingPitchRange {
  
  @JSImport("cesium", "HeadingPitchRange")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def clone_(hpr: HeadingPitchRange): HeadingPitchRange = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(hpr.asInstanceOf[js.Any]).asInstanceOf[HeadingPitchRange]
  @scala.inline
  def clone_(hpr: HeadingPitchRange, result: HeadingPitchRange): HeadingPitchRange = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(hpr.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRange]
}
