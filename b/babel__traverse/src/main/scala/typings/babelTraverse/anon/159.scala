package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NumberTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `159` extends StObject {
  
  var `type`: NumberTypeAnnotation
}
object `159` {
  
  @scala.inline
  def apply(): `159` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[`159`]
  }
  
  @scala.inline
  implicit class `159MutableBuilder`[Self <: `159`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NumberTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
