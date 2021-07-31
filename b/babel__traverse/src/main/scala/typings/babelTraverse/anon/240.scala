package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `240` extends StObject {
  
  var `type`: TSTypeReference
}
object `240` {
  
  @scala.inline
  def apply(): `240` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[`240`]
  }
  
  @scala.inline
  implicit class `240MutableBuilder`[Self <: `240`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
