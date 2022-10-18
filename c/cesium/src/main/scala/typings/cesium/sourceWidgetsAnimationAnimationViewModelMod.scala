package typings.cesium

import typings.cesium.mod.AnimationViewModel
import typings.cesium.mod.AnimationViewModel.DateFormatter
import typings.cesium.mod.AnimationViewModel.TimeFormatter
import typings.cesium.mod.ClockViewModel
import typings.cesium.mod.JulianDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsAnimationAnimationViewModelMod {
  
  @JSImport("cesium/Source/Widgets/Animation/AnimationViewModel", JSImport.Default)
  @js.native
  open class default protected () extends AnimationViewModel {
    def this(clockViewModel: ClockViewModel) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Widgets/Animation/AnimationViewModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets the default date formatter used by new instances.
      */
    @JSImport("cesium/Source/Widgets/Animation/AnimationViewModel", "default.defaultDateFormatter")
    @js.native
    def defaultDateFormatter: DateFormatter = js.native
    /**
      * Gets or sets the default date formatter used by new instances.
      */
    inline def defaultDateFormatter(date: JulianDate, viewModel: AnimationViewModel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDateFormatter")(date.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def defaultDateFormatter_=(x: DateFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDateFormatter")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets the default array of known clock multipliers associated with new instances of the shuttle ring.
      */
    @JSImport("cesium/Source/Widgets/Animation/AnimationViewModel", "default.defaultTicks")
    @js.native
    def defaultTicks: js.Array[Double] = js.native
    inline def defaultTicks_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTicks")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets the default time formatter used by new instances.
      */
    @JSImport("cesium/Source/Widgets/Animation/AnimationViewModel", "default.defaultTimeFormatter")
    @js.native
    def defaultTimeFormatter: TimeFormatter = js.native
    /**
      * Gets or sets the default time formatter used by new instances.
      */
    inline def defaultTimeFormatter(date: JulianDate, viewModel: AnimationViewModel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTimeFormatter")(date.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def defaultTimeFormatter_=(x: TimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeFormatter")(x.asInstanceOf[js.Any])
  }
}
