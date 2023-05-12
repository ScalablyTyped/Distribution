package typings.chartJs

import typings.chartJs.distPluginsPluginDotcolorsMod.ColorsPluginOptions
import typings.chartJs.distTypesIndexMod.ChartType
import typings.chartJs.distTypesIndexMod.DefaultDataPoint
import typings.chartJs.mod.Chart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsMod {
  
  object Colors {
    
    @JSImport("chart.js/dist/plugins", "Colors")
    @js.native
    val ^ : js.Any = js.native
    
    inline def beforeLayout(
      chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
      _args: Any,
      options: ColorsPluginOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeLayout")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("chart.js/dist/plugins", "Colors.defaults")
    @js.native
    def defaults: ColorsPluginOptions = js.native
    inline def defaults_=(x: ColorsPluginOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/plugins", "Colors.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  object Decimation {
    
    @JSImport("chart.js/dist/plugins", "Decimation")
    @js.native
    val ^ : js.Any = js.native
    
    inline def beforeElementsUpdate(chart: Any, args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeElementsUpdate")(chart.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object defaults {
      
      @JSImport("chart.js/dist/plugins", "Decimation.defaults.algorithm")
      @js.native
      val algorithm: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Decimation.defaults.enabled")
      @js.native
      val enabled: Boolean = js.native
    }
    
    inline def destroy(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("chart.js/dist/plugins", "Decimation.id")
    @js.native
    val id: String = js.native
  }
  
  object Filler {
    
    @JSImport("chart.js/dist/plugins", "Filler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def afterDatasetsUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDatasetsUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeDatasetDraw(chart: Any, args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDatasetDraw")(chart.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeDatasetsDraw(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDatasetsDraw")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeDraw(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDraw")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object defaults {
      
      @JSImport("chart.js/dist/plugins", "Filler.defaults.drawTime")
      @js.native
      val drawTime: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Filler.defaults.propagate")
      @js.native
      val propagate: Boolean = js.native
    }
    
    @JSImport("chart.js/dist/plugins", "Filler.id")
    @js.native
    val id: String = js.native
  }
  
  object Legend {
    
    @JSImport("chart.js/dist/plugins", "Legend")
    @js.native
    val ^ : js.Any = js.native
    
    inline def afterEvent(chart: Any, args: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterEvent")(chart.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterUpdate(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterUpdate")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def beforeUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object defaults {
      
      @JSImport("chart.js/dist/plugins", "Legend.defaults")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("chart.js/dist/plugins", "Legend.defaults.align")
      @js.native
      val align: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Legend.defaults.display")
      @js.native
      val display: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins", "Legend.defaults.fullSize")
      @js.native
      val fullSize: Boolean = js.native
      
      object labels {
        
        @JSImport("chart.js/dist/plugins", "Legend.defaults.labels")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("chart.js/dist/plugins", "Legend.defaults.labels.boxWidth")
        @js.native
        val boxWidth: Double = js.native
        
        inline def color(ctx: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(ctx.asInstanceOf[js.Any]).asInstanceOf[Any]
        
        inline def generateLabels(chart: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generateLabels")(chart.asInstanceOf[js.Any]).asInstanceOf[Any]
        
        @JSImport("chart.js/dist/plugins", "Legend.defaults.labels.padding")
        @js.native
        val padding: Double = js.native
      }
      
      inline def onClick(e: Any, legendItem: Any, legend: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onClick")(e.asInstanceOf[js.Any], legendItem.asInstanceOf[js.Any], legend.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("chart.js/dist/plugins", "Legend.defaults.onHover")
      @js.native
      val onHover: Any = js.native
      
      @JSImport("chart.js/dist/plugins", "Legend.defaults.onLeave")
      @js.native
      val onLeave: Any = js.native
      
      @JSImport("chart.js/dist/plugins", "Legend.defaults.position")
      @js.native
      val position: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Legend.defaults.reverse")
      @js.native
      val reverse: Boolean = js.native
      
      object title {
        
        @JSImport("chart.js/dist/plugins", "Legend.defaults.title")
        @js.native
        val ^ : js.Any = js.native
        
        inline def color1(ctx: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("color_1")(ctx.asInstanceOf[js.Any]).asInstanceOf[Any]
        
        @JSImport("chart.js/dist/plugins", "Legend.defaults.title.display_1")
        @js.native
        val display1: Boolean = js.native
        
        @JSImport("chart.js/dist/plugins", "Legend.defaults.title.position_1")
        @js.native
        val position1: String = js.native
        
        @JSImport("chart.js/dist/plugins", "Legend.defaults.title.text")
        @js.native
        val text: String = js.native
      }
      
      @JSImport("chart.js/dist/plugins", "Legend.defaults.weight")
      @js.native
      val weight: Double = js.native
    }
    
    object descriptors {
      
      @JSImport("chart.js/dist/plugins", "Legend.descriptors")
      @js.native
      val ^ : js.Any = js.native
      
      object labels1 {
        
        @JSImport("chart.js/dist/plugins", "Legend.descriptors.labels_1")
        @js.native
        val ^ : js.Any = js.native
        
        inline def scriptable1(name: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_scriptable_1")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      }
      
      inline def scriptable(name: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_scriptable")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    @JSImport("chart.js/dist/plugins", "Legend.id")
    @js.native
    val id: String = js.native
    
    inline def start(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def stop(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object SubTitle {
    
    @JSImport("chart.js/dist/plugins", "SubTitle")
    @js.native
    val ^ : js.Any = js.native
    
    inline def beforeUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object defaultRoutes {
      
      @JSImport("chart.js/dist/plugins", "SubTitle.defaultRoutes.color")
      @js.native
      val color: String = js.native
    }
    
    object defaults {
      
      @JSImport("chart.js/dist/plugins", "SubTitle.defaults.align")
      @js.native
      val align: String = js.native
      
      @JSImport("chart.js/dist/plugins", "SubTitle.defaults.display")
      @js.native
      val display: Boolean = js.native
      
      object font {
        
        @JSImport("chart.js/dist/plugins", "SubTitle.defaults.font.weight")
        @js.native
        val weight: String = js.native
      }
      
      @JSImport("chart.js/dist/plugins", "SubTitle.defaults.fullSize")
      @js.native
      val fullSize: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins", "SubTitle.defaults.padding")
      @js.native
      val padding: Double = js.native
      
      @JSImport("chart.js/dist/plugins", "SubTitle.defaults.position")
      @js.native
      val position: String = js.native
      
      @JSImport("chart.js/dist/plugins", "SubTitle.defaults.text")
      @js.native
      val text: String = js.native
      
      @JSImport("chart.js/dist/plugins", "SubTitle.defaults.weight_1")
      @js.native
      val weight1: Double = js.native
    }
    
    object descriptors {
      
      @JSImport("chart.js/dist/plugins", "SubTitle.descriptors._indexable")
      @js.native
      val indexable: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins", "SubTitle.descriptors._scriptable")
      @js.native
      val scriptable: Boolean = js.native
    }
    
    @JSImport("chart.js/dist/plugins", "SubTitle.id")
    @js.native
    val id: String = js.native
    
    inline def start(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def stop(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object Title {
    
    @JSImport("chart.js/dist/plugins", "Title")
    @js.native
    val ^ : js.Any = js.native
    
    inline def beforeUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object defaultRoutes {
      
      @JSImport("chart.js/dist/plugins", "Title.defaultRoutes.color")
      @js.native
      val color: String = js.native
    }
    
    object defaults {
      
      @JSImport("chart.js/dist/plugins", "Title.defaults.align")
      @js.native
      val align: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Title.defaults.display")
      @js.native
      val display: Boolean = js.native
      
      object font {
        
        @JSImport("chart.js/dist/plugins", "Title.defaults.font.weight")
        @js.native
        val weight: String = js.native
      }
      
      @JSImport("chart.js/dist/plugins", "Title.defaults.fullSize")
      @js.native
      val fullSize: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins", "Title.defaults.padding")
      @js.native
      val padding: Double = js.native
      
      @JSImport("chart.js/dist/plugins", "Title.defaults.position")
      @js.native
      val position: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Title.defaults.text")
      @js.native
      val text: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Title.defaults.weight_1")
      @js.native
      val weight1: Double = js.native
    }
    
    object descriptors {
      
      @JSImport("chart.js/dist/plugins", "Title.descriptors._indexable")
      @js.native
      val indexable: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins", "Title.descriptors._scriptable")
      @js.native
      val scriptable: Boolean = js.native
    }
    
    @JSImport("chart.js/dist/plugins", "Title.id")
    @js.native
    val id: String = js.native
    
    inline def start(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def stop(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object Tooltip {
    
    @JSImport("chart.js/dist/plugins", "Tooltip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist/plugins", "Tooltip.additionalOptionScopes")
    @js.native
    val additionalOptionScopes: js.Array[String] = js.native
    
    inline def afterDraw(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDraw")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def afterEvent(chart: Any, args: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterEvent")(chart.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterInit(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterInit")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object defaultRoutes {
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaultRoutes.bodyFont_1")
      @js.native
      val bodyFont1: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaultRoutes.footerFont_1")
      @js.native
      val footerFont1: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaultRoutes.titleFont_1")
      @js.native
      val titleFont1: String = js.native
    }
    
    object defaults {
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults")
      @js.native
      val ^ : js.Any = js.native
      
      object animation {
        
        @JSImport("chart.js/dist/plugins", "Tooltip.defaults.animation.duration")
        @js.native
        val duration: Double = js.native
        
        @JSImport("chart.js/dist/plugins", "Tooltip.defaults.animation.easing")
        @js.native
        val easing: String = js.native
      }
      
      object animations {
        
        object numbers {
          
          @JSImport("chart.js/dist/plugins", "Tooltip.defaults.animations.numbers.properties")
          @js.native
          val properties: js.Array[String] = js.native
          
          @JSImport("chart.js/dist/plugins", "Tooltip.defaults.animations.numbers.type")
          @js.native
          val `type`: String = js.native
        }
        
        object opacity {
          
          @JSImport("chart.js/dist/plugins", "Tooltip.defaults.animations.opacity.duration_1")
          @js.native
          val duration1: Double = js.native
          
          @JSImport("chart.js/dist/plugins", "Tooltip.defaults.animations.opacity.easing_1")
          @js.native
          val easing1: String = js.native
        }
      }
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.backgroundColor")
      @js.native
      val backgroundColor: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.bodyAlign")
      @js.native
      val bodyAlign: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.bodyColor")
      @js.native
      val bodyColor: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.bodySpacing")
      @js.native
      val bodySpacing: Double = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.borderColor")
      @js.native
      val borderColor: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.borderWidth")
      @js.native
      val borderWidth: Double = js.native
      
      inline def boxHeight(ctx: Any, opts: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("boxHeight")(ctx.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.boxPadding")
      @js.native
      val boxPadding: Double = js.native
      
      inline def boxWidth(ctx: Any, opts: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("boxWidth")(ctx.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.caretPadding")
      @js.native
      val caretPadding: Double = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.caretSize")
      @js.native
      val caretSize: Double = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.cornerRadius")
      @js.native
      val cornerRadius: Double = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.displayColors")
      @js.native
      val displayColors: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.enabled")
      @js.native
      val enabled: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.external")
      @js.native
      val external: Any = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.footerAlign")
      @js.native
      val footerAlign: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.footerColor")
      @js.native
      val footerColor: String = js.native
      
      object footerFont {
        
        @JSImport("chart.js/dist/plugins", "Tooltip.defaults.footerFont.weight_1")
        @js.native
        val weight1: String = js.native
      }
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.footerMarginTop")
      @js.native
      val footerMarginTop: Double = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.footerSpacing")
      @js.native
      val footerSpacing: Double = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.multiKeyBackground")
      @js.native
      val multiKeyBackground: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.padding")
      @js.native
      val padding: Double = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.position")
      @js.native
      val position: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.titleAlign")
      @js.native
      val titleAlign: String = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.titleColor")
      @js.native
      val titleColor: String = js.native
      
      object titleFont {
        
        @JSImport("chart.js/dist/plugins", "Tooltip.defaults.titleFont.weight")
        @js.native
        val weight: String = js.native
      }
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.titleMarginBottom")
      @js.native
      val titleMarginBottom: Double = js.native
      
      @JSImport("chart.js/dist/plugins", "Tooltip.defaults.titleSpacing")
      @js.native
      val titleSpacing: Double = js.native
    }
    
    object descriptors {
      
      @JSImport("chart.js/dist/plugins", "Tooltip.descriptors")
      @js.native
      val ^ : js.Any = js.native
      
      object animation1 {
        
        @JSImport("chart.js/dist/plugins", "Tooltip.descriptors.animation_1._fallback")
        @js.native
        val fallback: Boolean = js.native
      }
      
      object animations1 {
        
        @JSImport("chart.js/dist/plugins", "Tooltip.descriptors.animations_1._fallback_1")
        @js.native
        val fallback1: String = js.native
      }
      
      object callbacks {
        
        @JSImport("chart.js/dist/plugins", "Tooltip.descriptors.callbacks._indexable_1")
        @js.native
        val indexable1: Boolean = js.native
        
        @JSImport("chart.js/dist/plugins", "Tooltip.descriptors.callbacks._scriptable_1")
        @js.native
        val scriptable1: Boolean = js.native
      }
      
      @JSImport("chart.js/dist/plugins", "Tooltip.descriptors._indexable")
      @js.native
      val indexable: Boolean = js.native
      
      inline def scriptable(name: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_scriptable")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    @JSImport("chart.js/dist/plugins", "Tooltip.id")
    @js.native
    val id: String = js.native
    
    inline def reset(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reset")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
