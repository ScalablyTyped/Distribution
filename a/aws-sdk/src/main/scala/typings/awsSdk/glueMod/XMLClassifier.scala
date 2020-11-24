package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLClassifier extends js.Object {
  
  /**
    * An identifier of the data format that the classifier matches.
    */
  var Classification: typings.awsSdk.glueMod.Classification = js.native
  
  /**
    * The time that this classifier was registered.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time that this classifier was last updated.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
  
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. This can't identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
    */
  var RowTag: js.UndefOr[typings.awsSdk.glueMod.RowTag] = js.native
  
  /**
    * The version of this classifier.
    */
  var Version: js.UndefOr[VersionId] = js.native
}
object XMLClassifier {
  
  @scala.inline
  def apply(Classification: Classification, Name: NameString): XMLClassifier = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLClassifier]
  }
  
  @scala.inline
  implicit class XMLClassifierOps[Self <: XMLClassifier] (val x: Self) extends AnyVal {
    
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
    def setClassification(value: Classification): Self = this.set("Classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: Timestamp): Self = this.set("LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdated: Self = this.set("LastUpdated", js.undefined)
    
    @scala.inline
    def setRowTag(value: RowTag): Self = this.set("RowTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowTag: Self = this.set("RowTag", js.undefined)
    
    @scala.inline
    def setVersion(value: VersionId): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
