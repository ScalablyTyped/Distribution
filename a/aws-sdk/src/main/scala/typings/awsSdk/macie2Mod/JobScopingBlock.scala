package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobScopingBlock extends StObject {
  
  /**
    * An array of conditions, one for each condition that determines which objects to include or exclude from the job.
    */
  var and: js.UndefOr[listOfJobScopeTerm] = js.undefined
}
object JobScopingBlock {
  
  inline def apply(): JobScopingBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobScopingBlock]
  }
  
  extension [Self <: JobScopingBlock](x: Self) {
    
    inline def setAnd(value: listOfJobScopeTerm): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    inline def setAndVarargs(value: JobScopeTerm*): Self = StObject.set(x, "and", js.Array(value :_*))
  }
}
