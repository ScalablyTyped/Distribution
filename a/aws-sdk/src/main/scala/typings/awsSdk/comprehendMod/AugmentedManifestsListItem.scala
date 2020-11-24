package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AugmentedManifestsListItem extends js.Object {
  
  /**
    * The JSON attribute that contains the annotations for your training documents. The number of attribute names that you specify depends on whether your augmented manifest file is the output of a single labeling job or a chained labeling job. If your file is the output of a single labeling job, specify the LabelAttributeName key that was used when the job was created in Ground Truth. If your file is the output of a chained labeling job, specify the LabelAttributeName key for one or more jobs in the chain. Each LabelAttributeName key provides the annotations from an individual job.
    */
  var AttributeNames: AttributeNamesList = js.native
  
  /**
    * The Amazon S3 location of the augmented manifest file.
    */
  var S3Uri: typings.awsSdk.comprehendMod.S3Uri = js.native
}
object AugmentedManifestsListItem {
  
  @scala.inline
  def apply(AttributeNames: AttributeNamesList, S3Uri: S3Uri): AugmentedManifestsListItem = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AugmentedManifestsListItem]
  }
  
  @scala.inline
  implicit class AugmentedManifestsListItemOps[Self <: AugmentedManifestsListItem] (val x: Self) extends AnyVal {
    
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
    def setAttributeNamesVarargs(value: AttributeNamesListItem*): Self = this.set("AttributeNames", js.Array(value :_*))
    
    @scala.inline
    def setAttributeNames(value: AttributeNamesList): Self = this.set("AttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = this.set("S3Uri", value.asInstanceOf[js.Any])
  }
}
