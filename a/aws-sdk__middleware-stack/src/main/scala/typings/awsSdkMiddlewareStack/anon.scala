package typings.awsSdkMiddlewareStack

import typings.awsSdkMiddlewareStack.distTypesTypesMod.Normalized
import typings.awsSdkMiddlewareStack.distTypesTypesMod.RelativeMiddlewareEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait After[Input /* <: js.Object */, Output /* <: js.Object */] extends StObject {
    
    var after: js.Array[Normalized[RelativeMiddlewareEntry[Input, Output], Input, Output]]
    
    var before: js.Array[Normalized[RelativeMiddlewareEntry[Input, Output], Input, Output]]
  }
  object After {
    
    inline def apply[Input /* <: js.Object */, Output /* <: js.Object */](
      after: js.Array[Normalized[RelativeMiddlewareEntry[Input, Output], Input, Output]],
      before: js.Array[Normalized[RelativeMiddlewareEntry[Input, Output], Input, Output]]
    ): After[Input, Output] = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[After[Input, Output]]
    }
    
    extension [Self <: After[?, ?], Input /* <: js.Object */, Output /* <: js.Object */](x: Self & (After[Input, Output])) {
      
      inline def setAfter(value: js.Array[Normalized[RelativeMiddlewareEntry[Input, Output], Input, Output]]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterVarargs(value: (Normalized[RelativeMiddlewareEntry[Input, Output], Input, Output])*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setBefore(value: js.Array[Normalized[RelativeMiddlewareEntry[Input, Output], Input, Output]]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeVarargs(value: (Normalized[RelativeMiddlewareEntry[Input, Output], Input, Output])*): Self = StObject.set(x, "before", js.Array(value*))
    }
  }
}
