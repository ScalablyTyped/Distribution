package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugLayerMod {
  
  @JSImport("babylonjs/Debug/debugLayer", "DebugLayer")
  @js.native
  class DebugLayer protected () extends StObject {
    /**
      * Instantiates a new debug layer.
      * The debug layer (aka Inspector) is the go to tool in order to better understand
      * what is happening in your scene
      * @see https://doc.babylonjs.com/features/playground_debuglayer
      * @param scene Defines the scene to inspect
      */
    def this(scene: Scene) = this()
    
    var BJSINSPECTOR: js.Any = js.native
    
    /** Creates the inspector window. */
    var _createInspector: js.Any = js.native
    
    /** Get the inspector from bundle or global */
    var _getGlobalInspector: js.Any = js.native
    
    var _onPropertyChangedObservable: js.Any = js.native
    
    var _scene: js.Any = js.native
    
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
    def onPropertyChangedObservable: js.Any = js.native
    
    /**
      * Select a specific entity in the scene explorer and highlight a specific block in that entity property grid
      * @param entity defines the entity to select
      * @param lineContainerTitles defines the specific blocks to highlight (could be a string or an array of strings)
      */
    def select(entity: js.Any): Unit = js.native
    def select(entity: js.Any, lineContainerTitles: String): Unit = js.native
    def select(entity: js.Any, lineContainerTitles: js.Array[String]): Unit = js.native
    
    /**
      * Update the scene in the inspector
      */
    def setAsActiveScene(): Unit = js.native
    
    /**
      * Launch the debugLayer.
      * @param config Define the configuration of the inspector
      * @return a promise fulfilled when the debug layer is visible
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
    @scala.inline
    def InspectorURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InspectorURL")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait DebugLayerTab extends StObject
  @JSImport("babylonjs/Debug/debugLayer", "DebugLayerTab")
  @js.native
  object DebugLayerTab extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DebugLayerTab with Double] = js.native
    
    /**
      * Debug tab
      */
    @js.native
    sealed trait Debug extends DebugLayerTab
    /* 1 */ val Debug: typings.babylonjs.debugLayerMod.DebugLayerTab.Debug with Double = js.native
    
    /**
      * Properties tag (default)
      */
    @js.native
    sealed trait Properties extends DebugLayerTab
    /* 0 */ val Properties: typings.babylonjs.debugLayerMod.DebugLayerTab.Properties with Double = js.native
    
    /**
      * Settings tab
      */
    @js.native
    sealed trait Settings extends DebugLayerTab
    /* 4 */ val Settings: typings.babylonjs.debugLayerMod.DebugLayerTab.Settings with Double = js.native
    
    /**
      * Statistics tab
      */
    @js.native
    sealed trait Statistics extends DebugLayerTab
    /* 2 */ val Statistics: typings.babylonjs.debugLayerMod.DebugLayerTab.Statistics with Double = js.native
    
    /**
      * Tools tab
      */
    @js.native
    sealed trait Tools extends DebugLayerTab
    /* 3 */ val Tools: typings.babylonjs.debugLayerMod.DebugLayerTab.Tools with Double = js.native
  }
  
  @js.native
  trait IExplorerExtensibilityGroup extends StObject {
    
    /**
      * Gets the list of options added to a type
      */
    var entries: js.Array[IExplorerExtensibilityOption] = js.native
    
    /**
      * Defines a predicate to test if a given type mut be extended
      */
    def predicate(entity: js.Any): Boolean = js.native
  }
  object IExplorerExtensibilityGroup {
    
    @scala.inline
    def apply(entries: js.Array[IExplorerExtensibilityOption], predicate: js.Any => Boolean): IExplorerExtensibilityGroup = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate))
      __obj.asInstanceOf[IExplorerExtensibilityGroup]
    }
    
    @scala.inline
    implicit class IExplorerExtensibilityGroupMutableBuilder[Self <: IExplorerExtensibilityGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[IExplorerExtensibilityOption]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesVarargs(value: IExplorerExtensibilityOption*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setPredicate(value: js.Any => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IExplorerExtensibilityOption extends StObject {
    
    /**
      * Defines the action to execute on click
      */
    def action(entity: js.Any): Unit = js.native
    
    /**
      * Define the option label
      */
    var label: String = js.native
  }
  object IExplorerExtensibilityOption {
    
    @scala.inline
    def apply(action: js.Any => Unit, label: String): IExplorerExtensibilityOption = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExplorerExtensibilityOption]
    }
    
    @scala.inline
    implicit class IExplorerExtensibilityOptionMutableBuilder[Self <: IExplorerExtensibilityOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: js.Any => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IInspectorOptions extends StObject {
    
    /**
      * Display in embed mode (both panes on the right)
      */
    var embedMode: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow the panes to be closed by users (default: true)
      */
    var enableClose: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow the panes to popup (default: true)
      */
    var enablePopup: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional list of extensibility entries
      */
    var explorerExtensibility: js.UndefOr[js.Array[IExplorerExtensibilityGroup]] = js.native
    
    /**
      * HTML element to use as root (the parent of the rendering canvas will be used as default value)
      */
    var globalRoot: js.UndefOr[HTMLElement] = js.native
    
    /**
      * let the Inspector handles resize of the canvas when panes are resized (default to true)
      */
    var handleResize: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional initial tab (default to DebugLayerTab.Properties)
      */
    var initialTab: js.UndefOr[DebugLayerTab] = js.native
    
    /**
      * Optional URL to get the inspector script from (by default it uses the babylonjs CDN).
      */
    var inspectorURL: js.UndefOr[String] = js.native
    
    /**
      * Display in overlay mode (default: false)
      */
    var overlay: js.UndefOr[Boolean] = js.native
    
    /**
      * Display the Scene explorer
      */
    var showExplorer: js.UndefOr[Boolean] = js.native
    
    /**
      * Display the property inspector
      */
    var showInspector: js.UndefOr[Boolean] = js.native
  }
  object IInspectorOptions {
    
    @scala.inline
    def apply(): IInspectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInspectorOptions]
    }
    
    @scala.inline
    implicit class IInspectorOptionsMutableBuilder[Self <: IInspectorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmbedMode(value: Boolean): Self = StObject.set(x, "embedMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbedModeUndefined: Self = StObject.set(x, "embedMode", js.undefined)
      
      @scala.inline
      def setEnableClose(value: Boolean): Self = StObject.set(x, "enableClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCloseUndefined: Self = StObject.set(x, "enableClose", js.undefined)
      
      @scala.inline
      def setEnablePopup(value: Boolean): Self = StObject.set(x, "enablePopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePopupUndefined: Self = StObject.set(x, "enablePopup", js.undefined)
      
      @scala.inline
      def setExplorerExtensibility(value: js.Array[IExplorerExtensibilityGroup]): Self = StObject.set(x, "explorerExtensibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplorerExtensibilityUndefined: Self = StObject.set(x, "explorerExtensibility", js.undefined)
      
      @scala.inline
      def setExplorerExtensibilityVarargs(value: IExplorerExtensibilityGroup*): Self = StObject.set(x, "explorerExtensibility", js.Array(value :_*))
      
      @scala.inline
      def setGlobalRoot(value: HTMLElement): Self = StObject.set(x, "globalRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalRootUndefined: Self = StObject.set(x, "globalRoot", js.undefined)
      
      @scala.inline
      def setHandleResize(value: Boolean): Self = StObject.set(x, "handleResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleResizeUndefined: Self = StObject.set(x, "handleResize", js.undefined)
      
      @scala.inline
      def setInitialTab(value: DebugLayerTab): Self = StObject.set(x, "initialTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialTabUndefined: Self = StObject.set(x, "initialTab", js.undefined)
      
      @scala.inline
      def setInspectorURL(value: String): Self = StObject.set(x, "inspectorURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInspectorURLUndefined: Self = StObject.set(x, "inspectorURL", js.undefined)
      
      @scala.inline
      def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setShowExplorer(value: Boolean): Self = StObject.set(x, "showExplorer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowExplorerUndefined: Self = StObject.set(x, "showExplorer", js.undefined)
      
      @scala.inline
      def setShowInspector(value: Boolean): Self = StObject.set(x, "showInspector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInspectorUndefined: Self = StObject.set(x, "showInspector", js.undefined)
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /**
        * @hidden
        * Backing field
        */
      var _debugLayer: DebugLayer = js.native
      
      /**
        * Gets the debug layer (aka Inspector) associated with the scene
        * @see https://doc.babylonjs.com/features/playground_debuglayer
        */
      var debugLayer: DebugLayer = js.native
    }
    object Scene {
      
      @scala.inline
      def apply(_debugLayer: DebugLayer, debugLayer: DebugLayer): typings.babylonjs.debugLayerMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_debugLayer = _debugLayer.asInstanceOf[js.Any], debugLayer = debugLayer.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.debugLayerMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit class SceneMutableBuilder[Self <: typings.babylonjs.debugLayerMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDebugLayer(value: DebugLayer): Self = StObject.set(x, "debugLayer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_debugLayer(value: DebugLayer): Self = StObject.set(x, "_debugLayer", value.asInstanceOf[js.Any])
      }
    }
  }
}
