package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeValue extends js.Object {
  
  /**
    * For number values, expressed as double.
    */
  var N: js.UndefOr[DoubleObject] = js.native
  
  /**
    * For single string values. Maximum string length is 100 characters.
    */
  var S: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * For a map of up to 10 data type:value pairs. Maximum length for each string value is 100 characters. 
    */
  var SDM: js.UndefOr[StringDoubleMap] = js.native
  
  /**
    * For a list of up to 10 strings. Maximum length for each string is 100 characters. Duplicate values are not recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
    */
  var SL: js.UndefOr[StringList] = js.native
}
object AttributeValue {
  
  @scala.inline
  def apply(): AttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValue]
  }
  
  @scala.inline
  implicit class AttributeValueOps[Self <: AttributeValue] (val x: Self) extends AnyVal {
    
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
    def setN(value: DoubleObject): Self = this.set("N", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteN: Self = this.set("N", js.undefined)
    
    @scala.inline
    def setS(value: NonZeroAndMaxString): Self = this.set("S", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS: Self = this.set("S", js.undefined)
    
    @scala.inline
    def setSDM(value: StringDoubleMap): Self = this.set("SDM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSDM: Self = this.set("SDM", js.undefined)
    
    @scala.inline
    def setSLVarargs(value: NonZeroAndMaxString*): Self = this.set("SL", js.Array(value :_*))
    
    @scala.inline
    def setSL(value: StringList): Self = this.set("SL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSL: Self = this.set("SL", js.undefined)
  }
}
