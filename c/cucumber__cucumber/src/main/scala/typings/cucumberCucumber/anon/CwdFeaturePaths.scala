package typings.cucumberCucumber.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CwdFeaturePaths extends StObject {
  
  var cwd: String
  
  var featurePaths: js.Array[String]
}
object CwdFeaturePaths {
  
  inline def apply(cwd: String, featurePaths: js.Array[String]): CwdFeaturePaths = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], featurePaths = featurePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[CwdFeaturePaths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CwdFeaturePaths] (val x: Self) extends AnyVal {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setFeaturePaths(value: js.Array[String]): Self = StObject.set(x, "featurePaths", value.asInstanceOf[js.Any])
    
    inline def setFeaturePathsVarargs(value: String*): Self = StObject.set(x, "featurePaths", js.Array(value*))
  }
}
