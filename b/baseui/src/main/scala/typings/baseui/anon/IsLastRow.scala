package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLastRow extends StObject {
  
  @JSName("$animation")
  var $animation: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isLastRow")
  var $isLastRow: Boolean
}
object IsLastRow {
  
  inline def apply($isLastRow: Boolean): IsLastRow = {
    val __obj = js.Dynamic.literal($isLastRow = $isLastRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLastRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsLastRow] (val x: Self) extends AnyVal {
    
    inline def set$animation(value: Boolean): Self = StObject.set(x, "$animation", value.asInstanceOf[js.Any])
    
    inline def set$animationUndefined: Self = StObject.set(x, "$animation", js.undefined)
    
    inline def set$isLastRow(value: Boolean): Self = StObject.set(x, "$isLastRow", value.asInstanceOf[js.Any])
  }
}
