package typings.typescriptNn5FuAjk.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ShadowRoot")
@js.native
open class ShadowRoot ()
  extends StObject
     with typings.typescriptNn5FuAjk.ShadowRoot {
  
  /**
    * Returns the deepest element in the document through which or to which key events are being routed. This is, roughly speaking, the focused element in the document.
    *
    * For the purposes of this API, when a child browsing context is focused, its container is focused in the parent browsing context. For example, if the user moves the focus to a text control in an iframe, the iframe is the element returned by the activeElement API in the iframe's node document.
    *
    * Similarly, when the focused element is in a different node tree than documentOrShadowRoot, the element returned will be the host that's located in the same node tree as documentOrShadowRoot if documentOrShadowRoot is a shadow-including inclusive ancestor of the focused element, and null if not.
    */
  /* CompleteClass */
  override val activeElement: typings.typescriptNn5FuAjk.Element | Null = js.native
  
  /**
    * Returns the element for the specified x coordinate and the specified y coordinate.
    * @param x The x-offset
    * @param y The y-offset
    */
  /* CompleteClass */
  override def elementFromPoint(x: Double, y: Double): typings.typescriptNn5FuAjk.Element | Null = js.native
  
  /* CompleteClass */
  override def elementsFromPoint(x: Double, y: Double): typings.typescriptNn5FuAjk.Array[typings.typescriptNn5FuAjk.Element] = js.native
  
  /** Returns document's fullscreen element. */
  /* CompleteClass */
  override val fullscreenElement: typings.typescriptNn5FuAjk.Element | Null = js.native
  
  /* CompleteClass */
  override def getAnimations(): typings.typescriptNn5FuAjk.Array[typings.typescriptNn5FuAjk.Animation] = js.native
  
  /** Returns the first element within node's descendants whose ID is elementId. */
  /* CompleteClass */
  override def getElementById(elementId: java.lang.String): typings.typescriptNn5FuAjk.Element | Null = js.native
  
  /* CompleteClass */
  var innerHTML: java.lang.String = js.native
  
  /* CompleteClass */
  override val pictureInPictureElement: typings.typescriptNn5FuAjk.Element | Null = js.native
  
  /* CompleteClass */
  override val pointerLockElement: typings.typescriptNn5FuAjk.Element | Null = js.native
  
  /** Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document. */
  /* CompleteClass */
  override val styleSheets: typings.typescriptNn5FuAjk.StyleSheetList = js.native
}
