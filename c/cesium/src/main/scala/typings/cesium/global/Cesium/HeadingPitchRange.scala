package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.HeadingPitchRange")
@js.native
class HeadingPitchRange ()
  extends typings.cesium.mod.HeadingPitchRange {
  def this(heading: Double) = this()
  def this(heading: Double, pitch: Double) = this()
  def this(heading: Unit, pitch: Double) = this()
  def this(heading: Double, pitch: Double, range: Double) = this()
  def this(heading: Double, pitch: Unit, range: Double) = this()
  def this(heading: Unit, pitch: Double, range: Double) = this()
  def this(heading: Unit, pitch: Unit, range: Double) = this()
}
object HeadingPitchRange {
  
  @JSGlobal("Cesium.HeadingPitchRange")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(hpr: typings.cesium.mod.HeadingPitchRange): typings.cesium.mod.HeadingPitchRange = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(hpr.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.HeadingPitchRange]
  inline def clone_(hpr: typings.cesium.mod.HeadingPitchRange, result: typings.cesium.mod.HeadingPitchRange): typings.cesium.mod.HeadingPitchRange = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(hpr.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.HeadingPitchRange]
}
