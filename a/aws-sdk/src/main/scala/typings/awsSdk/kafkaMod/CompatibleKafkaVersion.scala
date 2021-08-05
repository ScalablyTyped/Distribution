package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompatibleKafkaVersion extends StObject {
  
  /**
    * 
    A Kafka version.
    
    */
  var SourceVersion: js.UndefOr[string] = js.undefined
  
  /**
    * 
    A list of Kafka versions.
    
    */
  var TargetVersions: js.UndefOr[listOfString] = js.undefined
}
object CompatibleKafkaVersion {
  
  inline def apply(): CompatibleKafkaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleKafkaVersion]
  }
  
  extension [Self <: CompatibleKafkaVersion](x: Self) {
    
    inline def setSourceVersion(value: string): Self = StObject.set(x, "SourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "SourceVersion", js.undefined)
    
    inline def setTargetVersions(value: listOfString): Self = StObject.set(x, "TargetVersions", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionsUndefined: Self = StObject.set(x, "TargetVersions", js.undefined)
    
    inline def setTargetVersionsVarargs(value: string*): Self = StObject.set(x, "TargetVersions", js.Array(value :_*))
  }
}
