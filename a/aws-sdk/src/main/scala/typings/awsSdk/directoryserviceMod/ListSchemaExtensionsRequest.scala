package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemaExtensionsRequest extends StObject {
  
  /**
    * The identifier of the directory from which to retrieve the schema extension information.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[typings.awsSdk.directoryserviceMod.Limit] = js.undefined
  
  /**
    * The ListSchemaExtensions.NextToken value from a previous call to ListSchemaExtensions. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.undefined
}
object ListSchemaExtensionsRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId): ListSchemaExtensionsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaExtensionsRequest]
  }
  
  @scala.inline
  implicit class ListSchemaExtensionsRequestMutableBuilder[Self <: ListSchemaExtensionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
