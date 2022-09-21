package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "HeadingPitchRange")
@js.native
open class HeadingPitchRange () extends StObject {
  def this(heading: Double) = this()
  def this(heading: Double, pitch: Double) = this()
  def this(heading: Unit, pitch: Double) = this()
  def this(heading: Double, pitch: Double, range: Double) = this()
  def this(heading: Double, pitch: Unit, range: Double) = this()
  def this(heading: Unit, pitch: Double, range: Double) = this()
  def this(heading: Unit, pitch: Unit, range: Double) = this()
  
  /**
    * Heading is the rotation from the local north direction where a positive angle is increasing eastward.
    */
  var heading: Double = js.native
  
  /**
    * Pitch is the rotation from the local xy-plane. Positive pitch angles
    * are above the plane. Negative pitch angles are below the plane.
    */
  var pitch: Double = js.native
  
  /**
    * Range is the distance from the center of the local frame.
    */
  var range: Double = js.native
}
/* static members */
object HeadingPitchRange {
  
  @JSImport("cesium", "HeadingPitchRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Duplicates a HeadingPitchRange instance.
    * @param hpr - The HeadingPitchRange to duplicate.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new HeadingPitchRange instance if one was not provided. (Returns undefined if hpr is undefined)
    */
  inline def clone(hpr: HeadingPitchRange): HeadingPitchRange = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(hpr.asInstanceOf[js.Any]).asInstanceOf[HeadingPitchRange]
  inline def clone(hpr: HeadingPitchRange, result: HeadingPitchRange): HeadingPitchRange = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(hpr.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRange]
}
