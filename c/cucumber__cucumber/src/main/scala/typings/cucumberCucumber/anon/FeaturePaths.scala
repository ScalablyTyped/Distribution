package typings.cucumberCucumber.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturePaths extends StObject {
  
  var featurePaths: js.Array[String]
  
  var importPaths: js.Array[String]
  
  var requirePaths: js.Array[String]
  
  var unexpandedFeaturePaths: js.Array[String]
}
object FeaturePaths {
  
  inline def apply(
    featurePaths: js.Array[String],
    importPaths: js.Array[String],
    requirePaths: js.Array[String],
    unexpandedFeaturePaths: js.Array[String]
  ): FeaturePaths = {
    val __obj = js.Dynamic.literal(featurePaths = featurePaths.asInstanceOf[js.Any], importPaths = importPaths.asInstanceOf[js.Any], requirePaths = requirePaths.asInstanceOf[js.Any], unexpandedFeaturePaths = unexpandedFeaturePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturePaths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturePaths] (val x: Self) extends AnyVal {
    
    inline def setFeaturePaths(value: js.Array[String]): Self = StObject.set(x, "featurePaths", value.asInstanceOf[js.Any])
    
    inline def setFeaturePathsVarargs(value: String*): Self = StObject.set(x, "featurePaths", js.Array(value*))
    
    inline def setImportPaths(value: js.Array[String]): Self = StObject.set(x, "importPaths", value.asInstanceOf[js.Any])
    
    inline def setImportPathsVarargs(value: String*): Self = StObject.set(x, "importPaths", js.Array(value*))
    
    inline def setRequirePaths(value: js.Array[String]): Self = StObject.set(x, "requirePaths", value.asInstanceOf[js.Any])
    
    inline def setRequirePathsVarargs(value: String*): Self = StObject.set(x, "requirePaths", js.Array(value*))
    
    inline def setUnexpandedFeaturePaths(value: js.Array[String]): Self = StObject.set(x, "unexpandedFeaturePaths", value.asInstanceOf[js.Any])
    
    inline def setUnexpandedFeaturePathsVarargs(value: String*): Self = StObject.set(x, "unexpandedFeaturePaths", js.Array(value*))
  }
}
