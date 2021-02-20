package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationProperties extends StObject {
  
  /**
    * The ARN of the resource to publish to.
    */
  var DestinationArn: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the KMS key to use for encryption.
    */
  var KmsKeyArn: js.UndefOr[String] = js.native
}
object DestinationProperties {
  
  @scala.inline
  def apply(): DestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationProperties]
  }
  
  @scala.inline
  implicit class DestinationPropertiesMutableBuilder[Self <: DestinationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationArn(value: String): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: String): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
  }
}
