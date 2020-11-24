package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringConstraintsResource extends js.Object {
  
  /**
    * The Amazon S3 URI for the constraints resource.
    */
  var S3Uri: js.UndefOr[typings.awsSdk.sagemakerMod.S3Uri] = js.native
}
object MonitoringConstraintsResource {
  
  @scala.inline
  def apply(): MonitoringConstraintsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConstraintsResource]
  }
  
  @scala.inline
  implicit class MonitoringConstraintsResourceOps[Self <: MonitoringConstraintsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = this.set("S3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Uri: Self = this.set("S3Uri", js.undefined)
  }
}
