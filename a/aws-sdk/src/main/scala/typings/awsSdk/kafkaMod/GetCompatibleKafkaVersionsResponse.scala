package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCompatibleKafkaVersionsResponse extends StObject {
  
  /**
    * 
    A list of CompatibleKafkaVersion objects.
    
    */
  var CompatibleKafkaVersions: js.UndefOr[listOfCompatibleKafkaVersion] = js.undefined
}
object GetCompatibleKafkaVersionsResponse {
  
  inline def apply(): GetCompatibleKafkaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleKafkaVersionsResponse]
  }
  
  extension [Self <: GetCompatibleKafkaVersionsResponse](x: Self) {
    
    inline def setCompatibleKafkaVersions(value: listOfCompatibleKafkaVersion): Self = StObject.set(x, "CompatibleKafkaVersions", value.asInstanceOf[js.Any])
    
    inline def setCompatibleKafkaVersionsUndefined: Self = StObject.set(x, "CompatibleKafkaVersions", js.undefined)
    
    inline def setCompatibleKafkaVersionsVarargs(value: CompatibleKafkaVersion*): Self = StObject.set(x, "CompatibleKafkaVersions", js.Array(value*))
  }
}
