package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  /**
    * Default: false
    */
  var includeStack: Boolean
  
  /**
    * Default: ['then', 'catch', 'inspect', 'toJSON']
    */
  var proxyExcludedKeys: js.Array[String]
  
  /**
    * Default: true
    */
  var showDiff: Boolean
  
  /**
    * Default: 40
    */
  var truncateThreshold: Double
  
  /**
    * Default: true
    */
  var useProxy: Boolean
}
object Config {
  
  inline def apply(
    includeStack: Boolean,
    proxyExcludedKeys: js.Array[String],
    showDiff: Boolean,
    truncateThreshold: Double,
    useProxy: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(includeStack = includeStack.asInstanceOf[js.Any], proxyExcludedKeys = proxyExcludedKeys.asInstanceOf[js.Any], showDiff = showDiff.asInstanceOf[js.Any], truncateThreshold = truncateThreshold.asInstanceOf[js.Any], useProxy = useProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    inline def setIncludeStack(value: Boolean): Self = StObject.set(x, "includeStack", value.asInstanceOf[js.Any])
    
    inline def setProxyExcludedKeys(value: js.Array[String]): Self = StObject.set(x, "proxyExcludedKeys", value.asInstanceOf[js.Any])
    
    inline def setProxyExcludedKeysVarargs(value: String*): Self = StObject.set(x, "proxyExcludedKeys", js.Array(value*))
    
    inline def setShowDiff(value: Boolean): Self = StObject.set(x, "showDiff", value.asInstanceOf[js.Any])
    
    inline def setTruncateThreshold(value: Double): Self = StObject.set(x, "truncateThreshold", value.asInstanceOf[js.Any])
    
    inline def setUseProxy(value: Boolean): Self = StObject.set(x, "useProxy", value.asInstanceOf[js.Any])
  }
}
