package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLClassifier extends StObject {
  
  /**
    * An identifier of the data format that the classifier matches.
    */
  var Classification: typings.awsSdk.glueMod.Classification
  
  /**
    * The time that this classifier was registered.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time that this classifier was last updated.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the classifier.
    */
  var Name: NameString
  
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. This can't identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
    */
  var RowTag: js.UndefOr[typings.awsSdk.glueMod.RowTag] = js.undefined
  
  /**
    * The version of this classifier.
    */
  var Version: js.UndefOr[VersionId] = js.undefined
}
object XMLClassifier {
  
  @scala.inline
  def apply(Classification: Classification, Name: NameString): XMLClassifier = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLClassifier]
  }
  
  @scala.inline
  implicit class XMLClassifierMutableBuilder[Self <: XMLClassifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassification(value: Classification): Self = StObject.set(x, "Classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: Timestamp): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTag(value: RowTag): Self = StObject.set(x, "RowTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTagUndefined: Self = StObject.set(x, "RowTag", js.undefined)
    
    @scala.inline
    def setVersion(value: VersionId): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
