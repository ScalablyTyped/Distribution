package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeConfig[Labels /* <: LabelsGeneric */] extends StObject {
  
  var help: String
  
  var labelNames: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof Labels extends string ? std.Array<keyof Labels> : undefined */ js.Any
  ] = js.undefined
  
  var name: String
}
object GaugeConfig {
  
  inline def apply[Labels /* <: LabelsGeneric */](help: String, name: String): GaugeConfig[Labels] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeConfig[Labels]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GaugeConfig[?], Labels /* <: LabelsGeneric */] (val x: Self & GaugeConfig[Labels]) extends AnyVal {
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setLabelNames(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof Labels extends string ? std.Array<keyof Labels> : undefined */ js.Any
    ): Self = StObject.set(x, "labelNames", value.asInstanceOf[js.Any])
    
    inline def setLabelNamesUndefined: Self = StObject.set(x, "labelNames", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
