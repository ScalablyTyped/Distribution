package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobManifestSpec extends StObject {
  
  /**
    * If the specified manifest object is in the S3BatchOperations_CSV_20180820 format, this element describes which columns contain the required data.
    */
  var Fields: js.UndefOr[JobManifestFieldList] = js.native
  
  /**
    * Indicates which of the available formats the specified manifest uses.
    */
  var Format: JobManifestFormat = js.native
}
object JobManifestSpec {
  
  @scala.inline
  def apply(Format: JobManifestFormat): JobManifestSpec = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobManifestSpec]
  }
  
  @scala.inline
  implicit class JobManifestSpecMutableBuilder[Self <: JobManifestSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: JobManifestFieldList): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: JobManifestFieldName*): Self = StObject.set(x, "Fields", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: JobManifestFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
  }
}
