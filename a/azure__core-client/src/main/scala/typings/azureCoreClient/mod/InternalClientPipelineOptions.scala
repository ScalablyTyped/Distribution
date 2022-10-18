package typings.azureCoreClient.mod

import typings.azureCoreClient.anon.Credential
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.InternalPipelineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalClientPipelineOptions
  extends StObject
     with InternalPipelineOptions {
  
  /**
    * Options to customize bearerTokenAuthenticationPolicy.
    */
  var credentialOptions: js.UndefOr[Credential] = js.undefined
  
  /**
    * Options to customize deserializationPolicy.
    */
  var deserializationOptions: js.UndefOr[DeserializationPolicyOptions] = js.undefined
  
  /**
    * Options to customize serializationPolicy.
    */
  var serializationOptions: js.UndefOr[SerializationPolicyOptions] = js.undefined
}
object InternalClientPipelineOptions {
  
  inline def apply(): InternalClientPipelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalClientPipelineOptions]
  }
  
  extension [Self <: InternalClientPipelineOptions](x: Self) {
    
    inline def setCredentialOptions(value: Credential): Self = StObject.set(x, "credentialOptions", value.asInstanceOf[js.Any])
    
    inline def setCredentialOptionsUndefined: Self = StObject.set(x, "credentialOptions", js.undefined)
    
    inline def setDeserializationOptions(value: DeserializationPolicyOptions): Self = StObject.set(x, "deserializationOptions", value.asInstanceOf[js.Any])
    
    inline def setDeserializationOptionsUndefined: Self = StObject.set(x, "deserializationOptions", js.undefined)
    
    inline def setSerializationOptions(value: SerializationPolicyOptions): Self = StObject.set(x, "serializationOptions", value.asInstanceOf[js.Any])
    
    inline def setSerializationOptionsUndefined: Self = StObject.set(x, "serializationOptions", js.undefined)
  }
}
