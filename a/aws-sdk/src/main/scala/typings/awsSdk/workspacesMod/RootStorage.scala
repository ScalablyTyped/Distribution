package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootStorage extends StObject {
  
  /**
    * The size of the root volume.
    */
  var Capacity: js.UndefOr[NonEmptyString] = js.undefined
}
object RootStorage {
  
  @scala.inline
  def apply(): RootStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootStorage]
  }
  
  @scala.inline
  implicit class RootStorageMutableBuilder[Self <: RootStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacity(value: NonEmptyString): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
  }
}
