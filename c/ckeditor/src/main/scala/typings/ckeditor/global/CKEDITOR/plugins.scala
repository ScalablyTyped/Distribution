package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.domObject
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.elementPath
import typings.ckeditor.CKEDITOR.dom.node
import typings.ckeditor.CKEDITOR.dom.range
import typings.ckeditor.CKEDITOR.fileTools.fileLoader
import typings.ckeditor.CKEDITOR.pluginDefinition
import typings.ckeditor.CKEDITOR.plugins.balloontoolbar.contextDefinition
import typings.ckeditor.CKEDITOR.plugins.embedBase.baseDefinition
import typings.ckeditor.CKEDITOR.plugins.imagebase.imageWidgetDefinition
import typings.ckeditor.CKEDITOR.plugins.notification.updateOptions
import typings.ckeditor.CKEDITOR.plugins.pastefromword.lists.numbering
import typings.ckeditor.CKEDITOR.plugins.widget.definition
import typings.ckeditor.anon.Exec
import typings.ckeditor.anon.Filter
import typings.ckeditor.anon.Removed
import typings.ckeditor.anon.Set
import typings.std.Blob
import typings.std.DataTransfer
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugins {
  
  @JSGlobal("CKEDITOR.plugins")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def add(name: String, definition: pluginDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def addExternal(name: String, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExternal")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addExternal(name: String, path: String, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExternal")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("CKEDITOR.plugins.autoEmbed")
  @js.native
  class autoEmbed ()
    extends StObject
       with typings.ckeditor.CKEDITOR.plugins.autoEmbed {
    
    /* CompleteClass */
    override def getWidgetDefinition(editor: typings.ckeditor.CKEDITOR.editor, url: String): definition = js.native
  }
  
  object balloontoolbar {
    
    @JSGlobal("CKEDITOR.plugins.balloontoolbar.context")
    @js.native
    class context protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.balloontoolbar.context {
      def this(editor: typings.ckeditor.CKEDITOR.editor, options: contextDefinition) = this()
    }
    
    @JSGlobal("CKEDITOR.plugins.balloontoolbar.contextManager")
    @js.native
    class contextManager protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.balloontoolbar.contextManager {
      def this(editor: typings.ckeditor.CKEDITOR.editor) = this()
    }
  }
  
  object clipboard {
    
    @JSGlobal("CKEDITOR.plugins.clipboard")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addPasteButton(editor: typings.ckeditor.CKEDITOR.editor, name: String, definition: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPasteButton")(editor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def canClipboardApiBeTrusted(
      dataTransfer: typings.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer,
      editor: typings.ckeditor.CKEDITOR.editor
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canClipboardApiBeTrusted")(dataTransfer.asInstanceOf[js.Any], editor.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSGlobal("CKEDITOR.plugins.clipboard.dataTransfer")
    @js.native
    class dataTransfer ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer {
      def this(nativeDataTransfer: DataTransfer) = this()
      def this(nativeDataTransfer: Unit, editor: typings.ckeditor.CKEDITOR.editor) = this()
      def this(nativeDataTransfer: DataTransfer, editor: typings.ckeditor.CKEDITOR.editor) = this()
    }
    
    @JSGlobal("CKEDITOR.plugins.clipboard.fallbackDataTransfer")
    @js.native
    class fallbackDataTransfer protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.clipboard.fallbackDataTransfer {
      def this(dataTransfer: typings.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer) = this()
    }
    
    @scala.inline
    def getDropTarget(editor: typings.ckeditor.CKEDITOR.editor): domObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getDropTarget")(editor.asInstanceOf[js.Any]).asInstanceOf[domObject]
    
    @scala.inline
    def getRangeAtDropPosition(domEvent: Event, editor: typings.ckeditor.CKEDITOR.editor): range = (^.asInstanceOf[js.Dynamic].applyDynamic("getRangeAtDropPosition")(domEvent.asInstanceOf[js.Any], editor.asInstanceOf[js.Any])).asInstanceOf[range]
    
    @scala.inline
    def initDragDataTransfer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initDragDataTransfer")().asInstanceOf[Unit]
    @scala.inline
    def initDragDataTransfer(evt: Unit, editor: typings.ckeditor.CKEDITOR.editor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initDragDataTransfer")(evt.asInstanceOf[js.Any], editor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def initDragDataTransfer(evt: typings.ckeditor.CKEDITOR.dom.event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initDragDataTransfer")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def initDragDataTransfer(evt: typings.ckeditor.CKEDITOR.dom.event, editor: typings.ckeditor.CKEDITOR.editor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initDragDataTransfer")(evt.asInstanceOf[js.Any], editor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def initPasteDataTransfer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initPasteDataTransfer")().asInstanceOf[Unit]
    @scala.inline
    def initPasteDataTransfer(evt: Unit, sourceEditor: typings.ckeditor.CKEDITOR.editor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initPasteDataTransfer")(evt.asInstanceOf[js.Any], sourceEditor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def initPasteDataTransfer(evt: typings.ckeditor.CKEDITOR.dom.event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initPasteDataTransfer")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def initPasteDataTransfer(evt: typings.ckeditor.CKEDITOR.dom.event, sourceEditor: typings.ckeditor.CKEDITOR.editor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initPasteDataTransfer")(evt.asInstanceOf[js.Any], sourceEditor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("CKEDITOR.plugins.clipboard.isCustomCopyCutSupported")
    @js.native
    val isCustomCopyCutSupported: Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.isCustomDataTypesSupported")
    @js.native
    val isCustomDataTypesSupported: Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.isFileApiSupported")
    @js.native
    val isFileApiSupported: Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.mainPasteEvent")
    @js.native
    val mainPasteEvent: String = js.native
    
    @scala.inline
    def preventDefaultDropOnElement(element: element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefaultDropOnElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def resetDragDataTransfer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetDragDataTransfer")().asInstanceOf[Unit]
  }
  
  object cloudservices {
    
    @JSGlobal("CKEDITOR.plugins.cloudservices.cloudServicesLoader")
    @js.native
    class cloudServicesLoader protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.cloudservices.cloudServicesLoader {
      def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: String) = this()
      def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: Blob) = this()
      def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: String, fileName: String) = this()
      def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: Blob, fileName: String) = this()
      def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: String, fileName: String, token: String) = this()
      def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: String, fileName: Unit, token: String) = this()
      def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: Blob, fileName: String, token: String) = this()
      def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: Blob, fileName: Unit, token: String) = this()
    }
  }
  
  object condesnippet {
    
    @JSGlobal("CKEDITOR.plugins.condesnippet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CKEDITOR.plugins.condesnippet.highlighter")
    @js.native
    class highlighter ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.condesnippet.highlighter {
      
      /* CompleteClass */
      override def highlight(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit = js.native
      
      /* CompleteClass */
      override def highlighter(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit = js.native
      
      /* CompleteClass */
      override def init(ready: js.Function0[Unit]): Unit = js.native
      
      /* CompleteClass */
      var languages: StringDictionary[String] = js.native
      
      /* CompleteClass */
      override val queue: js.Array[
            js.Function3[
              /* code */ String, 
              /* lang */ String, 
              /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
              Unit
            ]
          ] = js.native
      
      /* CompleteClass */
      override val ready: Boolean = js.native
    }
    
    @scala.inline
    def setHighlighter(highlighter: typings.ckeditor.CKEDITOR.plugins.condesnippet.highlighter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHighlighter")(highlighter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("CKEDITOR.plugins.contextMenu")
  @js.native
  class contextMenu protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.plugins.contextMenu {
    def this(editor: typings.ckeditor.CKEDITOR.editor) = this()
  }
  
  object copyformatting {
    
    @JSGlobal("CKEDITOR.plugins.copyformatting")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.breakOnElements")
    @js.native
    def breakOnElements: js.Array[String] = js.native
    @scala.inline
    def breakOnElements_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("breakOnElements")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.elementsForInlineTransform")
    @js.native
    def elementsForInlineTransform: js.Array[String] = js.native
    @scala.inline
    def elementsForInlineTransform_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elementsForInlineTransform")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.excludedAttributes")
    @js.native
    def excludedAttributes: js.Array[String] = js.native
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.excludedAttributesFromInlineTransform")
    @js.native
    def excludedAttributesFromInlineTransform: js.Array[String] = js.native
    @scala.inline
    def excludedAttributesFromInlineTransform_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludedAttributesFromInlineTransform")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def excludedAttributes_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludedAttributes")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.inlineBoundary")
    @js.native
    def inlineBoundary: js.Array[String] = js.native
    @scala.inline
    def inlineBoundary_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineBoundary")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.preservedElements")
    @js.native
    def preservedElements: js.Array[String] = js.native
    @scala.inline
    def preservedElements_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preservedElements")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.state")
    @js.native
    class state protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.copyformatting.state {
      def this(editor: typings.ckeditor.CKEDITOR.editor) = this()
    }
  }
  
  object embedBase {
    
    @JSGlobal("CKEDITOR.plugins.embedBase")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createWidgetBaseDefinition(editor: typings.ckeditor.CKEDITOR.editor): baseDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("createWidgetBaseDefinition")(editor.asInstanceOf[js.Any]).asInstanceOf[baseDefinition]
  }
  
  @scala.inline
  def get(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getFilePath(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilePath")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getPath(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object image2 {
    
    @JSGlobal("CKEDITOR.plugins.image2")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def checkHasNaturalRatio(image: element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkHasNaturalRatio")(image.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def getLinkAttributesGetter(): js.Function2[
        /* editor */ typings.ckeditor.CKEDITOR.editor, 
        /* data */ StringDictionary[String], 
        Removed
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinkAttributesGetter")().asInstanceOf[js.Function2[
        /* editor */ typings.ckeditor.CKEDITOR.editor, 
        /* data */ StringDictionary[String], 
        Removed
      ]]
    
    @scala.inline
    def getLinkAttributesParser(): js.Function2[
        /* editor */ typings.ckeditor.CKEDITOR.editor, 
        /* element */ element, 
        StringDictionary[String]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinkAttributesParser")().asInstanceOf[js.Function2[
        /* editor */ typings.ckeditor.CKEDITOR.editor, 
        /* element */ element, 
        StringDictionary[String]
      ]]
    
    @scala.inline
    def getNatural(image: element): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNatural")(image.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  }
  
  object imagebase {
    
    @JSGlobal("CKEDITOR.plugins.imagebase")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addFeature(editor: typings.ckeditor.CKEDITOR.editor, name: String, definition: imageWidgetDefinition): imageWidgetDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("addFeature")(editor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[imageWidgetDefinition]
    
    @scala.inline
    def addImageWidget(editor: typings.ckeditor.CKEDITOR.editor, name: String, definition: imageWidgetDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addImageWidget")(editor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("CKEDITOR.plugins.imagebase.progressBar")
    @js.native
    class progressBar ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.imagebase.progressBar {
      
      /* CompleteClass */
      override def aborted(): Unit = js.native
      
      /* CompleteClass */
      var bar: element = js.native
      
      /* CompleteClass */
      override def bindLoader(loader: fileLoader): Unit = js.native
      
      /* CompleteClass */
      override def done(): Unit = js.native
      
      /* CompleteClass */
      override def failed(): Unit = js.native
      
      /* CompleteClass */
      override def remove(): Unit = js.native
      
      /* CompleteClass */
      override def updated(progress: Double): Unit = js.native
      
      /* CompleteClass */
      var wrapper: element = js.native
    }
    
    @JSGlobal("CKEDITOR.plugins.imagebase.progressReporter")
    @js.native
    class progressReporter ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.imagebase.progressReporter {
      def this(wrapperHtml: String) = this()
      
      /* CompleteClass */
      override def aborted(): Unit = js.native
      
      /* CompleteClass */
      override def bindLoader(loader: fileLoader): Unit = js.native
      
      /* CompleteClass */
      override def done(): Unit = js.native
      
      /* CompleteClass */
      override def failed(): Unit = js.native
      
      /* CompleteClass */
      override def remove(): Unit = js.native
      
      /* CompleteClass */
      override def updated(progress: Double): Unit = js.native
      
      /* CompleteClass */
      var wrapper: element = js.native
    }
  }
  
  object indent {
    
    @JSGlobal("CKEDITOR.plugins.indent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CKEDITOR.plugins.indent.genericDefinition")
    @js.native
    class genericDefinition ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.indent.genericDefinition
    
    @scala.inline
    def registerCommands(
      editor: typings.ckeditor.CKEDITOR.editor,
      commands: StringDictionary[typings.ckeditor.CKEDITOR.command]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCommands")(editor.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("CKEDITOR.plugins.indent.specificDefinition")
    @js.native
    class specificDefinition ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.indent.specificDefinition {
      
      /* CompleteClass */
      var database: StringDictionary[js.Any] = js.native
      
      /* CompleteClass */
      override val enterBr: Boolean = js.native
      
      /* CompleteClass */
      override def execJob(editor: typings.ckeditor.CKEDITOR.editor, priority: Double): Boolean = js.native
      
      /* CompleteClass */
      override def getContext(node: elementPath): element = js.native
      
      /* CompleteClass */
      override val indentKey: StringDictionary[js.Any] = js.native
      
      /* CompleteClass */
      override val isIndent: Boolean = js.native
      
      /* CompleteClass */
      override val jobs: StringDictionary[Exec] = js.native
      
      /* CompleteClass */
      override def refreshJob(editor: typings.ckeditor.CKEDITOR.editor, priority: Double): Double = js.native
      
      /* CompleteClass */
      override val relatedGlobal: StringDictionary[js.Any] = js.native
    }
  }
  
  object indentList {
    
    @JSGlobal("CKEDITOR.plugins.indentList")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def firstItemInPath(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("firstItemInPath")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def firstItemInPath(query: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("firstItemInPath")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def firstItemInPath(query: js.Function1[/* element */ element, Boolean]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("firstItemInPath")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def firstItemInPath(query: StringDictionary[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("firstItemInPath")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def firstItemInPath(query: element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("firstItemInPath")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object link {
    
    @JSGlobal("CKEDITOR.plugins.link")
    @js.native
    val ^ : js.Any = js.native
    
    // DEPRECATED 4.3.3
    @JSGlobal("CKEDITOR.plugins.link.emptyAnchorFix")
    @js.native
    val emptyAnchorFix: Boolean = js.native
    
    // DEPRECATED 4.3.3
    @JSGlobal("CKEDITOR.plugins.link.fakeAnchor")
    @js.native
    val fakeAnchor: Boolean = js.native
    
    @scala.inline
    def getEditorAnchors(editor: typings.ckeditor.CKEDITOR.editor): js.Array[element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditorAnchors")(editor.asInstanceOf[js.Any]).asInstanceOf[js.Array[element]]
    
    @scala.inline
    def getLinkAttributes(editor: typings.ckeditor.CKEDITOR.editor, data: StringDictionary[js.Any]): Set = (^.asInstanceOf[js.Dynamic].applyDynamic("getLinkAttributes")(editor.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Set]
    
    @scala.inline
    def getSelectedLink(editor: typings.ckeditor.CKEDITOR.editor): element | js.Array[element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedLink")(editor.asInstanceOf[js.Any]).asInstanceOf[element | js.Array[element]]
    @scala.inline
    def getSelectedLink(editor: typings.ckeditor.CKEDITOR.editor, returnMultiple: Boolean): element | js.Array[element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedLink")(editor.asInstanceOf[js.Any], returnMultiple.asInstanceOf[js.Any])).asInstanceOf[element | js.Array[element]]
    
    @scala.inline
    def parseLinkAttributes(editor: typings.ckeditor.CKEDITOR.editor, element: element): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseLinkAttributes")(editor.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    @scala.inline
    def showDisplayTextForElement(element: element, editor: typings.ckeditor.CKEDITOR.editor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("showDisplayTextForElement")(element.asInstanceOf[js.Any], editor.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    // DEPRECATED 4.3.3
    @JSGlobal("CKEDITOR.plugins.link.synAnchorSelector")
    @js.native
    val synAnchorSelector: Boolean = js.native
    
    @scala.inline
    def tryRestoreFakeAnchor(editor: typings.ckeditor.CKEDITOR.editor, element: element): element = (^.asInstanceOf[js.Dynamic].applyDynamic("tryRestoreFakeAnchor")(editor.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[element]
  }
  
  @JSGlobal("CKEDITOR.plugins.list")
  @js.native
  class list ()
    extends StObject
       with typings.ckeditor.CKEDITOR.plugins.list {
    
    /* CompleteClass */
    override def arrayToList(listArray: js.Any, database: js.Any, paragraphMode: js.Any, dir: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def listToArray(
      listNode: js.Any,
      database: js.Any,
      baseArray: js.Any,
      baseIndentLevel: js.Any,
      grandparentNode: js.Any
    ): Unit = js.native
  }
  
  @scala.inline
  def load(name: String, callback: js.Function1[/* plugins */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def load(
    name: String,
    callback: js.Function1[/* plugins */ js.Array[String], Unit],
    scope: StringDictionary[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("CKEDITOR.plugins.notification")
  @js.native
  class notification protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.plugins.notification {
    def this(
      editor: typings.ckeditor.CKEDITOR.editor,
      options: typings.ckeditor.CKEDITOR.plugins.notification.options
    ) = this()
    
    /* CompleteClass */
    override val area: typings.ckeditor.CKEDITOR.plugins.notification.area = js.native
    
    /* CompleteClass */
    override val duration: Double = js.native
    
    /* CompleteClass */
    override val editor: typings.ckeditor.CKEDITOR.editor = js.native
    
    /* CompleteClass */
    override val element: typings.ckeditor.CKEDITOR.dom.element = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override val id: Double = js.native
    
    /* CompleteClass */
    override def isVisible(): Boolean = js.native
    
    /* CompleteClass */
    override val message: String = js.native
    
    /* CompleteClass */
    override val progress: Double = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override val `type`: typings.ckeditor.CKEDITOR.plugins.notification.`type` = js.native
    
    /* CompleteClass */
    override def update(options: updateOptions): Unit = js.native
  }
  
  @JSGlobal("CKEDITOR.plugins.notificationAggregator")
  @js.native
  class notificationAggregator protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.plugins.notificationAggregator {
    def this(editor: typings.ckeditor.CKEDITOR.editor, message: String) = this()
    def this(editor: typings.ckeditor.CKEDITOR.editor, message: String, singularMessage: String) = this()
  }
  object notificationAggregator {
    
    @JSGlobal("CKEDITOR.plugins.notificationAggregator.task")
    @js.native
    class task ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.notificationAggregator.task {
      def this(weight: Double) = this()
    }
  }
  
  object pastefromword {
    
    @JSGlobal("CKEDITOR.plugins.pastefromword.lists")
    @js.native
    class lists ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.pastefromword.lists {
      
      /* CompleteClass */
      var numbering: numbering = js.native
    }
    object lists {
      
      @JSGlobal("CKEDITOR.plugins.pastefromword.lists.numbering")
      @js.native
      class numbering ()
        extends StObject
           with typings.ckeditor.CKEDITOR.plugins.pastefromword.lists.numbering {
        
        /* CompleteClass */
        override def getStyle(marker: String): String = js.native
        
        /* CompleteClass */
        override def toNumber(marker: String, markerType: String): Double = js.native
      }
    }
    
    @JSGlobal("CKEDITOR.plugins.pastefromword.styles")
    @js.native
    class styles ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.pastefromword.styles
  }
  
  @scala.inline
  def setLang(pluginName: String, languageCode: String, languageEntries: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLang")(pluginName.asInstanceOf[js.Any], languageCode.asInstanceOf[js.Any], languageEntries.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object tableselection {
    
    @JSGlobal("CKEDITOR.plugins.tableselection")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getCellsBetween(first: element, last: element): js.Array[element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellsBetween")(first.asInstanceOf[js.Any], last.asInstanceOf[js.Any])).asInstanceOf[js.Array[element]]
  }
  
  @JSGlobal("CKEDITOR.plugins.widget")
  @js.native
  class widget protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.plugins.widget {
    def this(
      widgetsRepo: typings.ckeditor.CKEDITOR.plugins.widget.repository,
      id: Double,
      element: typings.ckeditor.CKEDITOR.dom.element,
      widgetDef: typings.ckeditor.CKEDITOR.plugins.widget.definition
    ) = this()
    def this(
      widgetsRepo: typings.ckeditor.CKEDITOR.plugins.widget.repository,
      id: Double,
      element: typings.ckeditor.CKEDITOR.dom.element,
      widgetDef: typings.ckeditor.CKEDITOR.plugins.widget.definition,
      starupData: js.Any
    ) = this()
  }
  object widget {
    
    @JSGlobal("CKEDITOR.plugins.widget")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CKEDITOR.plugins.widget.WRAPPER_CLASS_PREFIX")
    @js.native
    def WRAPPER_CLASS_PREFIX: String = js.native
    @scala.inline
    def WRAPPER_CLASS_PREFIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WRAPPER_CLASS_PREFIX")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getNestedEditable(guard: element, node: node): element = (^.asInstanceOf[js.Dynamic].applyDynamic("getNestedEditable")(guard.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[element]
    
    @scala.inline
    def isDomDragHandler(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomDragHandler")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isDomDragHandlerContainer(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomDragHandlerContainer")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isDomNestedEditable(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomNestedEditable")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isDomWidget(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomWidget")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isDomWidgetElement(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomWidgetElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isDomWidgetWrapper(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomWidgetWrapper")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isParserWidgetElement(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParserWidgetElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isParserWidgetWrapper(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParserWidgetWrapper")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("CKEDITOR.plugins.widget.nestedEditable")
    @js.native
    class nestedEditable protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.widget.nestedEditable {
      def this(
        editor: typings.ckeditor.CKEDITOR.editor,
        element: typings.ckeditor.CKEDITOR.dom.element,
        config: Filter
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.plugins.widget.repository")
    @js.native
    class repository ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.widget.repository
    
    @JSGlobal("CKEDITOR.plugins.widget.widgetselection")
    @js.native
    class widgetselection ()
      extends StObject
         with typings.ckeditor.CKEDITOR.plugins.widget.widgetselection {
      
      /* CompleteClass */
      override def addFillers(editable: typings.ckeditor.CKEDITOR.editable): Boolean = js.native
      
      /* CompleteClass */
      override def removeFillers(editable: typings.ckeditor.CKEDITOR.editable): Unit = js.native
    }
  }
}
