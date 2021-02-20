package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NumberTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `159` extends StObject {
  
  var `type`: NumberTypeAnnotation = js.native
}
object `159` {
  
  @scala.inline
  def apply(`type`: NumberTypeAnnotation): `159` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`159`]
  }
  
  @scala.inline
  implicit class `159MutableBuilder`[Self <: `159`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NumberTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
