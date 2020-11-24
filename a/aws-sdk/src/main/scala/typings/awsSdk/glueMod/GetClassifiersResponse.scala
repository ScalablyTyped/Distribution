package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClassifiersResponse extends js.Object {
  
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
  implicit class GetClassifiersResponseOps[Self <: GetClassifiersResponse] (val x: Self) extends AnyVal {
    
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
    def setClassifiersVarargs(value: Classifier*): Self = this.set("Classifiers", js.Array(value :_*))
    
    @scala.inline
    def setClassifiers(value: ClassifierList): Self = this.set("Classifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassifiers: Self = this.set("Classifiers", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
