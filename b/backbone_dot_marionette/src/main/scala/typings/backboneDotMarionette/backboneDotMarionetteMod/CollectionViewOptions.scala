package typings.backboneDotMarionette.backboneDotMarionetteMod

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.backboneMod.Collection
import typings.backbone.backboneMod.Model
import typings.backboneDotMarionette.TypeofClassView
import typings.backboneDotMarionette.backboneDotMarionetteNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionViewOptions[TModel /* <: Model */, TCollection /* <: Collection[TModel] */]
  extends typings.backbone.backboneMod.ViewOptions[TModel]
     with ViewMixinOptions {
  /**
    * Specify a child view to use.
    */
  var childView: js.UndefOr[(js.Function1[/* model */ TModel, TypeofClassView]) | TypeofClassView] = js.undefined
  /**
    * Define options to pass to the childView constructor.
    */
  var childViewOptions: js.UndefOr[js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]] = js.undefined
  /**
    * Specify a view to use if the collection has no children.
    */
  var emptyView: js.UndefOr[js.Function0[TypeofClassView] | TypeofClassView] = js.undefined
  /**
    * Define options to pass to the emptyView constructor.
    */
  var emptyViewOptions: js.UndefOr[js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]] = js.undefined
  /**
    * The events attribute binds DOM events to actions to perform on the
    * view. It takes DOM event key and a mapping to the handler.
    */
  @JSName("events")
  var events_CollectionViewOptions: js.UndefOr[EventsHash] = js.undefined
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
  ] = js.undefined
  /**
    * If true when you sort your collection there will be no re-rendering,
    * only the DOM nodes will be reordered.
    */
  var reorderOnSort: js.UndefOr[Boolean] = js.undefined
  /**
    * If false the collection view will not maintain a sorted collection's
    * order in the DOM.
    */
  var sort: js.UndefOr[Boolean] = js.undefined
  /**
    * Render your collection view's children with a different sort order
    * than the underlying Backbone collection.
    */
  var viewComparator: js.UndefOr[
    String | (js.Function1[/* element */ TModel, Double | String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], Double])
  ] = js.undefined
}

object CollectionViewOptions {
  @scala.inline
  def apply[TModel /* <: Model */, TCollection /* <: Collection[TModel] */](
    attributes: StringDictionary[js.Any] = null,
    behaviors: js.Array[Behavior] = null,
    childView: (js.Function1[/* model */ TModel, TypeofClassView]) | TypeofClassView = null,
    childViewEventPrefix: String | `false` = null,
    childViewEvents: EventsHash = null,
    childViewOptions: js.Function0[ViewOptions[TModel]] | ViewOptions[TModel] = null,
    childViewTriggers: EventsHash = null,
    className: String = null,
    collection: Collection[_] = null,
    collectionEvents: EventsHash = null,
    el: js.Any = null,
    emptyView: js.Function0[TypeofClassView] | TypeofClassView = null,
    emptyViewOptions: js.Function0[ViewOptions[TModel]] | ViewOptions[TModel] = null,
    events: EventsHash = null,
    filter: (/* child */ js.UndefOr[TModel], /* index */ js.UndefOr[Double], /* collection */ js.UndefOr[TCollection]) => Boolean = null,
    id: String = null,
    model: TModel = null,
    modelEvents: EventsHash = null,
    reorderOnSort: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined,
    tagName: String = null,
    triggers: EventsHash = null,
    ui: js.Any = null,
    viewComparator: String | (js.Function1[/* element */ TModel, Double | String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], Double]) = null
  ): CollectionViewOptions[TModel, TCollection] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors)
    if (childView != null) __obj.updateDynamic("childView")(childView.asInstanceOf[js.Any])
    if (childViewEventPrefix != null) __obj.updateDynamic("childViewEventPrefix")(childViewEventPrefix.asInstanceOf[js.Any])
    if (childViewEvents != null) __obj.updateDynamic("childViewEvents")(childViewEvents)
    if (childViewOptions != null) __obj.updateDynamic("childViewOptions")(childViewOptions.asInstanceOf[js.Any])
    if (childViewTriggers != null) __obj.updateDynamic("childViewTriggers")(childViewTriggers)
    if (className != null) __obj.updateDynamic("className")(className)
    if (collection != null) __obj.updateDynamic("collection")(collection)
    if (collectionEvents != null) __obj.updateDynamic("collectionEvents")(collectionEvents)
    if (el != null) __obj.updateDynamic("el")(el)
    if (emptyView != null) __obj.updateDynamic("emptyView")(emptyView.asInstanceOf[js.Any])
    if (emptyViewOptions != null) __obj.updateDynamic("emptyViewOptions")(emptyViewOptions.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3(filter))
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (modelEvents != null) __obj.updateDynamic("modelEvents")(modelEvents)
    if (!js.isUndefined(reorderOnSort)) __obj.updateDynamic("reorderOnSort")(reorderOnSort)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (triggers != null) __obj.updateDynamic("triggers")(triggers)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (viewComparator != null) __obj.updateDynamic("viewComparator")(viewComparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionViewOptions[TModel, TCollection]]
  }
}

