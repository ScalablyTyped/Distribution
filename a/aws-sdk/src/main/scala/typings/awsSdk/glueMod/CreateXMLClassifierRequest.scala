package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateXMLClassifierRequest extends StObject {
  
  /**
    * An identifier of the data format that the classifier matches.
    */
  var Classification: typings.awsSdk.glueMod.Classification
  
  /**
    * The name of the classifier.
    */
  var Name: NameString
  
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. This can't identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
    */
  var RowTag: js.UndefOr[typings.awsSdk.glueMod.RowTag] = js.undefined
}
object CreateXMLClassifierRequest {
  
  inline def apply(Classification: Classification, Name: NameString): CreateXMLClassifierRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateXMLClassifierRequest]
  }
  
  extension [Self <: CreateXMLClassifierRequest](x: Self) {
    
    inline def setClassification(value: Classification): Self = StObject.set(x, "Classification", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRowTag(value: RowTag): Self = StObject.set(x, "RowTag", value.asInstanceOf[js.Any])
    
    inline def setRowTagUndefined: Self = StObject.set(x, "RowTag", js.undefined)
  }
}
