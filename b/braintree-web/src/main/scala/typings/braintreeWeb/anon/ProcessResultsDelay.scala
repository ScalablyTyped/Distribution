package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessResultsDelay extends StObject {
  
  var processResultsDelay: js.UndefOr[Double] = js.native
}
object ProcessResultsDelay {
  
  @scala.inline
  def apply(): ProcessResultsDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessResultsDelay]
  }
  
  @scala.inline
  implicit class ProcessResultsDelayMutableBuilder[Self <: ProcessResultsDelay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessResultsDelay(value: Double): Self = StObject.set(x, "processResultsDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessResultsDelayUndefined: Self = StObject.set(x, "processResultsDelay", js.undefined)
  }
}
