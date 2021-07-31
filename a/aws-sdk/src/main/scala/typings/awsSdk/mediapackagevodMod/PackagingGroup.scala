package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagingGroup extends StObject {
  
  /**
    * The ARN of the PackagingGroup.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  var Authorization: js.UndefOr[typings.awsSdk.mediapackagevodMod.Authorization] = js.undefined
  
  /**
    * The fully qualified domain name for Assets in the PackagingGroup.
    */
  var DomainName: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the PackagingGroup.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.undefined
}
object PackagingGroup {
  
  @scala.inline
  def apply(): PackagingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackagingGroup]
  }
  
  @scala.inline
  implicit class PackagingGroupMutableBuilder[Self <: PackagingGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAuthorization(value: Authorization): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    @scala.inline
    def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
