package typings.awsSdkTypes.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionInfo extends js.Object {
  
  var hostname: String = js.native
  
  var partition: String = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var signingRegion: js.UndefOr[String] = js.native
  
  var signingService: js.UndefOr[String] = js.native
}
object RegionInfo {
  
  @scala.inline
  def apply(hostname: String, partition: String): RegionInfo = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionInfo]
  }
  
  @scala.inline
  implicit class RegionInfoOps[Self <: RegionInfo] (val x: Self) extends AnyVal {
    
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
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartition(value: String): Self = this.set("partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSigningRegion(value: String): Self = this.set("signingRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningRegion: Self = this.set("signingRegion", js.undefined)
    
    @scala.inline
    def setSigningService(value: String): Self = this.set("signingService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningService: Self = this.set("signingService", js.undefined)
  }
}
