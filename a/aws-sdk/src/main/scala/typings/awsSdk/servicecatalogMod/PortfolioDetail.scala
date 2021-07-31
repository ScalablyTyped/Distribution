package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortfolioDetail extends StObject {
  
  /**
    * The ARN assigned to the portfolio.
    */
  var ARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[CreationTime] = js.undefined
  
  /**
    * The description of the portfolio.
    */
  var Description: js.UndefOr[PortfolioDescription] = js.undefined
  
  /**
    * The name to use for display purposes.
    */
  var DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined
  
  /**
    * The portfolio identifier.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.undefined
  
  /**
    * The name of the portfolio provider.
    */
  var ProviderName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProviderName] = js.undefined
}
object PortfolioDetail {
  
  @scala.inline
  def apply(): PortfolioDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortfolioDetail]
  }
  
  @scala.inline
  implicit class PortfolioDetailMutableBuilder[Self <: PortfolioDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: ResourceARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: CreationTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: PortfolioDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: PortfolioDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setProviderName(value: ProviderName): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
  }
}
