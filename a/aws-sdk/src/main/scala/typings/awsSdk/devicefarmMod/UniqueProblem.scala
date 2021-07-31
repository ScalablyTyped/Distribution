package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueProblem extends StObject {
  
  /**
    * A message about the unique problems' result.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * Information about the problems.
    */
  var problems: js.UndefOr[Problems] = js.undefined
}
object UniqueProblem {
  
  @scala.inline
  def apply(): UniqueProblem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueProblem]
  }
  
  @scala.inline
  implicit class UniqueProblemMutableBuilder[Self <: UniqueProblem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setProblems(value: Problems): Self = StObject.set(x, "problems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblemsUndefined: Self = StObject.set(x, "problems", js.undefined)
    
    @scala.inline
    def setProblemsVarargs(value: Problem*): Self = StObject.set(x, "problems", js.Array(value :_*))
  }
}
