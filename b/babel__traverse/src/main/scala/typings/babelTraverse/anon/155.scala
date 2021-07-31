package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSImportEqualsDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  var `type`: TSImportEqualsDeclaration
}
object `155` {
  
  @scala.inline
  def apply(): `155` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSImportEqualsDeclaration")
    __obj.asInstanceOf[`155`]
  }
  
  @scala.inline
  implicit class `155MutableBuilder`[Self <: `155`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSImportEqualsDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
