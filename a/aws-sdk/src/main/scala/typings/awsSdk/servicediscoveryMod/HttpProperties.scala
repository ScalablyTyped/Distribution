package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpProperties extends js.Object {
  
  /**
    * The name of an HTTP namespace.
    */
  var HttpName: js.UndefOr[NamespaceName] = js.native
}
object HttpProperties {
  
  @scala.inline
  def apply(): HttpProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpProperties]
  }
  
  @scala.inline
  implicit class HttpPropertiesOps[Self <: HttpProperties] (val x: Self) extends AnyVal {
    
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
    def setHttpName(value: NamespaceName): Self = this.set("HttpName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpName: Self = this.set("HttpName", js.undefined)
  }
}
