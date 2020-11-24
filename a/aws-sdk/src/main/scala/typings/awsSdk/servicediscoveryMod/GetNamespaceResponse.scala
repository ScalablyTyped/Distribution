package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNamespaceResponse extends js.Object {
  
  /**
    * A complex type that contains information about the specified namespace.
    */
  var Namespace: js.UndefOr[typings.awsSdk.servicediscoveryMod.Namespace] = js.native
}
object GetNamespaceResponse {
  
  @scala.inline
  def apply(): GetNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNamespaceResponse]
  }
  
  @scala.inline
  implicit class GetNamespaceResponseOps[Self <: GetNamespaceResponse] (val x: Self) extends AnyVal {
    
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
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
  }
}
