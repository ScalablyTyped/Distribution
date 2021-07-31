package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parseable extends StObject {
  
  var parse: js.UndefOr[Boolean] = js.undefined
}
object Parseable {
  
  @scala.inline
  def apply(): Parseable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parseable]
  }
  
  @scala.inline
  implicit class ParseableMutableBuilder[Self <: Parseable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
  }
}
