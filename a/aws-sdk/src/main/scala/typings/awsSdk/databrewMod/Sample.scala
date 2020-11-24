package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sample extends js.Object {
  
  /**
    * The number of rows in the sample.
    */
  var Size: js.UndefOr[SampleSize] = js.native
  
  /**
    * The way in which DataBrew obtains rows from a dataset.
    */
  var Type: SampleType = js.native
}
object Sample {
  
  @scala.inline
  def apply(Type: SampleType): Sample = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sample]
  }
  
  @scala.inline
  implicit class SampleOps[Self <: Sample] (val x: Self) extends AnyVal {
    
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
    def setType(value: SampleType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: SampleSize): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
  }
}
