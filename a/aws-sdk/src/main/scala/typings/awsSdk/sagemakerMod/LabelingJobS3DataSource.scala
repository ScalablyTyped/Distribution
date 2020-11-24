package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelingJobS3DataSource extends js.Object {
  
  /**
    * The Amazon S3 location of the manifest file that describes the input data objects.
    */
  var ManifestS3Uri: S3Uri = js.native
}
object LabelingJobS3DataSource {
  
  @scala.inline
  def apply(ManifestS3Uri: S3Uri): LabelingJobS3DataSource = {
    val __obj = js.Dynamic.literal(ManifestS3Uri = ManifestS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobS3DataSource]
  }
  
  @scala.inline
  implicit class LabelingJobS3DataSourceOps[Self <: LabelingJobS3DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setManifestS3Uri(value: S3Uri): Self = this.set("ManifestS3Uri", value.asInstanceOf[js.Any])
  }
}
