package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSImportEqualsDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160` extends StObject {
  
  var `type`: TSImportEqualsDeclaration
}
object `160` {
  
  inline def apply(): `160` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSImportEqualsDeclaration")
    __obj.asInstanceOf[`160`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `160`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSImportEqualsDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
