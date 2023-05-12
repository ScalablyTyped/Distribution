package typings.chartJs

import typings.chartJs.anon.Average
import typings.chartJs.anon.DataIndex
import typings.chartJs.anon.Height
import typings.chartJs.anon.Readonlydefault
import typings.chartJs.anon.X1
import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsPluginDottooltipMod {
  
  object default {
    
    @JSImport("chart.js/dist/plugins/plugin.tooltip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.additionalOptionScopes")
    @js.native
    val additionalOptionScopes: js.Array[String] = js.native
    
    inline def afterDraw(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDraw")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def afterEvent(chart: Any, args: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterEvent")(chart.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterInit(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterInit")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object defaultRoutes {
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaultRoutes.bodyFont_1")
      @js.native
      val bodyFont1: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaultRoutes.footerFont_1")
      @js.native
      val footerFont1: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaultRoutes.titleFont_1")
      @js.native
      val titleFont1: String = js.native
    }
    
    object defaults {
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults")
      @js.native
      val ^ : js.Any = js.native
      
      object animation {
        
        @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.animation.duration")
        @js.native
        val duration: Double = js.native
        
        @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.animation.easing")
        @js.native
        val easing: String = js.native
      }
      
      object animations {
        
        object numbers {
          
          @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.animations.numbers.properties")
          @js.native
          val properties: js.Array[String] = js.native
          
          @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.animations.numbers.type")
          @js.native
          val `type`: String = js.native
        }
        
        object opacity {
          
          @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.animations.opacity.duration_1")
          @js.native
          val duration1: Double = js.native
          
          @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.animations.opacity.easing_1")
          @js.native
          val easing1: String = js.native
        }
      }
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.backgroundColor")
      @js.native
      val backgroundColor: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.bodyAlign")
      @js.native
      val bodyAlign: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.bodyColor")
      @js.native
      val bodyColor: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.bodySpacing")
      @js.native
      val bodySpacing: Double = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.borderColor")
      @js.native
      val borderColor: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.borderWidth")
      @js.native
      val borderWidth: Double = js.native
      
      inline def boxHeight(ctx: Any, opts: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("boxHeight")(ctx.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.boxPadding")
      @js.native
      val boxPadding: Double = js.native
      
      inline def boxWidth(ctx: Any, opts: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("boxWidth")(ctx.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.caretPadding")
      @js.native
      val caretPadding: Double = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.caretSize")
      @js.native
      val caretSize: Double = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.cornerRadius")
      @js.native
      val cornerRadius: Double = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.displayColors")
      @js.native
      val displayColors: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.enabled")
      @js.native
      val enabled: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.external")
      @js.native
      val external: Any = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.footerAlign")
      @js.native
      val footerAlign: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.footerColor")
      @js.native
      val footerColor: String = js.native
      
      object footerFont {
        
        @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.footerFont.weight_1")
        @js.native
        val weight1: String = js.native
      }
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.footerMarginTop")
      @js.native
      val footerMarginTop: Double = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.footerSpacing")
      @js.native
      val footerSpacing: Double = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.multiKeyBackground")
      @js.native
      val multiKeyBackground: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.padding")
      @js.native
      val padding: Double = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.position")
      @js.native
      val position: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.titleAlign")
      @js.native
      val titleAlign: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.titleColor")
      @js.native
      val titleColor: String = js.native
      
      object titleFont {
        
        @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.titleFont.weight")
        @js.native
        val weight: String = js.native
      }
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.titleMarginBottom")
      @js.native
      val titleMarginBottom: Double = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.defaults.titleSpacing")
      @js.native
      val titleSpacing: Double = js.native
    }
    
    object descriptors {
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.descriptors")
      @js.native
      val ^ : js.Any = js.native
      
      object animation1 {
        
        @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.descriptors.animation_1._fallback")
        @js.native
        val fallback: Boolean = js.native
      }
      
      object animations1 {
        
        @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.descriptors.animations_1._fallback_1")
        @js.native
        val fallback1: String = js.native
      }
      
      object callbacks {
        
        @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.descriptors.callbacks._indexable_1")
        @js.native
        val indexable1: Boolean = js.native
        
        @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.descriptors.callbacks._scriptable_1")
        @js.native
        val scriptable1: Boolean = js.native
      }
      
      @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.descriptors._indexable")
      @js.native
      val indexable: Boolean = js.native
      
      inline def scriptable(name: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_scriptable")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    @JSImport("chart.js/dist/plugins/plugin.tooltip", "default.id")
    @js.native
    val id: String = js.native
    
    inline def reset(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reset")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("chart.js/dist/plugins/plugin.tooltip", "Tooltip")
  @js.native
  open class Tooltip protected () extends default[AnyObject, AnyObject] {
    def this(config: Any) = this()
    
    @JSName("$context")
    var $context: Any = js.native
    
    var _active: js.Array[Any] = js.native
    
    var _cachedAnimations: Readonlydefault = js.native
    
    /**
      * @private
      */
    /* private */ var _createItems: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _drawColorBox: Any = js.native
    
    var _eventPosition: Any = js.native
    
    /**
      * Helper for determining the active elements for event
      * @param {ChartEvent} e - The event to handle
      * @param {InteractionItem[]} lastActive - Previously active elements
      * @param {boolean} [replay] - This is a replayed event (from update)
      * @param {boolean} [inChartArea] - The event is inside chartArea
      * @returns {InteractionItem[]} - Active elements
      * @private
      */
    /* private */ var _getActiveElements: Any = js.native
    
    var _ignoreReplayEvents: Boolean = js.native
    
    /**
      * Determine if the active elements + event combination changes the
      * tooltip position
      * @param {array} active - Active elements
      * @param {ChartEvent} e - Event that triggered the position change
      * @returns {boolean} True if the position has changed
      */
    def _positionChanged(active: js.Array[Any], e: ChartEvent): Boolean = js.native
    
    /**
      * @private
      */
    /* private */ var _resolveAnimations: Any = js.native
    
    var _size: Height = js.native
    
    var _tooltipItems: js.Array[Any] = js.native
    
    /**
      * Update x/y animation targets when _active elements are animating too
      * @private
      */
    /* private */ var _updateAnimationTarget: Any = js.native
    
    /**
      * Determine if the tooltip will draw anything
      * @returns {boolean} True if the tooltip will render
      */
    def _willRender(): Boolean = js.native
    
    var afterBody: Any = js.native
    
    var beforeBody: Any = js.native
    
    var body: js.Array[Any] = js.native
    
    var caretX: Any = js.native
    
    var caretY: Any = js.native
    
    var chart: Any = js.native
    
    var dataPoints: js.Array[DataIndex] = js.native
    
    def draw(ctx: Any): Unit = js.native
    
    def drawBackground(pt: Any, ctx: Any, tooltipSize: Any, options: Any): Unit = js.native
    
    def drawBody(pt: Any, ctx: Any, options: Any): Unit = js.native
    
    def drawCaret(tooltipPoint: Any, ctx: Any, size: Any, options: Any): Unit = js.native
    
    def drawFooter(pt: Any, ctx: Any, options: Any): Unit = js.native
    
    def drawTitle(pt: Any, ctx: Any, options: Any): Unit = js.native
    
    var footer: Any = js.native
    
    /**
      * Get active elements in the tooltip
      * @returns {Array} Array of elements that are active in the tooltip
      */
    def getActiveElements(): js.Array[Any] = js.native
    
    def getAfterBody(tooltipItems: Any, options: Any): Any = js.native
    
    def getBeforeBody(tooltipItems: Any, options: Any): Any = js.native
    
    def getBody(tooltipItems: Any, options: Any): js.Array[Any] = js.native
    
    def getCaretPosition(tooltipPoint: Any, size: Any, options: Any): X1 = js.native
    
    /**
      * @protected
      */
    /* protected */ def getContext(): Any = js.native
    
    def getFooter(tooltipItems: Any, options: Any): Any = js.native
    
    def getTitle(context: Any, options: Any): Any = js.native
    
    /**
      * Handle an event
      * @param {ChartEvent} e - The event to handle
      * @param {boolean} [replay] - This is a replayed event (from update)
      * @param {boolean} [inChartArea] - The event is inside chartArea
      * @returns {boolean} true if the tooltip changed
      */
    def handleEvent(e: ChartEvent): Boolean = js.native
    def handleEvent(e: ChartEvent, replay: Boolean): Boolean = js.native
    def handleEvent(e: ChartEvent, replay: Boolean, inChartArea: Boolean): Boolean = js.native
    def handleEvent(e: ChartEvent, replay: Unit, inChartArea: Boolean): Boolean = js.native
    
    var height: Double = js.native
    
    def initialize(options: Any): Unit = js.native
    
    var labelColors: js.Array[Any] = js.native
    
    var labelPointStyles: js.Array[Any] = js.native
    
    var labelTextColors: js.Array[Any] = js.native
    
    var opacity: Double = js.native
    
    /**
      * Set active elements in the tooltip
      * @param {array} activeElements Array of active datasetIndex/index pairs.
      * @param {object} eventPosition Synthetic event position used in positioning
      */
    def setActiveElements(activeElements: js.Array[Any], eventPosition: js.Object): Unit = js.native
    
    var title: Any = js.native
    
    def update(changed: Any, replay: Any): Unit = js.native
    
    var width: Double = js.native
    
    var xAlign: Any = js.native
    
    var yAlign: Any = js.native
  }
  /* static members */
  object Tooltip {
    
    @JSImport("chart.js/dist/plugins/plugin.tooltip", "Tooltip")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @namespace Chart.Tooltip.positioners
      */
    @JSImport("chart.js/dist/plugins/plugin.tooltip", "Tooltip.positioners")
    @js.native
    def positioners: Average = js.native
    inline def positioners_=(x: Average): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positioners")(x.asInstanceOf[js.Any])
  }
  
  type ActiveElement = typings.chartJs.distTypesIndexMod.ActiveElement
  
  type Chart = typings.chartJs.distPlatformPlatformDotbaseMod.Chart
  
  type ChartEvent = typings.chartJs.distTypesIndexMod.ChartEvent
  
  type InteractionItem = typings.chartJs.distCoreCoreDotinteractionMod.InteractionItem
}
