package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComputerResult extends StObject {
  
  /**
    * A Computer object that represents the computer account.
    */
  var Computer: js.UndefOr[typings.awsSdk.directoryserviceMod.Computer] = js.undefined
}
object CreateComputerResult {
  
  @scala.inline
  def apply(): CreateComputerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateComputerResult]
  }
  
  @scala.inline
  implicit class CreateComputerResultMutableBuilder[Self <: CreateComputerResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputer(value: Computer): Self = StObject.set(x, "Computer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerUndefined: Self = StObject.set(x, "Computer", js.undefined)
  }
}
