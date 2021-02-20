package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionStatus extends StObject {
  
  /**
    * The expression that is evaluated for sorting while processing a search request.
    */
  var Options: Expression = js.native
  
  var Status: OptionStatus = js.native
}
object ExpressionStatus {
  
  @scala.inline
  def apply(Options: Expression, Status: OptionStatus): ExpressionStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionStatus]
  }
  
  @scala.inline
  implicit class ExpressionStatusMutableBuilder[Self <: ExpressionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Expression): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
