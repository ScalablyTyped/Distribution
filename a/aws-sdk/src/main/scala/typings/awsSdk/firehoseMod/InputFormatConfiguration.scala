package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputFormatConfiguration extends StObject {
  
  /**
    * Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are non-null, the server rejects the request.
    */
  var Deserializer: js.UndefOr[typings.awsSdk.firehoseMod.Deserializer] = js.undefined
}
object InputFormatConfiguration {
  
  inline def apply(): InputFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputFormatConfiguration]
  }
  
  extension [Self <: InputFormatConfiguration](x: Self) {
    
    inline def setDeserializer(value: Deserializer): Self = StObject.set(x, "Deserializer", value.asInstanceOf[js.Any])
    
    inline def setDeserializerUndefined: Self = StObject.set(x, "Deserializer", js.undefined)
  }
}
