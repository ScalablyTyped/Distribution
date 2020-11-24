package typings.codepage.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPConv extends js.Object {
  
  var dec: NumberDictionary[String] = js.native
  
  var enc: StringDictionary[Double] = js.native
}
object CPConv {
  
  @scala.inline
  def apply(dec: NumberDictionary[String], enc: StringDictionary[Double]): CPConv = {
    val __obj = js.Dynamic.literal(dec = dec.asInstanceOf[js.Any], enc = enc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPConv]
  }
  
  @scala.inline
  implicit class CPConvOps[Self <: CPConv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDec(value: NumberDictionary[String]): Self = this.set("dec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnc(value: StringDictionary[Double]): Self = this.set("enc", value.asInstanceOf[js.Any])
  }
}
