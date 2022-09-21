package typings.cesium

import typings.cesium.mod.HeadingPitchRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingPitchRangeMod {
  
  @JSImport("cesium/Source/Core/HeadingPitchRange", JSImport.Default)
  @js.native
  open class default () extends HeadingPitchRange {
    def this(heading: Double) = this()
    def this(heading: Double, pitch: Double) = this()
    def this(heading: Unit, pitch: Double) = this()
    def this(heading: Double, pitch: Double, range: Double) = this()
    def this(heading: Double, pitch: Unit, range: Double) = this()
    def this(heading: Unit, pitch: Double, range: Double) = this()
    def this(heading: Unit, pitch: Unit, range: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/HeadingPitchRange", JSImport.Default)
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
}
