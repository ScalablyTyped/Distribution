package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentClass extends StObject {
  
  /**
    * The name of the class.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The confidence score that Amazon Comprehend has this class correctly attributed.
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object DocumentClass {
  
  @scala.inline
  def apply(): DocumentClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentClass]
  }
  
  @scala.inline
  implicit class DocumentClassMutableBuilder[Self <: DocumentClass] (val x: Self) extends AnyVal {
    
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
