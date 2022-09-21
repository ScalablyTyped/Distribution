package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.webgl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features extends StObject {
  
  /** List of the 3D-related features your app requires. */
  var features: js.Array[webgl]
}
object Features {
  
  inline def apply(features: js.Array[webgl]): Features = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  
  extension [Self <: Features](x: Self) {
    
    inline def setFeatures(value: js.Array[webgl]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: webgl*): Self = StObject.set(x, "features", js.Array(value*))
  }
}
