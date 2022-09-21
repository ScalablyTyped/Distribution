package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.IsPhantom
import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapperMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/mapper", JSImport.Default)
  @js.native
  /**
    * Creates an instance of the mapper.
    */
  open class default ()
    extends StObject
       with Mapper
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter * / any */ @js.native
  trait Mapper extends StObject {
    
    /**
      * Binds given marker name with given {@link module:engine/view/element~Element view element}. The element
      * will be added to the current set of elements bound with given marker name.
      */
    def bindElementToMarker(element: typings.ckeditorCkeditor5Engine.viewElementMod.default, name: String): Unit = js.native
    
    /**
      * Marks model and view elements as corresponding. Corresponding elements can be retrieved by using
      * the {@link module:engine/conversion/mapper~Mapper#toModelElement toModelElement} and
      * {@link module:engine/conversion/mapper~Mapper#toViewElement toViewElement} methods.
      * The information that elements are bound is also used to translate positions.
      */
    def bindElements(
      modelElement: typings.ckeditorCkeditor5Engine.elementMod.default,
      viewElement: typings.ckeditorCkeditor5Engine.viewElementMod.default
    ): Unit = js.native
    
    /**
      * Removes all model to view and view to model bindings.
      */
    def clearBindings(): Unit = js.native
    
    def delegate(events: String*): Any = js.native
    
    /**
      * For given `viewPosition`, finds and returns the closest ancestor of this position that has a mapping to
      * the model.
      */
    def findMappedViewAncestor(viewPosition: typings.ckeditorCkeditor5Engine.viewPositionMod.default): typings.ckeditorCkeditor5Engine.viewElementMod.default = js.native
    
    /**
      * Finds the position in the view node (or its children) with the expected model offset.
      *
      * Example:
      *
      *    <p>fo<b>bar</b>bom</p> -> expected offset: 4
      *
      *    findPositionIn( p, 4 ):
      *    <p>|fo<b>bar</b>bom</p> -> expected offset: 4, actual offset: 0
      *    <p>fo|<b>bar</b>bom</p> -> expected offset: 4, actual offset: 2
      *    <p>fo<b>bar</b>|bom</p> -> expected offset: 4, actual offset: 5 -> we are too far
      *
      *    findPositionIn( b, 4 - ( 5 - 3 ) ):
      *    <p>fo<b>|bar</b>bom</p> -> expected offset: 2, actual offset: 0
      *    <p>fo<b>bar|</b>bom</p> -> expected offset: 2, actual offset: 3 -> we are too far
      *
      *    findPositionIn( bar, 2 - ( 3 - 3 ) ):
      *    We are in the text node so we can simple find the offset.
      *    <p>fo<b>ba|r</b>bom</p> -> expected offset: 2, actual offset: 2 -> position found
      */
    def findPositionIn(viewParent: typings.ckeditorCkeditor5Engine.viewElementMod.default, expectedOffset: Double): typings.ckeditorCkeditor5Engine.viewPositionMod.default = js.native
    
    def fire(eventOrInfo: String, args: Any*): Any = js.native
    def fire(
      eventOrInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo */ Any,
      args: Any*
    ): Any = js.native
    
    /**
      * Returns all marker names of markers which has changed due to unbinding a view element (so it is assumed that the view element
      * has been removed, moved or renamed) since the last flush. After returning, the marker names list is cleared.
      */
    def flushUnboundMarkerNames(): js.Array[String] = js.native
    
    /**
      * Gets the length of the view element in the model.
      *
      * The length is calculated as follows:
      * * if {@link #registerViewToModelLength length mapping callback} is provided for given `viewNode` it is used to
      * evaluate model length (`viewNode` is used as first and only parameter passed to the callback),
      * * length of a {@link module:engine/view/text~Text text node} is equal to the length of it's
      * {@link module:engine/view/text~Text#data data},
      * * length of a {@link module:engine/view/uielement~UIElement ui element} is equal to 0,
      * * length of a mapped {@link module:engine/view/element~Element element} is equal to 1,
      * * length of a not-mapped {@link module:engine/view/element~Element element} is equal to the length of it's children.
      *
      * Examples:
      *
      *    foo                          -> 3 // Text length is equal to it's data length.
      *    <p>foo</p>                   -> 1 // Length of an element which is mapped is by default equal to 1.
      *    <b>foo</b>                   -> 3 // Length of an element which is not mapped is a length of its children.
      *    <div><p>x</p><p>y</p></div>  -> 2 // Assuming that <div> is not mapped and <p> are mapped.
      */
    def getModelLength(viewNode: typings.ckeditorCkeditor5Engine.viewElementMod.default): Double = js.native
    
    def listenTo[P /* <: String */, E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](
      emitter: E,
      event: P,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def listenTo[P /* <: String */, E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](
      emitter: E,
      event: P,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Priority
    ): Unit = js.native
    
    /**
      * Gets all view elements bound to the given marker name.
      */
    def markerNameToElements(name: String): Set[typings.ckeditorCkeditor5Engine.viewElementMod.default] | Null = js.native
    
    def off[K /* <: String */](event: K): Unit = js.native
    def off[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    
    def on[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def on[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Priority
    ): Unit = js.native
    
    def once[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def once[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Priority
    ): Unit = js.native
    
    /**
      * Registers a callback that evaluates the length in the model of a view element with given name.
      *
      * The callback is fired with one argument, which is a view element instance. The callback is expected to return
      * a number representing the length of view element in model.
      *
      *    // List item in view may contain nested list, which have other list items. In model though,
      *    // the lists are represented by flat structure. Because of those differences, length of list view element
      *    // may be greater than one. In the callback it's checked how many nested list items are in evaluated list item.
      *
      *    function getViewListItemLength( element ) {
      *      let length = 1;
      *
      *      for ( let child of element.getChildren() ) {
      *        if ( child.name == 'ul' || child.name == 'ol' ) {
      *          for ( let item of child.getChildren() ) {
      *            length += getViewListItemLength( item );
      *          }
      *        }
      *      }
      *
      *      return length;
      *    }
      *
      *    mapper.registerViewToModelLength( 'li', getViewListItemLength );
      */
    def registerViewToModelLength(
      viewElementName: String,
      lengthCallback: js.Function1[/* element */ typings.ckeditorCkeditor5Engine.viewElementMod.default, Double]
    ): Unit = js.native
    
    def stopDelegating(): Unit = js.native
    def stopDelegating(event: String): Unit = js.native
    def stopDelegating(
      event: String,
      emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
    ): Unit = js.native
    def stopDelegating(
      event: Unit,
      emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
    ): Unit = js.native
    
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](emitter: E): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](emitter: E, event: P): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: E,
      event: P,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: E,
      event: Unit,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](emitter: Unit, event: P): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: Unit,
      event: P,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: Unit,
      event: Unit,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Gets the corresponding model element.
      *
      * **Note:** {@link module:engine/view/uielement~UIElement} does not have corresponding element in model.
      */
    def toModelElement(viewElement: typings.ckeditorCkeditor5Engine.viewElementMod.default): js.UndefOr[typings.ckeditorCkeditor5Engine.elementMod.default] = js.native
    
    /**
      * Gets the corresponding model position.
      */
    def toModelPosition(viewPosition: typings.ckeditorCkeditor5Engine.viewPositionMod.default): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    
    /**
      * Gets the corresponding model range.
      */
    def toModelRange(viewRange: typings.ckeditorCkeditor5Engine.viewRangeMod.default): typings.ckeditorCkeditor5Engine.rangeMod.default = js.native
    
    /**
      * Gets the corresponding view element.
      */
    def toViewElement(modelElement: typings.ckeditorCkeditor5Engine.elementMod.default): typings.ckeditorCkeditor5Engine.viewElementMod.default = js.native
    
    /**
      * Gets the corresponding view position.
      */
    def toViewPosition(modelPosition: typings.ckeditorCkeditor5Engine.positionMod.default): typings.ckeditorCkeditor5Engine.viewPositionMod.default = js.native
    def toViewPosition(modelPosition: typings.ckeditorCkeditor5Engine.positionMod.default, options: IsPhantom): typings.ckeditorCkeditor5Engine.viewPositionMod.default = js.native
    
    /**
      * Gets the corresponding view range.
      */
    def toViewRange(modelRange: typings.ckeditorCkeditor5Engine.rangeMod.default): typings.ckeditorCkeditor5Engine.viewRangeMod.default = js.native
    
    /**
      * Unbinds an element from given marker name.
      */
    def unbindElementFromMarkerName(element: typings.ckeditorCkeditor5Engine.viewElementMod.default, name: String): Unit = js.native
    
    /**
      * Unbinds given {@link module:engine/model/element~Element model element} from the map.
      *
      * **Note:** model-to-view binding will be removed, if it existed. However, corresponding view-to-model binding
      * will be removed only if view element is still bound to passed `modelElement`.
      *
      * This behavior lets for re-binding view element to another model element without fear of losing the new binding
      * when the previously bound model element is unbound.
      */
    def unbindModelElement(modelElement: typings.ckeditorCkeditor5Engine.elementMod.default): Unit = js.native
    
    /**
      * Unbinds given {@link module:engine/view/element~Element view element} from the map.
      *
      * **Note:** view-to-model binding will be removed, if it existed. However, corresponding model-to-view binding
      * will be removed only if model element is still bound to passed `viewElement`.
      *
      * This behavior lets for re-binding model element to another view element without fear of losing the new binding
      * when the previously bound view element is unbound.
      */
    def unbindViewElement(viewElement: typings.ckeditorCkeditor5Engine.viewElementMod.default): Unit = js.native
  }
}
