package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseLogStreamsResult extends StObject {
  
  /**
    * An object describing the result of your get relational database log streams request.
    */
  var logStreams: js.UndefOr[StringList] = js.native
}
object GetRelationalDatabaseLogStreamsResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseLogStreamsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseLogStreamsResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseLogStreamsResultMutableBuilder[Self <: GetRelationalDatabaseLogStreamsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogStreams(value: StringList): Self = StObject.set(x, "logStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamsUndefined: Self = StObject.set(x, "logStreams", js.undefined)
    
    @scala.inline
    def setLogStreamsVarargs(value: String*): Self = StObject.set(x, "logStreams", js.Array(value :_*))
  }
}
