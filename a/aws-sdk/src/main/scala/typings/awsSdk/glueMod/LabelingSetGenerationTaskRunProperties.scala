package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingSetGenerationTaskRunProperties extends StObject {
  
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where you will generate the labeling set.
    */
  var OutputS3Path: js.UndefOr[UriString] = js.undefined
}
object LabelingSetGenerationTaskRunProperties {
  
  @scala.inline
  def apply(): LabelingSetGenerationTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingSetGenerationTaskRunProperties]
  }
  
  @scala.inline
  implicit class LabelingSetGenerationTaskRunPropertiesMutableBuilder[Self <: LabelingSetGenerationTaskRunProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputS3Path(value: UriString): Self = StObject.set(x, "OutputS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3PathUndefined: Self = StObject.set(x, "OutputS3Path", js.undefined)
  }
}
