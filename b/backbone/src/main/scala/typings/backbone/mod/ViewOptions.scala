package typings.backbone.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewOptions[TModel /* <: Model[js.Any, ModelSetOptions, js.Object] */] extends StObject {
  
  var attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  // TODO: quickfix, this can't be fixed easy. The collection does not need to have the same model as the parent view.
  var collection: js.UndefOr[Collection[js.Any]] = js.undefined
  
  //was: Collection<TModel>;
  var el: js.UndefOr[js.Any] = js.undefined
  
  var events: js.UndefOr[EventsHash] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var model: js.UndefOr[TModel] = js.undefined
  
  var tagName: js.UndefOr[String] = js.undefined
}
object ViewOptions {
  
  @scala.inline
  def apply[TModel /* <: Model[js.Any, ModelSetOptions, js.Object] */](): ViewOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions[TModel]]
  }
  
  @scala.inline
  implicit class ViewOptionsMutableBuilder[Self <: ViewOptions[?], TModel /* <: Model[js.Any, ModelSetOptions, js.Object] */] (val x: Self & ViewOptions[TModel]) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCollection(value: Collection[js.Any]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    @scala.inline
    def setEl(value: js.Any): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    @scala.inline
    def setEvents(value: EventsHash): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setModel(value: TModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
