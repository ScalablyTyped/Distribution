package typings.consul.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsulOptions extends StObject {
  
  var ca: js.UndefOr[js.Array[String]] = js.native
  
  var defaults: js.UndefOr[CommonOptions] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[String] = js.native
  
  var promisify: js.UndefOr[Boolean | js.Function] = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
}
object ConsulOptions {
  
  @scala.inline
  def apply(): ConsulOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsulOptions]
  }
  
  @scala.inline
  implicit class ConsulOptionsMutableBuilder[Self <: ConsulOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCa(value: js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    @scala.inline
    def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value :_*))
    
    @scala.inline
    def setDefaults(value: CommonOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setPromisify(value: Boolean | js.Function): Self = StObject.set(x, "promisify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromisifyUndefined: Self = StObject.set(x, "promisify", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
  }
}
