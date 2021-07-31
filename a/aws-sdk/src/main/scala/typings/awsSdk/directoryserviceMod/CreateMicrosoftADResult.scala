package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMicrosoftADResult extends StObject {
  
  /**
    * The identifier of the directory that was created.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.undefined
}
object CreateMicrosoftADResult {
  
  @scala.inline
  def apply(): CreateMicrosoftADResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMicrosoftADResult]
  }
  
  @scala.inline
  implicit class CreateMicrosoftADResultMutableBuilder[Self <: CreateMicrosoftADResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
