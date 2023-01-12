package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateParallelDataRequest extends StObject {
  
  /**
    * A unique identifier for the request. This token is automatically generated when you use Amazon Translate through an AWS SDK.
    */
  var ClientToken: ClientTokenString
  
  /**
    * A custom description for the parallel data resource in Amazon Translate.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsTranslateMod.Description] = js.undefined
  
  /**
    * The name of the parallel data resource being updated.
    */
  var Name: ResourceName
  
  /**
    * Specifies the format and S3 location of the parallel data input file.
    */
  var ParallelDataConfig: typings.awsSdk.clientsTranslateMod.ParallelDataConfig
}
object UpdateParallelDataRequest {
  
  inline def apply(ClientToken: ClientTokenString, Name: ResourceName, ParallelDataConfig: ParallelDataConfig): UpdateParallelDataRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ParallelDataConfig = ParallelDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateParallelDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateParallelDataRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParallelDataConfig(value: ParallelDataConfig): Self = StObject.set(x, "ParallelDataConfig", value.asInstanceOf[js.Any])
  }
}
