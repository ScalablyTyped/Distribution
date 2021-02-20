package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentLabel extends StObject {
  
  /**
    * The name of the label.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The confidence score that Amazon Comprehend has this label correctly attributed.
    */
  var Score: js.UndefOr[Float] = js.native
}
object DocumentLabel {
  
  @scala.inline
  def apply(): DocumentLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLabel]
  }
  
  @scala.inline
  implicit class DocumentLabelMutableBuilder[Self <: DocumentLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
