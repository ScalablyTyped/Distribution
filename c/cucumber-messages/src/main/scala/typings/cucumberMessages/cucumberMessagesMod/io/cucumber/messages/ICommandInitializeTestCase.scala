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
  
  @scala.inline
  def apply(): ICommandInitializeTestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandInitializeTestCase]
  }
  
  @scala.inline
  implicit class ICommandInitializeTestCaseMutableBuilder[Self <: ICommandInitializeTestCase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    @scala.inline
    def setPickle(value: IPickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickleNull: Self = StObject.set(x, "pickle", null)
    
    @scala.inline
    def setPickleUndefined: Self = StObject.set(x, "pickle", js.undefined)
  }
}
