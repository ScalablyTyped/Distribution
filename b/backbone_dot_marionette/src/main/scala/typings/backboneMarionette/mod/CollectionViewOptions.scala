package typings.backboneMarionette.mod

import org.scalablytyped.runtime.Instantiable0
import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.ObjectHash
import typings.backboneMarionette.anon.TypeofView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionViewOptions[TModel /* <: Model[_, ModelSetOptions, js.Object] */, TCollection /* <: Collection[TModel] */]
  extends typings.backbone.mod.ViewOptions[TModel]
     with ViewMixinOptions {
  
  /**
    * Specify a child view to use.
    */
  var childView: js.UndefOr[
    (js.Function1[
      /* model */ TModel, 
      TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]])
    ]) | (TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]]))
  ] = js.native
  
  /**
    * Define options to pass to the childView constructor.
    */
  var childViewOptions: js.UndefOr[js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]] = js.native
  
  /**
    * Specify a view to use if the collection has no children.
    */
  var emptyView: js.UndefOr[
    (js.Function0[
      TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]])
    ]) | (TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]]))
  ] = js.native
  
  /**
    * Define options to pass to the emptyView constructor.
    */
  var emptyViewOptions: js.UndefOr[js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]] = js.native
  
  /**
    * The events attribute binds DOM events to actions to perform on the
    * view. It takes DOM event key and a mapping to the handler.
    */
  @JSName("events")
  var events_CollectionViewOptions: js.UndefOr[EventsHash] = js.native
  
  /**
    * Prevent some of the underlying collection's models from being
    * rendered as child views.
    */
  var filter: js.UndefOr[
    js.Function3[
      /* child */ js.UndefOr[TModel], 
      /* index */ js.UndefOr[Double], 
      /* collection */ js.UndefOr[TCollection], 
      Boolean
    ]
  ] = js.native
  
  /**
    * If true when you sort your collection there will be no re-rendering,
    * only the DOM nodes will be reordered.
    */
  var reorderOnSort: js.UndefOr[Boolean] = js.native
  
  /**
    * If false the collection view will not maintain a sorted collection's
    * order in the DOM.
    */
  var sort: js.UndefOr[Boolean] = js.native
  
  /**
    * Render your collection view's children with a different sort order
    * than the underlying Backbone collection.
    */
  var viewComparator: js.UndefOr[
    String | (js.Function1[/* element */ TModel, Double | String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], Double])
  ] = js.native
  
  /**
    * Prevent some of the underlying children from being attached to the DOM.
    */
  var viewFilter: js.UndefOr[
    (js.Function3[
      /* view */ js.UndefOr[
        TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]])
      ], 
      /* index */ js.UndefOr[Double], 
      /* children */ js.UndefOr[js.Array[typings.backbone.mod.View[Model[_, ModelSetOptions, js.Object]]]], 
      Boolean
    ]) | ObjectHash | String
  ] = js.native
}
object CollectionViewOptions {
  
  @scala.inline
  def apply[TModel /* <: Model[_, ModelSetOptions, js.Object] */, TCollection /* <: Collection[TModel] */](): CollectionViewOptions[TModel, TCollection] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionViewOptions[TModel, TCollection]]
  }
  
  @scala.inline
  implicit class CollectionViewOptionsMutableBuilder[Self <: CollectionViewOptions[_, _], TModel /* <: Model[_, ModelSetOptions, js.Object] */, TCollection /* <: Collection[TModel] */] (val x: Self with (CollectionViewOptions[TModel, TCollection])) extends AnyVal {
    
    @scala.inline
    def setChildView(
      value: (js.Function1[
          /* model */ TModel, 
          TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]])
        ]) | (TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]]))
    ): Self = StObject.set(x, "childView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildViewFunction1(
      value: /* model */ TModel => TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]])
    ): Self = StObject.set(x, "childView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildViewOptions(value: js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]): Self = StObject.set(x, "childViewOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildViewOptionsFunction0(value: () => ViewOptions[TModel]): Self = StObject.set(x, "childViewOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChildViewOptionsUndefined: Self = StObject.set(x, "childViewOptions", js.undefined)
    
    @scala.inline
    def setChildViewUndefined: Self = StObject.set(x, "childView", js.undefined)
    
    @scala.inline
    def setEmptyView(
      value: (js.Function0[
          TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]])
        ]) | (TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]]))
    ): Self = StObject.set(x, "emptyView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyViewFunction0(
      value: () => TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]])
    ): Self = StObject.set(x, "emptyView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmptyViewOptions(value: js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]): Self = StObject.set(x, "emptyViewOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyViewOptionsFunction0(value: () => ViewOptions[TModel]): Self = StObject.set(x, "emptyViewOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmptyViewOptionsUndefined: Self = StObject.set(x, "emptyViewOptions", js.undefined)
    
    @scala.inline
    def setEmptyViewUndefined: Self = StObject.set(x, "emptyView", js.undefined)
    
    @scala.inline
    def setEvents(value: EventsHash): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (/* child */ js.UndefOr[TModel], /* index */ js.UndefOr[Double], /* collection */ js.UndefOr[TCollection]) => Boolean
    ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setReorderOnSort(value: Boolean): Self = StObject.set(x, "reorderOnSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReorderOnSortUndefined: Self = StObject.set(x, "reorderOnSort", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setViewComparator(
      value: String | (js.Function1[/* element */ TModel, Double | String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], Double])
    ): Self = StObject.set(x, "viewComparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewComparatorFunction1(value: /* element */ TModel => Double | String): Self = StObject.set(x, "viewComparator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setViewComparatorFunction2(value: (/* compare */ TModel, /* to */ js.UndefOr[TModel]) => Double): Self = StObject.set(x, "viewComparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setViewComparatorUndefined: Self = StObject.set(x, "viewComparator", js.undefined)
    
    @scala.inline
    def setViewFilter(
      value: (js.Function3[
          /* view */ js.UndefOr[
            TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]])
          ], 
          /* index */ js.UndefOr[Double], 
          /* children */ js.UndefOr[js.Array[typings.backbone.mod.View[Model[_, ModelSetOptions, js.Object]]]], 
          Boolean
        ]) | ObjectHash | String
    ): Self = StObject.set(x, "viewFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewFilterFunction3(
      value: (/* view */ js.UndefOr[
          TypeofView with (Instantiable0[typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]])
        ], /* index */ js.UndefOr[Double], /* children */ js.UndefOr[js.Array[typings.backbone.mod.View[Model[_, ModelSetOptions, js.Object]]]]) => Boolean
    ): Self = StObject.set(x, "viewFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setViewFilterUndefined: Self = StObject.set(x, "viewFilter", js.undefined)
  }
}
