package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseUrl extends StObject {
  
  var BaseUrl: Any
  
  var CorsBehavior: Any
  
  var DefaultRetryStrategy: Any
  
  var PreprocessUrl: Any
}
object BaseUrl {
  
  inline def apply(BaseUrl: Any, CorsBehavior: Any, DefaultRetryStrategy: Any, PreprocessUrl: Any): BaseUrl = {
    val __obj = js.Dynamic.literal(BaseUrl = BaseUrl.asInstanceOf[js.Any], CorsBehavior = CorsBehavior.asInstanceOf[js.Any], DefaultRetryStrategy = DefaultRetryStrategy.asInstanceOf[js.Any], PreprocessUrl = PreprocessUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseUrl] (val x: Self) extends AnyVal {
    
    inline def setBaseUrl(value: Any): Self = StObject.set(x, "BaseUrl", value.asInstanceOf[js.Any])
    
    inline def setCorsBehavior(value: Any): Self = StObject.set(x, "CorsBehavior", value.asInstanceOf[js.Any])
    
    inline def setDefaultRetryStrategy(value: Any): Self = StObject.set(x, "DefaultRetryStrategy", value.asInstanceOf[js.Any])
    
    inline def setPreprocessUrl(value: Any): Self = StObject.set(x, "PreprocessUrl", value.asInstanceOf[js.Any])
  }
}
