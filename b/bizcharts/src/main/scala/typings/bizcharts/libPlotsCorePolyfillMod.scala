package typings.bizcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsCorePolyfillMod {
  
  @JSImport("bizcharts/lib/plots/core/polyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def polyfillAxis(cfg: Any, name: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polyfillAxis")(cfg.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def polyfillDescriptionEvent(options: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfillDescriptionEvent")(options.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def polyfillEvents(chart: Any, preOptions: Any, newOptions: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polyfillEvents")(chart.asInstanceOf[js.Any], preOptions.asInstanceOf[js.Any], newOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def polyfillOptions(opt: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfillOptions")(opt.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def polyfillTitleEvent(options: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfillTitleEvent")(options.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def polyfillVisible(polyfillOpt: Any, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("polyfillVisible")(polyfillOpt.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def polyfillVisible(polyfillOpt: Any, path: Any, negativeValue: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("polyfillVisible")(polyfillOpt.asInstanceOf[js.Any], path.asInstanceOf[js.Any], negativeValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def replaceApi(replaceApiList: js.Array[ReplaceApi_], options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceApi")(replaceApiList.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ReplaceApi_ extends StObject {
    
    var notice: String
    
    var sourceKey: String
    
    var targetKey: String
  }
  object ReplaceApi_ {
    
    inline def apply(notice: String, sourceKey: String, targetKey: String): ReplaceApi_ = {
      val __obj = js.Dynamic.literal(notice = notice.asInstanceOf[js.Any], sourceKey = sourceKey.asInstanceOf[js.Any], targetKey = targetKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceApi_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplaceApi_] (val x: Self) extends AnyVal {
      
      inline def setNotice(value: String): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
      
      inline def setSourceKey(value: String): Self = StObject.set(x, "sourceKey", value.asInstanceOf[js.Any])
      
      inline def setTargetKey(value: String): Self = StObject.set(x, "targetKey", value.asInstanceOf[js.Any])
    }
  }
}
