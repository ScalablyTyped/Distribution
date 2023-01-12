package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueOnHttpStepFailure extends StObject {
  
  var continueOnHttpStepFailure: Boolean
  
  var continueOnStepFailure: Boolean
}
object ContinueOnHttpStepFailure {
  
  inline def apply(continueOnHttpStepFailure: Boolean, continueOnStepFailure: Boolean): ContinueOnHttpStepFailure = {
    val __obj = js.Dynamic.literal(continueOnHttpStepFailure = continueOnHttpStepFailure.asInstanceOf[js.Any], continueOnStepFailure = continueOnStepFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueOnHttpStepFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinueOnHttpStepFailure] (val x: Self) extends AnyVal {
    
    inline def setContinueOnHttpStepFailure(value: Boolean): Self = StObject.set(x, "continueOnHttpStepFailure", value.asInstanceOf[js.Any])
    
    inline def setContinueOnStepFailure(value: Boolean): Self = StObject.set(x, "continueOnStepFailure", value.asInstanceOf[js.Any])
  }
}
