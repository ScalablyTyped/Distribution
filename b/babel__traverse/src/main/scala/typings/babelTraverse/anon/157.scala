package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.PipelineBareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `157` extends StObject {
  
  var `type`: PipelineBareFunction = js.native
}
object `157` {
  
  @scala.inline
  def apply(`type`: PipelineBareFunction): `157` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`157`]
  }
  
  @scala.inline
  implicit class `157MutableBuilder`[Self <: `157`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: PipelineBareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
