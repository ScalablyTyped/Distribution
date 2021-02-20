package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclaredPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `183` extends StObject {
  
  var `type`: DeclaredPredicate = js.native
}
object `183` {
  
  @scala.inline
  def apply(`type`: DeclaredPredicate): `183` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`183`]
  }
  
  @scala.inline
  implicit class `183MutableBuilder`[Self <: `183`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclaredPredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
