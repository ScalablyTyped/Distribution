package typings.azure.mod

import typings.azure.anon.Delete
import typings.azure.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageServiceProperties extends js.Object {
  
  var DefaultServiceVersion: String = js.native
  
  var Logging: Delete = js.native
  
  var Metrics: Enabled = js.native
}
object StorageServiceProperties {
  
  @scala.inline
  def apply(DefaultServiceVersion: String, Logging: Delete, Metrics: Enabled): StorageServiceProperties = {
    val __obj = js.Dynamic.literal(DefaultServiceVersion = DefaultServiceVersion.asInstanceOf[js.Any], Logging = Logging.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageServiceProperties]
  }
  
  @scala.inline
  implicit class StorageServicePropertiesOps[Self <: StorageServiceProperties] (val x: Self) extends AnyVal {
    
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
    def setDefaultServiceVersion(value: String): Self = this.set("DefaultServiceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogging(value: Delete): Self = this.set("Logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: Enabled): Self = this.set("Metrics", value.asInstanceOf[js.Any])
  }
}
