package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJsonClassifierRequest extends StObject {
  
  /**
    * A JsonPath string defining the JSON data for the classifier to classify. Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
    */
  var JsonPath: typings.awsSdk.glueMod.JsonPath
  
  /**
    * The name of the classifier.
    */
  var Name: NameString
}
object CreateJsonClassifierRequest {
  
  inline def apply(JsonPath: JsonPath, Name: NameString): CreateJsonClassifierRequest = {
    val __obj = js.Dynamic.literal(JsonPath = JsonPath.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJsonClassifierRequest]
  }
  
  extension [Self <: CreateJsonClassifierRequest](x: Self) {
    
    inline def setJsonPath(value: JsonPath): Self = StObject.set(x, "JsonPath", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
