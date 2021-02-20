package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatasetRequest extends StObject {
  
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
  implicit class CreateDatasetRequestMutableBuilder[Self <: CreateDatasetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "FormatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatOptionsUndefined: Self = StObject.set(x, "FormatOptions", js.undefined)
    
    @scala.inline
    def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
