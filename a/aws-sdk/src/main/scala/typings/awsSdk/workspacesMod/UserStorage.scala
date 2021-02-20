package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserStorage extends StObject {
  
  /**
    * The size of the user storage.
    */
  var Capacity: js.UndefOr[NonEmptyString] = js.native
}
object UserStorage {
  
  @scala.inline
  def apply(): UserStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserStorage]
  }
  
  @scala.inline
  implicit class UserStorageMutableBuilder[Self <: UserStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacity(value: NonEmptyString): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
  }
}
