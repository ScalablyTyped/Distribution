package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockPublicAccessConfigurationMetadata extends StObject {
  
  /**
    * The Amazon Resource Name that created or last modified the configuration.
    */
  var CreatedByArn: ArnType = js.native
  
  /**
    * The date and time that the configuration was created.
    */
  var CreationDateTime: Date = js.native
}
object BlockPublicAccessConfigurationMetadata {
  
  @scala.inline
  def apply(CreatedByArn: ArnType, CreationDateTime: Date): BlockPublicAccessConfigurationMetadata = {
    val __obj = js.Dynamic.literal(CreatedByArn = CreatedByArn.asInstanceOf[js.Any], CreationDateTime = CreationDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPublicAccessConfigurationMetadata]
  }
  
  @scala.inline
  implicit class BlockPublicAccessConfigurationMetadataMutableBuilder[Self <: BlockPublicAccessConfigurationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedByArn(value: ArnType): Self = StObject.set(x, "CreatedByArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
  }
}
