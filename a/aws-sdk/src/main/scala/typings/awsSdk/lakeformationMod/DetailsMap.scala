package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailsMap extends js.Object {
  
  /**
    * A share resource ARN for a catalog resource shared through AWS Resource Access Manager (AWS RAM).
    */
  var ResourceShare: js.UndefOr[ResourceShareList] = js.native
}
object DetailsMap {
  
  @scala.inline
  def apply(): DetailsMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsMap]
  }
  
  @scala.inline
  implicit class DetailsMapOps[Self <: DetailsMap] (val x: Self) extends AnyVal {
    
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
    def setResourceShareVarargs(value: RAMResourceShareArn*): Self = this.set("ResourceShare", js.Array(value :_*))
    
    @scala.inline
    def setResourceShare(value: ResourceShareList): Self = this.set("ResourceShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceShare: Self = this.set("ResourceShare", js.undefined)
  }
}
