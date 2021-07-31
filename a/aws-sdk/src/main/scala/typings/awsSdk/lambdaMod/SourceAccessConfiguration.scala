package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceAccessConfiguration extends StObject {
  
  /**
    * To reference the secret, use the following format: [ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]  The value of Type is always BASIC_AUTH. To encrypt the secret, you can use customer or service managed keys. When using a customer managed KMS key, the Lambda execution role requires kms:Decrypt permissions.
    */
  var Type: js.UndefOr[SourceAccessType] = js.undefined
  
  /**
    * To reference the secret, use the following format: [ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]  The value of Type is always BASIC_AUTH. To encrypt the secret, you can use customer or service managed keys. When using a customer managed KMS key, the Lambda execution role requires kms:Decrypt permissions.
    */
  var URI: js.UndefOr[Arn] = js.undefined
}
object SourceAccessConfiguration {
  
  @scala.inline
  def apply(): SourceAccessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceAccessConfiguration]
  }
  
  @scala.inline
  implicit class SourceAccessConfigurationMutableBuilder[Self <: SourceAccessConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: SourceAccessType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setURI(value: Arn): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
  }
}
