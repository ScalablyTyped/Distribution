package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportLabelsTaskRunProperties extends StObject {
  
  /**
    * The Amazon Simple Storage Service (Amazon S3) path from where you will import the labels.
    */
  var InputS3Path: js.UndefOr[UriString] = js.native
  
  /**
    * Indicates whether to overwrite your existing labels.
    */
  var Replace: js.UndefOr[ReplaceBoolean] = js.native
}
object ImportLabelsTaskRunProperties {
  
  @scala.inline
  def apply(): ImportLabelsTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportLabelsTaskRunProperties]
  }
  
  @scala.inline
  implicit class ImportLabelsTaskRunPropertiesMutableBuilder[Self <: ImportLabelsTaskRunProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputS3Path(value: UriString): Self = StObject.set(x, "InputS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputS3PathUndefined: Self = StObject.set(x, "InputS3Path", js.undefined)
    
    @scala.inline
    def setReplace(value: ReplaceBoolean): Self = StObject.set(x, "Replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "Replace", js.undefined)
  }
}
