package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var option: typings.baseui.selectTypesMod.Option
}
object Index {
  
  inline def apply(option: typings.baseui.selectTypesMod.Option): Index = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  extension [Self <: Index](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setOption(value: typings.baseui.selectTypesMod.Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
