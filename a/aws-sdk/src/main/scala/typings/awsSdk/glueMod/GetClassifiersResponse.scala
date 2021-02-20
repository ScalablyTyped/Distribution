package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClassifiersResponse extends StObject {
  
  /**
    * The requested list of classifier objects.
    */
  var Classifiers: js.UndefOr[ClassifierList] = js.native
  
  /**
    * A continuation token.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetClassifiersResponse {
  
  @scala.inline
  def apply(): GetClassifiersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassifiersResponse]
  }
  
  @scala.inline
  implicit class GetClassifiersResponseMutableBuilder[Self <: GetClassifiersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifiers(value: ClassifierList): Self = StObject.set(x, "Classifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassifiersUndefined: Self = StObject.set(x, "Classifiers", js.undefined)
    
    @scala.inline
    def setClassifiersVarargs(value: Classifier*): Self = StObject.set(x, "Classifiers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
