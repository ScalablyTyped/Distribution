package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionComponentElement[P]
  extends StObject
     with ReactElement[P, FunctionComponent[P]] {
  
  var ref: js.UndefOr[Any] = js.undefined
}
object FunctionComponentElement {
  
  inline def apply[P](props: P, `type`: FunctionComponent[P]): FunctionComponentElement[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionComponentElement[P]]
  }
  
  extension [Self <: FunctionComponentElement[?], P](x: Self & FunctionComponentElement[P]) {
    
    inline def setRef(value: scala.Nothing | Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
