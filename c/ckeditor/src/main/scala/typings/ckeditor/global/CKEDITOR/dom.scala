package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.Window
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeList
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dom {
  
  @JSGlobal("CKEDITOR.dom.comment")
  @js.native
  class comment protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.comment {
    def this(comment: String) = this()
    def this(comment: Node) = this()
    def this(comment: String, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
    def this(comment: Node, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.document")
  @js.native
  class document protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.document {
    def this(domDocument: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.documentFragment")
  @js.native
  class documentFragment protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.documentFragment {
    def this(nodeOrDoc: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.domObject")
  @js.native
  class domObject protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.domObject {
    def this(nativeDomObject: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.element")
  @js.native
  class element protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.element {
    def this(element: String) = this()
    def this(element: HTMLElement) = this()
    def this(element: String, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
    def this(element: HTMLElement, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
  }
  object element {
    
    @JSGlobal("CKEDITOR.dom.element")
    @js.native
    val ^ : js.Any = js.native
    
    // static method
    /* static member */
    inline def clearAllMarkers(database: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllMarkers")(database.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def clearMarkers(database: js.Any, element: typings.ckeditor.CKEDITOR.dom.element, removeFromDatabase: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearMarkers")(database.asInstanceOf[js.Any], element.asInstanceOf[js.Any], removeFromDatabase.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def createFromHtml(html: String): typings.ckeditor.CKEDITOR.dom.element = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHtml")(html.asInstanceOf[js.Any]).asInstanceOf[typings.ckeditor.CKEDITOR.dom.element]
    
    /* static member */
    inline def get(element: String): typings.ckeditor.CKEDITOR.dom.element = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(element.asInstanceOf[js.Any]).asInstanceOf[typings.ckeditor.CKEDITOR.dom.element]
    inline def get(element: typings.ckeditor.CKEDITOR.dom.element): typings.ckeditor.CKEDITOR.dom.element = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(element.asInstanceOf[js.Any]).asInstanceOf[typings.ckeditor.CKEDITOR.dom.element]
    inline def get(element: HTMLElement): typings.ckeditor.CKEDITOR.dom.element = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(element.asInstanceOf[js.Any]).asInstanceOf[typings.ckeditor.CKEDITOR.dom.element]
    
    /* static member */
    inline def setMarker(database: js.Any, element: typings.ckeditor.CKEDITOR.dom.element, name: String, value: js.Any): typings.ckeditor.CKEDITOR.dom.element = (^.asInstanceOf[js.Dynamic].applyDynamic("setMarker")(database.asInstanceOf[js.Any], element.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor.CKEDITOR.dom.element]
  }
  
  @JSGlobal("CKEDITOR.dom.elementPath")
  @js.native
  class elementPath protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.elementPath {
    def this(startNode: typings.ckeditor.CKEDITOR.dom.element) = this()
    def this(startNode: typings.ckeditor.CKEDITOR.dom.element, root: typings.ckeditor.CKEDITOR.dom.element) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.event")
  @js.native
  class event protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.event {
    def this(domEvent: Event) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.iterator")
  @js.native
  class iterator protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.iterator {
    def this(range: typings.ckeditor.CKEDITOR.dom.range) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.node")
  @js.native
  class node protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.node {
    def this(domNode: Node) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.nodeList")
  @js.native
  class nodeList protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.nodeList {
    def this(nativeList: NodeList) = this()
    
    /* CompleteClass */
    override def count(): Double = js.native
    
    /* CompleteClass */
    override def getItem(index: Double): typings.ckeditor.CKEDITOR.dom.node = js.native
    
    /* CompleteClass */
    override def toArray(): js.Array[typings.ckeditor.CKEDITOR.dom.node] = js.native
  }
  
  @JSGlobal("CKEDITOR.dom.range")
  @js.native
  class range protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.range {
    def this(root: typings.ckeditor.CKEDITOR.dom.document) = this()
    def this(root: typings.ckeditor.CKEDITOR.dom.element) = this()
  }
  object range {
    
    @JSGlobal("CKEDITOR.dom.range")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def mergeRanges(ranges: js.Array[typings.ckeditor.CKEDITOR.dom.range]): js.Array[typings.ckeditor.CKEDITOR.dom.range] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRanges")(ranges.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.ckeditor.CKEDITOR.dom.range]]
  }
  
  @JSGlobal("CKEDITOR.dom.rangeList")
  @js.native
  class rangeList ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.rangeList {
    def this(ranges: js.Array[typings.ckeditor.CKEDITOR.dom.range]) = this()
    def this(ranges: typings.ckeditor.CKEDITOR.dom.range) = this()
  }
  
  // see https://docs.com/ckeditor4/latest/api/CKEDITOR_dom_selection.html
  @JSGlobal("CKEDITOR.dom.selection")
  @js.native
  class selection protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.selection {
    def this(target: typings.ckeditor.CKEDITOR.dom.document) = this()
    def this(target: typings.ckeditor.CKEDITOR.dom.element) = this()
    def this(target: typings.ckeditor.CKEDITOR.dom.selection) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.text")
  @js.native
  class text protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.text {
    def this(text: String) = this()
    def this(text: Text) = this()
    def this(text: String, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
    def this(text: Text, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.walker")
  @js.native
  class walker protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.walker {
    def this(range: typings.ckeditor.CKEDITOR.dom.range) = this()
  }
  object walker {
    
    @JSGlobal("CKEDITOR.dom.walker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def blockBoundary(customNodeNames: js.Any): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockBoundary")(customNodeNames.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    
    /* static member */
    inline def bogus(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("bogus")().asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    inline def bogus(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("bogus")(isReject.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    
    /* static member */
    inline def bookmark(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("bookmark")().asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    inline def bookmark(contentOnly: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("bookmark")(contentOnly.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    inline def bookmark(contentOnly: Boolean, isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("bookmark")(contentOnly.asInstanceOf[js.Any], isReject.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    inline def bookmark(contentOnly: Unit, isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("bookmark")(contentOnly.asInstanceOf[js.Any], isReject.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    
    /* static member */
    inline def editable(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("editable")().asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    inline def editable(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("editable")(isReject.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    
    /* static member */
    inline def empty(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    inline def empty(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(isReject.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    
    /* static member */
    inline def ignored(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")().asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    inline def ignored(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")(isReject.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    
    /* static member */
    inline def invisible(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("invisible")().asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    inline def invisible(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("invisible")(isReject.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    
    /* static member */
    inline def listItemBoundary(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("listItemBoundary")().asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    
    /* static member */
    inline def nodeType(`type`: Double): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    inline def nodeType(`type`: Double, isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeType")(`type`.asInstanceOf[js.Any], isReject.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    
    /* static member */
    inline def temp(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("temp")().asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    inline def temp(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("temp")(isReject.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    
    /* static member */
    inline def whitespaces(): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("whitespaces")().asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    inline def whitespaces(isReject: Boolean): js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("whitespaces")(isReject.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ typings.ckeditor.CKEDITOR.dom.node, Boolean]]
    
    /* static member */
    object validEmptyBlockContainers
  }
  
  @JSGlobal("CKEDITOR.dom.window")
  @js.native
  class window protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.window {
    def this(domWindow: Window) = this()
  }
}
