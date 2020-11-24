package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateXMLClassifierRequest extends js.Object {
  
  /**
    * An identifier of the data format that the classifier matches.
    */
  var Classification: js.UndefOr[typings.awsSdk.glueMod.Classification] = js.native
  
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
  
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. This cannot identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
    */
  var RowTag: js.UndefOr[typings.awsSdk.glueMod.RowTag] = js.native
}
object UpdateXMLClassifierRequest {
  
  @scala.inline
  def apply(Name: NameString): UpdateXMLClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateXMLClassifierRequest]
  }
  
  @scala.inline
  implicit class UpdateXMLClassifierRequestOps[Self <: UpdateXMLClassifierRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassification(value: Classification): Self = this.set("Classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassification: Self = this.set("Classification", js.undefined)
    
    @scala.inline
    def setRowTag(value: RowTag): Self = this.set("RowTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowTag: Self = this.set("RowTag", js.undefined)
  }
}
