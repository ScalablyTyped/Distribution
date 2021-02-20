package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceProperties extends StObject {
  
  /**
    * A complex type that contains the ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
    */
  var DnsProperties: js.UndefOr[typings.awsSdk.servicediscoveryMod.DnsProperties] = js.native
  
  /**
    * A complex type that contains the name of an HTTP namespace.
    */
  var HttpProperties: js.UndefOr[typings.awsSdk.servicediscoveryMod.HttpProperties] = js.native
}
object NamespaceProperties {
  
  @scala.inline
  def apply(): NamespaceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceProperties]
  }
  
  @scala.inline
  implicit class NamespacePropertiesMutableBuilder[Self <: NamespaceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsProperties(value: DnsProperties): Self = StObject.set(x, "DnsProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsPropertiesUndefined: Self = StObject.set(x, "DnsProperties", js.undefined)
    
    @scala.inline
    def setHttpProperties(value: HttpProperties): Self = StObject.set(x, "HttpProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpPropertiesUndefined: Self = StObject.set(x, "HttpProperties", js.undefined)
  }
}
