package typings.backboneMarionette

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backboneMarionette.mod.Behavior
import typings.backboneMarionette.mod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictindex
    extends StObject
       with /* index */ StringDictionary[js.Any] {
    
    var behaviorClass: Instantiable1[/* options */ js.UndefOr[js.Any], Behavior]
  }
  object Dictindex {
    
    @scala.inline
    def apply(behaviorClass: Instantiable1[/* options */ js.UndefOr[js.Any], Behavior]): Dictindex = {
      val __obj = js.Dynamic.literal(behaviorClass = behaviorClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictindex]
    }
    
    @scala.inline
    implicit class DictindexMutableBuilder[Self <: Dictindex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehaviorClass(value: Instantiable1[/* options */ js.UndefOr[js.Any], Behavior]): Self = StObject.set(x, "behaviorClass", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable[TView /* <: View[TModel] */, TModel /* <: Model[js.Any, ModelSetOptions, js.Object] */]
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, TView]
  
  @js.native
  trait InstantiableView[TModel /* <: Model[js.Any, ModelSetOptions, js.Object] */]
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, typings.backbone.mod.View[TModel]]
  
  trait PreventRender extends StObject {
    
    var preventRender: Boolean
  }
  object PreventRender {
    
    @scala.inline
    def apply(preventRender: Boolean): PreventRender = {
      val __obj = js.Dynamic.literal(preventRender = preventRender.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreventRender]
    }
    
    @scala.inline
    implicit class PreventRenderMutableBuilder[Self <: PreventRender] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreventRender(value: Boolean): Self = StObject.set(x, "preventRender", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofView extends StObject {
    
    /**
      * Do not use, prefer TypeScript's extend functionality.
      **/
    /* static member */
    def extend(properties: js.Any): js.Any = js.native
    def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
  }
}
