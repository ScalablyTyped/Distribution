package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionImageInsertionFramerate extends StObject {
  
  /**
    * The bottom of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set this value to 1.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max17895697] = js.native
  
  /**
    * The top of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set this value to 24.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483640] = js.native
}
object MotionImageInsertionFramerate {
  
  @scala.inline
  def apply(): MotionImageInsertionFramerate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionImageInsertionFramerate]
  }
  
  @scala.inline
  implicit class MotionImageInsertionFramerateMutableBuilder[Self <: MotionImageInsertionFramerate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFramerateDenominator(value: integerMin1Max17895697): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    @scala.inline
    def setFramerateNumerator(value: integerMin1Max2147483640): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
  }
}
