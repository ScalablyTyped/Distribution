package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.marionette", "CollectionView")
@js.native
class CollectionView[TModel /* <: backboneLib.backboneMod.Model */, TView /* <: View[TModel] */, TCollection /* <: backboneLib.backboneMod.Collection[TModel] */] () extends View[TModel] {
  def this(options: CollectionViewOptions[TModel, TCollection]) = this()
  /**
    * Specify a child view to use.
    */
  var childView: (js.Function1[/* model */ TModel, backboneDotMarionetteLib.Anon_ArgsAny[TView]]) | backboneDotMarionetteLib.Anon_ArgsAny[TView] = js.native
  /**
    * Use the childViewEvents attribute to map child events to methods on the
    * parent view.
    */
  var childViewEvents: EventsHash = js.native
  /**
    * Define options to pass to the childView constructor.
    */
  var childViewOptions: (js.Function2[/* model */ TModel, /* index */ scala.Double, ViewOptions[TModel]]) | ViewOptions[TModel] = js.native
  /**
    * A childViewTriggers hash or method permits proxying of child view events
    * without manually setting bindings. The values of the hash should be a
    * string of the event to trigger on the parent.
    */
  var childViewTriggers: EventsHash = js.native
  /**
    * The CollectionView can store and manage its child views. This allows
    * you to easily access the views within the collection view, iterate
    * them, find them by a given indexer such as the view's model or
    * collection, and more.
    */
  var children: Container[TView] = js.native
  /**
    * Bind to events that occur on attached collections.
    */
  var collectionEvents: EventsHash = js.native
  /**
    * Specify a view to use if the collection has no children.
    */
  var emptyView: js.Function0[backboneDotMarionetteLib.Anon_Args[TModel]] | backboneDotMarionetteLib.Anon_Args[TModel] = js.native
  /**
    * Define options to pass to the emptyView constructor.
    */
  var emptyViewOptions: (js.Function2[/* model */ TModel, /* index */ scala.Double, ViewOptions[TModel]]) | ViewOptions[TModel] = js.native
  /**
    * If true when you sort your collection there will be no re-rendering,
    * only the DOM nodes will be reordered.
    */
  var reorderOnSort: scala.Boolean = js.native
  /**
    * Render your collection view's children with a different sort order
    * than the underlying Backbone collection.
    */
  var viewComparator: java.lang.String | (js.Function1[/* element */ TModel, scala.Double | java.lang.String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], scala.Double]) = js.native
  /**
    * The addChildView method can be used to add a view that is independent
    * of your Backbone.Collection.
    */
  def addChildView(childView: TView, index: scala.Double): scala.Unit = js.native
  /**
    * When overriding attachHtml it may be necessary to also override how
    * the buffer is attached.
    */
  def attachBuffer(collectionView: CollectionView[TModel, TView, TCollection], buffer: stdLib.DocumentFragment): scala.Unit = js.native
  /**
    * This method is used move the HTML from the element buffer into the
    * collection view's el.
    */
  def attachHtml(collectionView: CollectionView[TModel, TView, TCollection], childView: TView, index: scala.Double): scala.Unit = js.native
  /**
    * The buildChildView is responsible for taking the ChildView class and
    * instantiating it with the appropriate data.
    */
  def buildChildView(
    child: TModel,
    childViewClass: backboneDotMarionetteLib.Anon_ArgsAny[TView],
    childViewOptions: ViewOptions[TModel]
  ): scala.Unit = js.native
  /**
    * Automatically destroys this Collection's children and cleans up
    * listeners.
    */
  @JSName("destroy")
  def destroy_MCollectionView(args: js.Any*): CollectionView[TModel, TView, TCollection] = js.native
  /**
    * Prevent some of the underlying collection's models from being
    * rendered as child views.
    */
  def filter(): scala.Boolean = js.native
  def filter(child: TModel): scala.Boolean = js.native
  def filter(child: TModel, index: scala.Double): scala.Boolean = js.native
  def filter(child: TModel, index: scala.Double, collection: TCollection): scala.Boolean = js.native
   // Mirrors Backbone.Collection.comparator
  /**
    * Override this method to determine which viewComparator to use.
    */
  def getViewComparator(): java.lang.String | (js.Function1[/* element */ TModel, scala.Double | java.lang.String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], scala.Double]) = js.native
  /**
    * Method used to determine when emptyView is rendered.
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    * This callback function allows you to know when a child / child view
    * instance has been added to the collection view. It provides access to
    * the view instance for the child that was added.
    */
  def onAddChild(collectionView: CollectionView[TModel, TView, TCollection], childView: TView): scala.Unit = js.native
  /**
    * This callback function allows you to know when a child / child view
    * instance is about to be added to the collection view. It provides
    * access to the view instance for the child that was added.
    */
  def onBeforeAddChild(collectionView: CollectionView[TModel, TView, TCollection], childView: TView): scala.Unit = js.native
  /**
    * This callback function allows you to know when a childView instance is
    * about to be removed from the collectionView. It provides access to the
    * view instance for the child that was removed.
    */
  def onBeforeRemoveChild(collectionView: CollectionView[TModel, TView, TCollection], childView: TView): scala.Unit = js.native
  /**
    * Called just prior to rendering the collection view.
    */
  def onBeforeRender(): scala.Unit = js.native
  /**
    * This callback function allows you to know when a child / childView
    * instance has been deleted or removed from the collection.
    */
  def onRemoveChild(collectionView: CollectionView[TModel, TView, TCollection], childView: TView): scala.Unit = js.native
  /**
    * Triggered after the view has been rendered. You can implement this in
    * your view to provide custom code for dealing with the view's el after
    * it has been rendered.
    */
  def onRender(): scala.Unit = js.native
  /**
    * The removeChildView method is useful if you need to remove a view
    * from the CollectionView without affecting the view's collection.
    */
  def removeChildView(childView: TView): scala.Unit = js.native
  /**
    * Remove a filter from the CollectionView.
    */
  def removeFilter(options: backboneDotMarionetteLib.Anon_PreventRender): scala.Unit = js.native
  /**
    * If reorderOnSort is set to true, this function will be used instead
    * of re-rendering all children.
    */
  def reorder(): scala.Unit = js.native
  /**
    * By default the CollectionView will maintain the order of its
    * collection in the DOM. However on occasions the view may need to
    * re-render to make this possible, for example if you were to change
    * the comparator on the collection. The CollectionView will re-render
    * its children or reorder them depending on reorderOnSort.
    */
  def resortView(): scala.Unit = js.native
  /**
    * Modify the CollectionView's filter attribute, and renders the new
    * ChildViews in a efficient way, instead of rendering the whole DOM
    * structure again.
    */
  def setFilter(
    filter: js.Function3[
      /* child */ js.UndefOr[TModel], 
      /* index */ js.UndefOr[scala.Double], 
      /* collection */ js.UndefOr[TCollection], 
      scala.Boolean
    ],
    options: backboneDotMarionetteLib.Anon_PreventRender
  ): scala.Unit = js.native
}

