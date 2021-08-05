package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCommitOutput extends StObject {
  
  /**
    * A commit data type object that contains information about the specified commit.
    */
  var commit: Commit
}
object GetCommitOutput {
  
  inline def apply(commit: Commit): GetCommitOutput = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommitOutput]
  }
  
  extension [Self <: GetCommitOutput](x: Self) {
    
    inline def setCommit(value: Commit): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
  }
}
