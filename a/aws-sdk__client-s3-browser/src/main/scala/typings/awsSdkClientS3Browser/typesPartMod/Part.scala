package typings.awsSdkClientS3Browser.typesPartMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Part extends js.Object {
  
  /**
    * <p>Entity tag returned when the part was uploaded.</p>
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * <p>Date and time at which the part was uploaded.</p>
    */
  var LastModified: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>Part number identifying the part. This is a positive integer between 1 and 10,000.</p>
    */
  var PartNumber: js.UndefOr[Double] = js.native
  
  /**
    * <p>Size of the uploaded part data.</p>
    */
  var Size: js.UndefOr[Double] = js.native
}
object Part {
  
  @scala.inline
  def apply(): Part = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Part]
  }
  
  @scala.inline
  implicit class PartOps[Self <: Part] (val x: Self) extends AnyVal {
    
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    
    @scala.inline
    def setLastModified(value: Date | String | Double): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    
    @scala.inline
    def setPartNumber(value: Double): Self = this.set("PartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartNumber: Self = this.set("PartNumber", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
  }
}
