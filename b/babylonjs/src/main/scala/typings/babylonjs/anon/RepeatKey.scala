package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepeatKey extends StObject {
  
  var repeatKey: js.UndefOr[String] = js.native
  
  var replaceStrings: js.UndefOr[js.Array[Replace]] = js.native
}
object RepeatKey {
  
  @scala.inline
  def apply(): RepeatKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatKey]
  }
  
  @scala.inline
  implicit class RepeatKeyMutableBuilder[Self <: RepeatKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepeatKey(value: String): Self = StObject.set(x, "repeatKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatKeyUndefined: Self = StObject.set(x, "repeatKey", js.undefined)
    
    @scala.inline
    def setReplaceStrings(value: js.Array[Replace]): Self = StObject.set(x, "replaceStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceStringsUndefined: Self = StObject.set(x, "replaceStrings", js.undefined)
    
    @scala.inline
    def setReplaceStringsVarargs(value: Replace*): Self = StObject.set(x, "replaceStrings", js.Array(value :_*))
  }
}
