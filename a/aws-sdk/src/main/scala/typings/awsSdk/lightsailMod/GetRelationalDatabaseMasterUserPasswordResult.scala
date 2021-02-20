package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseMasterUserPasswordResult extends StObject {
  
  /**
    * The timestamp when the specified version of the master user password was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The master user password for the password version specified.
    */
  var masterUserPassword: js.UndefOr[SensitiveString] = js.native
}
object GetRelationalDatabaseMasterUserPasswordResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseMasterUserPasswordResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseMasterUserPasswordResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseMasterUserPasswordResultMutableBuilder[Self <: GetRelationalDatabaseMasterUserPasswordResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: SensitiveString): Self = StObject.set(x, "masterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserPasswordUndefined: Self = StObject.set(x, "masterUserPassword", js.undefined)
  }
}
