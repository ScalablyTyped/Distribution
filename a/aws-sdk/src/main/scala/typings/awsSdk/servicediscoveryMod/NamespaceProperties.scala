package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceProperties extends js.Object {
  
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
  implicit class NamespacePropertiesOps[Self <: NamespaceProperties] (val x: Self) extends AnyVal {
    
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
    def setDnsProperties(value: DnsProperties): Self = this.set("DnsProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsProperties: Self = this.set("DnsProperties", js.undefined)
    
    @scala.inline
    def setHttpProperties(value: HttpProperties): Self = this.set("HttpProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpProperties: Self = this.set("HttpProperties", js.undefined)
  }
}
