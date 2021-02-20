package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyProductOutput extends StObject {
  
  /**
    * The token to use to track the progress of the operation.
    */
  var CopyProductToken: js.UndefOr[Id] = js.native
}
object CopyProductOutput {
  
  @scala.inline
  def apply(): CopyProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyProductOutput]
  }
  
  @scala.inline
  implicit class CopyProductOutputMutableBuilder[Self <: CopyProductOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyProductToken(value: Id): Self = StObject.set(x, "CopyProductToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyProductTokenUndefined: Self = StObject.set(x, "CopyProductToken", js.undefined)
  }
}
