package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArgumentPlaceholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `232` extends StObject {
  
  var `type`: ArgumentPlaceholder
}
object `232` {
  
  inline def apply(): `232` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArgumentPlaceholder")
    __obj.asInstanceOf[`232`]
  }
  
  extension [Self <: `232`](x: Self) {
    
    inline def setType(value: ArgumentPlaceholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
