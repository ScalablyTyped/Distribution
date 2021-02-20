package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlOptions extends StObject {
  
  var domain: String = js.native
  
  var domain_prefix: String = js.native
  
  var extensions: js.Array[String] = js.native
  
  var path: String = js.native
  
  var protocol: String = js.native
}
object UrlOptions {
  
  @scala.inline
  def apply(
    domain: String,
    domain_prefix: String,
    extensions: js.Array[String],
    path: String,
    protocol: String
  ): UrlOptions = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], domain_prefix = domain_prefix.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlOptions]
  }
  
  @scala.inline
  implicit class UrlOptionsMutableBuilder[Self <: UrlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain_prefix(value: String): Self = StObject.set(x, "domain_prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
