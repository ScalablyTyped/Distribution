package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentParameter extends StObject {
  
  /**
    * The environment key suggested by the Amazon SageMaker Inference Recommender.
    */
  var Key: String
  
  /**
    * The value suggested by the Amazon SageMaker Inference Recommender.
    */
  var Value: String
  
  /**
    * The value type suggested by the Amazon SageMaker Inference Recommender.
    */
  var ValueType: String
}
object EnvironmentParameter {
  
  inline def apply(Key: String, Value: String, ValueType: String): EnvironmentParameter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentParameter]
  }
  
  extension [Self <: EnvironmentParameter](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueType(value: String): Self = StObject.set(x, "ValueType", value.asInstanceOf[js.Any])
  }
}
