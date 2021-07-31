package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.mod.ConfigType
import typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginRelativeTimeMod extends Shortcut {
  
  @JSImport("dayjs/plugin/relativeTime", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[RelativeTimeOptions] = js.native
  
  trait RelativeTimeOptions extends StObject {
    
    var rounding: js.UndefOr[js.Function1[/* num */ Double, Double]] = js.undefined
    
    var thresholds: js.UndefOr[js.Array[RelativeTimeThreshold]] = js.undefined
  }
  object RelativeTimeOptions {
    
    @scala.inline
    def apply(): RelativeTimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelativeTimeOptions]
    }
    
    @scala.inline
    implicit class RelativeTimeOptionsMutableBuilder[Self <: RelativeTimeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRounding(value: /* num */ Double => Double): Self = StObject.set(x, "rounding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
      
      @scala.inline
      def setThresholds(value: js.Array[RelativeTimeThreshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
      
      @scala.inline
      def setThresholdsVarargs(value: RelativeTimeThreshold*): Self = StObject.set(x, "thresholds", js.Array(value :_*))
    }
  }
  
  trait RelativeTimeThreshold extends StObject {
    
    var d: js.UndefOr[String] = js.undefined
    
    var l: String
    
    var r: js.UndefOr[Double] = js.undefined
  }
  object RelativeTimeThreshold {
    
    @scala.inline
    def apply(l: String): RelativeTimeThreshold = {
      val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeTimeThreshold]
    }
    
    @scala.inline
    implicit class RelativeTimeThresholdMutableBuilder[Self <: RelativeTimeThreshold] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setL(value: String): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    }
  }
  
  type _To = PluginFunc[RelativeTimeOptions]
  
  /* This means you don't have to write `^`, but can instead just say `pluginRelativeTimeMod.foo` */
  override def _to: PluginFunc[RelativeTimeOptions] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def from(compared: ConfigType): String = js.native
      def from(compared: ConfigType, withoutSuffix: Boolean): String = js.native
      
      def fromNow(): String = js.native
      def fromNow(withoutSuffix: Boolean): String = js.native
      
      def to(compared: ConfigType): String = js.native
      def to(compared: ConfigType, withoutSuffix: Boolean): String = js.native
      
      def toNow(): String = js.native
      def toNow(withoutSuffix: Boolean): String = js.native
    }
  }
}
