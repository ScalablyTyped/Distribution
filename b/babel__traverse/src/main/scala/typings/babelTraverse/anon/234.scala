package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSImportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `234` extends StObject {
  
  var `type`: TSImportType = js.native
}
object `234` {
  
  @scala.inline
  def apply(`type`: TSImportType): `234` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`234`]
  }
  
  @scala.inline
  implicit class `234MutableBuilder`[Self <: `234`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSImportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
