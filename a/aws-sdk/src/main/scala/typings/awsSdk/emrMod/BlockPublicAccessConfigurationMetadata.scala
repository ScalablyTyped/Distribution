package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockPublicAccessConfigurationMetadata extends StObject {
  
  /**
    * The Amazon Resource Name that created or last modified the configuration.
    */
  var CreatedByArn: ArnType
  
  /**
    * The date and time that the configuration was created.
    */
  var CreationDateTime: Date
}
object BlockPublicAccessConfigurationMetadata {
  
  inline def apply(CreatedByArn: ArnType, CreationDateTime: Date): BlockPublicAccessConfigurationMetadata = {
    val __obj = js.Dynamic.literal(CreatedByArn = CreatedByArn.asInstanceOf[js.Any], CreationDateTime = CreationDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPublicAccessConfigurationMetadata]
  }
  
  extension [Self <: BlockPublicAccessConfigurationMetadata](x: Self) {
    
    inline def setCreatedByArn(value: ArnType): Self = StObject.set(x, "CreatedByArn", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
  }
}
