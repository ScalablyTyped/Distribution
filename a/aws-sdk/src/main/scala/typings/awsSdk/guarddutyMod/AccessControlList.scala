package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessControlList extends StObject {
  
  /**
    * A value that indicates whether public read access for the bucket is enabled through an Access Control List (ACL).
    */
  var AllowsPublicReadAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether public write access for the bucket is enabled through an Access Control List (ACL).
    */
  var AllowsPublicWriteAccess: js.UndefOr[Boolean] = js.undefined
}
object AccessControlList {
  
  @scala.inline
  def apply(): AccessControlList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlList]
  }
  
  @scala.inline
  implicit class AccessControlListMutableBuilder[Self <: AccessControlList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowsPublicReadAccess(value: Boolean): Self = StObject.set(x, "AllowsPublicReadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsPublicReadAccessUndefined: Self = StObject.set(x, "AllowsPublicReadAccess", js.undefined)
    
    @scala.inline
    def setAllowsPublicWriteAccess(value: Boolean): Self = StObject.set(x, "AllowsPublicWriteAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsPublicWriteAccessUndefined: Self = StObject.set(x, "AllowsPublicWriteAccess", js.undefined)
  }
}
