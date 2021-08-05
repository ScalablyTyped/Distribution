package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntityRecognizerResponse extends StObject {
  
  /**
    * Describes information associated with an entity recognizer.
    */
  var EntityRecognizerProperties: js.UndefOr[typings.awsSdk.comprehendMod.EntityRecognizerProperties] = js.undefined
}
object DescribeEntityRecognizerResponse {
  
  inline def apply(): DescribeEntityRecognizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntityRecognizerResponse]
  }
  
  extension [Self <: DescribeEntityRecognizerResponse](x: Self) {
    
    inline def setEntityRecognizerProperties(value: EntityRecognizerProperties): Self = StObject.set(x, "EntityRecognizerProperties", value.asInstanceOf[js.Any])
    
    inline def setEntityRecognizerPropertiesUndefined: Self = StObject.set(x, "EntityRecognizerProperties", js.undefined)
  }
}
