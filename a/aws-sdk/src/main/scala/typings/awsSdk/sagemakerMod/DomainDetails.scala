package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDetails extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.sagemakerMod.CreationTime] = js.undefined
  
  /**
    * The domain's Amazon Resource Name (ARN).
    */
  var DomainArn: js.UndefOr[typings.awsSdk.sagemakerMod.DomainArn] = js.undefined
  
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typings.awsSdk.sagemakerMod.DomainId] = js.undefined
  
  /**
    * The domain name.
    */
  var DomainName: js.UndefOr[typings.awsSdk.sagemakerMod.DomainName] = js.undefined
  
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[typings.awsSdk.sagemakerMod.LastModifiedTime] = js.undefined
  
  /**
    * The status.
    */
  var Status: js.UndefOr[DomainStatus] = js.undefined
  
  /**
    * The domain's URL.
    */
  var Url: js.UndefOr[String1024] = js.undefined
}
object DomainDetails {
  
  @scala.inline
  def apply(): DomainDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDetails]
  }
  
  @scala.inline
  implicit class DomainDetailsMutableBuilder[Self <: DomainDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDomainArn(value: DomainArn): Self = StObject.set(x, "DomainArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainArnUndefined: Self = StObject.set(x, "DomainArn", js.undefined)
    
    @scala.inline
    def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: LastModifiedTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setStatus(value: DomainStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUrl(value: String1024): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
