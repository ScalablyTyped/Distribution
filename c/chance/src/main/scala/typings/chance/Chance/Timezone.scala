package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timezone extends StObject {
  
  var abbr: String = js.native
  
  var isdst: Boolean = js.native
  
  var name: String = js.native
  
  var offset: Double = js.native
  
  var text: String = js.native
  
  var utc: js.Array[String] = js.native
}
object Timezone {
  
  @scala.inline
  def apply(abbr: String, isdst: Boolean, name: String, offset: Double, text: String, utc: js.Array[String]): Timezone = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], isdst = isdst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], utc = utc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timezone]
  }
  
  @scala.inline
  implicit class TimezoneMutableBuilder[Self <: Timezone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsdst(value: Boolean): Self = StObject.set(x, "isdst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtc(value: js.Array[String]): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtcVarargs(value: String*): Self = StObject.set(x, "utc", js.Array(value :_*))
  }
}
