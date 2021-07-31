package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonOptions extends StObject {
  
  /**
    * A value that specifies whether JSON input contains embedded new line characters.
    */
  var MultiLine: js.UndefOr[typings.awsSdk.databrewMod.MultiLine] = js.undefined
}
object JsonOptions {
  
  @scala.inline
  def apply(): JsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonOptions]
  }
  
  @scala.inline
  implicit class JsonOptionsMutableBuilder[Self <: JsonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiLine(value: MultiLine): Self = StObject.set(x, "MultiLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLineUndefined: Self = StObject.set(x, "MultiLine", js.undefined)
  }
}
