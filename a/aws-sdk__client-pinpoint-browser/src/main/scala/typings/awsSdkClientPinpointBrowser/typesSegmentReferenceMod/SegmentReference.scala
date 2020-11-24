package typings.awsSdkClientPinpointBrowser.typesSegmentReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentReference extends js.Object {
  
  /**
    * A unique identifier for the segment.
    */
  var Id: js.UndefOr[String] = js.native
  
  /**
    * If specified contains a specific version of the segment included.
    */
  var Version: js.UndefOr[Double] = js.native
}
object SegmentReference {
  
  @scala.inline
  def apply(): SegmentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentReference]
  }
  
  @scala.inline
  implicit class SegmentReferenceOps[Self <: SegmentReference] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
