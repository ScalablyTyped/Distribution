package typings.backboneMarionette

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backboneMarionette.mod.Behavior
import typings.backboneMarionette.mod.View
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictindex
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    var behaviorClass: Instantiable1[/* options */ js.UndefOr[Any], Behavior]
  }
  object Dictindex {
    
    inline def apply(behaviorClass: Instantiable1[/* options */ js.UndefOr[Any], Behavior]): Dictindex = {
      val __obj = js.Dynamic.literal(behaviorClass = behaviorClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictindex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictindex] (val x: Self) extends AnyVal {
      
      inline def setBehaviorClass(value: Instantiable1[/* options */ js.UndefOr[Any], Behavior]): Self = StObject.set(x, "behaviorClass", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable[TView /* <: View[TModel] */, TModel /* <: Model[Any, ModelSetOptions, Any] */]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, TView]
  
  @js.native
  trait InstantiableView[TModel /* <: Model[Any, ModelSetOptions, Any] */]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, typings.backbone.mod.View[TModel, HTMLElement]]
  
  trait PreventRender extends StObject {
    
    var preventRender: Boolean
  }
  object PreventRender {
    
    inline def apply(preventRender: Boolean): PreventRender = {
      val __obj = js.Dynamic.literal(preventRender = preventRender.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreventRender]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreventRender] (val x: Self) extends AnyVal {
      
      inline def setPreventRender(value: Boolean): Self = StObject.set(x, "preventRender", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofView extends StObject {
    
    /**
      * Do not use, prefer TypeScript's extend functionality.
      */
    /* static member */
    def extend(properties: Any): Any = js.native
    def extend(properties: Any, classProperties: Any): Any = js.native
  }
}
