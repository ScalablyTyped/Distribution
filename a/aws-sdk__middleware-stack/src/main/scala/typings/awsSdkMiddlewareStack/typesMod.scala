package typings.awsSdkMiddlewareStack

import typings.awsSdkMiddlewareStack.anon.After
import typings.awsSdkTypes.middlewareMod.AbsoluteLocation
import typings.awsSdkTypes.middlewareMod.BuildHandler
import typings.awsSdkTypes.middlewareMod.DeserializeHandler
import typings.awsSdkTypes.middlewareMod.FinalizeHandler
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.middlewareMod.HandlerOptions
import typings.awsSdkTypes.middlewareMod.InitializeHandler
import typings.awsSdkTypes.middlewareMod.MiddlewareType
import typings.awsSdkTypes.middlewareMod.Priority
import typings.awsSdkTypes.middlewareMod.Relation
import typings.awsSdkTypes.middlewareMod.RelativeLocation
import typings.awsSdkTypes.middlewareMod.SerializeHandler
import typings.awsSdkTypes.middlewareMod.Step
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait AbsoluteMiddlewareEntry[Input /* <: js.Object */, Output /* <: js.Object */]
    extends StObject
       with MiddlewareEntry[Input, Output]
       with AbsoluteLocation {
    
    @JSName("priority")
    var priority_AbsoluteMiddlewareEntry: Priority
    
    @JSName("step")
    var step_AbsoluteMiddlewareEntry: Step
  }
  object AbsoluteMiddlewareEntry {
    
    inline def apply[Input /* <: js.Object */, Output /* <: js.Object */](
      middleware: ((/* next */ BuildHandler[Input, Output]) | (/* next */ DeserializeHandler[Input, Output]) | (/* next */ FinalizeHandler[Input, Output]) | (/* next */ InitializeHandler[Input, Output]) | (/* next */ SerializeHandler[Input, Output]), /* context */ HandlerExecutionContext) => (BuildHandler[Input, Output]) | (DeserializeHandler[Input, Output]) | (FinalizeHandler[Input, Output]) | (InitializeHandler[Input, Output]) | (SerializeHandler[Input, Output]),
      priority: Priority,
      step: Step
    ): AbsoluteMiddlewareEntry[Input, Output] = {
      val __obj = js.Dynamic.literal(middleware = js.Any.fromFunction2(middleware), priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbsoluteMiddlewareEntry[Input, Output]]
    }
    
    extension [Self <: AbsoluteMiddlewareEntry[?, ?], Input /* <: js.Object */, Output /* <: js.Object */](x: Self & (AbsoluteMiddlewareEntry[Input, Output])) {
      
      inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  trait MiddlewareEntry[Input /* <: js.Object */, Output /* <: js.Object */]
    extends StObject
       with HandlerOptions {
    
    var middleware: MiddlewareType[Input, Output]
  }
  object MiddlewareEntry {
    
    inline def apply[Input /* <: js.Object */, Output /* <: js.Object */](
      middleware: ((/* next */ BuildHandler[Input, Output]) | (/* next */ DeserializeHandler[Input, Output]) | (/* next */ FinalizeHandler[Input, Output]) | (/* next */ InitializeHandler[Input, Output]) | (/* next */ SerializeHandler[Input, Output]), /* context */ HandlerExecutionContext) => (BuildHandler[Input, Output]) | (DeserializeHandler[Input, Output]) | (FinalizeHandler[Input, Output]) | (InitializeHandler[Input, Output]) | (SerializeHandler[Input, Output])
    ): MiddlewareEntry[Input, Output] = {
      val __obj = js.Dynamic.literal(middleware = js.Any.fromFunction2(middleware))
      __obj.asInstanceOf[MiddlewareEntry[Input, Output]]
    }
    
    extension [Self <: MiddlewareEntry[?, ?], Input /* <: js.Object */, Output /* <: js.Object */](x: Self & (MiddlewareEntry[Input, Output])) {
      
      inline def setMiddleware(
        value: ((/* next */ BuildHandler[Input, Output]) | (/* next */ DeserializeHandler[Input, Output]) | (/* next */ FinalizeHandler[Input, Output]) | (/* next */ InitializeHandler[Input, Output]) | (/* next */ SerializeHandler[Input, Output]), /* context */ HandlerExecutionContext) => (BuildHandler[Input, Output]) | (DeserializeHandler[Input, Output]) | (FinalizeHandler[Input, Output]) | (InitializeHandler[Input, Output]) | (SerializeHandler[Input, Output])
      ): Self = StObject.set(x, "middleware", js.Any.fromFunction2(value))
    }
  }
  
  type NamedMiddlewareEntriesMap[Input /* <: js.Object */, Output /* <: js.Object */] = Record[String, MiddlewareEntry[Input, Output]]
  
  type Normalized[T /* <: MiddlewareEntry[Input, Output] */, Input /* <: js.Object */, Output /* <: js.Object */] = T & (After[Input, Output])
  
  trait NormalizedRelativeEntry[Input /* <: js.Object */, Output /* <: js.Object */]
    extends StObject
       with HandlerOptions {
    
    var middleware: MiddlewareType[Input, Output]
    
    var next: js.UndefOr[NormalizedRelativeEntry[Input, Output]] = js.undefined
    
    var prev: js.UndefOr[NormalizedRelativeEntry[Input, Output]] = js.undefined
    
    var priority: Null
    
    @JSName("step")
    var step_NormalizedRelativeEntry: Step
  }
  object NormalizedRelativeEntry {
    
    inline def apply[Input /* <: js.Object */, Output /* <: js.Object */](
      middleware: ((/* next */ BuildHandler[Input, Output]) | (/* next */ DeserializeHandler[Input, Output]) | (/* next */ FinalizeHandler[Input, Output]) | (/* next */ InitializeHandler[Input, Output]) | (/* next */ SerializeHandler[Input, Output]), /* context */ HandlerExecutionContext) => (BuildHandler[Input, Output]) | (DeserializeHandler[Input, Output]) | (FinalizeHandler[Input, Output]) | (InitializeHandler[Input, Output]) | (SerializeHandler[Input, Output]),
      priority: Null,
      step: Step
    ): NormalizedRelativeEntry[Input, Output] = {
      val __obj = js.Dynamic.literal(middleware = js.Any.fromFunction2(middleware), priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedRelativeEntry[Input, Output]]
    }
    
    extension [Self <: NormalizedRelativeEntry[?, ?], Input /* <: js.Object */, Output /* <: js.Object */](x: Self & (NormalizedRelativeEntry[Input, Output])) {
      
      inline def setMiddleware(
        value: ((/* next */ BuildHandler[Input, Output]) | (/* next */ DeserializeHandler[Input, Output]) | (/* next */ FinalizeHandler[Input, Output]) | (/* next */ InitializeHandler[Input, Output]) | (/* next */ SerializeHandler[Input, Output]), /* context */ HandlerExecutionContext) => (BuildHandler[Input, Output]) | (DeserializeHandler[Input, Output]) | (FinalizeHandler[Input, Output]) | (InitializeHandler[Input, Output]) | (SerializeHandler[Input, Output])
      ): Self = StObject.set(x, "middleware", js.Any.fromFunction2(value))
      
      inline def setNext(value: NormalizedRelativeEntry[Input, Output]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrev(value: NormalizedRelativeEntry[Input, Output]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setPriority(value: Null): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  trait RelativeMiddlewareEntry[Input /* <: js.Object */, Output /* <: js.Object */]
    extends StObject
       with MiddlewareEntry[Input, Output]
       with RelativeLocation
  object RelativeMiddlewareEntry {
    
    inline def apply[Input /* <: js.Object */, Output /* <: js.Object */](
      middleware: ((/* next */ BuildHandler[Input, Output]) | (/* next */ DeserializeHandler[Input, Output]) | (/* next */ FinalizeHandler[Input, Output]) | (/* next */ InitializeHandler[Input, Output]) | (/* next */ SerializeHandler[Input, Output]), /* context */ HandlerExecutionContext) => (BuildHandler[Input, Output]) | (DeserializeHandler[Input, Output]) | (FinalizeHandler[Input, Output]) | (InitializeHandler[Input, Output]) | (SerializeHandler[Input, Output]),
      relation: Relation,
      toMiddleware: String
    ): RelativeMiddlewareEntry[Input, Output] = {
      val __obj = js.Dynamic.literal(middleware = js.Any.fromFunction2(middleware), relation = relation.asInstanceOf[js.Any], toMiddleware = toMiddleware.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeMiddlewareEntry[Input, Output]]
    }
  }
}
