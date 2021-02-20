package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteResult extends StObject {
  
  def getNumPois(): Double = js.native
  
  def getPoi(i: Double): AutocompleteResultPoi = js.native
  
  var keyword: String = js.native
}
object AutocompleteResult {
  
  @scala.inline
  def apply(getNumPois: () => Double, getPoi: Double => AutocompleteResultPoi, keyword: String): AutocompleteResult = {
    val __obj = js.Dynamic.literal(getNumPois = js.Any.fromFunction0(getNumPois), getPoi = js.Any.fromFunction1(getPoi), keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteResult]
  }
  
  @scala.inline
  implicit class AutocompleteResultMutableBuilder[Self <: AutocompleteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNumPois(value: () => Double): Self = StObject.set(x, "getNumPois", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPoi(value: Double => AutocompleteResultPoi): Self = StObject.set(x, "getPoi", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
  }
}
