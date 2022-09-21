package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactSourceType extends StObject {
  
  /**
    * The type of ID.
    */
  var SourceIdType: ArtifactSourceIdType
  
  /**
    * The ID.
    */
  var Value: String256
}
object ArtifactSourceType {
  
  inline def apply(SourceIdType: ArtifactSourceIdType, Value: String256): ArtifactSourceType = {
    val __obj = js.Dynamic.literal(SourceIdType = SourceIdType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceType]
  }
  
  extension [Self <: ArtifactSourceType](x: Self) {
    
    inline def setSourceIdType(value: ArtifactSourceIdType): Self = StObject.set(x, "SourceIdType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String256): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
