package typings.chance.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.UrlOptions> */
trait PartialUrlOptions extends StObject {
  
  var domain: js.UndefOr[String] = js.undefined
  
  var domain_prefix: js.UndefOr[String] = js.undefined
  
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
}
object PartialUrlOptions {
  
  @scala.inline
  def apply(): PartialUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUrlOptions]
  }
  
  @scala.inline
  implicit class PartialUrlOptionsMutableBuilder[Self <: PartialUrlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setDomain_prefix(value: String): Self = StObject.set(x, "domain_prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain_prefixUndefined: Self = StObject.set(x, "domain_prefix", js.undefined)
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
