package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSImportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `234` extends StObject {
  
  var `type`: TSImportType
}
object `234` {
  
  @scala.inline
  def apply(): `234` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[`234`]
  }
  
  @scala.inline
  implicit class `234MutableBuilder`[Self <: `234`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSImportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
