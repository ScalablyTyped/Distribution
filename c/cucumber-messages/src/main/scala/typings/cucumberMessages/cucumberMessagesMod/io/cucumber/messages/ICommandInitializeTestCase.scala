package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandInitializeTestCase. */
trait ICommandInitializeTestCase extends StObject {
  
  /** CommandInitializeTestCase actionId */
  var actionId: js.UndefOr[String | Null] = js.undefined
  
  /** CommandInitializeTestCase pickle */
  var pickle: js.UndefOr[IPickle | Null] = js.undefined
}
object ICommandInitializeTestCase {
  
  inline def apply(): ICommandInitializeTestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandInitializeTestCase]
  }
  
  extension [Self <: ICommandInitializeTestCase](x: Self) {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    inline def setPickle(value: IPickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
    
    inline def setPickleNull: Self = StObject.set(x, "pickle", null)
    
    inline def setPickleUndefined: Self = StObject.set(x, "pickle", js.undefined)
  }
}
