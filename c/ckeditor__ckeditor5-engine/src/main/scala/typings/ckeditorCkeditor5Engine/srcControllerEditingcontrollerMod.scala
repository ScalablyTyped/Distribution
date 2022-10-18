package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.srcModelModelMod.Model
import typings.ckeditorCkeditor5Engine.srcViewStylesmapMod.StylesProcessor
import typings.ckeditorCkeditor5Engine.srcViewViewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcControllerEditingcontrollerMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/controller/editingcontroller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EditingController {
    /**
      * Creates an editing controller instance.
      */
    def this(model: Model, stylesProcessor: StylesProcessor) = this()
    
    /**
      * Removes all event listeners attached to the `EditingController`. Destroys all objects created
      * by `EditingController` that need to be destroyed.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Downcast dispatcher that converts changes from the model to {@link #view the editing view}.
      */
    /* CompleteClass */
    override val downcastDispatcher: typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object] = js.native
    
    /**
      * Mapper which describes the model-view binding.
      */
    /* CompleteClass */
    override val mapper: typings.ckeditorCkeditor5Engine.srcConversionMapperMod.default = js.native
    
    /**
      * Editor model.
      */
    /* CompleteClass */
    override val model: Model = js.native
    
    /**
      * Editing view controller.
      */
    /* CompleteClass */
    override val view: View = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable * / any */ trait EditingController extends StObject {
    
    /**
      * Removes all event listeners attached to the `EditingController`. Destroys all objects created
      * by `EditingController` that need to be destroyed.
      */
    def destroy(): Unit
    
    /**
      * Downcast dispatcher that converts changes from the model to {@link #view the editing view}.
      */
    val downcastDispatcher: typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object]
    
    /**
      * Mapper which describes the model-view binding.
      */
    val mapper: typings.ckeditorCkeditor5Engine.srcConversionMapperMod.default
    
    /**
      * Editor model.
      */
    val model: Model
    
    /**
      * Editing view controller.
      */
    val view: View
  }
  object EditingController {
    
    inline def apply(
      destroy: () => Unit,
      downcastDispatcher: typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object],
      mapper: typings.ckeditorCkeditor5Engine.srcConversionMapperMod.default,
      model: Model,
      view: View
    ): EditingController = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), downcastDispatcher = downcastDispatcher.asInstanceOf[js.Any], mapper = mapper.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditingController]
    }
    
    extension [Self <: EditingController](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDowncastDispatcher(value: typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object]): Self = StObject.set(x, "downcastDispatcher", value.asInstanceOf[js.Any])
      
      inline def setMapper(value: typings.ckeditorCkeditor5Engine.srcConversionMapperMod.default): Self = StObject.set(x, "mapper", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
