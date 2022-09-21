package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetRequest extends StObject {
  
  /**
    * The file format of a dataset that is created from an Amazon S3 file or folder.
    */
  var Format: js.UndefOr[InputFormat] = js.undefined
  
  var FormatOptions: js.UndefOr[typings.awsSdk.databrewMod.FormatOptions] = js.undefined
  
  var Input: typings.awsSdk.databrewMod.Input
  
  /**
    * The name of the dataset to be created. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and space.
    */
  var Name: DatasetName
  
  /**
    * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
    */
  var PathOptions: js.UndefOr[typings.awsSdk.databrewMod.PathOptions] = js.undefined
  
  /**
    * Metadata tags to apply to this dataset.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateDatasetRequest {
  
  inline def apply(Input: Input, Name: DatasetName): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  
  extension [Self <: CreateDatasetRequest](x: Self) {
    
    inline def setFormat(value: InputFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "FormatOptions", value.asInstanceOf[js.Any])
    
    inline def setFormatOptionsUndefined: Self = StObject.set(x, "FormatOptions", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "PathOptions", value.asInstanceOf[js.Any])
    
    inline def setPathOptionsUndefined: Self = StObject.set(x, "PathOptions", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
