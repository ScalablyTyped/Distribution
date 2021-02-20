package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.webgl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Features extends StObject {
  
  /** List of the 3D-related features your app requires. */
  var features: js.Array[webgl] = js.native
}
object Features {
  
  @scala.inline
  def apply(features: js.Array[webgl]): Features = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  
  @scala.inline
  implicit class FeaturesMutableBuilder[Self <: Features] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[webgl]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesVarargs(value: webgl*): Self = StObject.set(x, "features", js.Array(value :_*))
  }
}
