package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumBundleCreationNonCompatMode extends StObject {
  
  var numBundleCreationNonCompatMode: Double
  
  var numBundleReuseNonCompatMode: Double
  
  var numEnableDrawWrapper: Double
  
  var numEnableEffects: Double
}
object NumBundleCreationNonCompatMode {
  
  inline def apply(
    numBundleCreationNonCompatMode: Double,
    numBundleReuseNonCompatMode: Double,
    numEnableDrawWrapper: Double,
    numEnableEffects: Double
  ): NumBundleCreationNonCompatMode = {
    val __obj = js.Dynamic.literal(numBundleCreationNonCompatMode = numBundleCreationNonCompatMode.asInstanceOf[js.Any], numBundleReuseNonCompatMode = numBundleReuseNonCompatMode.asInstanceOf[js.Any], numEnableDrawWrapper = numEnableDrawWrapper.asInstanceOf[js.Any], numEnableEffects = numEnableEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumBundleCreationNonCompatMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumBundleCreationNonCompatMode] (val x: Self) extends AnyVal {
    
    inline def setNumBundleCreationNonCompatMode(value: Double): Self = StObject.set(x, "numBundleCreationNonCompatMode", value.asInstanceOf[js.Any])
    
    inline def setNumBundleReuseNonCompatMode(value: Double): Self = StObject.set(x, "numBundleReuseNonCompatMode", value.asInstanceOf[js.Any])
    
    inline def setNumEnableDrawWrapper(value: Double): Self = StObject.set(x, "numEnableDrawWrapper", value.asInstanceOf[js.Any])
    
    inline def setNumEnableEffects(value: Double): Self = StObject.set(x, "numEnableEffects", value.asInstanceOf[js.Any])
  }
}
