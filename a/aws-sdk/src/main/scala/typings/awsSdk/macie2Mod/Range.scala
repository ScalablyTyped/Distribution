package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends js.Object {
  
  /**
    * Possible values are: In an Occurrences.lineRanges array, the number of lines from the beginning of the file to the end of the sensitive data. In an Occurrences.offsetRanges array, the number of characters from the beginning of the file to the end of the sensitive data. In a Page object, the number of lines (lineRange) or characters (offsetRange) from the beginning of the page to the end of the sensitive data.
    */
  var end: js.UndefOr[long] = js.native
  
  /**
    * Possible values are: In an Occurrences.lineRanges array, the number of lines from the beginning of the file to the beginning of the sensitive data. In an Occurrences.offsetRanges array, the number of characters from the beginning of the file to the beginning of the sensitive data. In a Page object, the number of lines (lineRange) or characters (offsetRange) from the beginning of the page to the beginning of the sensitive data.
    */
  var start: js.UndefOr[long] = js.native
  
  /**
    * The column number for the column that contains the data, if the file contains structured data.
    */
  var startColumn: js.UndefOr[long] = js.native
}
object Range {
  
  @scala.inline
  def apply(): Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: long): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStart(value: long): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStartColumn(value: long): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartColumn: Self = this.set("startColumn", js.undefined)
  }
}
