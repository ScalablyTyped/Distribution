package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSImportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `241` extends StObject {
  
  var `type`: TSImportType
}
object `241` {
  
  inline def apply(): `241` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[`241`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `241`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSImportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
