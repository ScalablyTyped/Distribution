package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/tooltip/tooltip.TooltipOptions> */
trait PartialTooltipOptions extends StObject {
  
  var attribTooltipTarget: js.UndefOr[String] = js.undefined
  
  var classShown: js.UndefOr[String] = js.undefined
  
  var initEventNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var objMenuOffset: js.UndefOr[
    js.Function2[/* menuBody */ typings.std.Element, /* menuDirection */ String, js.UndefOr[Dictx]]
  ] = js.undefined
  
  var selectorContent: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
}
object PartialTooltipOptions {
  
  inline def apply(): PartialTooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTooltipOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTooltipOptions] (val x: Self) extends AnyVal {
    
    inline def setAttribTooltipTarget(value: String): Self = StObject.set(x, "attribTooltipTarget", value.asInstanceOf[js.Any])
    
    inline def setAttribTooltipTargetUndefined: Self = StObject.set(x, "attribTooltipTarget", js.undefined)
    
    inline def setClassShown(value: String): Self = StObject.set(x, "classShown", value.asInstanceOf[js.Any])
    
    inline def setClassShownUndefined: Self = StObject.set(x, "classShown", js.undefined)
    
    inline def setInitEventNames(value: js.Array[String]): Self = StObject.set(x, "initEventNames", value.asInstanceOf[js.Any])
    
    inline def setInitEventNamesUndefined: Self = StObject.set(x, "initEventNames", js.undefined)
    
    inline def setInitEventNamesVarargs(value: String*): Self = StObject.set(x, "initEventNames", js.Array(value*))
    
    inline def setObjMenuOffset(value: (/* menuBody */ typings.std.Element, /* menuDirection */ String) => js.UndefOr[Dictx]): Self = StObject.set(x, "objMenuOffset", js.Any.fromFunction2(value))
    
    inline def setObjMenuOffsetUndefined: Self = StObject.set(x, "objMenuOffset", js.undefined)
    
    inline def setSelectorContent(value: String): Self = StObject.set(x, "selectorContent", value.asInstanceOf[js.Any])
    
    inline def setSelectorContentUndefined: Self = StObject.set(x, "selectorContent", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
  }
}
