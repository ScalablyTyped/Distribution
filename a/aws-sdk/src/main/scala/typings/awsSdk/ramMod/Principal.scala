package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Principal extends StObject {
  
  /**
    * The time when the principal was associated with the resource share.
    */
  var creationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Indicates whether the principal belongs to the same AWS organization as the AWS account that owns the resource share.
    */
  var external: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the principal.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the association was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
}
object Principal {
  
  @scala.inline
  def apply(): Principal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Principal]
  }
  
  @scala.inline
  implicit class PrincipalMutableBuilder[Self <: Principal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: DateTime): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
  }
}
