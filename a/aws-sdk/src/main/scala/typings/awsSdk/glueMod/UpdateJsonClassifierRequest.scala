package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJsonClassifierRequest extends js.Object {
  
  /**
    * A JsonPath string defining the JSON data for the classifier to classify. AWS Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
    */
  var JsonPath: js.UndefOr[typings.awsSdk.glueMod.JsonPath] = js.native
  
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
}
object UpdateJsonClassifierRequest {
  
  @scala.inline
  def apply(Name: NameString): UpdateJsonClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJsonClassifierRequest]
  }
  
  @scala.inline
  implicit class UpdateJsonClassifierRequestOps[Self <: UpdateJsonClassifierRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonPath(value: JsonPath): Self = this.set("JsonPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonPath: Self = this.set("JsonPath", js.undefined)
  }
}
