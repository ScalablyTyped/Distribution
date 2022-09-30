package typings.babylonjs

import typings.babylonjs.iInspectableMod.IInspectable
import typings.babylonjs.sceneMod.Scene
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugLayerMod {
  
  @JSImport("babylonjs/Debug/debugLayer", "DebugLayer")
  @js.native
  /**
    * Instantiates a new debug layer.
    * The debug layer (aka Inspector) is the go to tool in order to better understand
    * what is happening in your scene
    * @see https://doc.babylonjs.com/features/playground_debuglayer
    * @param scene Defines the scene to inspect
    */
  open class DebugLayer () extends StObject {
    def this(scene: Scene) = this()
    
    /* private */ var BJSINSPECTOR: Any = js.native
    
    /**
      * Creates the inspector window.
      * @param config
      */
    /* private */ var _createInspector: Any = js.native
    
    /** Get the inspector from bundle or global */
    /* private */ var _getGlobalInspector: Any = js.native
    
    /* private */ var _onPropertyChangedObservable: Any = js.native
    
    /* private */ var _onSelectionChangedObservable: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /**
      * Hide the inspector and close its window.
      */
    def hide(): Unit = js.native
    
    /**
      * Get if the inspector is visible or not.
      * @returns true if visible otherwise, false
      */
    def isVisible(): Boolean = js.native
    
    /**
      * Observable triggered when a property is changed through the inspector.
      */
    def onPropertyChangedObservable: Any = js.native
    
    /**
      * Observable triggered when the selection is changed through the inspector.
      */
    def onSelectionChangedObservable: Any = js.native
    
    /**
      * Select a specific entity in the scene explorer and highlight a specific block in that entity property grid
      * @param entity defines the entity to select
      * @param lineContainerTitles defines the specific blocks to highlight (could be a string or an array of strings)
      */
    def select(entity: Any): Unit = js.native
    def select(entity: Any, lineContainerTitles: String): Unit = js.native
    def select(entity: Any, lineContainerTitles: js.Array[String]): Unit = js.native
    
    /**
      * Update the scene in the inspector
      */
    def setAsActiveScene(): Unit = js.native
    
    /**
      * Launch the debugLayer.
      * @param config Define the configuration of the inspector
      * @returns a promise fulfilled when the debug layer is visible
      */
    def show(): js.Promise[DebugLayer] = js.native
    def show(config: IInspectorOptions): js.Promise[DebugLayer] = js.native
  }
  /* static members */
  object DebugLayer {
    
    @JSImport("babylonjs/Debug/debugLayer", "DebugLayer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Define the url to get the inspector script from.
      * By default it uses the babylonjs CDN.
      * @ignoreNaming
      */
    @JSImport("babylonjs/Debug/debugLayer", "DebugLayer.InspectorURL")
    @js.native
    def InspectorURL: String = js.native
    inline def InspectorURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InspectorURL")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait DebugLayerTab extends StObject
  @JSImport("babylonjs/Debug/debugLayer", "DebugLayerTab")
  @js.native
  object DebugLayerTab extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DebugLayerTab & Double] = js.native
    
    /**
      * Debug tab
      */
    @js.native
    sealed trait Debug
      extends StObject
         with DebugLayerTab
    /* 1 */ val Debug: typings.babylonjs.debugLayerMod.DebugLayerTab.Debug & Double = js.native
    
    /**
      * Properties tag (default)
      */
    @js.native
    sealed trait Properties
      extends StObject
         with DebugLayerTab
    /* 0 */ val Properties: typings.babylonjs.debugLayerMod.DebugLayerTab.Properties & Double = js.native
    
    /**
      * Settings tab
      */
    @js.native
    sealed trait Settings
      extends StObject
         with DebugLayerTab
    /* 4 */ val Settings: typings.babylonjs.debugLayerMod.DebugLayerTab.Settings & Double = js.native
    
    /**
      * Statistics tab
      */
    @js.native
    sealed trait Statistics
      extends StObject
         with DebugLayerTab
    /* 2 */ val Statistics: typings.babylonjs.debugLayerMod.DebugLayerTab.Statistics & Double = js.native
    
    /**
      * Tools tab
      */
    @js.native
    sealed trait Tools
      extends StObject
         with DebugLayerTab
    /* 3 */ val Tools: typings.babylonjs.debugLayerMod.DebugLayerTab.Tools & Double = js.native
  }
  
  trait IExplorerAdditionalChild extends StObject {
    
    /**
      * Function used to return the class name of the child node
      */
    def getClassName(): String
    
    /**
      * List of inspectable custom properties (used by the Inspector)
      * @see https://doc.babylonjs.com/how_to/debug_layer#extensibility
      */
    var inspectableCustomProperties: js.Array[IInspectable]
    
    /**
      * Gets the name of the additional node
      */
    var name: String
  }
  object IExplorerAdditionalChild {
    
    inline def apply(getClassName: () => String, inspectableCustomProperties: js.Array[IInspectable], name: String): IExplorerAdditionalChild = {
      val __obj = js.Dynamic.literal(getClassName = js.Any.fromFunction0(getClassName), inspectableCustomProperties = inspectableCustomProperties.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExplorerAdditionalChild]
    }
    
    extension [Self <: IExplorerAdditionalChild](x: Self) {
      
      inline def setGetClassName(value: () => String): Self = StObject.set(x, "getClassName", js.Any.fromFunction0(value))
      
      inline def setInspectableCustomProperties(value: js.Array[IInspectable]): Self = StObject.set(x, "inspectableCustomProperties", value.asInstanceOf[js.Any])
      
      inline def setInspectableCustomPropertiesVarargs(value: IInspectable*): Self = StObject.set(x, "inspectableCustomProperties", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IExplorerAdditionalNode extends StObject {
    
    /**
      * Function used to return the list of child entries
      */
    def getContent(): js.Array[IExplorerAdditionalChild]
    
    /**
      * Gets the name of the additional node
      */
    var name: String
  }
  object IExplorerAdditionalNode {
    
    inline def apply(getContent: () => js.Array[IExplorerAdditionalChild], name: String): IExplorerAdditionalNode = {
      val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExplorerAdditionalNode]
    }
    
    extension [Self <: IExplorerAdditionalNode](x: Self) {
      
      inline def setGetContent(value: () => js.Array[IExplorerAdditionalChild]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IExplorerExtensibilityGroup extends StObject {
    
    /**
      * Gets the list of options added to a type
      */
    var entries: js.Array[IExplorerExtensibilityOption]
    
    /**
      * Defines a predicate to test if a given type mut be extended
      */
    def predicate(entity: Any): Boolean
  }
  object IExplorerExtensibilityGroup {
    
    inline def apply(entries: js.Array[IExplorerExtensibilityOption], predicate: Any => Boolean): IExplorerExtensibilityGroup = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate))
      __obj.asInstanceOf[IExplorerExtensibilityGroup]
    }
    
    extension [Self <: IExplorerExtensibilityGroup](x: Self) {
      
      inline def setEntries(value: js.Array[IExplorerExtensibilityOption]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: IExplorerExtensibilityOption*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setPredicate(value: Any => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
    }
  }
  
  trait IExplorerExtensibilityOption extends StObject {
    
    /**
      * Defines the action to execute on click
      */
    def action(entity: Any): Unit
    
    /**
      * Define the option label
      */
    var label: String
  }
  object IExplorerExtensibilityOption {
    
    inline def apply(action: Any => Unit, label: String): IExplorerExtensibilityOption = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExplorerExtensibilityOption]
    }
    
    extension [Self <: IExplorerExtensibilityOption](x: Self) {
      
      inline def setAction(value: Any => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait IInspectorOptions extends StObject {
    
    /**
      * Optional list of additional top level nodes
      */
    var additionalNodes: js.UndefOr[js.Array[IExplorerAdditionalNode]] = js.undefined
    
    /**
      * Display in embed mode (both panes on the right)
      */
    var embedMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow the panes to be closed by users (default: true)
      */
    var enableClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow the panes to popup (default: true)
      */
    var enablePopup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional list of extensibility entries
      */
    var explorerExtensibility: js.UndefOr[js.Array[IExplorerExtensibilityGroup]] = js.undefined
    
    /**
      * HTML element to use as root (the parent of the rendering canvas will be used as default value)
      */
    var globalRoot: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * let the Inspector handles resize of the canvas when panes are resized (default to true)
      */
    var handleResize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional initial tab (default to DebugLayerTab.Properties)
      */
    var initialTab: js.UndefOr[DebugLayerTab] = js.undefined
    
    /**
      * Optional URL to get the inspector script from (by default it uses the babylonjs CDN).
      */
    var inspectorURL: js.UndefOr[String] = js.undefined
    
    /**
      * Display in overlay mode (default: false)
      */
    var overlay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Display the Scene explorer
      */
    var showExplorer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Display the property inspector
      */
    var showInspector: js.UndefOr[Boolean] = js.undefined
  }
  object IInspectorOptions {
    
    inline def apply(): IInspectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInspectorOptions]
    }
    
    extension [Self <: IInspectorOptions](x: Self) {
      
      inline def setAdditionalNodes(value: js.Array[IExplorerAdditionalNode]): Self = StObject.set(x, "additionalNodes", value.asInstanceOf[js.Any])
      
      inline def setAdditionalNodesUndefined: Self = StObject.set(x, "additionalNodes", js.undefined)
      
      inline def setAdditionalNodesVarargs(value: IExplorerAdditionalNode*): Self = StObject.set(x, "additionalNodes", js.Array(value*))
      
      inline def setEmbedMode(value: Boolean): Self = StObject.set(x, "embedMode", value.asInstanceOf[js.Any])
      
      inline def setEmbedModeUndefined: Self = StObject.set(x, "embedMode", js.undefined)
      
      inline def setEnableClose(value: Boolean): Self = StObject.set(x, "enableClose", value.asInstanceOf[js.Any])
      
      inline def setEnableCloseUndefined: Self = StObject.set(x, "enableClose", js.undefined)
      
      inline def setEnablePopup(value: Boolean): Self = StObject.set(x, "enablePopup", value.asInstanceOf[js.Any])
      
      inline def setEnablePopupUndefined: Self = StObject.set(x, "enablePopup", js.undefined)
      
      inline def setExplorerExtensibility(value: js.Array[IExplorerExtensibilityGroup]): Self = StObject.set(x, "explorerExtensibility", value.asInstanceOf[js.Any])
      
      inline def setExplorerExtensibilityUndefined: Self = StObject.set(x, "explorerExtensibility", js.undefined)
      
      inline def setExplorerExtensibilityVarargs(value: IExplorerExtensibilityGroup*): Self = StObject.set(x, "explorerExtensibility", js.Array(value*))
      
      inline def setGlobalRoot(value: HTMLElement): Self = StObject.set(x, "globalRoot", value.asInstanceOf[js.Any])
      
      inline def setGlobalRootUndefined: Self = StObject.set(x, "globalRoot", js.undefined)
      
      inline def setHandleResize(value: Boolean): Self = StObject.set(x, "handleResize", value.asInstanceOf[js.Any])
      
      inline def setHandleResizeUndefined: Self = StObject.set(x, "handleResize", js.undefined)
      
      inline def setInitialTab(value: DebugLayerTab): Self = StObject.set(x, "initialTab", value.asInstanceOf[js.Any])
      
      inline def setInitialTabUndefined: Self = StObject.set(x, "initialTab", js.undefined)
      
      inline def setInspectorURL(value: String): Self = StObject.set(x, "inspectorURL", value.asInstanceOf[js.Any])
      
      inline def setInspectorURLUndefined: Self = StObject.set(x, "inspectorURL", js.undefined)
      
      inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setShowExplorer(value: Boolean): Self = StObject.set(x, "showExplorer", value.asInstanceOf[js.Any])
      
      inline def setShowExplorerUndefined: Self = StObject.set(x, "showExplorer", js.undefined)
      
      inline def setShowInspector(value: Boolean): Self = StObject.set(x, "showInspector", value.asInstanceOf[js.Any])
      
      inline def setShowInspectorUndefined: Self = StObject.set(x, "showInspector", js.undefined)
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /**
        * @internal
        * Backing field
        */
      var _debugLayer: DebugLayer
      
      /**
        * Gets the debug layer (aka Inspector) associated with the scene
        * @see https://doc.babylonjs.com/features/playground_debuglayer
        */
      var debugLayer: DebugLayer
    }
    object Scene {
      
      inline def apply(_debugLayer: DebugLayer, debugLayer: DebugLayer): typings.babylonjs.debugLayerMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_debugLayer = _debugLayer.asInstanceOf[js.Any], debugLayer = debugLayer.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.debugLayerMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      extension [Self <: typings.babylonjs.debugLayerMod.babylonjsSceneAugmentingMod.Scene](x: Self) {
        
        inline def setDebugLayer(value: DebugLayer): Self = StObject.set(x, "debugLayer", value.asInstanceOf[js.Any])
        
        inline def set_debugLayer(value: DebugLayer): Self = StObject.set(x, "_debugLayer", value.asInstanceOf[js.Any])
      }
    }
  }
}
