package typings.backboneMarionette.mod

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backboneMarionette.anon.TypeofView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionViewOptions[TModel /* <: Model[_, ModelSetOptions] */, TCollection /* <: Collection[TModel] */]
  extends typings.backbone.mod.ViewOptions[TModel]
     with ViewMixinOptions {
  /**
    * Specify a child view to use.
    */
  var childView: js.UndefOr[(js.Function1[/* model */ TModel, TypeofView]) | TypeofView] = js.native
  /**
    * Define options to pass to the childView constructor.
    */
  var childViewOptions: js.UndefOr[js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]] = js.native
  /**
    * Specify a view to use if the collection has no children.
    */
  var emptyView: js.UndefOr[js.Function0[TypeofView] | TypeofView] = js.native
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
}

object CollectionViewOptions {
  @scala.inline
  def apply[/* <: typings.backbone.mod.Model[_, typings.backbone.mod.ModelSetOptions] */ TModel, /* <: typings.backbone.mod.Collection[TModel] */ TCollection](): CollectionViewOptions[TModel, TCollection] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionViewOptions[TModel, TCollection]]
  }
  @scala.inline
  implicit class CollectionViewOptionsOps[Self <: CollectionViewOptions[_, _], /* <: typings.backbone.mod.Model[_, typings.backbone.mod.ModelSetOptions] */ TModel, /* <: typings.backbone.mod.Collection[TModel] */ TCollection] (val x: Self with (CollectionViewOptions[TModel, TCollection])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildViewFunction1(value: /* model */ TModel => TypeofView): Self = this.set("childView", js.Any.fromFunction1(value))
    @scala.inline
    def setChildView(value: (js.Function1[/* model */ TModel, TypeofView]) | TypeofView): Self = this.set("childView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildView: Self = this.set("childView", js.undefined)
    @scala.inline
    def setChildViewOptionsFunction0(value: () => ViewOptions[TModel]): Self = this.set("childViewOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setChildViewOptions(value: js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]): Self = this.set("childViewOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildViewOptions: Self = this.set("childViewOptions", js.undefined)
    @scala.inline
    def setEmptyViewFunction0(value: () => TypeofView): Self = this.set("emptyView", js.Any.fromFunction0(value))
    @scala.inline
    def setEmptyView(value: js.Function0[TypeofView] | TypeofView): Self = this.set("emptyView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyView: Self = this.set("emptyView", js.undefined)
    @scala.inline
    def setEmptyViewOptionsFunction0(value: () => ViewOptions[TModel]): Self = this.set("emptyViewOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setEmptyViewOptions(value: js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]): Self = this.set("emptyViewOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyViewOptions: Self = this.set("emptyViewOptions", js.undefined)
    @scala.inline
    def setEvents(value: EventsHash): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setFilter(
      value: (/* child */ js.UndefOr[TModel], /* index */ js.UndefOr[Double], /* collection */ js.UndefOr[TCollection]) => Boolean
    ): Self = this.set("filter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setReorderOnSort(value: Boolean): Self = this.set("reorderOnSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReorderOnSort: Self = this.set("reorderOnSort", js.undefined)
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setViewComparatorFunction2(value: (/* compare */ TModel, /* to */ js.UndefOr[TModel]) => Double): Self = this.set("viewComparator", js.Any.fromFunction2(value))
    @scala.inline
    def setViewComparatorFunction1(value: /* element */ TModel => Double | String): Self = this.set("viewComparator", js.Any.fromFunction1(value))
    @scala.inline
    def setViewComparator(
      value: String | (js.Function1[/* element */ TModel, Double | String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], Double])
    ): Self = this.set("viewComparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewComparator: Self = this.set("viewComparator", js.undefined)
  }
  
}

