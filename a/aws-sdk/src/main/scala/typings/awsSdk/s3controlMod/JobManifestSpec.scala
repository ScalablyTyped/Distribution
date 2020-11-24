package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobManifestSpec extends js.Object {
  
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
  implicit class JobManifestSpecOps[Self <: JobManifestSpec] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: JobManifestFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: JobManifestFieldName*): Self = this.set("Fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: JobManifestFieldList): Self = this.set("Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("Fields", js.undefined)
  }
}
