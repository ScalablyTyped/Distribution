package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatasetRequest extends js.Object {
  
  var FormatOptions: js.UndefOr[typings.awsSdk.databrewMod.FormatOptions] = js.native
  
  var Input: typings.awsSdk.databrewMod.Input = js.native
  
  /**
    * The name of the dataset to be created.
    */
  var Name: DatasetName = js.native
  
  /**
    * Metadata tags to apply to this dataset.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object CreateDatasetRequest {
  
  @scala.inline
  def apply(Input: Input, Name: DatasetName): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  
  @scala.inline
  implicit class CreateDatasetRequestOps[Self <: CreateDatasetRequest] (val x: Self) extends AnyVal {
    
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
    def setInput(value: Input): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DatasetName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatOptions(value: FormatOptions): Self = this.set("FormatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatOptions: Self = this.set("FormatOptions", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
