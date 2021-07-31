package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Site extends StObject {
  
  var AccountId: js.UndefOr[typings.awsSdk.outpostsMod.AccountId] = js.undefined
  
  var Description: js.UndefOr[SiteDescription] = js.undefined
  
  var Name: js.UndefOr[SiteName] = js.undefined
  
  var SiteId: js.UndefOr[typings.awsSdk.outpostsMod.SiteId] = js.undefined
}
object Site {
  
  @scala.inline
  def apply(): Site = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit class SiteMutableBuilder[Self <: Site] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setDescription(value: SiteDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: SiteName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
  }
}
