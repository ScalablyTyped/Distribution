package typings.chartJs.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  @JSImport("chart.js/dist", "Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js/dist", "Tooltip.additionalOptionScopes")
  @js.native
  val additionalOptionScopes: js.Array[String] = js.native
  
  inline def afterDraw(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDraw")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def afterEvent(chart: Any, args: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterEvent")(chart.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def afterInit(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterInit")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object defaultRoutes {
    
    @JSImport("chart.js/dist", "Tooltip.defaultRoutes.bodyFont_1")
    @js.native
    val bodyFont1: String = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaultRoutes.footerFont_1")
    @js.native
    val footerFont1: String = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaultRoutes.titleFont_1")
    @js.native
    val titleFont1: String = js.native
  }
  
  object defaults {
    
    @JSImport("chart.js/dist", "Tooltip.defaults")
    @js.native
    val ^ : js.Any = js.native
    
    object animation {
      
      @JSImport("chart.js/dist", "Tooltip.defaults.animation.duration")
      @js.native
      val duration: Double = js.native
      
      @JSImport("chart.js/dist", "Tooltip.defaults.animation.easing")
      @js.native
      val easing: String = js.native
    }
    
    object animations {
      
      object numbers {
        
        @JSImport("chart.js/dist", "Tooltip.defaults.animations.numbers.properties")
        @js.native
        val properties: js.Array[String] = js.native
        
        @JSImport("chart.js/dist", "Tooltip.defaults.animations.numbers.type")
        @js.native
        val `type`: String = js.native
      }
      
      object opacity {
        
        @JSImport("chart.js/dist", "Tooltip.defaults.animations.opacity.duration_1")
        @js.native
        val duration1: Double = js.native
        
        @JSImport("chart.js/dist", "Tooltip.defaults.animations.opacity.easing_1")
        @js.native
        val easing1: String = js.native
      }
    }
    
    @JSImport("chart.js/dist", "Tooltip.defaults.backgroundColor")
    @js.native
    val backgroundColor: String = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.bodyAlign")
    @js.native
    val bodyAlign: String = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.bodyColor")
    @js.native
    val bodyColor: String = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.bodySpacing")
    @js.native
    val bodySpacing: Double = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.borderColor")
    @js.native
    val borderColor: String = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.borderWidth")
    @js.native
    val borderWidth: Double = js.native
    
    inline def boxHeight(ctx: Any, opts: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("boxHeight")(ctx.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("chart.js/dist", "Tooltip.defaults.boxPadding")
    @js.native
    val boxPadding: Double = js.native
    
    inline def boxWidth(ctx: Any, opts: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("boxWidth")(ctx.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("chart.js/dist", "Tooltip.defaults.caretPadding")
    @js.native
    val caretPadding: Double = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.caretSize")
    @js.native
    val caretSize: Double = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.cornerRadius")
    @js.native
    val cornerRadius: Double = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.displayColors")
    @js.native
    val displayColors: Boolean = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.enabled")
    @js.native
    val enabled: Boolean = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.external")
    @js.native
    val external: Any = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.footerAlign")
    @js.native
    val footerAlign: String = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.footerColor")
    @js.native
    val footerColor: String = js.native
    
    object footerFont {
      
      @JSImport("chart.js/dist", "Tooltip.defaults.footerFont.weight_1")
      @js.native
      val weight1: String = js.native
    }
    
    @JSImport("chart.js/dist", "Tooltip.defaults.footerMarginTop")
    @js.native
    val footerMarginTop: Double = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.footerSpacing")
    @js.native
    val footerSpacing: Double = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.multiKeyBackground")
    @js.native
    val multiKeyBackground: String = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.padding")
    @js.native
    val padding: Double = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.position")
    @js.native
    val position: String = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.titleAlign")
    @js.native
    val titleAlign: String = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.titleColor")
    @js.native
    val titleColor: String = js.native
    
    object titleFont {
      
      @JSImport("chart.js/dist", "Tooltip.defaults.titleFont.weight")
      @js.native
      val weight: String = js.native
    }
    
    @JSImport("chart.js/dist", "Tooltip.defaults.titleMarginBottom")
    @js.native
    val titleMarginBottom: Double = js.native
    
    @JSImport("chart.js/dist", "Tooltip.defaults.titleSpacing")
    @js.native
    val titleSpacing: Double = js.native
  }
  
  object descriptors {
    
    @JSImport("chart.js/dist", "Tooltip.descriptors")
    @js.native
    val ^ : js.Any = js.native
    
    object animation1 {
      
      @JSImport("chart.js/dist", "Tooltip.descriptors.animation_1._fallback")
      @js.native
      val fallback: Boolean = js.native
    }
    
    object animations1 {
      
      @JSImport("chart.js/dist", "Tooltip.descriptors.animations_1._fallback_1")
      @js.native
      val fallback1: String = js.native
    }
    
    object callbacks {
      
      @JSImport("chart.js/dist", "Tooltip.descriptors.callbacks._indexable_1")
      @js.native
      val indexable1: Boolean = js.native
      
      @JSImport("chart.js/dist", "Tooltip.descriptors.callbacks._scriptable_1")
      @js.native
      val scriptable1: Boolean = js.native
    }
    
    @JSImport("chart.js/dist", "Tooltip.descriptors._indexable")
    @js.native
    val indexable: Boolean = js.native
    
    inline def scriptable(name: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_scriptable")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("chart.js/dist", "Tooltip.id")
  @js.native
  val id: String = js.native
  
  inline def reset(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reset")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
