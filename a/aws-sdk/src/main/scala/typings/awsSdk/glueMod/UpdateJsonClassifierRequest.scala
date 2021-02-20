package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJsonClassifierRequest extends StObject {
  
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
  implicit class UpdateJsonClassifierRequestMutableBuilder[Self <: UpdateJsonClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsonPath(value: JsonPath): Self = StObject.set(x, "JsonPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonPathUndefined: Self = StObject.set(x, "JsonPath", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
