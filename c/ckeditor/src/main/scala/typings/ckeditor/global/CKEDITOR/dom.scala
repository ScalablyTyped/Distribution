package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.Window
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeList
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.dom")
@js.native
object dom extends js.Object {
  
  @js.native
  class comment protected ()
    extends typings.ckeditor.CKEDITOR.dom.comment {
    def this(comment: String) = this()
    def this(comment: Node) = this()
    def this(comment: String, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
    def this(comment: Node, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
  }
  
  @js.native
  class document protected ()
    extends typings.ckeditor.CKEDITOR.dom.document {
    def this(domDocument: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class documentFragment protected ()
    extends typings.ckeditor.CKEDITOR.dom.documentFragment {
    def this(nodeOrDoc: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class domObject protected ()
    extends typings.ckeditor.CKEDITOR.dom.domObject {
    def this(nativeDomObject: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class element protected ()
    extends typings.ckeditor.CKEDITOR.dom.element {
    def this(element: String) = this()
    def this(element: HTMLElement) = this()
    def this(element: String, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
    def this(element: HTMLElement, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
  }
  /* static members */
  @js.native
  object element extends js.Object {
    
    // static method
    def clearAllMarkers(database: js.Any): js.Any = js.native
    
    def clearMarkers(database: js.Any, element: typings.ckeditor.CKEDITOR.dom.element, removeFromDatabase: Boolean): Unit = js.native
    
    def createFromHtml(html: String): typings.ckeditor.CKEDITOR.dom.element = js.native
    
    def get(element: String): typings.ckeditor.CKEDITOR.dom.element = js.native
    def get(element: typings.ckeditor.CKEDITOR.dom.element): typings.ckeditor.CKEDITOR.dom.element = js.native
    def get(element: HTMLElement): typings.ckeditor.CKEDITOR.dom.element = js.native
    
    def setMarker(database: js.Any, element: typings.ckeditor.CKEDITOR.dom.element, name: String, value: js.Any): typings.ckeditor.CKEDITOR.dom.element = js.native
  }
  
  @js.native
  class elementPath protected ()
    extends typings.ckeditor.CKEDITOR.dom.elementPath {
    def this(startNode: typings.ckeditor.CKEDITOR.dom.element) = this()
    def this(startNode: typings.ckeditor.CKEDITOR.dom.element, root: typings.ckeditor.CKEDITOR.dom.element) = this()
  }
  
  @js.native
  class event protected ()
    extends typings.ckeditor.CKEDITOR.dom.event {
    def this(domEvent: Event) = this()
  }
  
  @js.native
  class iterator protected ()
    extends typings.ckeditor.CKEDITOR.dom.iterator {
    def this(range: typings.ckeditor.CKEDITOR.dom.range) = this()
  }
  
  @js.native
  class node protected ()
    extends typings.ckeditor.CKEDITOR.dom.node {
    def this(domNode: Node) = this()
  }
  
  @js.native
  class nodeList protected ()
    extends typings.ckeditor.CKEDITOR.dom.nodeList {
    def this(nativeList: NodeList) = this()
  }
  
  @js.native
  class range protected ()
    extends typings.ckeditor.CKEDITOR.dom.range {
    def this(root: typings.ckeditor.CKEDITOR.dom.document) = this()
    def this(root: typings.ckeditor.CKEDITOR.dom.element) = this()
  }
  /* static members */
  @js.native
  object range extends js.Object {
    
    def mergeRanges(ranges: js.Array[typings.ckeditor.CKEDITOR.dom.range]): js.Array[typings.ckeditor.CKEDITOR.dom.range] = js.native
  }
  
  @js.native
  class rangeList ()
    extends typings.ckeditor.CKEDITOR.dom.rangeList {
    def this(ranges: js.Array[typings.ckeditor.CKEDITOR.dom.range]) = this()
    def this(ranges: typings.ckeditor.CKEDITOR.dom.range) = this()
  }
  
  // see https://docs.com/ckeditor4/latest/api/CKEDITOR_dom_selection.html
  @js.native
  class selection protected ()
    extends typings.ckeditor.CKEDITOR.dom.selection {
    def this(target: typings.ckeditor.CKEDITOR.dom.document) = this()
    def this(target: typings.ckeditor.CKEDITOR.dom.element) = this()
    def this(target: typings.ckeditor.CKEDITOR.dom.selection) = this()
  }
  
  @js.native
  class text protected ()
    extends typings.ckeditor.CKEDITOR.dom.text {
    def this(text: String) = this()
    def this(text: Text) = this()
    def this(text: String, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
    def this(text: Text, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
  }
  
  @js.native
  class walker protected ()
    extends typings.ckeditor.CKEDITOR.dom.walker {
    def this(range: typings.ckeditor.CKEDITOR.dom.range) = this()
  }
  /* static members */
  @js.native
  object walker extends js.Object {
    
    def blockBoundary(customNodeNames: js.Any): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    def bogus(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def bogus(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    def bookmark(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def bookmark(contentOnly: js.UndefOr[scala.Nothing], isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def bookmark(contentOnly: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def bookmark(contentOnly: Boolean, isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    def editable(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def editable(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    def empty(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def empty(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    def ignored(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def ignored(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    def invisible(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def invisible(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    def listItemBoundary(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    def nodeType(`type`: Double): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def nodeType(`type`: Double, isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    def temp(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def temp(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    var validEmptyBlockContainers: StringDictionary[js.Any] = js.native
    
    def whitespaces(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def whitespaces(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
  }
  
  @js.native
  class window protected ()
    extends typings.ckeditor.CKEDITOR.dom.window {
    def this(domWindow: Window) = this()
  }
}
