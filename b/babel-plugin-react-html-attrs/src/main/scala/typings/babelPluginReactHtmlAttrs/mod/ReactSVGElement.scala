package typings.babelPluginReactHtmlAttrs.mod

import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ReactSVG for ReactSVGElement
trait ReactSVGElement
  extends StObject
     with DOMElement[SVGAttributes[SVGElement], SVGElement]
object ReactSVGElement {
  
  @scala.inline
  def apply(props: SVGAttributes[SVGElement], `type`: String): ReactSVGElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null, ref = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSVGElement]
  }
}
