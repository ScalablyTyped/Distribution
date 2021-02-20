package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionComponentElement[P] extends ReactElement[P, FunctionComponent[P]] {
  
  var ref: js.UndefOr[js.Any] = js.native
}
object FunctionComponentElement {
  
  @scala.inline
  def apply[P](props: P, `type`: FunctionComponent[P]): FunctionComponentElement[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionComponentElement[P]]
  }
  
  @scala.inline
  implicit class FunctionComponentElementMutableBuilder[Self <: FunctionComponentElement[_], P] (val x: Self with FunctionComponentElement[P]) extends AnyVal {
    
    @scala.inline
    def setRef(value: js.Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
