package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterConstructorOptions extends js.Object {
  
  /**
    * The path to the certificate to use for SSL connections
    */
  var certpath: String = js.native
}
object ClusterConstructorOptions {
  
  @scala.inline
  def apply(certpath: String): ClusterConstructorOptions = {
    val __obj = js.Dynamic.literal(certpath = certpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterConstructorOptions]
  }
  
  @scala.inline
  implicit class ClusterConstructorOptionsOps[Self <: ClusterConstructorOptions] (val x: Self) extends AnyVal {
    
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
    def setCertpath(value: String): Self = this.set("certpath", value.asInstanceOf[js.Any])
  }
}
