package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CollectionViewOptions[TModel /* <: backboneLib.backboneMod.Model */, TCollection /* <: backboneLib.backboneMod.Collection[TModel] */]
  extends backboneLib.backboneMod.BackboneNs.ViewOptions[TModel]
     with ViewMixinOptions {
  /**
       * Specify a child view to use.
       */
  var childView: js.UndefOr[
    (js.Function1[
      /* model */ TModel, 
      ScalablyTyped.runtime.Instantiable0[backboneLib.backboneMod.View[backboneLib.backboneMod.BackboneNs.Model]]
    ]) | ScalablyTyped.runtime.Instantiable0[backboneLib.backboneMod.View[backboneLib.backboneMod.BackboneNs.Model]]
  ] = js.undefined
  /**
       * Define options to pass to the childView constructor.
       */
  var childViewOptions: js.UndefOr[js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]] = js.undefined
  /**
       * Specify a view to use if the collection has no children.
       */
  var emptyView: js.UndefOr[
    (js.Function0[
      ScalablyTyped.runtime.Instantiable0[backboneLib.backboneMod.View[backboneLib.backboneMod.BackboneNs.Model]]
    ]) | ScalablyTyped.runtime.Instantiable0[backboneLib.backboneMod.View[backboneLib.backboneMod.BackboneNs.Model]]
  ] = js.undefined
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
      /* index */ js.UndefOr[scala.Double], 
      /* collection */ js.UndefOr[TCollection], 
      scala.Boolean
    ]
  ] = js.undefined
  /**
       * If true when you sort your collection there will be no re-rendering,
       * only the DOM nodes will be reordered.
       */
  var reorderOnSort: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If false the collection view will not maintain a sorted collection's
       * order in the DOM.
       */
  var sort: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Render your collection view's children with a different sort order
       * than the underlying Backbone collection.
       */
  var viewComparator: js.UndefOr[
    java.lang.String | (js.Function1[/* element */ TModel, scala.Double | java.lang.String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], scala.Double])
  ] = js.undefined
}

