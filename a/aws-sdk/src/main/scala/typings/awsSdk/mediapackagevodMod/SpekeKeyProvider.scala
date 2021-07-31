package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpekeKeyProvider extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
  MediaPackage will assume when accessing the key provider service.
    */
  var RoleArn: string
  
  /**
    * The system IDs to include in key requests.
    */
  var SystemIds: listOfString
  
  /**
    * The URL of the external key provider service.
    */
  var Url: string
}
object SpekeKeyProvider {
  
  @scala.inline
  def apply(RoleArn: string, SystemIds: listOfString, Url: string): SpekeKeyProvider = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], SystemIds = SystemIds.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpekeKeyProvider]
  }
  
  @scala.inline
  implicit class SpekeKeyProviderMutableBuilder[Self <: SpekeKeyProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemIds(value: listOfString): Self = StObject.set(x, "SystemIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemIdsVarargs(value: string*): Self = StObject.set(x, "SystemIds", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
