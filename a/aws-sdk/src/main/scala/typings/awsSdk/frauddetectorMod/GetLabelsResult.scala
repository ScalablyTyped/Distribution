package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLabelsResult extends StObject {
  
  /**
    * An array of labels.
    */
  var labels: js.UndefOr[labelList] = js.native
  
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object GetLabelsResult {
  
  @scala.inline
  def apply(): GetLabelsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLabelsResult]
  }
  
  @scala.inline
  implicit class GetLabelsResultMutableBuilder[Self <: GetLabelsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: labelList): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
