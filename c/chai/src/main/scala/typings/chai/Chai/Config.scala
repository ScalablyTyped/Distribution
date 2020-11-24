package typings.chai.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  /**
    * Default: false
    */
  var includeStack: Boolean = js.native
  
  /**
    * Default: ['then', 'catch', 'inspect', 'toJSON']
    */
  var proxyExcludedKeys: js.Array[String] = js.native
  
  /**
    * Default: true
    */
  var showDiff: Boolean = js.native
  
  /**
    * Default: 40
    */
  var truncateThreshold: Double = js.native
  
  /**
    * Default: true
    */
  var useProxy: Boolean = js.native
}
object Config {
  
  @scala.inline
  def apply(
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
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIncludeStack(value: Boolean): Self = this.set("includeStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyExcludedKeysVarargs(value: String*): Self = this.set("proxyExcludedKeys", js.Array(value :_*))
    
    @scala.inline
    def setProxyExcludedKeys(value: js.Array[String]): Self = this.set("proxyExcludedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDiff(value: Boolean): Self = this.set("showDiff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncateThreshold(value: Double): Self = this.set("truncateThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseProxy(value: Boolean): Self = this.set("useProxy", value.asInstanceOf[js.Any])
  }
}
