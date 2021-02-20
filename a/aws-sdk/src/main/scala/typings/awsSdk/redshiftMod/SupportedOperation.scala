package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedOperation extends StObject {
  
  /**
    * A list of the supported operations.
    */
  var OperationName: js.UndefOr[String] = js.native
}
object SupportedOperation {
  
  @scala.inline
  def apply(): SupportedOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedOperation]
  }
  
  @scala.inline
  implicit class SupportedOperationMutableBuilder[Self <: SupportedOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationName(value: String): Self = StObject.set(x, "OperationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationNameUndefined: Self = StObject.set(x, "OperationName", js.undefined)
  }
}
