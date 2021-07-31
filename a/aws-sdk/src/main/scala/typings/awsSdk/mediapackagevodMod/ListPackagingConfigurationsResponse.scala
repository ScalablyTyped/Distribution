package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagingConfigurationsResponse extends StObject {
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A list of MediaPackage VOD PackagingConfiguration resources.
    */
  var PackagingConfigurations: js.UndefOr[listOfPackagingConfiguration] = js.undefined
}
object ListPackagingConfigurationsResponse {
  
  @scala.inline
  def apply(): ListPackagingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagingConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ListPackagingConfigurationsResponseMutableBuilder[Self <: ListPackagingConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPackagingConfigurations(value: listOfPackagingConfiguration): Self = StObject.set(x, "PackagingConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagingConfigurationsUndefined: Self = StObject.set(x, "PackagingConfigurations", js.undefined)
    
    @scala.inline
    def setPackagingConfigurationsVarargs(value: PackagingConfiguration*): Self = StObject.set(x, "PackagingConfigurations", js.Array(value :_*))
  }
}
