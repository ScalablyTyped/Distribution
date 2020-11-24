package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonClassifier extends js.Object {
  
  /**
    * The time that this classifier was registered.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A JsonPath string defining the JSON data for the classifier to classify. AWS Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
    */
  var JsonPath: typings.awsSdk.glueMod.JsonPath = js.native
  
  /**
    * The time that this classifier was last updated.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
  
  /**
    * The version of this classifier.
    */
  var Version: js.UndefOr[VersionId] = js.native
}
object JsonClassifier {
  
  @scala.inline
  def apply(JsonPath: JsonPath, Name: NameString): JsonClassifier = {
    val __obj = js.Dynamic.literal(JsonPath = JsonPath.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonClassifier]
  }
  
  @scala.inline
  implicit class JsonClassifierOps[Self <: JsonClassifier] (val x: Self) extends AnyVal {
    
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
    def setJsonPath(value: JsonPath): Self = this.set("JsonPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: Timestamp): Self = this.set("LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdated: Self = this.set("LastUpdated", js.undefined)
    
    @scala.inline
    def setVersion(value: VersionId): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
